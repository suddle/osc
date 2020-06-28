<template>
  <div>
    <el-table
    :data="tableData"
    style="width: 100%">
    <el-input v-model="input" placeholder="请输入内容"></el-input>
    <el-table-column label="姓名">
      <template slot-scope="scope">
        <el-input v-model=scope.row.name  placeholder="" maxlength=6 v-show=editshow></el-input>
        <el-tag size="medium" :sid=scope.row.id v-show=noeditshow>{{ scope.row.name }}</el-tag>
      </template>
    </el-table-column>
    <el-table-column label="电话">
      <template slot-scope="scope">
        <el-input v-model=scope.row.telephone  placeholder="" maxlength=11 v-show=editshow></el-input>
        <el-tag size="medium" :sid=scope.row.id v-show=noeditshow>{{ scope.row.telephone }}</el-tag>
      </template>
    </el-table-column>
    <el-table-column label="操作">
      <template slot-scope="scope">
        <el-button size="mini" @click="handleEdit(scope.$index, scope.row)">编辑</el-button>
        <el-button size="mini" @click="handleAdd(scope.$index, scope.row)">增加</el-button>
        <el-button size="mini" @click="handleQuere(scope.$index, scope.row)" v-show=editshow>确定</el-button>
      </template>
    </el-table-column>
    <el-table-column align="right">
      <template slot="header" slot-scope="scope">
        <div style="white-space: nowrap;">
          <el-input
          v-model="search"
          placeholder="输入关键字搜索" style="width: 150px;"/>
          <el-button type="primary" plain>搜索</el-button>
        </div>
      </template>
    </el-table-column>
  </el-table>
  <el-alert title="" type="info" class="suddletips" @close="closelogin" v-show=loginshow>
  <div style="position:relative;height: 100%;" class="suddletipswip">
      <input v-model="names" placeholder="请输入内容" maxlength=6>
      <input v-model="passwords" placeholder="请输入内容"  maxlength=20>
      <input v-model="telephones" placeholder="请输入内容"   maxlength=11>
      <input v-model="roles" placeholder="请输入内容"   maxlength=11>
    <el-button type="success" @click="loginbtns">提交</el-button>
  </div>
</el-alert>
</div>
</template>
<script>
  export default {
    data() {
      return {
        tableData: [{
          id:1,
          name: '王小虎',
        }],
        input: '',
        editshow:false,
        noeditshow:true,
        loginshow:false,
        names:"名字",
        passwords:"密码",
        telephones:"电话",
        roles:"角色",
      }
    },
    created(){
      // this.convert();
      this.getuser();
    },
    methods: {
      getuser:function(){
        var that=this;
        this.$axios.get(this.$sudleurl+'getAllUser/', {})
        .then(function (response) {
          that.tableData=response.data;
        })
        .catch(function (error) {
          console.log(error,'123123');
        });
      },
      convert: function () {
        var datas={
          "username":"zjys",
          "password":"890123",
          "telephone":"13261205132",
          "role":"0"
        }
        this.$axios({
          method:'post',
          url:this.$sudleurl+'register/',
          params:datas,
        }).then(function(response){
          console.log(response)
        })
      },
      handleEdit(index, row) {
        this.editshow=true
        this.noeditshow=false
        console.log(index, row);
      },
      handleDelete(index, row) {
        this.tableData.splice(index,1);
      },
      handleAdd(index, row){
        this.loginshow=true;
        console.log(index, row);
      },
      handleQuere(index, row){
        var datas={
          "id":row.id,
          "username":row.name,
          "password":row.password,
          "telephone":row.telephone,
          "role":row.role
        }
        console.log(datas)
        this.$axios({
          method:'post',
          url:this.$sudleurl+'updateuser/',
          params:datas,
        }).then(function(response){
          console.log(response)
        })
        this.editshow=false
        this.noeditshow=true        
      },
      loginbtns:function(){
        var datas={
          "username":this.names,
          "password":this.passwords,
          "telephone":this.telephones,
          "role":this.roles
        }
        this.$axios({
          method:'post',
          url:this.$sudleurl+'login/',
          params:datas,
        }).then(function(response){
          console.log(response)
        })
        this.loginshow=false;
      },
      closelogin:function(e){
        this.loginshow=false;
      }
    }
  }
</script>
<style type="text/css">
  .suddletips{
    position: absolute;
    top: 20%;
    left: 20%;
    width: 40%;
    height: 40%;
    background: #333;
    padding: 10px;
    border-radius: 5px;
  }
  .suddletips .el-alert__content,.suddletips p{
    height: 100%;
    width: 100%;
  }
  .suddletips input,.suddletips select{
    width: 100%;
    height: 30px;
    margin: 5px;
  }
  .suddletipswip{
    display: flex;
    flex-direction:column;
  }
</style>

@所有人
【每日练习-6.28】
1、项目经理与两名关键相关方开会，这两名相关方都识别到将产生严重项目风险的事件。
由于只有有限的资源可用。项目经理应该怎么做？
A.制定风险排序表。
B.执行定性风险分析。
C.执行定量风险分析。
D.更新风险管理计划。
b
---------------
2、项目团队成员报告了项目执行期间的一个潜在风险。哪一项工具或技术支持风险控制？
A.定量风险分析
B.风险登记册
C.风险审计
D.定性风险分析
c
---------------
3、分包商无法履行合同。结果导致项目整合延期，且项目将无法按时完成。
项目经理应该怎么做？
A.审查风险应对计划
B.审查分包商的承诺
C.变更进度基准，并通知客户
D.签发变更请求
a
---------------
4、在项目启动阶段识别到的一个风险在执行阶段发生了。影响很大，可能导致项目环境的
重大变更。
项目经理应该怎么做？
A.在变更日志中创建一项新变更，执行影响分析，并准备一份项目状态报告
B.更新风险登记册，创建并持续监控问题日志当中的问题
C.在问题日志中创建一项新问题，并立即通知相关方
D.更新风险登记册，并在变更日志中创建一项新变更，包含风险登记册中的详情
d
---------------
5、项目经理正在实施一项对公司经营至关重要的新软件应用程序。在风险分析期间，由于项 目所在地能源供应问题，一名团队成员识别到一个高发生概率的电气故障风险。这可能影响 服务器，让应用程序不可用。项目发起人同意建立一个备用辅助站点。
这使用的是什么风险应对策略？
A.转移
B.接受
C.回避
D.减轻
d