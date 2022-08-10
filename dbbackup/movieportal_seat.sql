-- MySQL dump 10.13  Distrib 8.0.28, for Win64 (x86_64)
--
-- Host: localhost    Database: movieportal
-- ------------------------------------------------------
-- Server version	8.0.28

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
-- Table structure for table `seat`
--

DROP TABLE IF EXISTS `seat`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `seat` (
  `id` int NOT NULL,
  `screen_id` int NOT NULL,
  `section_id` int NOT NULL,
  `row_number` varchar(5) NOT NULL,
  `seat_number` int NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_seat_screen_id` (`screen_id`),
  KEY `fk_seat_section_id` (`section_id`),
  CONSTRAINT `fk_seat_screen_id` FOREIGN KEY (`screen_id`) REFERENCES `screen` (`id`),
  CONSTRAINT `fk_seat_section_id` FOREIGN KEY (`section_id`) REFERENCES `section` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `seat`
--

LOCK TABLES `seat` WRITE;
/*!40000 ALTER TABLE `seat` DISABLE KEYS */;
INSERT INTO `seat` VALUES (1,1,1,'A',1),(2,1,1,'A',2),(3,1,1,'A',3),(4,1,1,'A',4),(5,1,1,'A',5),(6,1,1,'A',6),(7,1,1,'A',7),(8,1,2,'B',1),(9,1,2,'B',2),(10,1,2,'B',3),(11,1,2,'B',4),(12,1,2,'B',5),(13,1,2,'B',6),(14,1,2,'B',7),(15,1,3,'C',1),(16,1,3,'C',2),(17,1,3,'C',3),(18,1,3,'C',4),(19,1,3,'C',5),(20,1,3,'C',6),(21,1,3,'C',7),(22,2,1,'A',2),(23,2,1,'A',3),(24,2,1,'A',4),(25,2,1,'A',5),(26,2,1,'A',6),(27,2,1,'A',7),(28,2,2,'B',1),(29,2,2,'B',2),(30,2,2,'B',3),(31,2,2,'B',4),(32,2,2,'B',5),(33,2,2,'B',6),(34,2,2,'B',7),(35,2,3,'C',1),(36,2,3,'C',2),(37,2,3,'C',3),(38,2,3,'C',4),(39,2,3,'C',5),(40,2,3,'C',6),(41,2,3,'C',7),(42,2,1,'A',1);
/*!40000 ALTER TABLE `seat` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-08-10  1:48:14
