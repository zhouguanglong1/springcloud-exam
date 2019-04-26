/*
 Navicat Premium Data Transfer

 Source Server         : localhost_3306
 Source Server Type    : MySQL
 Source Server Version : 50717
 Source Host           : localhost:3306
 Source Schema         : test

 Target Server Type    : MySQL
 Target Server Version : 50717
 File Encoding         : 65001

 Date: 12/03/2019 17:31:56
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for component
-- ----------------------------
DROP TABLE IF EXISTS `component`;
CREATE TABLE `component`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `module_name` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '组件名称',
  `module_type` int(11) NULL DEFAULT NULL COMMENT '分类，1基础设施2业务中台',
  `module_version` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '版本',
  `module_status` int(11) NULL DEFAULT NULL COMMENT '状态1上架0下架',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of component
-- ----------------------------
INSERT INTO `component` VALUES (2, 'sonar', 1, 'v1.0.0', 1);
INSERT INTO `component` VALUES (3, 'jenkins', 1, 'v1.0.0', 1);

SET FOREIGN_KEY_CHECKS = 1;
