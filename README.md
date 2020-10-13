# spi-demo
关于Java SPI机制的实现，本工程是一个纯Java工程
其中用到了：
1. IDEA创建多模块工程
- 父工程为spi-demo
- 子模块包括：
  - spi-interface
  - spi-core
  - spi-girl
  - spi-boy
2. gradle的使用：
- gradle引入第三方依赖
  - 同一工程引入其他模块
  - 引入第三方jar
- gradle打包工程
  - 默认Java工程打包得到的jar中不包含依赖
  - 使用插件引入第三方依赖jar
