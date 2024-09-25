-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 25, 2022 at 04:56 PM
-- Server version: 10.4.24-MariaDB
-- PHP Version: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `final_project_bca`
--

-- --------------------------------------------------------

--
-- Table structure for table `corsee`
--

CREATE TABLE `corsee` (
  `id` int(11) NOT NULL,
  `C_name` varchar(30) NOT NULL,
  `cost` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `corsee`
--

INSERT INTO `corsee` (`id`, `C_name`, `cost`) VALUES
(2, '', ''),
(3, 'ba', '28222'),
(4, 'BCA', '33000'),
(5, 'BCO', '5000'),
(6, 'BSC', '8000'),
(7, 'MCA', '800000'),
(8, 'MBA', '8000'),
(9, 'MCOM', '800075'),
(10, 'MSC', '80007');

-- --------------------------------------------------------

--
-- Table structure for table `feess`
--

CREATE TABLE `feess` (
  `reciptNo` int(11) NOT NULL,
  `studentname` varchar(30) NOT NULL,
  `Rol` varchar(30) NOT NULL,
  `paymentmod` varchar(30) NOT NULL,
  `cheque` varchar(30) NOT NULL,
  `banck` varchar(30) NOT NULL,
  `dd` varchar(30) NOT NULL,
  `courname` varchar(30) NOT NULL,
  `gstin` varchar(30) NOT NULL,
  `totalamount` varchar(30) NOT NULL,
  `data` varchar(30) NOT NULL,
  `inishalamount` varchar(30) NOT NULL,
  `cgst` varchar(30) NOT NULL,
  `sgst` varchar(30) NOT NULL,
  `totalword` varchar(30) NOT NULL,
  `reparkk` varchar(30) NOT NULL,
  `year1` varchar(30) NOT NULL,
  `year2` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `feess`
--

INSERT INTO `feess` (`reciptNo`, `studentname`, `Rol`, `paymentmod`, `cheque`, `banck`, `dd`, `courname`, `gstin`, `totalamount`, `data`, `inishalamount`, `cgst`, `sgst`, `totalword`, `reparkk`, `year1`, `year2`) VALUES
(1, 'vaibhav', '26', 'cash', '', '', '', 'ba', 'DAH57685S', '304.44', '2022-05-23', '258', '23.220001', '23.220001', 'Three Hundred Fouronly', 'yess', '2021', '2021'),
(2, 'vaibhav', '26', 'cash', '', '', '', 'ba', 'DAH57685S', '304.44', '2022-05-23', '258', '23.220001', '23.220001', 'Three Hundred Fouronly', 'yess', '2021', '2021'),
(3, '', '', 'DD', '', '', '', '', 'DAH57685S', '', '2022-41-23', '', '', '', '', '', '2021', '2021'),
(4, '', '', 'DD', '', '', '', '', 'DAH57685S', '', '2022-46-23', '', '', '', '', '', '2021', '2021'),
(5, 'vvvvv', '5274', 'cash', '', '', '', 'ba', 'DAH57685S', '881.45996', '2022-50-23', '747', '67.23', '67.23', 'Eight Hundred Eighty Oneonly', 'rdf', '2021', '2021'),
(6, 'vvvvv', '5274', 'cash', '', '', '', 'ba', 'DAH57685S', '881.45996', '2022-50-23', '747', '67.23', '67.23', 'Eight Hundred Eighty Oneonly', 'rdf', '2021', '2021'),
(7, 'Ruchita pawar', '22', 'cash', '', '', '', 'BCA', 'DAH57685S', '274.94', '2022-36-05', '233', '20.970001', '20.970001', 'Two Hundred Seventy Fouronly', 'yes', '2021', '2021');

-- --------------------------------------------------------

--
-- Table structure for table `signupp`
--

CREATE TABLE `signupp` (
  `id` int(11) NOT NULL,
  `Firstname` varchar(30) NOT NULL,
  `Lastname` varchar(30) NOT NULL,
  `username` varchar(30) NOT NULL,
  `CPassword` varchar(30) NOT NULL,
  `Password` varchar(30) NOT NULL,
  `date` varchar(30) NOT NULL,
  `Contact_no` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `signupp`
--

INSERT INTO `signupp` (`id`, `Firstname`, `Lastname`, `username`, `CPassword`, `Password`, `date`, `Contact_no`) VALUES
(1, 'vaibhav', 'jadhav', 'vaibhav', '123456789', '123456789', '2022-15-23', '1234567890'),
(2, 'vaibhav', 'jadhav', 'vaibhav', '123456789', '123456789', '2022-15-23', '1234567890');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `corsee`
--
ALTER TABLE `corsee`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `feess`
--
ALTER TABLE `feess`
  ADD PRIMARY KEY (`reciptNo`);

--
-- Indexes for table `signupp`
--
ALTER TABLE `signupp`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `corsee`
--
ALTER TABLE `corsee`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT for table `feess`
--
ALTER TABLE `feess`
  MODIFY `reciptNo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `signupp`
--
ALTER TABLE `signupp`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
