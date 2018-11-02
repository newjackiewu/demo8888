/*
Navicat MySQL Data Transfer

Source Server         : test1
Source Server Version : 50521
Source Host           : localhost:3306
Source Database       : xueyuan

Target Server Type    : MYSQL
Target Server Version : 50521
File Encoding         : 65001

Date: 2018-10-23 10:31:05
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `menu`
-- ----------------------------
DROP TABLE IF EXISTS `menu`;
CREATE TABLE `menu` (
  `menuid` int(11) NOT NULL AUTO_INCREMENT,
  `menuname` varchar(255) DEFAULT NULL,
  `upmenuid` int(11) DEFAULT NULL,
  `menupath` varchar(255) DEFAULT NULL,
  `menustate` int(11) DEFAULT NULL,
  `menuremark` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`menuid`)
) ENGINE=InnoDB AUTO_INCREMENT=50 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of menu
-- ----------------------------
INSERT INTO `menu` VALUES ('28', '个人中心', '-1', null, '1', null);
INSERT INTO `menu` VALUES ('29', '教务中心', '-1', null, '1', null);
INSERT INTO `menu` VALUES ('30', '学员中心', '-1', null, '1', null);
INSERT INTO `menu` VALUES ('31', '学习中心', '-1', null, '1', null);
INSERT INTO `menu` VALUES ('32', '资料管理', '-1', null, '1', null);
INSERT INTO `menu` VALUES ('33', '权限管理', '-1', null, '1', null);
INSERT INTO `menu` VALUES ('34', '我的资料', '28', 'user/MyUser.jsp', '1', null);
INSERT INTO `menu` VALUES ('35', '班级信息', '28', 'user/class.html', '1', null);
INSERT INTO `menu` VALUES ('36', '修改密码', '28', 'user/password.jsp', '1', null);
INSERT INTO `menu` VALUES ('37', '班级管理', '29', '/Educational/class/getclasslist', '1', null);
INSERT INTO `menu` VALUES ('38', '学生管理', '29', 'Educational/student/list.html', '1', null);
INSERT INTO `menu` VALUES ('39', '组织考试', '29', 'Educational/exam/exam.html', '1', null);
INSERT INTO `menu` VALUES ('40', '班级审核', '29', 'Educational/getclasses', '1', null);
INSERT INTO `menu` VALUES ('41', '学员信息', '30', null, '1', null);
INSERT INTO `menu` VALUES ('42', '我的成绩', '30', null, '1', null);
INSERT INTO `menu` VALUES ('43', '我的书籍', '30', null, '1', null);
INSERT INTO `menu` VALUES ('44', '资料下载', '31', null, '1', null);
INSERT INTO `menu` VALUES ('45', '资料上传', '32', null, '1', null);
INSERT INTO `menu` VALUES ('46', '书籍管理', '32', null, '1', null);
INSERT INTO `menu` VALUES ('47', '用户管理', '33', null, '1', null);
INSERT INTO `menu` VALUES ('48', '角色管理', '33', null, '1', null);
INSERT INTO `menu` VALUES ('49', '菜单管理', '33', null, '1', null);

-- ----------------------------
-- Table structure for `middle`
-- ----------------------------
DROP TABLE IF EXISTS `middle`;
CREATE TABLE `middle` (
  `middleid` int(11) NOT NULL AUTO_INCREMENT,
  `menuid` int(11) DEFAULT NULL,
  `roleid` int(11) DEFAULT NULL,
  PRIMARY KEY (`middleid`)
) ENGINE=InnoDB AUTO_INCREMENT=72 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of middle
-- ----------------------------
INSERT INTO `middle` VALUES ('49', '28', '1');
INSERT INTO `middle` VALUES ('50', '34', '1');
INSERT INTO `middle` VALUES ('51', '36', '1');
INSERT INTO `middle` VALUES ('52', '29', '1');
INSERT INTO `middle` VALUES ('53', '37', '1');
INSERT INTO `middle` VALUES ('54', '38', '1');
INSERT INTO `middle` VALUES ('55', '39', '1');
INSERT INTO `middle` VALUES ('56', '28', '3');
INSERT INTO `middle` VALUES ('57', '34', '3');
INSERT INTO `middle` VALUES ('58', '35', '3');
INSERT INTO `middle` VALUES ('59', '36', '3');
INSERT INTO `middle` VALUES ('60', '30', '3');
INSERT INTO `middle` VALUES ('61', '41', '3');
INSERT INTO `middle` VALUES ('62', '42', '3');
INSERT INTO `middle` VALUES ('63', '43', '3');
INSERT INTO `middle` VALUES ('64', '31', '3');
INSERT INTO `middle` VALUES ('65', '44', '3');
INSERT INTO `middle` VALUES ('66', '29', '4');
INSERT INTO `middle` VALUES ('67', '40', '4');
INSERT INTO `middle` VALUES ('68', '33', '5');
INSERT INTO `middle` VALUES ('69', '47', '5');
INSERT INTO `middle` VALUES ('70', '48', '5');
INSERT INTO `middle` VALUES ('71', '49', '5');

-- ----------------------------
-- Table structure for `role`
-- ----------------------------
DROP TABLE IF EXISTS `role`;
CREATE TABLE `role` (
  `roleid` int(11) NOT NULL AUTO_INCREMENT,
  `rolename` varchar(255) DEFAULT NULL,
  `rolestate` int(11) DEFAULT NULL,
  PRIMARY KEY (`roleid`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of role
-- ----------------------------
INSERT INTO `role` VALUES ('1', '班主任', '1');
INSERT INTO `role` VALUES ('2', '讲师', '1');
INSERT INTO `role` VALUES ('3', '学生', '1');
INSERT INTO `role` VALUES ('4', '院长', '1');
INSERT INTO `role` VALUES ('5', '超级管理员', '1');

-- ----------------------------
-- Table structure for `user_tb`
-- ----------------------------
DROP TABLE IF EXISTS `user_tb`;
CREATE TABLE `user_tb` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `student_id` int(11) DEFAULT NULL,
  `role_id` int(11) DEFAULT NULL,
  `user_name` varchar(255) DEFAULT NULL,
  `user_ps` varchar(255) DEFAULT NULL,
  `user_realname` varchar(255) DEFAULT NULL,
  `user_sex` varchar(255) DEFAULT NULL,
  `user_email` varchar(255) DEFAULT NULL,
  `user_phone` varchar(255) DEFAULT NULL,
  `user_address` varchar(255) DEFAULT NULL,
  `user_idcard` varchar(255) DEFAULT NULL,
  `user_content` varchar(255) DEFAULT NULL,
  `logincount` int(11) DEFAULT '0',
  `regdate` date DEFAULT NULL,
  `managerid` int(11) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_tb
-- ----------------------------
INSERT INTO `user_tb` VALUES ('0', null, '1', 'user0', '222222', '张三2', '女', '123@qq.com', '1234567', '北京', '12221121212121', '一个大帅哥', '81', '2018-10-11', null);
INSERT INTO `user_tb` VALUES ('1', null, '1', 'user1', '123', '李四', '女', null, null, null, null, null, '97', null, null);
INSERT INTO `user_tb` VALUES ('2', null, '2', 'user2', 'user2', null, null, null, null, null, null, null, '8', null, null);
INSERT INTO `user_tb` VALUES ('3', null, '3', 'user3', 'user3', null, null, null, null, null, null, null, '3', null, null);
INSERT INTO `user_tb` VALUES ('4', null, '4', 'user4', 'user4', '杨XX', '男', '1332@126.com', '13333333333', '朝阳', '110111111111111111111', '一个新开辟领域的探讨，探讨摸索', '0', '2018-10-22', null);
INSERT INTO `user_tb` VALUES ('5', null, '5', 'admin', 'admin', null, null, null, null, null, null, null, '6', null, null);
