CREATE DATABASE agile DEFAULT CHARSET 'utf8';
USE agile;

show databases;

CREATE TABLE IF NOT EXISTS `user`(
   `id` INT UNSIGNED AUTO_INCREMENT,
   `forname` varchar(40) NOT NULL,
   `surname` VARCHAR(40) NOT NULL,
   `email` VARCHAR(40) NOT NULL,
   `password` VARCHAR(40) NOT NULL,
   `skills` VARCHAR(40) NOT NULL,
   PRIMARY KEY ( `id` )
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

select * from user;

CREATE TABLE IF NOT EXISTS `role`(
   `id` INT UNSIGNED AUTO_INCREMENT,
   `title` varchar(40) NOT NULL,
   `selectable` bool NOT NULL,
   PRIMARY KEY ( `id` )
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

select * from role;

CREATE TABLE IF NOT EXISTS `project`(
   `id` INT UNSIGNED AUTO_INCREMENT,
   `title` varchar(40) NOT NULL,
   PRIMARY KEY ( `id` )
)ENGINE=InnoDB DEFAULT CHARSET=utf8;


CREATE TABLE IF NOT EXISTS `userStory`(
   `id` INT UNSIGNED AUTO_INCREMENT,
   `projectID` int NOT NULL,
   `title` varchar(40) NOT NULL,
   `description` varchar(400) NOT NULL,
   PRIMARY KEY ( `id` )
)ENGINE=InnoDB DEFAULT CHARSET=utf8;


CREATE TABLE IF NOT EXISTS `sprint`(
   `id` INT UNSIGNED AUTO_INCREMENT,
   `sptintTitle` varchar(40) NOT NULL,
   `duration` int NOT NULL,
   `inProgress` bool NOT NULL,
   `blocked` bool NOT NULL,
   PRIMARY KEY ( `id` )
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE IF NOT EXISTS `task`(
   `id` INT UNSIGNED AUTO_INCREMENT,
   `title` varchar(40) NOT NULL,
   `inProgress` bool NOT NULL,
   `blocked` bool NOT NULL,
   `taskType` varchar(40) NOT NULL,
   `duration` int NOT NULL,
   `taskDetails` varchar(400) NOT NULL,
   PRIMARY KEY ( `id` )
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE IF NOT EXISTS `sprintTeam`(
   `id` INT UNSIGNED AUTO_INCREMENT,
   `teamName` varchar(40) NOT NULL,
   `isAssigned` bool NOT NULL,
   PRIMARY KEY ( `id` )
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

show tables;





