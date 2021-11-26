
CREATE DATABASE IF NOT EXISTS films;
USE films;

DROP TABLE if exists album_actor;
DROP TABLE if exists facts;
DROP TABLE if exists comments;
DROP TABLE if exists user;
DROP TABLE if exists actor;
DROP TABLE if exists film;


CREATE TABLE IF NOT EXISTS film (
  id          int           PRIMARY KEY AUTO_INCREMENT,
  name        varchar(99)   NOT NULL,
  description varchar(1000) NOT NULL
);

CREATE TABLE IF NOT EXISTS actor (
  id          int         PRIMARY KEY AUTO_INCREMENT,
  first_name  varchar(99) NOT NULL,
  second_name varchar(99) NOT NULL,
  rating      int         NOT NULL DEFAULT 0
);

CREATE TABLE IF NOT EXISTS user (
  id    int         PRIMARY KEY AUTO_INCREMENT,
  name  varchar(99) NOT NULL, 
  email varchar(99) NOT NULL
);

CREATE TABLE IF NOT EXISTS comments (
  id      int           PRIMARY KEY AUTO_INCREMENT,
  film_id int,
  user_id int,
  rating  int           NOT NULL DEFAULT 0,
  text    varchar(1000) NOT NULL,

  FOREIGN KEY (film_id) REFERENCES film(id),
  FOREIGN KEY (user_id) REFERENCES user(id)
);

CREATE TABLE IF NOT EXISTS facts (
  id      int PRIMARY KEY AUTO_INCREMENT,
  user_id int,
  text    varchar(1000),

  FOREIGN KEY (user_id) REFERENCES user(id)
);

CREATE TABLE IF NOT EXISTS album_actor (
  id int PRIMARY KEY AUTO_INCREMENT,
  film_id int,
  actor_id int,

  
  FOREIGN KEY (film_id) REFERENCES film(id),
  FOREIGN KEY (actor_id) REFERENCES actor(id)
);

