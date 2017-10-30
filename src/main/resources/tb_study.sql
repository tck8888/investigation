/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50718
Source Host           : localhost:3306
Source Database       : mybatis

Target Server Type    : MYSQL
Target Server Version : 50718
File Encoding         : 65001

Date: 2017-10-30 22:16:00
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `tb_study`
-- ----------------------------
DROP TABLE IF EXISTS `tb_study`;
CREATE TABLE `tb_study` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `sex` varchar(255) DEFAULT '',
  `grade` varchar(255) DEFAULT '',
  `major` varchar(255) DEFAULT '',
  `playGame` varchar(255) DEFAULT '',
  `playGameName` varchar(255) DEFAULT '',
  `playGameTime` varchar(255) DEFAULT '',
  `playGameAdvantages` varchar(255) DEFAULT '',
  `playGameWorth` varchar(255) DEFAULT '',
  `playGameLocation` varchar(255) DEFAULT '',
  `playGameReason` varchar(255) DEFAULT '',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_study
-- ----------------------------
INSERT INTO `tb_study` VALUES ('1', '男', '大一', '英语', '偶尔玩', '魂斗罗', '0.5h', '舒缓压力', '值得', '网吧', '纯粹娱乐');
