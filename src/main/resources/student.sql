CREATE TABLE student (
	stId INT ( 11 ) NOT NULL AUTO_INCREMENT COMMENT "id",
	stName VARCHAR ( 50 ) NOT NULL COMMENT "姓名",
	stAge INT ( 2 ) NOT NULL COMMENT "年龄",
	stPhoneNo VARCHAR ( 11 ) DEFAULT "000000" COMMENT "手机",
	stGender VARCHAR ( 4 ) NOT NULL COMMENT "性别",
	stClass VARCHAR ( 30 ) NOT NULL COMMENT "班级",
	stHome VARCHAR ( 100 ) COMMENT "家庭住址",
	PRIMARY KEY ( stId ) 
) ENGINE = INNODB AUTO_INCREMENT = 100 DEFAULT CHARSET = utf8;

INSERT INTO `student` VALUES (100, '姜子牙', 63, '000000', '男', '初三1班', '镐京中央大街324号');
INSERT INTO `student` VALUES (101, '太乙真人', 1085, '13186986711', '男', '高三5班', '乾元山金光洞');
INSERT INTO `student` VALUES (102, '度厄真人', 1035, '17129847835', '男', '高三2班', '九顶铁刹山八宝云光洞');
INSERT INTO `student` VALUES (103, '慈航真人', 1022, '15189673478', '女', '高三1班', '普陀山紫竹林');
INSERT INTO `student` VALUES (104, '月游星君', 700, '000000', '女', '初三2班', NULL);
INSERT INTO `student` VALUES (105, '文殊广法天尊', 1125, '000000', '男', '高三1班', '五龙山云霄洞');
INSERT INTO `student` VALUES (106, '邓婵玉', 26, '18922226731', '女', '三年6班', NULL);