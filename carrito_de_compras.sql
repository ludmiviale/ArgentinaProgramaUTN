-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: localhost
-- Tiempo de generación: 26-04-2023 a las 04:21:19
-- Versión del servidor: 10.4.21-MariaDB
-- Versión de PHP: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `carrito_de_compras`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `carrito`
--

CREATE TABLE `carrito` (
  `idcarrito` int(11) NOT NULL,
  `cuil` varchar(15) NOT NULL,
  `montototal` decimal(14,2) NOT NULL,
  `montocondesc` decimal(14,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `carrito`
--

INSERT INTO `carrito` (`idcarrito`, `cuil`, `montototal`, `montocondesc`) VALUES
(1, '20298862318', '1930.00', '1351.00'),
(2, '20298862318', '2980.00', '2086.00'),
(3, '20307778438', '6250.00', '4375.00'),
(4, '20307778438', '9500.00', '6650.00'),
(5, '27334126606', '4350.00', '3045.00'),
(6, '27334126606', '1060.00', '742.00');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `clientes`
--

CREATE TABLE `clientes` (
  `nombres` varchar(70) DEFAULT NULL,
  `cuil` varchar(15) NOT NULL,
  `telefono` varchar(15) DEFAULT NULL,
  `email` varchar(40) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `clientes`
--

INSERT INTO `clientes` (`nombres`, `cuil`, `telefono`, `email`) VALUES
('Marcos Sierra', '20298862318', '3425676990', 'marcos_sierra@gmail.com'),
('Juan Zeballos', '20307778438', '3424611099', 'jzeballos@gmail.com'),
('Ana Garibaldi', '27334126606', '3425008362', 'anitagaribaldi@gmail.com');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `item`
--

CREATE TABLE `item` (
  `iditem` int(11) NOT NULL,
  `precio` decimal(14,2) NOT NULL,
  `nombre` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `item`
--

INSERT INTO `item` (`iditem`, `precio`, `nombre`) VALUES
(1, '220.00', 'Agua mineral'),
(2, '350.00', 'Gaseosa'),
(3, '490.00', 'Jugo de naranja'),
(4, '900.00', 'Vino Malbec'),
(5, '850.00', 'Vino Syrah'),
(6, '950.00', 'Vino Cabernet');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `itemcarrito`
--

CREATE TABLE `itemcarrito` (
  `idcarrito` int(11) NOT NULL,
  `iditem` int(11) NOT NULL,
  `cantidad` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `itemcarrito`
--

INSERT INTO `itemcarrito` (`idcarrito`, `iditem`, `cantidad`) VALUES
(0, 6, 10),
(4, 5, 3),
(4, 4, 2),
(6, 3, 1),
(6, 2, 1),
(6, 1, 1);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `carrito`
--
ALTER TABLE `carrito`
  ADD PRIMARY KEY (`idcarrito`);

--
-- Indices de la tabla `clientes`
--
ALTER TABLE `clientes`
  ADD PRIMARY KEY (`cuil`);

--
-- Indices de la tabla `item`
--
ALTER TABLE `item`
  ADD PRIMARY KEY (`iditem`);

--
-- Indices de la tabla `itemcarrito`
--
ALTER TABLE `itemcarrito`
  ADD KEY `idcarrito` (`idcarrito`),
  ADD KEY `itemcarrito_ibfk_1` (`iditem`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `carrito`
--
ALTER TABLE `carrito`
  MODIFY `idcarrito` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT de la tabla `item`
--
ALTER TABLE `item`
  MODIFY `iditem` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `itemcarrito`
--
ALTER TABLE `itemcarrito`
  ADD CONSTRAINT `itemcarrito_ibfk_1` FOREIGN KEY (`iditem`) REFERENCES `item` (`iditem`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
