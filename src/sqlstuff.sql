CREATE DATABASE IF NOT EXISTS spring_blog_db;

CREATE USER spring_blog_user;
# CREATE USER root@localhost IDENTIFIED BY 'password'
GRANT ALL ON spring_blog_db.* TO spring_blog_user;

USE spring_blog_db;
# insert into posts (title, body) values ('Superman/Doomsday ', 'Action|Animation');
# insert into posts (title, body) values ('Peaceful Warrior', 'Drama');
# insert into posts (title, body) values ('Center of the World, The', 'Drama');
# insert into posts (title, body) values ('Soldier, The', 'Action');
# insert into posts (title, body) values ('Arizona', 'Western');
# insert into posts (title, body) values ('Trog', 'Horror|Sci-Fi');
# insert into posts (title, body) values ('Dragon Tiger Gate (Lung fu moon)', 'Action|Drama');
# insert into posts (title, body) values ('Marie from the Bay of Angels (Marie Baie Des Anges)', 'Drama');
# insert into posts (title, body) values ('Barber, The', 'Crime|Horror|Mystery|Thriller');
# insert into posts (title, body) values ('Lady Takes a Chance, A', 'Comedy|Romance|Western');
# insert into posts (title, body) values ('Gasland Part II', 'Documentary');
# insert into posts (title, body) values ('Fall of the House of Usher, The (Zánik domu Usheru)', 'Animation');
# insert into posts (title, body) values ('Dungeons & Dragons', 'Adventure|Fantasy');
# insert into posts (title, body) values ('Wuthering Heights', '(no genres listed)');
# insert into posts (title, body) values ('Sometimes Happiness, Sometimes Sorrow (Kabhi Khushi Kabhie Gham)', 'Drama|Musical|Romance');
# insert into posts (title, body) values ('Border Radio', 'Drama');
# insert into posts (title, body) values ('Piano Teacher, The (La pianiste)', 'Drama');
# insert into posts (title, body) values ('Fabulous Baker Boys, The', 'Drama|Romance');
# insert into posts (title, body) values ('Outrage (Autoreiji)', 'Crime|Drama');
# insert into posts (title, body) values ('Every Little Step', 'Documentary');
# insert into posts (title, body) values ('Bandwagon', 'Comedy');
# insert into posts (title, body) values ('Radio Rebel', 'Drama');
# insert into posts (title, body) values ('Love (Szerelem)', 'Drama');
# insert into posts (title, body) values ('Call Me Crazy: A Five Film', 'Drama');
# insert into posts (title, body) values ('Cube of Sugar, A (Ye Habe Ghand)', 'Comedy|Drama');
# insert into posts (title, body) values ('Hudsucker Proxy, The', 'Comedy');
# insert into posts (title, body) values ('Lawless, The', 'Drama');
# insert into posts (title, body) values ('Dream Wife', 'Comedy|Romance');
# insert into posts (title, body) values ('Tooth Fairy', 'Comedy|Fantasy');
# insert into posts (title, body) values ('Every Night Dreams (Each Night I Dream) (Yogoto no yume)', 'Drama');
# insert into posts (title, body) values ('Leprechaun 4: In Space', 'Comedy|Fantasy|Horror|Sci-Fi');
# insert into posts (title, body) values ('Trailer Park Boys: Live at the North Pole', 'Comedy');
# insert into posts (title, body) values ('Vanity Fair', 'Drama|Romance');
# insert into posts (title, body) values ('Batman', 'Action|Adventure|Crime|Sci-Fi|Thriller');
# insert into posts (title, body) values ('Marie-Jo and Her 2 Lovers (Marie-Jo et ses 2 amours)', 'Comedy|Drama');
# insert into posts (title, body) values ('Fateless (Sorstalanság)', 'Drama|War');
# insert into posts (title, body) values ('Eagle vs Shark', 'Comedy');
# insert into posts (title, body) values ('No One Lives', 'Horror|Thriller');
# insert into posts (title, body) values ('In Eagle Shadow Fist (Ding tian li di) (Fist of Anger)', 'Action|Drama|War');
# insert into posts (title, body) values ('Red Spectacles, The (Jigoku no banken: akai megane)', 'Comedy|Drama|Sci-Fi');
# insert into posts (title, body) values ('Jade', 'Thriller');
# insert into posts (title, body) values ('Girl, The', 'Drama');
# insert into posts (title, body) values ('Muriel''s Wedding', 'Comedy');
# insert into posts (title, body) values ('Fighter, The', 'Drama');
# insert into posts (title, body) values ('Red Heat', 'Action');
# insert into posts (title, body) values ('Room Service', 'Comedy');
# insert into posts (title, body) values ('Chinese Odyssey 2002 (Tian xia wu shuang)', 'Action|Comedy|Romance');
# insert into posts (title, body) values ('Lenny', 'Drama');
# insert into posts (title, body) values ('Ghostmaker, The (Box of Shadows)', 'Horror|Sci-Fi|Thriller');
# insert into posts (title, body) values ('Free Samples', 'Comedy|Drama');

TRUNCATE posts;

UPDATE users SET email = "shirleyp1097@gmail.com" WHERE id = 1;

CREATE DATABASE IF NOT EXISTS draco_spring_blog_db;
USE draco_spring_blog_db;
CREATE TABLE users;
CREATE TABLE posts;