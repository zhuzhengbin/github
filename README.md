本项目主要用于对新技术（比如MyBatis等）进行实践，一般不涉及具体业务。


SpringBoot版本：2.2.8
（此版本主要是为了兼容一些SpringBoot的老特性）
MySQL版本： 5.7.29





参考淘宝:

**已实现的功能：**
封装统一的消息返回体
整合MyBatis操作MySQL数据库
整合Swagger到项目
定时任务写入数据
更换项目启动时的Spring标志
加入日志，在重要步骤处加上日志信息
为定时任务加上开关，修改数据库可以对其进行启停


**待实现的功能：**
用户身份认证（包括注册、登录、密码加密存储）
根据数据分区定期删除数据
数据分页功能
事务控制
封装异常处理并打印错误码
加入MyBatis-Plus来生成实体类


