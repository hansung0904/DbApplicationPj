use nhn_academy_12;

DROP TABLE IF EXISTS `user` ;

CREATE TABLE IF NOT EXISTS `user` (
  `id` VARCHAR(11) NOT NULL,
  `password` VARCHAR(18) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


DROP TABLE IF EXISTS `boardContent` ;

CREATE TABLE IF NOT EXISTS `boardContent` (
  `contentSerialNumber` INT(11) NOT NULL,
  `title` VARCHAR(100) NOT NULL,
  `classNumber` INT(1) NOT NULL,
  `content` VARCHAR(1500) NOT NULL,
  `file` VARCHAR(65535) NOT NULL,
  `writeTime` DATE NOT NULL,
  `like` INT(6) NOT NULL,
  `replyLimit` INT(1) NOT NULL,
  `id` VARCHAR(11) NOT NULL,
  
  PRIMARY KEY (`contentSerialNumber`))
  
ENGINE = InnoDB;


DROP TABLE IF EXISTS `boardList`;

CREATE TABLE IF NOT EXISTS `boardList` (
	`title` VARCHAR(100) NOT NULL,
    `writeTime` DATE NOT NULL,
    `modifyTime` DATE NULL,
    `contentCount` INT(11) NOT NULL,
    PRIMARY KEY (`title`))
ENGINE = InnoDB;