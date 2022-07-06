module.exports = {
  plugin: [
    // 配置autoprefixer插件
    require('autoprefixer')({
      'overrideBrowserslist': ['last 2 versions']
    })    
  ]
}