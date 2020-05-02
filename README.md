# boot-mybatis-redis-activemq-shiro
springboot 2.x 整合mybatis，redis，activemq和shiro的工程，在其中附加了mybatis需要使用到的数据库的表信息
#### 当前的所有的功能，只需要在mybatis这个分支之中运行就行了，
#### 需要支持的外部组件和中间件有：mysql, activemq, redis,这三个中间件需要提前启动。

#### 在mybatis-druid的分支之中，是既有mybatis的配置，也有druid的配置，但是，mybatis
#### 的配置是okay的，但是druid的配置是有问题的，因为我们在配置druid的时候，没有使用
#### springboot-druid-stater, 而只是使用了druid的依赖jar包，在对于配置中的DruidDBConfig,
#### 和其他的DruidStatFilter， DruidStatViewServlet应该是只写在一个config类之中，
#### 而不是写在三个里面，所以这块有问题，现在我们只需要使用springboot-druid-stater来
#### 完成配置，其他的DruidDBConfig，其实是可以不写的，除非是我们要使用一些比较细节的配置，
#### 常用的配置，springboot-druid-stater已经提供了默认值。