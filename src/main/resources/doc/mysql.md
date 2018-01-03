# 使用mysql中的经验教训

1. 连接服务器的mysql时，要讲配置文件中的bind_address给注释掉；然后再往数据库user表里插入权限数据，刷新。
