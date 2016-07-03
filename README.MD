Part 1: some notes about this project
1. This is a sample project to use: AngularJs in frontend, SpringBoot in backend
2. It is using spring data to connect to mongodb and mysql
	2.1. There are 2 optional database: mongodb and mysql
	2.2. This sample aims to how to configure a project with dynamic configuration to let us switch to one of two database.
	2.3 Update pom.xml to have right connection that you want:
		- Keeps both 'spring-boot-starter-data-jpa', and 'spring-data-mongodb', it will priority use jpa (mysql) for its Repository.
		  So it will connect to mysql. I dont know why jpq has higher priority.
		 - Remove 'spring-boot-starter-data-jpa', keep only 'spring-data-mongodb' from pom.xml fie in case 
		 	you want to have mongo connection.
		 
3. As explained above, which kind of database the system will use is belong at pom.xml, so we dont need to create different service,
jpa, and also repository for each database. They can be shared together.

=============
Part2: Installation guide

Please install bower to manage front end resources.

1. Run the following commnd to install dependencies libraries for front end.
$ bower install

mvn spring-boot:run -Drun.profiles=devmysql
mvn spring-boot:run -Drun.profiles=devmongo