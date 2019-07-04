# 结构
- dubbo-api：提供接口等基础类，不需要运行
- dubbo-provider：
  - 加载dubbo配置，dubbo.xml
    ，config\PropertiesConfig.java（引入dubbo.properties配置文件及xml文件）
  - 实现接口，定义服务名@Service("demoServiceImpl")
  - 声明需要暴露的服务接口，dubbo-provider.xml
- dubbo-consumer：
  - 加载dubbo配置，和provider一致
  - 定义测试类和方法
 
# 常见问题
### 项目中软件的版本
括号中日期是Maven仓库里显示的日期
- zkServer：3.4.12（1 May, 2018）
- springboot：2.1.6.RELEASE（Jun, 2019）
- com.101tec.zkclient：0.11（Oct, 2018）
- org.apache.zookeeper：3.4.13（Jul, 2018）
- com.alibaba.dubbo：2.6.0（Jan, 2018） 
### IP和Port问题
- zookeeper.connect=localhost:2181
  ，在host文件里面做了映射才可以使用127.0.0.1，
- 注意端口冲突的问题
  