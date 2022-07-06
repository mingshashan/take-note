import { createApp } from 'vue'
import {Button} from 'tdesign-vue-next'
import 'tdesign-vue-next/es/style/index.css'
import {store, key} from './store'
import App from './App.vue'
import router from './router/index'

const app = createApp(App)
app.use(Button)
app.use(router)
app.use(store, key)
app.mount('#app')
