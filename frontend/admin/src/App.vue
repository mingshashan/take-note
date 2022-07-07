<template>
  <img alt="Vue logo" src="./assets/logo.png" />
  <hello-world msg="团团" />
  <div>团团</div>
</template>

<script lang="ts">
import HelloWorld from './components/HelloWorld.vue';

export default {
  name: 'App',
  components: {
    HelloWorld,
  },
};
</script>
