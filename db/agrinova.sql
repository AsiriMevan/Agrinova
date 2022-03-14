-- phpMyAdmin SQL Dump
-- version 4.9.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3308
-- Generation Time: Oct 10, 2021 at 06:54 PM
-- Server version: 8.0.18
-- PHP Version: 7.3.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `agrinova`
--

-- --------------------------------------------------------

--
-- Table structure for table `product`
--

DROP TABLE IF EXISTS `product`;
CREATE TABLE IF NOT EXISTS `product` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `productid` int(11) NOT NULL,
  `productname` varchar(255) NOT NULL,
  `quntity` int(11) NOT NULL,
  `price` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `product`
--

INSERT INTO `product` (`id`, `productid`, `productname`, `quntity`, `price`) VALUES
(1, 123, 'panadol', 700, 2000),
(2, 122, 'citrazin', 200, 1000);

-- --------------------------------------------------------

--
-- Table structure for table `purchaseitem`
--

DROP TABLE IF EXISTS `purchaseitem`;
CREATE TABLE IF NOT EXISTS `purchaseitem` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `purchaseid` int(11) NOT NULL,
  `productid` int(11) NOT NULL,
  `price` int(11) NOT NULL,
  `quantity` int(11) NOT NULL,
  `total` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `purchaseitem`
--

INSERT INTO `purchaseitem` (`id`, `purchaseid`, `productid`, `price`, `quantity`, `total`) VALUES
(1, 1, 123, 2000, 20, 40000),
(2, 1, 122, 1000, 200, 200000),
(3, 1, 123, 2000, 35, 70000),
(4, 2, 123, 2000, 20, 40000),
(5, 2, 123, 2000, 20, 40000);

-- --------------------------------------------------------

--
-- Table structure for table `purchaseproduct`
--

DROP TABLE IF EXISTS `purchaseproduct`;
CREATE TABLE IF NOT EXISTS `purchaseproduct` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `date` date NOT NULL,
  `subtotal` int(11) NOT NULL,
  `pay` int(11) NOT NULL,
  `bal` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `purchaseproduct`
--

INSERT INTO `purchaseproduct` (`id`, `date`, `subtotal`, `pay`, `bal`) VALUES
(1, '2021-10-01', 310000, 0, 310000),
(2, '2021-10-02', 80000, 40000, 40000);

-- --------------------------------------------------------

--
-- Table structure for table `stocks`
--

DROP TABLE IF EXISTS `stocks`;
CREATE TABLE IF NOT EXISTS `stocks` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `prouductname` char(255) NOT NULL,
  `supplier` char(255) NOT NULL,
  `quantity` int(20) NOT NULL,
  `stockid` int(20) NOT NULL,
  `prouductid` int(20) NOT NULL,
  `invoiceid` int(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=9 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `stocks`
--

INSERT INTO `stocks` (`id`, `prouductname`, `supplier`, `quantity`, `stockid`, `prouductid`, `invoiceid`) VALUES
(8, 'panadol', 'micke', 200, 234, 344, 255);

-- --------------------------------------------------------

--
-- Table structure for table `store_manger`
--

DROP TABLE IF EXISTS `store_manger`;
CREATE TABLE IF NOT EXISTS `store_manger` (
  `storemanegerid` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  `nic` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  PRIMARY KEY (`storemanegerid`)
) ENGINE=MyISAM AUTO_INCREMENT=1335 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `store_manger`
--

INSERT INTO `store_manger` (`storemanegerid`, `name`, `nic`, `email`, `password`) VALUES
(1223, 'john', '12345', 'john@gmail.com', '1234'),
(1334, 'alex', '123456', 'alex@gmail.com', '1234567');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
CREATE TABLE IF NOT EXISTS `user` (
  `idUser` int(11) NOT NULL AUTO_INCREMENT,
  `userId` varchar(50) NOT NULL,
  `userName` varchar(100) NOT NULL,
  `email` varchar(100) NOT NULL,
  `nicNumber` varchar(20) NOT NULL,
  `contatcNo` varchar(10) NOT NULL,
  `password` varchar(20) NOT NULL,
  `conPassword` varchar(20) NOT NULL,
  `role` varchar(30) NOT NULL,
  PRIMARY KEY (`idUser`)
) ENGINE=MyISAM AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`idUser`, `userId`, `userName`, `email`, `nicNumber`, `contatcNo`, `password`, `conPassword`, `role`) VALUES
(2, 'USR1000', 'Tan Perry', 'tanperry@gmail.com', '7894563121', '0775289652', '123456', '123456', 'admin');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
