CREATE DATABASE  IF NOT EXISTS `examen_civa` /*!40100 DEFAULT CHARACTER SET utf8mb3 */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `examen_civa`;

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
-- Table structure for table `posicion`
--
DROP TABLE IF EXISTS `posicion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE posicion (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(50) NOT NULL
);

DROP TABLE IF EXISTS `futbolista`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE futbolista (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombres VARCHAR(50) NOT NULL,
    apellidos VARCHAR(50) NOT NULL,
    fecha_nacimiento DATE NOT NULL,
    caracteristicas TEXT,
    posicion_id INT,
    FOREIGN KEY (posicion_id) REFERENCES posicion(id)
);

--
-- Insertar datos
--
INSERT INTO posicion (nombre) VALUES ('Arquero'), ('Defensa'), ('Mediocampista'), ('Delantero');
INSERT INTO futbolista (nombres, apellidos, fecha_nacimiento, caracteristicas, posicion_id) VALUES 
('Juan', 'Pérez', '1990-01-01', 'Alto, rápido', 1),
('Carlos', 'Gómez', '1992-02-02', 'Fuerte, ágil', 2),
('Luis', 'Martínez', '1994-03-03', 'Inteligente, técnico', 3),
('Pedro', 'López', '1996-04-04', 'Resistente, hábil', 4),
('Jorge', 'Díaz', '1998-05-05', 'Rápido, fuerte', 1),
('Miguel', 'Fernández', '2000-06-06', 'Ágil, técnico', 2),
('Andrés', 'García', '1988-07-07', 'Fuerte, resistente', 3),
('Oscar', 'Sánchez', '1991-08-08', 'Rápido, habilidoso', 4),
('Eduardo', 'Ramírez', '1993-09-09', 'Técnico, ágil', 1),
('Diego', 'Torres', '1995-10-10', 'Fuerte, rápido', 2),
('Pablo', 'Hernández', '1997-11-11', 'Ágil, inteligente', 3),
('Ricardo', 'Jiménez', '1999-12-12', 'Hábil, técnico', 4),
('Tomás', 'Ruiz', '1990-01-13', 'Rápido, resistente', 1),
('Francisco', 'Gutiérrez', '1992-02-14', 'Fuerte, ágil', 2),
('Ramón', 'Molina', '1994-03-15', 'Técnico, habilidoso', 3),
('Sergio', 'Castro', '1996-04-16', 'Resistente, ágil', 4),
('Guillermo', 'Ortiz', '1998-05-17', 'Rápido, técnico', 1),
('Roberto', 'Navarro', '2000-06-18', 'Fuerte, habilidoso', 2),
('Héctor', 'Silva', '1988-07-19', 'Ágil, técnico', 3),
('Gabriel', 'Ramos', '1991-08-20', 'Rápido, fuerte', 4),
('Raúl', 'Reyes', '1993-09-21', 'Técnico, resistente', 1),
('Javier', 'Pacheco', '1995-10-22', 'Ágil, rápido', 2),
('Ignacio', 'Alonso', '1997-11-23', 'Fuerte, técnico', 3),
('Mateo', 'Herrera', '1999-12-24', 'Hábil, ágil', 4),
('Cristian', 'Cabrera', '1990-01-25', 'Rápido, resistente', 1),
('Sebastián', 'Rojas', '1992-02-26', 'Fuerte, ágil', 2),
('Adrián', 'Vega', '1994-03-27', 'Técnico, rápido', 3),
('Fernando', 'Iglesias', '1996-04-28', 'Resistente, hábil', 4),
('Alberto', 'Peña', '1998-05-29', 'Ágil, fuerte', 1),
('Manuel', 'Campos', '2000-06-30', 'Rápido, técnico', 2);





