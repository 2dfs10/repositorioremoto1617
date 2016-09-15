-- phpMyAdmin SQL Dump
-- version 3.5.2.2
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 03-06-2013 a las 21:21:13
-- Versión del servidor: 5.5.27
-- Versión de PHP: 5.4.7

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;


--
-- Base de datos: `datos1314recu`
--
CREATE DATABASE IF NOT EXISTS `datosejer1` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `datosejer1`;



-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ejercicio2`
--

CREATE TABLE IF NOT EXISTS `ejercicio1` (
  `idacuerdo` int(3) NOT NULL AUTO_INCREMENT,
  `empresa` varchar(25) CHARACTER SET latin1 COLLATE latin1_spanish_ci NOT NULL,
  `alumno` varchar(20) NOT NULL,
  `finicio` varchar(10) CHARACTER SET latin1 COLLATE latin1_spanish_ci NOT NULL,
  `ffinal` varchar(10) CHARACTER SET latin1 COLLATE latin1_spanish_ci NOT NULL,
  `ambitolocal` varchar(2) NOT NULL,
  `distancia` decimal(5,2) NOT NULL,
  `tutordocente` varchar(25) NOT NULL,
  PRIMARY KEY (`idacuerdo`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=25 ;

--
-- Volcado de datos para la tabla `ejercicio2`
--

INSERT INTO `ejercicio1` (`idacuerdo`, `empresa`, `alumno`, `finicio`, `ffinal`, `ambitolocal`, `distancia`, `tutordocente`) VALUES
(17, 'Leroy', 'Teo', '14/05/2013', '21/06/2013', 'Si', 75.00, 'Eduardo'),
(18, 'Hospital', 'Eusebio', '14/05/2013', '21/06/2013', 'Si', 85.00, 'Miguel'),
(19, 'pc coste', 'Adrian', '14/05/2013', '21/06/2013', 'No', 200.00, 'Do Carmo'),
(20, 'Atlantic cooper', 'juan vela', '21/05/2013', '21/06/2013', 'No', 300.00, 'Miguel'),
(21, 'Diputacion', 'Joselito', '21/09/2012', '21/12/2012', 'Si', 60.00, 'Eduardo'),
(22, 'Celulosa', 'Joselito', '21/09/2012', '21/12/2012', 'No', 150.00, 'Eduardo'),
(23, 'Mercedes benz', 'Teo', '21/09/2012', '21/12/2012', 'No', 200.00, 'Miguel'),
(24, 'App informatica', 'Gullermo', '15/10/2013', '28/12/2013', 'Si', 70.00, 'Do Carmo');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
