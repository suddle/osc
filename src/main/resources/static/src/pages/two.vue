<template>
  <el-table
    :data="tableData"
    style="width: 100%">
    <el-input v-model="input" placeholder="请输入内容"></el-input>
    <el-table-column
    label="职位">
      <template slot-scope="scope">
          <div slot="reference" class="name-wrapper">
            <el-tag size="medium">{{ scope.row.name }}</el-tag>
          </div>
      </template>
    </el-table-column>
    <el-table-column label="操作">
      <template slot-scope="scope">
        <el-button
          size="mini"
          @click="handleEdit(scope.$index, scope.row)">编辑</el-button>
          <el-button
          size="mini"
          @click="handleAdd(scope.$index, scope.row)">增加</el-button>
        <el-button
          size="mini"
          type="danger"
          @click="handleDelete(scope.$index, scope.row)">删除</el-button>
      </template>
    </el-table-column>
    <el-table-column
      align="right">
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
</template>

<script>
  export default {
    data() {
      return {
        tableData: [{
          name:"职位1",
        }],
        input: ''
      }
    },
    created(){
      // this.convert();
      this.getemployeee();
    },
    methods: {
      getemployeee(){
        var that=this;
        this.$axios.get(this.$sudleurl+'getAllEmployee/', {})
        .then(function (response) {
          that.tableData=response.data;
        })
        .catch(function (error) {
          console.log(error,'123123');
        });
      },
      handleEdit(index, row) {
        console.log(index, row);
      },
      handleDelete(index, row) {
        console.log(index, row);
      },
      handleAdd(index, row){
        console.log(index, row);
      }
    }
  }
</script>