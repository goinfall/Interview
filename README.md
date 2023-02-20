# Interview
这是一个面试的题目,主要考察面试者的编程能力,仅实现服务端的逻辑开发

启动本服务端，你需要配置如下信息

1、生成DB信息

CREATE TABLE `user` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `user_name` varchar(255) DEFAULT NULL COMMENT '用户名',
  `nick_name` varchar(255) DEFAULT NULL COMMENT '用户昵称',
  `age` int DEFAULT NULL COMMENT '年龄',
  `is_delete` tinyint NOT NULL DEFAULT '0' COMMENT '是否删除  0:未删除  1:已删除',
  `create_by` varchar(255) DEFAULT 'System' COMMENT '注册人',
  `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '生成时间',
  `modify_by` varchar(255) DEFAULT NULL COMMENT '修改人',
  `modify_time` datetime DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COLLATE=utf8

2、服务器需要配置相关的环境，比如：JVM

3、如果你想使用CI/CD进行部署，大致需要完成下面几部
    3.1 maven 打包：mvn clean install package -Dmaven.test.skip=true
    3.2 文件移动, 将生成的jar包文件放到特定的目录下
    3.3 用java启动jar的方式启动 java -jar xxx.jar
    3.4 执行健康检查，可以执行服务的HealhController
  
 4、整体代码的测试使用postman进行测试
 
