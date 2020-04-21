默认账号：13040779477  密码：123456  
在网页打开： localhost:8080  
## 项目架构
```
|--- pom                                        // acblog配置文件
|--- blog-plus.sql                              // acblog数据库设计
|--- src                                        // 源代码
|--- |--- main                                  // 代码页
          |--- Java                             // 后台代码
             |--- common                        // 公共类
                   |--- config                  // 配置类(以.config后缀结尾)
                   |--- utils                   // 工具类
                        |--- phoneVerify        // 腾讯云短信验证代码
         |--- modules                           // 服务端代码
                  |--- controller               // 表现层
                  |--- dao                      // 持久层
                  |--- entity                   // 实体层
                  |--- service                  // 业务逻辑层
                  |--- shiro                    // shiro配置类
                  |--- AcblogApplication        // spring boot启动类
|--- |--- resources                             // 资源
              |--- mappering                    // 持久层xml文件
              |--- static                       // 静态文件
              |--- templates                    // 前端页面
              |--- application.properties       // 全局配置类
              |--- application.yml              // 全局配置类
              |--- application-dev.yml          // 全局配置类(开发者模式)
              |--- application-test.yml         // 全局配置类(测试者模式)
              |--- application-prod.yml         // 全局配置类(生产者模式)
```

## 技术展示
### 后台：
项目构建：Maven  
web框架： spring boot  
数据持久层： mybatis-plus  
安全框架： shiro  
缓存：redis  
数据库：Mysql  
### 前台
前台框架：[layui框架](https://www.layui.com/ "layui框架") [amazeui框架](https://amazeui.clouddeep.cn/ "amazeui框架")  
前端模板： thymeleaf  

#### 打包上传部署
- 使用jar包部署方式，使用守护进程方式部署，`nohup java -jar blog.jar >temp.txt &`

- 使用shiro做安全框架，前后端分离必须使用session管理个人信息

