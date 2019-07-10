CREATE TABLE `subject` (
  `SubjectNo` int(11) NOT NULL AUTO_INCREMENT COMMENT '课程编号',
  `SubjectName` varchar(50) DEFAULT NULL COMMENT '课程名称',
  `ClassHour` int(4) DEFAULT NULL COMMENT '学时',
  `GradeID` int(4) DEFAULT NULL COMMENT '年级编号' 
) ENGINE=MyISAM;
