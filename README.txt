
Spring-Boot 结合 Mycat 实现分库分表

	1. 从官网下载mycat http://dl.mycat.io/1.6-RELEASE/ 下载版本
		Mycat-server-1.6-RELEASE-20161028204710-win.tar.gz
		
	2. 解压当前版本，然后找到conf文件：mycat\conf
	
	3. 将github上的config文件包里面的三个文件放入conf中，替换之前的配置
	
	4. 在本地创建三个数据库 db01,db02 db03
	
	5. 分别执行db文件夹对应的sql语句
	
	6. 启动mycat  在mycat\bin目录下执行 startup_nowarp.bat
	
	7. eclipse、maven导入项目
	
	8. 修改application.properties 中数据库的账号和密码
	
	9. 启动项目进行测试