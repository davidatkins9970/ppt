<template>
  <div id="app">
    <h1>{{ message }}</h1>
    <ul>
      <li v-for="player in players" :key="player.id">
        {{ player.name }}: {{ player.description }}
      </li>
    </ul>
  </div>
</template>

<script>
export default {
  name: 'App',
  data() {
    return {
      message: 'Welcome to Vue.js in Spring Boot!',
      players: [
        { id: 1, name: 'Lionel Messi', description: 'Argentina\'s superstar' },
        { id: 2, name: 'Cristiano Ronaldo', description: 'World #1-ranked player from Portugal' }
      ]
    };
  }
};
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>