# 使用mysql中的经验教训

1. 连接服务器的mysql时，要讲配置文件中的bind_address给注释掉；然后再往数据库user表里插入权限数据，刷新。

2. 为什么这个依赖要额外添加一个标签？
        <dependency>
            <groupId>net.sf.json-lib</groupId>
            <artifactId>json-lib</artifactId>
            <version>2.4</version>
            <classifier>jdk15</classifier>
        </dependency>
   
3. select的括号要记得删去，不然会报错

4. 时间差了几个小时，要修改时区;每次重启mysql服务，time_zone变量设置会恢复默认。