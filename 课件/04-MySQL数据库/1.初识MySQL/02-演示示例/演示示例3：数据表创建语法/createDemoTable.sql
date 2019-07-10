DROP TABLE IF  EXISTS  `member`;
CREATE TABLE IF NOT EXISTS  `member` (
    `id`  INT(10) UNSIGNED NOT NULL AUTO_INCREMENT,
    `userCode` VARCHAR(32) NOT NULL COMMENT "账号",
    `userName` VARCHAR(32) NOT NULL COMMENT "真实姓名",
    `password` VARCHAR(32) NOT NULL COMMENT "出生日期",
    `birthday` DATE NOT NULL DEFAULT '0000-00-00' COMMENT "出生日期",
    PRIMARY KEY (id),
    INDEX username (userCode,userName)	
)ENGINE = MyISAM DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci COMMENT="用户表";

 


