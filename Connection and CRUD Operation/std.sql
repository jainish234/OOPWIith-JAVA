-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 01, 2024 at 08:25 PM
-- Server version: 10.4.18-MariaDB
-- PHP Version: 8.0.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `std`
--

-- --------------------------------------------------------

--
-- Table structure for table `c_b`
--

CREATE TABLE `c_b` (
  `sid` int(20) NOT NULL,
  `s_name` varchar(100) NOT NULL,
  `s_stream` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `c_b`
--

INSERT INTO `c_b` (`sid`, `s_name`, `s_stream`) VALUES
(1, 'Harsh', 'MCA'),
(2, 'Ajay', 'Mcom'),
(3, 'Deep', 'Mphil'),
(4, 'Keyur', 'MBA'),
(5, 'DEV', 'MSCIT'),
(6, 'Neel', 'BCA'),
(7, 'Rushi', 'Bcom'),
(8, 'Dhruv', 'Mpharm'),
(9, 'Jay', 'Computer Engineer'),
(10, 'Monij', 'BSCIT');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `c_b`
--
ALTER TABLE `c_b`
  ADD PRIMARY KEY (`sid`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `c_b`
--
ALTER TABLE `c_b`
  MODIFY `sid` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
