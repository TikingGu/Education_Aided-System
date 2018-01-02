/*
Navicat MySQL Data Transfer

Source Server         : test
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : eas31

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2018-01-01 13:13:05
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for announcement
-- ----------------------------
DROP TABLE IF EXISTS `announcement`;
CREATE TABLE `announcement` (
  `An_ID` int(11) NOT NULL AUTO_INCREMENT COMMENT '鍏?憡ID',
  `Title` varchar(50) NOT NULL COMMENT '鏍囬?',
  `Content` varchar(300) DEFAULT NULL COMMENT '鍐呭?',
  `classid` varchar(30) NOT NULL COMMENT '鐝?骇ID',
  PRIMARY KEY (`An_ID`),
  KEY `an_classid` (`classid`),
  CONSTRAINT `an_classid` FOREIGN KEY (`classid`) REFERENCES `classinfo` (`Class_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of announcement
-- ----------------------------

-- ----------------------------
-- Table structure for classinfo
-- ----------------------------
DROP TABLE IF EXISTS `classinfo`;
CREATE TABLE `classinfo` (
  `Class_ID` varchar(30) NOT NULL COMMENT '璇剧▼鐝?骇',
  `CourseID` varchar(30) NOT NULL COMMENT '璇剧▼鍙',
  `StudentNumber` int(11) DEFAULT NULL COMMENT '瀛︾敓浜烘暟',
  `tid` varchar(30) NOT NULL COMMENT '鏁欏笀ID',
  PRIMARY KEY (`Class_ID`),
  KEY `courseid` (`CourseID`),
  KEY `tid` (`tid`),
  CONSTRAINT `courseid` FOREIGN KEY (`CourseID`) REFERENCES `course` (`Course_ID`),
  CONSTRAINT `tid` FOREIGN KEY (`tid`) REFERENCES `teacher` (`T_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of classinfo
-- ----------------------------
INSERT INTO `classinfo` VALUES ('02', '666', '25', 't123');
INSERT INTO `classinfo` VALUES ('03', '777', '32', 't456');
INSERT INTO `classinfo` VALUES ('class1', 'course1', '50', 't915101');
INSERT INTO `classinfo` VALUES ('class2', 'course1', '40', 't915102');

-- ----------------------------
-- Table structure for comment
-- ----------------------------
DROP TABLE IF EXISTS `comment`;
CREATE TABLE `comment` (
  `Comment_ID` int(11) NOT NULL AUTO_INCREMENT COMMENT '鎵硅?ID',
  `Title` varchar(50) DEFAULT NULL COMMENT '鏍囬?',
  `Content` varchar(300) DEFAULT NULL COMMENT '鍐呭?',
  `sid` varchar(30) NOT NULL COMMENT '瀛︾敓ID',
  `comment_date` timestamp DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`Comment_ID`),
  KEY `co_sid` (`sid`),
  CONSTRAINT `co_sid` FOREIGN KEY (`sid`) REFERENCES `student` (`S_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of comment
-- ----------------------------

-- ----------------------------
-- Table structure for course
-- ----------------------------
DROP TABLE IF EXISTS `course`;
CREATE TABLE `course` (
  `Course_ID` varchar(30) NOT NULL COMMENT '璇剧▼鍙',
  `Course_Name` varchar(30) NOT NULL COMMENT '璇剧▼鍚',
  `Period` int(11) NOT NULL COMMENT '瀛︽椂',
  PRIMARY KEY (`Course_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of course
-- ----------------------------
INSERT INTO `course` VALUES ('666', '1223', '2');
INSERT INTO `course` VALUES ('777', '5264', '3');
INSERT INTO `course` VALUES ('course1', '组原', '3');
INSERT INTO `course` VALUES ('course2', '马原', '2');

-- ----------------------------
-- Table structure for homework_comment
-- ----------------------------
DROP TABLE IF EXISTS `homework_comment`;
CREATE TABLE `homework_comment` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `content` varchar(255) DEFAULT NULL,
  `created_at` datetime(6) DEFAULT NULL,
  `S_ID` varchar(255) DEFAULT NULL,
  `T_ID` varchar(255) DEFAULT NULL,
  `title` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of homework_comment
-- ----------------------------

-- ----------------------------
-- Table structure for posting
-- ----------------------------
DROP TABLE IF EXISTS `posting`;
CREATE TABLE `posting` (
  `Po_ID` int(11) NOT NULL AUTO_INCREMENT COMMENT '涓昏创ID',
  `Po_Date` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' ON UPDATE CURRENT_TIMESTAMP COMMENT '涓昏创鍙戝竷鏃ユ湡',
  `Replies_Num` int(11) DEFAULT '0' COMMENT '甯栧瓙鍥炲?鏁',
  `Agree_Num` int(11) DEFAULT '0' COMMENT '璧炲悓鏁',
  `Disagree_Num` int(11) DEFAULT '0' COMMENT '鍙嶅?鏁',
  `Po_Student` varchar(30) NOT NULL COMMENT '鍙戝笘瀛︾敓ID',
  `Content` varchar(500) NOT NULL COMMENT '鍐呭?',
  `Title` varchar(50) NOT NULL COMMENT '鏍囬?',
  `classid` varchar(30) NOT NULL,
  PRIMARY KEY (`Po_ID`),
  KEY `po_sid` (`Po_Student`),
  CONSTRAINT `po_sid` FOREIGN KEY (`Po_Student`) REFERENCES `student` (`S_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of posting
-- ----------------------------
INSERT INTO `posting` VALUES ('1', '2018-01-01 12:58:15', '0', '0', '0', 's915101', 'q', 'w', 'class1');
INSERT INTO `posting` VALUES ('2', '2018-01-01 12:59:07', '0', '0', '0', 's915102', 'e', 'r', 'class1');
INSERT INTO `posting` VALUES ('3', '2018-01-01 13:00:59', '0', '0', '0', 's915103', 't', 'y', 'class1');

-- ----------------------------
-- Table structure for question
-- ----------------------------
DROP TABLE IF EXISTS `question`;
CREATE TABLE `question` (
  `QuestionID` int(11) NOT NULL AUTO_INCREMENT COMMENT '棰樼洰ID',
  `QuestionTitle` varchar(100) NOT NULL COMMENT '棰樼洰',
  `Answer` varchar(1) NOT NULL COMMENT '绛旀?',
  `Option1` varchar(30) DEFAULT NULL COMMENT '閫夐」1',
  `Option2` varchar(30) DEFAULT NULL COMMENT '閫夐」2',
  `Option3` varchar(30) DEFAULT NULL COMMENT '閫夐」3',
  `Option4` varchar(30) DEFAULT NULL COMMENT '閫夐」4',
  `testid` int(11) NOT NULL COMMENT '娴嬮獙ID',
  PRIMARY KEY (`QuestionID`),
  KEY `test__id` (`testid`),
  CONSTRAINT `test__id` FOREIGN KEY (`testid`) REFERENCES `test` (`Test_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of question
-- ----------------------------
INSERT INTO `question` VALUES ('1', 'q', 'A', 'w', 'e', 'r', 't', '1');
INSERT INTO `question` VALUES ('2', 'a', 'B', 's', 'd', 'f', 'g', '1');

-- ----------------------------
-- Table structure for replies
-- ----------------------------
DROP TABLE IF EXISTS `replies`;
CREATE TABLE `replies` (
  `Replies_ID` int(30) NOT NULL AUTO_INCREMENT COMMENT '鍥炲笘ID',
  `PoID` int(11) NOT NULL COMMENT '涓昏创ID',
  `Re_Date` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' ON UPDATE CURRENT_TIMESTAMP COMMENT '鍥炲笘鏃ユ湡',
  `Re_Student` varchar(30) NOT NULL COMMENT '鍥炲笘瀛︾敓ID',
  `Content` varchar(200) NOT NULL COMMENT '鍐呭?',
  PRIMARY KEY (`Replies_ID`),
  KEY `poid` (`PoID`),
  CONSTRAINT `poid` FOREIGN KEY (`PoID`) REFERENCES `posting` (`Po_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of replies
-- ----------------------------
INSERT INTO `replies` VALUES ('1', '1', '2018-01-01 13:01:55', 's915102', 'aa');
INSERT INTO `replies` VALUES ('2', '1', '2018-01-01 13:02:26', 's915103', 'ss');

-- ----------------------------
-- Table structure for rollcall
-- ----------------------------
DROP TABLE IF EXISTS `rollcall`;
CREATE TABLE `rollcall` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `C_IDS` varchar(255) DEFAULT NULL,
  `code` varchar(255) DEFAULT NULL,
  `created_at` datetime(6) DEFAULT NULL,
  `expired_at` datetime(6) DEFAULT NULL,
  `T_ID` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of rollcall
-- ----------------------------

-- ----------------------------
-- Table structure for sheet
-- ----------------------------
DROP TABLE IF EXISTS `sheet`;
CREATE TABLE `sheet` (
  `SheetID` int(11) NOT NULL AUTO_INCREMENT COMMENT '绛斿嵎ID',
  `Sid` varchar(30) DEFAULT NULL COMMENT '瀛︾敓ID',
  `Student_Answers` varchar(30) DEFAULT NULL COMMENT '瀛︾敓绛旀?',
  `Score` float DEFAULT NULL COMMENT '寰楀垎',
  `testid` int(11) NOT NULL COMMENT '娴嬮獙ID',
  PRIMARY KEY (`SheetID`),
  KEY `test_id` (`testid`),
  CONSTRAINT `test_id` FOREIGN KEY (`testid`) REFERENCES `test` (`Test_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sheet
-- ----------------------------
INSERT INTO `sheet` VALUES ('1', 's915101', 'AA', '40', '1');
INSERT INTO `sheet` VALUES ('2', 'S915102', 'BB', '40', '1');

-- ----------------------------
-- Table structure for sign
-- ----------------------------
DROP TABLE IF EXISTS `sign`;
CREATE TABLE `sign` (
  `sid` varchar(30) NOT NULL COMMENT '瀛︾敓ID',
  `Sign_In` int(11) DEFAULT NULL COMMENT '鏄?惁绛惧埌',
  `classid` varchar(30) NOT NULL COMMENT '鍒拌?鐝?骇ID',
  `Sign_Date` datetime NOT NULL COMMENT '绛惧埌鏃ユ湡',
  PRIMARY KEY (`sid`,`classid`,`Sign_Date`),
  KEY `class_id` (`classid`),
  CONSTRAINT `class_id` FOREIGN KEY (`classid`) REFERENCES `classinfo` (`Class_ID`),
  CONSTRAINT `s_id` FOREIGN KEY (`sid`) REFERENCES `student` (`S_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sign
-- ----------------------------

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
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES ('s123', '654', '王');
INSERT INTO `student` VALUES ('s915101', '123', 'wolf');
INSERT INTO `student` VALUES ('s915102', '123', 'ban');
INSERT INTO `student` VALUES ('s915103', '123', 'leo');

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
-- Records of teacher
-- ----------------------------
INSERT INTO `teacher` VALUES ('t123', '李', '321');
INSERT INTO `teacher` VALUES ('t456', '王', '654');
INSERT INTO `teacher` VALUES ('t915101', 'poi', '123');
INSERT INTO `teacher` VALUES ('t915102', 'jane', '123');

-- ----------------------------
-- Table structure for teachingevaluation
-- ----------------------------
DROP TABLE IF EXISTS `teachingevaluation`;
CREATE TABLE `teachingevaluation` (
  `e_ID` varchar(30) NOT NULL COMMENT '璇勬暀ID',
  `e_Class` varchar(30) NOT NULL COMMENT '璇勬暀鐝?骇ID',
  `sid` varchar(30) NOT NULL COMMENT '瀛︾敓ID',
  `A1` varchar(1) DEFAULT NULL COMMENT '璇勬暀缁撴灉1',
  `A2` varchar(1) DEFAULT NULL COMMENT '璇勬暀缁撴灉2',
  `A3` varchar(1) DEFAULT NULL COMMENT '璇勬暀缁撴灉3',
  `A4` varchar(1) DEFAULT NULL COMMENT '璇勬暀缁撴灉4',
  `A5` varchar(1) DEFAULT NULL COMMENT '璇勬暀缁撴灉5',
  PRIMARY KEY (`e_ID`),
  KEY `e_class` (`e_Class`),
  KEY `e_s` (`sid`),
  CONSTRAINT `e_class` FOREIGN KEY (`e_Class`) REFERENCES `classinfo` (`Class_ID`),
  CONSTRAINT `e_s` FOREIGN KEY (`sid`) REFERENCES `student` (`S_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of teachingevaluation
-- ----------------------------
INSERT INTO `teachingevaluation` VALUES ('1', '03', 's123', 'a', 'a', 'a', 'a', 'a');

-- ----------------------------
-- Table structure for test
-- ----------------------------
DROP TABLE IF EXISTS `test`;
CREATE TABLE `test` (
  `Test_ID` int(11) NOT NULL AUTO_INCREMENT COMMENT '娴嬮獙ID',
  `Class_ID` varchar(30) NOT NULL COMMENT '鐝?骇ID',
  `TotalPoints` float NOT NULL COMMENT '娴嬮獙鎬诲垎',
  `Title` varchar(50) DEFAULT NULL,
  `Test_Date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '娴嬮獙鏃ユ湡',
  PRIMARY KEY (`Test_ID`),
  KEY `test_cid` (`Class_ID`),
  CONSTRAINT `test_cid` FOREIGN KEY (`Class_ID`) REFERENCES `classinfo` (`Class_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of test
-- ----------------------------
INSERT INTO `test` VALUES ('1', 'class1', '80', 'quiz1', '2018-01-01 12:54:53');
INSERT INTO `test` VALUES ('2', 'class1', '90', 'quiz2', '2018-01-01 12:55:21');

-- ----------------------------
-- Table structure for uploadfile
-- ----------------------------
DROP TABLE IF EXISTS `uploadfile`;
CREATE TABLE `uploadfile` (
  `FileName` varchar(50) NOT NULL COMMENT '鏂囦欢鍚',
  `UploadTeacher` varchar(30) NOT NULL COMMENT '涓婁紶鑰佸笀ID',
  `FileSize` int(11) DEFAULT NULL COMMENT '鏂囦欢澶у皬',
  `UploadDate` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '涓婁紶鏃堕棿',
  PRIMARY KEY (`FileName`),
  KEY `U_tid` (`UploadTeacher`),
  CONSTRAINT `U_tid` FOREIGN KEY (`UploadTeacher`) REFERENCES `teacher` (`T_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of uploadfile
-- ----------------------------

-- ----------------------------
-- Table structure for vote
-- ----------------------------
DROP TABLE IF EXISTS `vote`;
CREATE TABLE `vote` (
  `Vote_ID` varchar(30) NOT NULL COMMENT '鎶曠エID',
  `AgreeNum` int(11) DEFAULT NULL COMMENT '璧炲悓鏁',
  `DisagreeNum` int(11) DEFAULT NULL COMMENT '鍙嶅?鏁',
  PRIMARY KEY (`Vote_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of vote
-- ----------------------------
INSERT INTO `vote` VALUES ('20171231221127', '0', '0');
INSERT INTO `vote` VALUES ('20180101011019', '0', '0');
INSERT INTO `vote` VALUES ('230', '3', '4');
