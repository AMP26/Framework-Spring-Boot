CREATE DATABASE IF NOT EXISTS `event_booking`;
USE `event_booking`;


DROP TABLE IF EXISTS `event`;

CREATE TABLE `event` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(100) NOT NULL,
  `location` VARCHAR(100),
  `event_date` DATE,
  `price` DECIMAL(10,2),
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4;


INSERT INTO `event` (`id`, `name`, `location`, `event_date`, `price`) VALUES
(1, 'Tech Summit 2025', 'San Francisco', '2025-09-10', 149.99),
(2, 'Art & Wine Festival', 'Napa Valley', '2025-08-15', 89.50),
(3, 'Startup Pitch Night', 'New York', '2025-10-01', 49.00),
(4, 'Gaming Expo', 'Los Angeles', '2025-11-20', 119.00),
(5, 'Music Fiesta', 'Austin', '2025-12-05', 79.99);
