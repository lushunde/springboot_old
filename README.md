# springboot
每个分支是一个测试项目

# master 基本目录   集成了多环境配置文件
dev 开发文件，product 生产环境
开发环境通过 com.lushunde.springboot.Application 启动，使用哪个环境开关在pom.xml <activeByDefault>true</activeByDefault>
打包的时候使用  mvn clean package -Pdev     -P参数后面跟dev|product，只要是pom.xml <id>dev</id>
logback多环境  配置文件制定加载文件和监控等级