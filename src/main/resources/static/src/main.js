// The Vue build version to load with the `import` command
// (runtime-only or standalone) has been set in webpack.base.conf with an alias.
import Vue from 'vue'
import App from './App'
import router from './router'
import ElementUI from 'element-ui'
import 'element-ui/lib/theme-chalk/index.css'
import axios from 'axios'
// import scss from 'scss'
import '@/assets/icon/iconfont.css'
import $ from 'jquery'


Vue.prototype.$sudleurl="http://127.0.0.1:9090/"
Vue.prototype.$axios = axios
Vue.config.productionTip = false
Vue.use(ElementUI)
// Vue.use(scss)
/* eslint-disable no-new */
new Vue({
  el: '#app',
  router,
  components: { App },
  template: '<App/>'
})
