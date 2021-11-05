CREATE DATABASE IF NOT EXISTS spring_blog_db;

CREATE USER spring_blog_user@localhost;
# CREATE USER root@localhost IDENTIFIED BY 'password'
GRANT ALL ON spring_blog_db.* TO spring_blog_user@localhost;

