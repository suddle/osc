import Vue from 'vue'
import Router from 'vue-router'
import one from '@/pages/one'
import two from '@/pages/two'
import three from '@/pages/three'
import four from '@/pages/four'
import five from '@/pages/five'
import six from '@/pages/six'
/*import search from '@/pages/search'*/
  Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: 'one',
      component: one
    },
    {
      path: '/two',
      name: 'two',
      component: two
    },
     {
      path: '/three',
      name: 'three',
      component: three
    },
     {
      path: '/four',
      name: 'four',
      component: four
    },
    {
      path: '/five',
      name: 'five',
      component: five
    },
    {
      path: '/six',
      name: 'six',
      component: six
    },
   
  ]
})
