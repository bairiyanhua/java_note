DROP TABLE IF  EXISTS  `member`;
CREATE TABLE IF NOT EXISTS  `member` (
    `id`  INT(10) UNSIGNED NOT NULL AUTO_INCREMENT,
    `userCode` VARCHAR(32) NOT NULL COMMENT "�˺�",
    `userName` VARCHAR(32) NOT NULL COMMENT "��ʵ����",
    `password` VARCHAR(32) NOT NULL COMMENT "��������",
    `birthday` DATE NOT NULL DEFAULT '0000-00-00' COMMENT "��������",
    PRIMARY KEY (id),
    INDEX username (userCode,userName)	
)ENGINE = MyISAM DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci COMMENT="�û���";

 


