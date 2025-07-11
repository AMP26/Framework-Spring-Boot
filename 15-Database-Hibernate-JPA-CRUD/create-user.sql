-- 1. Create the database
CREATE DATABASE IF NOT EXISTS `bookstore`;

-- 2. Drop the user if it already exists
DROP USER IF EXISTS 'bookstore'@'%';

-- 3. Create the user with a password
CREATE USER 'bookstore'@'%' IDENTIFIED BY 'bookstore';

-- 4. Grant access only to the `bookstore` database
GRANT ALL PRIVILEGES ON `bookstore`.* TO 'bookstore'@'%';

-- 5. Apply changes
FLUSH PRIVILEGES;
