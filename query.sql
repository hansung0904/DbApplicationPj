use nhn_academy_12;

-- -----------------------------------------------------
-- Data for table `user`
-- -----------------------------------------------------
select * from user;
DROP TABLE `user` ;

CREATE TABLE IF NOT EXISTS `user` (
  `id` VARCHAR(11) NOT NULL,
  `password` VARCHAR(18) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;

insert into `user` (`id`, `password`) values('admin','admin');
insert into `user` (`id`, `password`) values('asd','asd');
insert into `user` (`id`, `password`) values('pyj','pyj');
insert into `user` (`id`, `password`) values('chs','chs');



-- -----------------------------------------------------
-- Data for table `boardContent`
-- -----------------------------------------------------
select * from boardContent;
DROP TABLE `boardContent` ;

CREATE TABLE IF NOT EXISTS `boardContent` (
  `contentSerialNumber` INT(11) NOT NULL,
  `title` VARCHAR(100) NOT NULL,
  `classNumber` INT(1) NOT NULL, -- 0 글 1 댓글 
  `content` VARCHAR(1500) NOT NULL,
  `file` text(16383) NOT NULL,
  `writeTime` DATE NOT NULL,
  `like` INT(6) NOT NULL,
  `replyLimit` INT(1) NOT NULL,
  `id` VARCHAR(11) NOT NULL,
  
  PRIMARY KEY (`contentSerialNumber`))
ENGINE = InnoDB;

insert into `boardContent` (`contentSerialNumber`, `title` , `classNumber`, `content`, `file`, `writeTime`, `like`, `replyLimit`, `id`)
 values(1,'test1 title', 0, 'test1 content', 'aaa', '2022-05-14 00:00:00', 0, 5, 'admin' );

insert into `boardContent` (`contentSerialNumber`, `title` , `classNumber`, `content`, `file`, `writeTime`, `like`, `replyLimit`, `id`)
 values(2,'test1 title', 0, 'test1 content', 'aaa', '2022-05-14 00:00:00', 0, 5, 'admin' );

insert into `boardContent` (`contentSerialNumber`, `title` , `classNumber`, `content`, `file`, `writeTime`, `like`, `replyLimit`, `id`)
 values(3,'test1 title', 0, 'test1 content', 'aaa', '2022-05-14 00:00:00', 0, 5, 'admin' );

insert into `boardContent` (`contentSerialNumber`, `title` , `classNumber`, `content`, `file`, `writeTime`, `like`, `replyLimit`, `id`)
 values(4,'test1 title', 0, 'test1 content', 'aaa', '2022-05-14 00:00:00', 0, 5, 'admin' );

insert into `boardContent` (`contentSerialNumber`, `title` , `classNumber`, `content`, `file`, `writeTime`, `like`, `replyLimit`, `id`)
 values(5,'test1 title', 0, 'test1 content', 'aaa', '2022-05-14 00:00:00', 0, 5, 'admin' );

insert into `boardContent` (`contentSerialNumber`, `title` , `classNumber`, `content`, `file`, `writeTime`, `like`, `replyLimit`, `id`)
 values(6,'test1 title', 0, 'test1 content', 'aaa', '2022-05-14 00:00:00', 3, 5, 'asd' );

insert into `boardContent` (`contentSerialNumber`, `title` , `classNumber`, `content`, `file`, `writeTime`, `like`, `replyLimit`, `id`)
 values(7,'test1 title', 0, 'test1 content', 'aaa', '2022-05-14 00:00:00', 5, 5, 'asd' );

insert into `boardContent` (`contentSerialNumber`, `title` , `classNumber`, `content`, `file`, `writeTime`, `like`, `replyLimit`, `id`)
 values(8,'test1 title', 0, 'test1 content', 'aaa', '2022-05-14 00:00:00', 10, 5, 'asd' );

insert into `boardContent` (`contentSerialNumber`, `title` , `classNumber`, `content`, `file`, `writeTime`, `like`, `replyLimit`, `id`)
 values(9,'test1 title', 0, 'test1 content', 'aaa', '2022-05-14 00:00:00', 11, 5, 'asd' );

insert into `boardContent` (`contentSerialNumber`, `title` , `classNumber`, `content`, `file`, `writeTime`, `like`, `replyLimit`, `id`)
 values(10,'test1 title', 0, 'test1 content', 'aaa', '2022-05-14 00:00:00', 0, 5, 'asd' );

insert into `boardContent` (`contentSerialNumber`, `title` , `classNumber`, `content`, `file`, `writeTime`, `like`, `replyLimit`, `id`)
 values(11,'test1 title', 0, 'test1 content', 'aaa', '2022-05-14 00:00:00', 0, 5, 'pyj' );

insert into `boardContent` (`contentSerialNumber`, `title` , `classNumber`, `content`, `file`, `writeTime`, `like`, `replyLimit`, `id`)
 values(12,'test1 title', 0, 'test1 content', 'aaa', '2022-05-14 00:00:00', 0, 5, 'pyj' );

insert into `boardContent` (`contentSerialNumber`, `title` , `classNumber`, `content`, `file`, `writeTime`, `like`, `replyLimit`, `id`)
 values(13,'test1 title', 0, 'test1 content', 'aaa', '2022-05-14 00:00:00', 0, 5, 'pyj' );

insert into `boardContent` (`contentSerialNumber`, `title` , `classNumber`, `content`, `file`, `writeTime`, `like`, `replyLimit`, `id`)
 values(14,'test1 title', 0, 'test1 content', 'aaa', '2022-05-14 00:00:00', 0, 5, 'pyj' );

insert into `boardContent` (`contentSerialNumber`, `title` , `classNumber`, `content`, `file`, `writeTime`, `like`, `replyLimit`, `id`)
 values(15,'test1 title', 0, 'test1 content', 'aaa', '2022-05-14 00:00:00', 0, 5, 'pyj' );

insert into `boardContent` (`contentSerialNumber`, `title` , `classNumber`, `content`, `file`, `writeTime`, `like`, `replyLimit`, `id`)
 values(16,'test1 title', 0, 'test1 content', 'aaa', '2022-05-14 00:00:00', 3, 5, 'chs' );

insert into `boardContent` (`contentSerialNumber`, `title` , `classNumber`, `content`, `file`, `writeTime`, `like`, `replyLimit`, `id`)
 values(17,'test1 title', 0, 'test1 content', 'aaa', '2022-05-14 00:00:00', 5, 5, 'chs' );

insert into `boardContent` (`contentSerialNumber`, `title` , `classNumber`, `content`, `file`, `writeTime`, `like`, `replyLimit`, `id`)
 values(18,'test1 title', 0, 'test1 content', 'aaa', '2022-05-14 00:00:00', 10, 5, 'chs' );

insert into `boardContent` (`contentSerialNumber`, `title` , `classNumber`, `content`, `file`, `writeTime`, `like`, `replyLimit`, `id`)
 values(19,'test1 title', 0, 'test1 content', 'aaa', '2022-05-14 00:00:00', 11, 5, 'chs' );

insert into `boardContent` (`contentSerialNumber`, `title` , `classNumber`, `content`, `file`, `writeTime`, `like`, `replyLimit`, `id`)
 values(20,'test1 title', 0, 'test1 content', 'aaa', '2022-05-14 00:00:00', 0, 5, 'chs' );


-- -----------------------------------------------------
-- Data for table `boardList`
-- -----------------------------------------------------
select * from boardList;
DROP TABLE `boardList`;

CREATE TABLE IF NOT EXISTS `boardList` (
	`title` VARCHAR(100) NOT NULL,
    `writeTime` DATE NOT NULL,
    `modifyTime` DATE NULL,
    `contentCount` INT(11) NOT NULL)
ENGINE = InnoDB;

insert into `boardList` (`title`, `writeTime` , `modifyTime`, `contentCount`)
 values('test1 title', '2022-05-14 00:00:00', '2022-05-14 00:00:00', 20);
 