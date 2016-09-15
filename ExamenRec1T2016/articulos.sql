-- phpMyAdmin SQL Dump
-- version 4.5.0.2
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 07-02-2016 a las 12:26:09
-- Versión del servidor: 10.0.17-MariaDB
-- Versión de PHP: 5.6.14

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `articulos`
--
CREATE DATABASE IF NOT EXISTS `articulos` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `articulos`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tarticulos`
--

DROP TABLE IF EXISTS `tarticulos`;
CREATE TABLE `tarticulos` (
  `nombrearticulo` varchar(15) NOT NULL,
  `codarticulo` int(6) NOT NULL,
  `precio` int(4) NOT NULL,
  `importado` varchar(2) NOT NULL,
  `almacen` varchar(80) NOT NULL,
  `stock` int(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `tarticulos`
--
ALTER TABLE `tarticulos`
  ADD PRIMARY KEY (`codarticulo`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
