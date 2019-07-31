CREATE TABLE IF NOT EXISTS `user`(
   `id` INT UNSIGNED AUTO_INCREMENT,
   `name` VARCHAR(200) NOT NULL,
   `mobile` VARCHAR(100) NOT NULL,
   `address` VARCHAR(255),
   `sex` VARCHAR(40),
   `birthday` DATE,
   PRIMARY KEY ( `id` )
)ENGINE=InnoDB DEFAULT CHARSET=utf8;