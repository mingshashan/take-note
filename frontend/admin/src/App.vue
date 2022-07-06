<template>
  <img alt="Vue logo" src="./assets/logo.png">
  <HelloWorld msg="团团"/>
  <div>团团</div>
</template>

<script lang="ts">
import HelloWorld from './components/HelloWorld.vue'

export default {
  name: 'App',
  components: {
    HelloWorld
  }
}
</script>

<style lang="scss" scoped>
  $color: #f00;
  div {
    display: flex;
    color: $color
  }
</style>