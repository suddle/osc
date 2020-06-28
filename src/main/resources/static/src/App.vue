<template>
  <el-container>
    <el-aside width="200px">
      <el-row class="tac">
        <el-col :span="24">
          <el-menu default-active="2" class="el-menu-vertical-demo"  text-color="#fff" active-text-color="#ffd04b">
            <el-menu-item index="1">
              <i class="el-icon-s-custom"></i>
              <span slot="title"><router-link :to="{ name: 'one' }">用户管理</router-link></span>
            </el-menu-item>
            <el-menu-item index="2">
              <i class="el-icon-s-check"></i>
              <span slot="title"><router-link :to="{ name: 'two' }">职位管理</router-link></span>
            </el-menu-item>
            <el-menu-item index="3">
              <i class="el-icon-setting"></i>
              <span slot="title"><router-link :to="{ name: 'three' }">员工管理</router-link></span>
            </el-menu-item>
            <el-menu-item index="4">
              <i class="el-icon-postcard"></i>
              <span slot="title"><router-link :to="{ name: 'four' }">公告管理</router-link></span>
            </el-menu-item>
            <el-menu-item index="5">
              <i class="el-icon-office-building"></i>
              <span slot="title"><router-link :to="{ name: 'five' }">部门管理</router-link></span>
            </el-menu-item>
            <el-menu-item index="6">
              <i class="el-icon-notebook-2"></i>
              <span slot="title"><router-link :to="{ name: 'six' }">下载中心</router-link></span>
            </el-menu-item>
          </el-menu>
        </el-col>
      </el-row>
    </el-aside>
    <el-container>
      <el-header>人事管理系统
        <span style="float:right;">
          <el-button type="primary" @click=login>登陆</el-button>
          <el-button type="success" @click="register">注册</el-button>
        </span>
      </el-header>
      <el-main>
        <router-view></router-view>
      </el-main>
      <el-alert title="" type="success" class="suddletip" @close="closelogin" v-show=loginshow>
        <div>
          <el-input v-model="name" placeholder="" maxlength=6></el-input>
          <el-input v-model="password" placeholder="请输入内容"  maxlength=20></el-input>
          <el-input v-model="telephone" placeholder="请输入内容" v-show=isshowtelephone  maxlength=11></el-input>
          <el-select v-model="role" placeholder="请选择" v-show=isshowrole>
            <el-option
            v-for="item in options"
            :key="item.role"
            :label="item.label"
            :value="item.role">
          </el-option>
        </el-select>
        <el-button type="success" @click="loginbtn">提交</el-button>
      </div>
    </el-alert>
    <el-footer>
      关于该系统的一些说明
    </el-footer>
  </el-container>
</el-container>
</template>
<script>
  export default {
    name: 'App',
    data () {
      return {
        msg: '我来了',
        ass:1,
        loginshow:false,
        name:"名字",
        password:"密码",
        telephone:"电话",
        role:"角色",
        isshowtelephone:false,
        isshowrole:false,
        options: [{
          role: '0',
          label: '管理者'
        }, {
          role: '1',
          label: '一般人员'
        }],
        role: '',
        loginurl:"",
      }
    },
    created(){

    },
    methods:{
      register:function(){
        this.loginurl=this.$sudleurl+'register/'
        this.loginshow=true;
        this.isshowrole=true;
        this.isshowtelephone=true;
      },
      login:function(){
        this.loginurl=this.$sudleurl+'login/'
        this.loginshow=true;
        this.isshowrole=false;
        this.isshowtelephone=false;
      },
      loginbtn:function(){
        var datas={
          "username":this.name,
          "password":this.password,
          "telephone":this.telephone,
          "role":this.role
        }
        this.$axios({
          method:'post',
          url:this.loginurl,
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
<style>
  .suddletip{
    position: absolute;
    top: 20%;
    left: 20%;
    width: 40%;
    height: 40%;
    background: #333;
    padding: 10px;
    border-radius: 5px;
  }
  .suddletip input{
    margin: 5px;
  }
  .links{
    height: 50px;
  }
  html,body{
    margin:0;
    padding:0;
    height: 100%;
    width: 100%;
  }
  .el-container{
    height: 100%;
  }
  .el-header, .el-footer {
    background-color: #B3C0D1;
    color: #333;
    text-align: center;
    line-height: 60px;
  }
  .el-aside {
    background-color: #D3DCE6;
    color: #333;
    text-align: center;
    line-height: 200px;
  }
  .el-main {
    background-color: #E9EEF3;
    color: #333;
    text-align: center;
    line-height: 160px;
  }
  .el-container:nth-child(5) .el-aside,
  .el-container:nth-child(6) .el-aside {
    line-height: 260px;
  }
  .el-container:nth-child(7) .el-aside {
    line-height: 320px;
  }
</style>
