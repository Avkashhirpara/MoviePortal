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
-- Table structure for table `show_rates`
--

DROP TABLE IF EXISTS `show_rates`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `show_rates` (
  `id` int NOT NULL,
  `show_id` int NOT NULL,
  `section_id` int NOT NULL,
  `price` double NOT NULL,
  `created_date` timestamp NOT NULL,
  `created_by` int NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_show_rates_show_id` (`show_id`),
  KEY `fk_show_rates_section_id` (`section_id`),
  CONSTRAINT `fk_show_rates_section_id` FOREIGN KEY (`section_id`) REFERENCES `section` (`id`),
  CONSTRAINT `fk_show_rates_show_id` FOREIGN KEY (`show_id`) REFERENCES `show` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `show_rates`
--

LOCK TABLES `show_rates` WRITE;
/*!40000 ALTER TABLE `show_rates` DISABLE KEYS */;
INSERT INTO `show_rates` VALUES (1,1,1,250,'2022-08-08 04:00:00',1),(2,1,2,350,'2022-08-08 04:00:00',1),(3,1,3,450,'2022-08-08 04:00:00',1),(4,2,1,300,'2022-08-08 04:00:00',1),(5,2,2,400,'2022-08-08 04:00:00',1),(6,2,3,600,'2022-08-08 04:00:00',1);
/*!40000 ALTER TABLE `show_rates` ENABLE KEYS */;
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
