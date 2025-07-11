-- Create a new database
CREATE DATABASE IF NOT EXISTS `bookstore`;
USE `bookstore`;

-- Drop table if it already exists
DROP TABLE IF EXISTS `book`;

-- Create a new table
CREATE TABLE `book` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `title` VARCHAR(100) DEFAULT NULL,
  `author` VARCHAR(100) DEFAULT NULL,
  `isbn` VARCHAR(20) DEFAULT NULL,
  `price` DECIMAL(10,2) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
