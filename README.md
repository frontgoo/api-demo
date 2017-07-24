# GXB服务端SDK与DEMO(Java)

代码基于各业务线对外文档，具体细节部分请参考API文档

## 安装

    $ git clone https://github.com/hammeras/api-demo.git
    $ cd api-demo
    $ mvn install

## Maven设置

 ```xml
    <properties>
        <gxb-sdk.version>INSERT VERSION HERE</gxb-sdk.version>
    </properties>
    <!-- 添加依赖 -->
    <dependency>
        <groupId>com.gxb.sdk</groupId>
        <artifactId>api-demo</artifactId>
        <version>${gxb-sdk.version}</version>
     </dependency>
 ```

## Requirements

* Java  6,7,8
* Maven 3.2.3+

我司的环境配置如下

```
Distributor ID: CentOS
Description:    CentOS release 6.5 (Final)
Release:    6.5
Codename:   Final

Server version: Apache Tomcat/8.0.30
Server built:   Dec 1 2015 22:30:46 UTC
Server number:  8.0.30.0
OS Name:        Linux
OS Version:     2.6.32-431.el6.x86_64
Architecture:   amd64
JVM Version:    1.8.0_111-b14
JVM Vendor:     Oracle Corporation

Maven 3.3.3
```
## Api调用例子

参考TestCase