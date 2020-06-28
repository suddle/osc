<template>
  <el-table
    :data="tableData"
    style="width: 100%">
    <el-input v-model="input" placeholder="请输入内容"></el-input>
    <el-table-column
    label="文件名"
      width="180">
      <template slot-scope="scope">
        <el-popover trigger="hover" placement="top">
          <p>姓名: {{ scope.row.name }}</p>
          <p>住址: {{ scope.row.address }}</p>
          <div slot="reference" class="name-wrapper">
            <el-tag size="medium">{{ scope.row.name }}</el-tag>
          </div>
        </el-popover>
      </template>
    </el-table-column>
    <el-table-column label="操作">
      <template slot-scope="scope">
        <el-button
          size="mini"
          @click="handleEdit(scope.$index, scope.row)">上传</el-button>
          <el-button
          size="mini"
          @click="handleAdd(scope.$index, scope.row)">下载</el-button>
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
          name: '王小虎',
        }, {
          name: '王小虎',
        }, {
          name: '王小虎',
        }, {
          name: '王小虎',
        }],
        input: ''
      }
    },
    methods: {
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