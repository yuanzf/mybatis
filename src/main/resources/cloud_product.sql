/*
 Navicat Premium Data Transfer

 Source Server         : 本地1
 Source Server Type    : MySQL
 Source Server Version : 80012
 Source Host           : localhost:3306
 Source Schema         : cloud_product

 Target Server Type    : MySQL
 Target Server Version : 80012
 File Encoding         : 65001

 Date: 19/04/2021 23:42:13
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for product
-- ----------------------------
DROP TABLE IF EXISTS `product`;
CREATE TABLE `product` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '产品名称',
  `price` double(45,0) DEFAULT NULL COMMENT '产品价格',
  `number` int(11) DEFAULT NULL COMMENT '产品库存',
  `create_time` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '入库时间',
  `update_time` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '更新时间',
  `status` int(11) DEFAULT NULL COMMENT '状态',
  `pic` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '产品图片',
  `type` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '产品类型',
  `comment` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '产品描述',
  `label` varchar(128) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `idx_name` (`name`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of product
-- ----------------------------
BEGIN;
INSERT INTO `product` VALUES (6, 'yuan', 123, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `product` VALUES (8, '袁', 123, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `product` VALUES (9, 'yuan', 123, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `product` VALUES (10, '123', 132, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `product` VALUES (11, 'qweq', 123, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
COMMIT;

-- ----------------------------
-- Table structure for product_order
-- ----------------------------
DROP TABLE IF EXISTS `product_order`;
CREATE TABLE `product_order` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) DEFAULT NULL COMMENT '购买用户Id',
  `product_id` int(11) DEFAULT NULL COMMENT '产品Id',
  `count` int(11) DEFAULT NULL COMMENT '购买数量',
  `total_price` double(45,0) DEFAULT NULL COMMENT '总价',
  `create_time` varchar(32) DEFAULT NULL COMMENT '创建时间',
  `update_time` varchar(32) DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of product_order
-- ----------------------------
BEGIN;
INSERT INTO `product_order` VALUES (1, 3, 1, 12, 2333, '123', '123');
INSERT INTO `product_order` VALUES (2, 3, 2, 10, 140, '123', '123');
INSERT INTO `product_order` VALUES (3, 3, 1, 23, 2829, '2018-11-23 00:29:03', '2018-11-23 00:29:03');
COMMIT;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `password` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `level` varchar(45) DEFAULT NULL,
  `telephone` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `address` varchar(45) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `update_Time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
BEGIN;
INSERT INTO `user` VALUES (3, 'yuan', '123', 'yuan', '123', '123', '2018-11-22 21:35:19', '2018-11-22 21:35:19');
INSERT INTO `user` VALUES (4, 'yuan1', '12314', 'yuan1', '12314', '1231', '2018-11-22 22:24:58', '2018-11-22 22:29:22');
INSERT INTO `user` VALUES (5, 'yuan1', '12314', 'yuan1', '12314', '1231', '2018-11-22 22:26:05', '2018-11-22 22:26:05');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
