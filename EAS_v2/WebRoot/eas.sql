/*
Navicat MySQL Data Transfer

Source Server         : EAS
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : eas

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2017-12-11 16:02:00
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
  PRIMARY KEY (`Class_ID`),
  KEY `courseid` (`CourseID`),
  CONSTRAINT `courseid` FOREIGN KEY (`CourseID`) REFERENCES `course` (`Course_ID`)
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
  KEY `student` (`Po_Student`),
  CONSTRAINT `student` FOREIGN KEY (`Po_Student`) REFERENCES `student` (`S_ID`)
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
-- Table structure for s_class
-- ----------------------------
DROP TABLE IF EXISTS `s_class`;
CREATE TABLE `s_class` (
  `sid` varchar(30) NOT NULL COMMENT '学生ID',
  `classid` varchar(30) NOT NULL COMMENT '班级ID',
  `Sign_In` int(11) DEFAULT NULL COMMENT '签到次数',
  PRIMARY KEY (`sid`,`classid`),
  KEY `class_id` (`classid`),
  CONSTRAINT `class_id` FOREIGN KEY (`classid`) REFERENCES `class` (`Class_ID`),
  CONSTRAINT `s___id` FOREIGN KEY (`sid`) REFERENCES `student` (`S_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for s_t_te
-- ----------------------------
DROP TABLE IF EXISTS `s_t_te`;
CREATE TABLE `s_t_te` (
  `sid` varchar(30) NOT NULL COMMENT '学生编号',
  `tid` varchar(30) NOT NULL COMMENT '教师编号',
  `eid` varchar(30) NOT NULL COMMENT '评教编号',
  `Result` varchar(30) DEFAULT NULL COMMENT '评教结果',
  PRIMARY KEY (`sid`,`tid`,`eid`),
  KEY `t_id` (`tid`),
  KEY `e_id` (`eid`),
  CONSTRAINT `e_id` FOREIGN KEY (`eid`) REFERENCES `teachingevaluation` (`e_ID`),
  CONSTRAINT `s_id` FOREIGN KEY (`sid`) REFERENCES `student` (`S_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `t_id` FOREIGN KEY (`tid`) REFERENCES `teacher` (`T_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for s_t_test
-- ----------------------------
DROP TABLE IF EXISTS `s_t_test`;
CREATE TABLE `s_t_test` (
  `sid` varchar(30) NOT NULL COMMENT '学生ID',
  `tid` varchar(30) NOT NULL COMMENT '教师ID',
  `testid` varchar(30) NOT NULL COMMENT '测验ID',
  `Points` float DEFAULT NULL COMMENT '得分',
  PRIMARY KEY (`sid`,`tid`,`testid`),
  KEY `t__id` (`tid`),
  KEY `test_id` (`testid`),
  CONSTRAINT `s__id` FOREIGN KEY (`sid`) REFERENCES `student` (`S_ID`),
  CONSTRAINT `t__id` FOREIGN KEY (`tid`) REFERENCES `teacher` (`T_ID`),
  CONSTRAINT `test_id` FOREIGN KEY (`testid`) REFERENCES `test` (`test_ID`)
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
  `e_Date` datetime DEFAULT NULL COMMENT '评教日期',
  `e_Course` varchar(30) DEFAULT NULL COMMENT '评教课程',
  PRIMARY KEY (`e_ID`),
  KEY `e_course` (`e_Course`),
  CONSTRAINT `e_course` FOREIGN KEY (`e_Course`) REFERENCES `course` (`Course_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for test
-- ----------------------------
DROP TABLE IF EXISTS `test`;
CREATE TABLE `test` (
  `test_ID` varchar(30) NOT NULL COMMENT '测验ID',
  `TotalPoints` float NOT NULL COMMENT '测验总分',
  PRIMARY KEY (`test_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
