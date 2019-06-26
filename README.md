# 在线网络商城
Team 14
```shell
# 1.执行下面命令将代码下载到本地（需安装git客户端，如果没有安装则在此页面选择Download as zip 方式下载到本地）
git clone https://github.com/rookiesong/online-shopping-mall.git

# 2.在本地或者远程MySQL数据库中执行Shopping/db/路径下的Shooping SQL语句以创建数据库。（需本机安装MySQL，版本建议在5.7或以下，高版本连接会出问题。执行SQL语句可使用命令行或者Navicat等工具。）

# 3.打开Shopping/src/main/resources/properties/路径下的database.properties配置文件，把数据库连接地址，用户名和密码改成自己的

# 4.执行以下maven命令（需本地安装Maven）
mvn clean
mvn package

# 5.在生成的target目录下可找到Shopping.war包

# 6.将war包复制到Tomcat安装目录下的webapps文件夹下，重启Tomcat服务器（需要下载Tomcat，版本在8.0或者以上）

# 7.访问 http://localhost:8080/Shopping 来查看效果。（注册普通用户，然后在数据库中将用户role字段改为1即可访问控制台页面，进行商品的增加和删除。）
```

### 系统架构
#### 系统图
![image](https://github.com/rookiesong/online-shopping-mall/blob/master/images/%E7%B3%BB%E7%BB%9F%E5%9B%BE.jpg)
#### 容器图
![image](https://github.com/rookiesong/online-shopping-mall/blob/master/images/%E5%AE%B9%E5%99%A8%E5%9B%BE.jpg)
#### 组件图
![image](https://github.com/rookiesong/online-shopping-mall/blob/master/images/%E7%BB%84%E4%BB%B6%E5%9B%BE.jpg)

