/*CREATE DATABASE hplus*/ /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
/*USE 'hplus';*/

-- Table structure for table 'product'
--

/*DROP TABLE IF EXISTS 'product' */
/*!40101 SET @saved_cs_client     = @@character_set_client */
/*!50503 SET character_set_client = utf8mb4 */
/*CREATE TABLE product (
  id int NOT NULL,
  name_ varchar(50) DEFAULT NULL,
  image_path varchar(100) DEFAULT NULL,
  PRIMARY KEY (id)
);*/

--
-- Dumping data for table 'product'
--

/*LOCK TABLES 'product' WRITE*/;
/*!40000 ALTER TABLE 'product' DISABLE KEYS */;
/*INSERT INTO product VALUES (1,'mineralwater-blueberry','images/mineralwater-blueberry.jpg'),(2,'mineralwater-lemonlime','images/mineralwater-lemonlime.jpg'),(3,'mineralwater-orange','images/mineralwater-orange.jpg'),(4,'mineralwater-peach','images/mineralwater-peach.jpg'),(5,'mineralwater-raspberry','images/mineralwater-raspberry.jpg'),(6,'mineralwater-strawberry','images/mineralwater-strawberry.jpg'),(7,'proteinbar-chocolate','images/proteinbar-chocolate.jpg'),(8,'proteinbar-lemon','images/proteinbar-lemon.jpg'),(9,'proteinbar-peanutbutter','images/proteinbar-peanutbutter.jpg'),(10,'vitamin-a','images/vitamin-a.jpg'),(11,'vitamin-bcomplex','images/vitamin-bcomplex.jpg'),(12,'vitamin-calcium','images/vitamin-c.jpg'); */
/*!40000 ALTER TABLE 'product' ENABLE KEYS */;
/*UNLOCK TABLES;*/

/*REATE DATABASE  IF NOT EXISTS 'hplus'*/ /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
/*USE 'hplus';*/


/*DROP TABLE IF EXISTS 'user';*/
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
/*CREATE TABLE user_ (
  id int NOT NULL,
  username varchar(50) DEFAULT NULL,
  password_ varchar(50) DEFAULT NULL,
  first_name varchar(50) DEFAULT NULL,
  last_name varchar(50) DEFAULT NULL,
  date_of_birth date DEFAULT NULL,
  activity varchar(100) DEFAULT NULL,
  gender varchar(50) DEFAULT NULL,
  PRIMARY KEY (id)
  );*/
/*) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;*/
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table 'user'
--

/*LOCK TABLES 'user' WRITE; */
/*!40000 ALTER TABLE 'user' DISABLE KEYS */;
/*INSERT INTO user_ VALUES (1,'admin','admin','admin','admin','2000-01-03','gym','MALE'),(2,'admin1','admin1','admin1','admin1','1985-08-23','sport','FEMALE');*/
/*!40000 ALTER TABLE 'user' ENABLE KEYS */;
/*UNLOCK TABLES;*/

