import { createRouter, createWebHashHistory } from 'vue-router';

const Home = () => import('../views/Home.vue');
const User = () => import('../views/User.vue');

const routes = [
  {
    path: '/home',
    name: 'home',
    component: Home,
  },
  {
    path: '/user',
    name: 'user',
    component: User,
  },
  {
    path: '/',
    name: '/home',
    component: Home,
  },
];

export default createRouter({
  history: createWebHashHistory(),
  routes,
});
