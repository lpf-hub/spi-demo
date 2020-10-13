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
3. SPI机制
Java SPI机制是“基于接口的编程 + 策略模式 + 配置文件“的方式实现动态加载机制
4. 策略模式
- Context上下文角色
  封装策略角色，在创建Context对象的时候，指定其中具体的策略角色
- 抽象策略角色
  策略、算法家族的抽象，通常定义为接口或抽象类
- 具体策略角色
  抽象策略的具体实现
- Client客户端
  测试策略模式
