/*
Navicat MySQL Data Transfer

Source Server         : EAS
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : eas

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2017-12-17 19:28:55
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for class
-- ----------------------------
DROP TABLE IF EXISTS `class`;
CREATE TABLE `class` (
  `Class_ID` varchar(30) NOT NULL COMMENT '课程班级',
  `CourseID` varchar(30) NOT NULL COMMENT '课程号',
  `StudentNumber` int(11) DEFAULT NULL COMMENT '学生人数',
  `tid` varchar(30) NOT NULL COMMENT '教师ID',
  PRIMARY KEY (`Class_ID`),
  KEY `courseid` (`CourseID`),
  KEY `tid` (`tid`),
  CONSTRAINT `courseid` FOREIGN KEY (`CourseID`) REFERENCES `course` (`Course_ID`),
  CONSTRAINT `tid` FOREIGN KEY (`tid`) REFERENCES `teacher` (`T_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for course
-- ----------------------------
DROP TABLE IF EXISTS `course`;
CREATE TABLE `course` (
  `Course_ID` varchar(30) NOT NULL COMMENT '课程号',
  `Course_Name` varchar(30) NOT NULL COMMENT '课程名',
  `Period` int(11) NOT NULL COMMENT '学时',
  PRIMARY KEY (`Course_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for posting
-- ----------------------------
DROP TABLE IF EXISTS `posting`;
CREATE TABLE `posting` (
  `Po_ID` varchar(30) NOT NULL COMMENT '主贴ID',
  `Po_Date` datetime NOT NULL COMMENT '主贴发布日期',
  `Replies_Num` int(11) DEFAULT '0' COMMENT '帖子回复数',
  `Agree_Num` int(11) DEFAULT '0' COMMENT '赞同数',
  `Disagree_Num` int(11) DEFAULT '0' COMMENT '反对数',
  `Po_Student` varchar(30) NOT NULL COMMENT '发帖学生ID',
  `Content` varchar(500) NOT NULL COMMENT '内容',
  PRIMARY KEY (`Po_ID`),
  KEY `po_sid` (`Po_Student`),
  CONSTRAINT `po_sid` FOREIGN KEY (`Po_Student`) REFERENCES `student` (`S_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for replies
-- ----------------------------
DROP TABLE IF EXISTS `replies`;
CREATE TABLE `replies` (
  `Replies_ID` varchar(30) NOT NULL COMMENT '回帖ID',
  `PoID` varchar(30) NOT NULL COMMENT '主贴ID',
  `Re_Date` datetime NOT NULL COMMENT '回帖日期',
  `Re_Student` varchar(30) NOT NULL COMMENT '回帖学生ID',
  `Content` varchar(200) NOT NULL COMMENT '内容',
  PRIMARY KEY (`Replies_ID`,`PoID`),
  KEY `poid` (`PoID`),
  CONSTRAINT `poid` FOREIGN KEY (`PoID`) REFERENCES `posting` (`Po_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for sheet
-- ----------------------------
DROP TABLE IF EXISTS `sheet`;
CREATE TABLE `sheet` (
  `SheetID` varchar(30) NOT NULL COMMENT '答卷ID',
  `Sid` varchar(30) DEFAULT NULL COMMENT '学生ID',
  `Student_Answers` varchar(30) DEFAULT NULL COMMENT '学生答案',
  `Score` float DEFAULT NULL COMMENT '得分',
  `testid` int(11) NOT NULL COMMENT '测验ID',
  PRIMARY KEY (`SheetID`,`testid`),
  KEY `test_id` (`testid`),
  CONSTRAINT `test_id` FOREIGN KEY (`testid`) REFERENCES `test` (`Test_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for sign
-- ----------------------------
DROP TABLE IF EXISTS `sign`;
CREATE TABLE `sign` (
  `sid` varchar(30) NOT NULL COMMENT '学生ID',
  `Sign_In` int(11) DEFAULT NULL COMMENT '是否签到',
  `classid` varchar(30) NOT NULL COMMENT '到课班级ID',
  `Sign_Date` datetime NOT NULL COMMENT '签到日期',
  PRIMARY KEY (`sid`,`classid`,`Sign_Date`),
  KEY `class_id` (`classid`),
  CONSTRAINT `class_id` FOREIGN KEY (`classid`) REFERENCES `class` (`Class_ID`),
  CONSTRAINT `s_id` FOREIGN KEY (`sid`) REFERENCES `student` (`S_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `S_ID` varchar(30) NOT NULL,
  `stuPassword` varchar(30) NOT NULL,
  `stuName` varchar(30) NOT NULL,
  PRIMARY KEY (`S_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for teacher
-- ----------------------------
DROP TABLE IF EXISTS `teacher`;
CREATE TABLE `teacher` (
  `T_ID` varchar(30) NOT NULL,
  `tName` varchar(30) NOT NULL,
  `tPassword` varchar(30) NOT NULL,
  PRIMARY KEY (`T_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for teachingevaluation
-- ----------------------------
DROP TABLE IF EXISTS `teachingevaluation`;
CREATE TABLE `teachingevaluation` (
  `e_ID` varchar(30) NOT NULL COMMENT '评教ID',
  `e_Class` varchar(30) NOT NULL COMMENT '评教班级ID',
  `sid` varchar(30) NOT NULL COMMENT '学生ID',
  `A1` varchar(1) DEFAULT NULL COMMENT '评教结果1',
  `A2` varchar(1) DEFAULT NULL COMMENT '评教结果2',
  `A3` varchar(1) DEFAULT NULL COMMENT '评教结果3',
  `A4` varchar(1) DEFAULT NULL COMMENT '评教结果4',
  `A5` varchar(1) DEFAULT NULL COMMENT '评教结果5',
  PRIMARY KEY (`e_ID`,`e_Class`,`sid`),
  KEY `e_class` (`e_Class`),
  KEY `e_s` (`sid`),
  CONSTRAINT `e_class` FOREIGN KEY (`e_Class`) REFERENCES `class` (`Class_ID`),
  CONSTRAINT `e_s` FOREIGN KEY (`sid`) REFERENCES `student` (`S_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for test
-- ----------------------------
DROP TABLE IF EXISTS `test`;
CREATE TABLE `test` (
  `Test_ID` int(11) NOT NULL AUTO_INCREMENT COMMENT '测验ID',
  `Class_ID` varchar(30) NOT NULL COMMENT '班级ID',
  `TotalPoints` float NOT NULL COMMENT '测验总分',
  `Test_Date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '测验日期',
  `QuestionID` varchar(30) NOT NULL COMMENT '题目ID',
  `QuestionTitle` varchar(100) NOT NULL COMMENT '题目',
  `Answer` varchar(1) NOT NULL COMMENT '答案',
  `Option1` varchar(30) DEFAULT NULL COMMENT '选项1',
  `Option2` varchar(30) DEFAULT NULL COMMENT '选项2',
  `Option3` varchar(30) DEFAULT NULL COMMENT '选项3',
  `Option4` varchar(30) DEFAULT NULL COMMENT '选项4',
  `Point` float NOT NULL COMMENT '分值',
  PRIMARY KEY (`Test_ID`,`Class_ID`,`QuestionID`),
  KEY `test_cid` (`Class_ID`),
  CONSTRAINT `test_cid` FOREIGN KEY (`Class_ID`) REFERENCES `class` (`Class_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for uploadflie
-- ----------------------------
DROP TABLE IF EXISTS `uploadflie`;
CREATE TABLE `uploadflie` (
  `FileName` varchar(50) NOT NULL COMMENT '文件名',
  `UploadTeacher` varchar(30) NOT NULL COMMENT '上传老师ID',
  `FileSize` int(11) DEFAULT NULL COMMENT '文件大小',
  `UploadDate` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '上传时间',
  PRIMARY KEY (`FileName`,`UploadTeacher`),
  KEY `U_tid` (`UploadTeacher`),
  CONSTRAINT `U_tid` FOREIGN KEY (`UploadTeacher`) REFERENCES `teacher` (`T_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
