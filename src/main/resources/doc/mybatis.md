# 整合MyBatis过程

1. 修改Maven项目的配置文件，添加MyBatis和MySQL等依赖。

2. 通过maven插件使用mybatis generator。

3. 要配置application.properties，才能扫描到各种与mybatis相关的文件

4. 将JSON字符串转为Java对象时，要注意变量名的对应

5. 如果要保存时分秒，在MYSQL里面就要用DATETIME，而不能用DATE

6. 中文字符问题解决方案是：进入/etc/mysql，修改my.cnf
    1. 在[client]字段里加入default-character-set=utf8
    2. 在[mysqld]字段里加入character-set-server=utf8
    3. 在[mysql]字段里加入default-character-set=utf8

7. 调用存储过程，不要带分号‘；’