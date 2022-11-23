CREATE DATABASE IF NOT EXISTS `ESCOM.CLUBS` DEFAULT CHARACTER SET utf8;
USE `ESCOM.CLUBS`;

-- Path: src/sql/tables/club.sql

-- -----------------------------------------------------
-- Table `ESCOM.CLUBS`.`CLUB`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `ESCOM.CLUBS`.`CLUB` ;
CREATE TABLE IF NOT EXISTS `ESCOM.CLUBS`.`CLUB` (
  `ID_CLUB` INT NOT NULL AUTO_INCREMENT,
  `NAME` VARCHAR(45) NOT NULL,
  `DESCRIPTION` VARCHAR(45) NOT NULL,
  `LOGO` VARCHAR(45) NOT NULL,
  `OWNER` VARCHAR(45) NOT NULL,
  `MAX_MEMBERS` INT NOT NULL,
  `CURRENT_MEMBERS` INT NOT NULL,
  `PLACE` VARCHAR(45) NOT NULL,
  `CREATION_DATE` DATE NOT NULL,
  `STATUS` INT NOT NULL,
  PRIMARY KEY (`ID_CLUB`));

INSERT INTO `ESCOM.CLUBS`.`CLUB` VALUES (1,'Club de Ajedrez','Club de Ajedrez','chess.png','Juan Perez',10,5,'1011','2018-01-01',1);
INSERT INTO `ESCOM.CLUBS`.`CLUB` VALUES (2,'Club de Baloncesto','Club de Baloncesto','basketball.png','Juan Perez',10,5,'1011','2018-01-01',1);
INSERT INTO `ESCOM.CLUBS`.`CLUB` VALUES (3,'Club de Futbol F','Club de Futbol Americano Femenil','futbol.png','Juan Perez',10,5,'1011','2018-01-01',1);
INSERT INTO `ESCOM.CLUBS`.`CLUB` VALUES (4,'Club de Atletismo','Club de Atletismo','running.png','Juan Perez',10,5,'1011','2018-01-01',1);
INSERT INTO `ESCOM.CLUBS`.`CLUB` VALUES (5,'Club de Futbol','Club de Futbol Soccer','soccer.png','Juan Perez',10,5,'1011','2018-01-01',1);
INSERT INTO `ESCOM.CLUBS`.`CLUB` VALUES (6,'Club de Videojuegos','Club de Videojuegos','gamming.png','Juan Perez',10,5,'1011','2018-01-01',1);
INSERT INTO `ESCOM.CLUBS`.`CLUB` VALUES (7,'Club de Voleibol','Club de Voleibol','volleyball.png','Juan Perez',10,5,'1011','2018-01-01',1);

-- Path: src/sql/tables/club_member.sql

-- -----------------------------------------------------
-- Table `ESCOM.CLUBS`.`REQUEST'S`
-- -----------------------------------------------------

CREATE TABLE IF NOT EXISTS `ESCOM.CLUBS`.`USER` (
  `ID_USER` VARCHAR(45) NOT NULL,
  `NAME` VARCHAR(45) NOT NULL,
  `LAST_NAME` VARCHAR(45) NOT NULL,
  `EMAIL` VARCHAR(45) NOT NULL,
  `PASSWORD` VARCHAR(45) NOT NULL,
  `PHONE` VARCHAR(45) NOT NULL,
  `BIRTHDAY` DATE NOT NULL,
  `GENDER` VARCHAR(45) NOT NULL,
  `STATUS` VARCHAR(45) NOT NULL,
  `CREATION_DATE` DATE NOT NULL,
  PRIMARY KEY (`ID_USER`),
  constraint STATUS check (STATUS="active" or STATUS="inactive" or STATUS="blocked")
);

INSERT INTO `ESCOM.CLUBS`.`USER` VALUES ('2015090001','Juan','Perez','juan@alumno.ipn.mx','123456','5555555555','1998-01-01','M','active','2018-01-01');
INSERT INTO `ESCOM.CLUBS`.`USER` VALUES ('2015090002','Pedro','Perez','pedro@alumno.ipn.mx','123456','5555555555','1998-01-01','M','active','2018-01-01');
INSERT INTO `ESCOM.CLUBS`.`USER` VALUES ('2015090003','Maria','Perez','maria@alumno.ipn.mx','123456','5555555555','1998-01-01','F','active','2018-01-01');
INSERT INTO `ESCOM.CLUBS`.`USER` VALUES ('2015090004','Jose','Perez','jose@alumno.ipn.mx','123456','5555555555','1998-01-01','M','active','2018-01-01');
INSERT INTO `ESCOM.CLUBS`.`USER` VALUES ('2015090005','Luis','Perez','luiz@alumno.ipn.mx','123456','5555555555','1998-01-01','M','active','2018-01-01');

CREATE TABLE IF NOT EXISTS `ESCOM.CLUBS`.`REQUEST` (
  `ID_REQUEST` INT NOT NULL AUTO_INCREMENT,
  `DESCRIPTION` VARCHAR(45) NOT NULL,
  `ID_CLUB` INT NOT NULL,
  `ID_USER` VARCHAR(45) NOT NULL,
  `CREATION_DATE` DATE NOT NULL,
  `STATUS` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`ID_REQUEST`),
  FOREIGN KEY (`ID_CLUB`) REFERENCES `ESCOM.CLUBS`.`CLUB` (`ID_CLUB`),
  FOREIGN KEY (`ID_USER`) REFERENCES `ESCOM.CLUBS`.`USER` (`ID_USER`),
  constraint STATUS_REQUEST check (STATUS="approved" or STATUS="rejected" or STATUS="pending")
);

INSERT INTO `ESCOM.CLUBS`.`REQUEST` VALUES (1,'Solicitud de ingreso al club de ajedrez',1,'2015090001','2018-01-01','approved');
INSERT INTO `ESCOM.CLUBS`.`REQUEST` VALUES (2,'Solicitud de ingreso al club de ajedrez',1,'2015090002','2018-01-01','approved');

-- -----------------------------------------------------
-- Table `ESCOM.CLUBS`.`CLUB_MEMBER`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `ESCOM.CLUBS`.`CLUB_MEMBER` ;
CREATE TABLE IF NOT EXISTS `ESCOM.CLUBS`.`CLUB_MEMBER` (
  `ID_CLUB` INT NOT NULL,
  `ID_USER` VARCHAR(45) NOT NULL,
  `JOIN_DATE` DATE NOT NULL,
  `STATUS` INT NOT NULL,
  PRIMARY KEY (`ID_CLUB`, `ID_USER`),
  FOREIGN KEY (`ID_CLUB`) REFERENCES `ESCOM.CLUBS`.`CLUB` (`ID_CLUB`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  FOREIGN KEY (`ID_USER`) REFERENCES `ESCOM.CLUBS`.`USER` (`ID_USER`) ON DELETE NO ACTION ON UPDATE NO ACTION);  

INSERT INTO `ESCOM.CLUBS`.`CLUB_MEMBER` VALUES (1,1,'2018-01-01',1);
INSERT INTO `ESCOM.CLUBS`.`CLUB_MEMBER` VALUES (1,2,'2018-01-01',1);