-- MySQL dump 10.13  Distrib 8.0.18, for Win64 (x86_64)
--
-- Host: localhost    Database: musicplayer
-- ------------------------------------------------------
-- Server version	5.7.28-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `musicfiles`
--

DROP TABLE IF EXISTS `musicfiles`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `musicfiles` (
  `Song_ID` int(11) NOT NULL,
  `Song_title` varchar(50) DEFAULT NULL,
  `Artist_Name` varchar(50) DEFAULT NULL,
  `Album_Name` varchar(50) DEFAULT NULL,
  `Song_Location` varchar(50) DEFAULT NULL,
  `Description` varchar(250) DEFAULT NULL,
  PRIMARY KEY (`Song_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `musicfiles`
--

LOCK TABLES `musicfiles` WRITE;
/*!40000 ALTER TABLE `musicfiles` DISABLE KEYS */;
INSERT INTO `musicfiles` VALUES (1,'Hud Hud Dabanng','Sajid Wajid','Dabanng','D:/Hindi Songs/Dabanng/Hud_Hud.mp3','Popular Song of actor Salman Khan'),(2,'Chennai Express','Sajid Wajid','Chennai Express','D:/Hindi Songs/Chennai Express/Hud_Hud.mp3','Popular Song of actor Shahrukh Khan'),(3,'Fillhal','B Praak','Fillhal Album','D:/Hindi Songs/Fillhal/fillhal.mp3','Lastest Song of actor Akshay Kumar'),(4,'Blue Eyes','Honey Singh','Blue Eyes','D:/Hindi Songs/Honey Singh Album/blue_eyes.mp3','Old Song of actor Honey Singh'),(5,'Tere Liye','Lata','Veer Zaara','D:/Hindi Songs/Veer Zaara/tere_liye.mp3','Best Song of Veer Zaara');
/*!40000 ALTER TABLE `musicfiles` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-12-09 15:49:23
