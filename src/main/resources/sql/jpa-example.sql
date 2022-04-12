CREATE
DATABASE  IF NOT EXISTS `jpa-example` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE
`jpa-example`;

CREATE TABLE `room`
(
    `id`           int(11) NOT NULL AUTO_INCREMENT,
    `name`         varchar(45) DEFAULT NULL,
    `total`        varchar(45) DEFAULT NULL,
    `created_date` bigint(15) DEFAULT NULL,
    PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=latin1;

CREATE TABLE `student`
(
    `id`           int(11) NOT NULL AUTO_INCREMENT,
    `name`         varchar(45) DEFAULT NULL,
    `phone`        varchar(45) DEFAULT NULL,
    `class`        int(11) DEFAULT NULL,
    `created_date` bigint(15) DEFAULT NULL,
    `room_id`      int(11) NOT NULL,
    PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=latin1;

