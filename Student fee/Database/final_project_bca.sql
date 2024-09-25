-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 12, 2023 at 04:01 PM
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
(4, 'BCA', '33000'),
(5, 'BCO', '5000'),
(6, 'BSC', '8000'),
(7, 'MCA', '800000'),
(8, 'MBA', '8000'),
(9, 'MCOM', '800075'),
(10, 'MSC', '80007'),
(11, 'FYBC', '4000'),
(12, 'SYBC', '4100'),
(13, 'YYBC', '4500'),
(14, 'TYBC', '4500'),
(15, 'FYBCA', '10000'),
(16, 'SYBCA', '15000'),
(17, 'TYBCA', '12000'),
(18, 'FYBA', '4000'),
(19, 'SYBA', '5000'),
(20, 'HSC', '2000'),
(21, '11th', '1000');

-- --------------------------------------------------------

--
-- Table structure for table `exam_fee`
--

CREATE TABLE `exam_fee` (
  `reciptNo` int(11) NOT NULL,
  `data` varchar(30) NOT NULL,
  `paymentmod` varchar(30) NOT NULL,
  `Fee_Types` varchar(30) NOT NULL,
  `Student_Name` varchar(30) NOT NULL,
  `roll` varchar(30) NOT NULL,
  `year01` varchar(30) NOT NULL,
  `year02` varchar(30) NOT NULL,
  `Castes` varchar(30) NOT NULL,
  `MobileNo` varchar(12) NOT NULL,
  `courname` varchar(30) NOT NULL,
  `Total_Amounts` varchar(30) NOT NULL,
  `ped_unpe` varchar(30) NOT NULL,
  `no_word` varchar(50) NOT NULL,
  `reparkk` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `exam_fee`
--

INSERT INTO `exam_fee` (`reciptNo`, `data`, `paymentmod`, `Fee_Types`, `Student_Name`, `roll`, `year01`, `year02`, `Castes`, `MobileNo`, `courname`, `Total_Amounts`, `ped_unpe`, `no_word`, `reparkk`) VALUES
(1, '2022-09-28', 'Cash', 'Exam Fee', 'jadhav', '2', '2022', '2023', 'OPEN', '8521479630', 'BCO', '5000', 'Paid', '', ''),
(2, '2022-09-28', 'Cash', 'Exam Fee', 'vaibhav', '2', '2022', '2023', 'OPEN', '8521479630', 'BCO', '5000', 'Paid', '', ''),
(3, '2023-05-11', 'Cash', 'Exam Fee', 'pooja', '22', '2022', '2023', 'OPEN', '65486521653', 'BCA', '3500', 'Paid', 'Three Thousand Five Hundred', '');

-- --------------------------------------------------------

--
-- Table structure for table `feess`
--

CREATE TABLE `feess` (
  `reciptN` int(11) NOT NULL,
  `date` varchar(20) NOT NULL,
  `paymentmod` varchar(15) NOT NULL,
  `Fee_Types` varchar(15) NOT NULL,
  `Student_Name` varchar(30) NOT NULL,
  `roll` varchar(10) NOT NULL,
  `year01` varchar(5) NOT NULL,
  `year02` varchar(5) NOT NULL,
  `Castes` varchar(20) NOT NULL,
  `MobileNo` varchar(12) NOT NULL,
  `courname` varchar(20) NOT NULL,
  `Total_Amounts` varchar(10) NOT NULL,
  `ped_unpe` varchar(10) NOT NULL,
  `no_word` varchar(50) NOT NULL,
  `reparkk` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `feess`
--

INSERT INTO `feess` (`reciptN`, `date`, `paymentmod`, `Fee_Types`, `Student_Name`, `roll`, `year01`, `year02`, `Castes`, `MobileNo`, `courname`, `Total_Amounts`, `ped_unpe`, `no_word`, `reparkk`) VALUES
(15, '2022-32-28', 'Cash', 'Admission Fee', 'vaibhav jadhav', '1', '2022', '2023', 'SC', '7894561230', 'MCA', '4100', 'Paid', '', 'yes'),
(16, '2022-09-28', 'Cash', 'Admission Fee', 'jadhav', '2', '2022', '2023', 'OPEN', '8521479630', 'BCO', '5000', 'Paid', '', ''),
(17, '2022-19-28', 'Cash', 'Admission Fee', '', '', '2022', '2023', 'OPEN', '', '', '', 'Paid', '', ''),
(18, '2022-47-28', 'Cash', 'Admission Fee', 'santosh', '3', '2022', '2023', 'OPEN', '5827922124', 'BCA', '34000', 'Paid', '', 'yes'),
(19, '2022-38-30', 'Cash', 'Admission Fee', 'jadhav vaibhav', '4', '2022', '2023', 'SC', '9309142461', 'MCA', '5000', 'Paid', '', ''),
(20, '2022-41-30', 'Cash', 'Admission Fee', 'savita', '5', '2022', '2023', 'OPEN', '65232165321', 'BCA', '123', 'Paid', '', ''),
(21, '2022-44-30', 'Cash', 'Admission Fee', 'devidas', '6', '2022', '2023', 'SC', '28516516555', 'MSC', '200', 'Paid', '', ''),
(22, '2022-44-30', 'Cash', 'Admission Fee', 'ggrt', '8', '2022', '2023', 'ST', '656515214', 'BSC', '255', 'Paid', '', ''),
(23, '2022-54-30', 'Cash', 'Admission Fee', 'dipak', '6', '2022', '2023', 'OPEN', '26564123212', 'BSC', '6000', 'Paid', '', ''),
(24, '2022-21-30', 'Cash', 'Admission Fee', 'sagar', '8', '2022', '2023', 'OPEN', '963258741225', '', '200', 'Paid', '', ''),
(25, '2022-22-30', 'Cash', 'Admission Fee', 'vishal', '9', '2022', '2023', 'OPEN', '54654654122', 'BSC', '665', 'Paid', '', ''),
(26, '2022-25-30', 'Cash', 'Admission Fee', 'vikas', '90', '2022', '2023', 'OBC', '4865415165', 'MCA', '200', 'Paid', '', ''),
(27, '2022-27-30', 'Cash', 'Admission Fee', 'manoj', '12', '2022', '2023', 'SC', '2558', 'BSC', '2300', 'Paid', '', ''),
(28, '2022-27-30', 'Cash', 'Admission Fee', 'manoj', '12', '2022', '2023', 'SC', '2558', 'BSC', '2300', 'Paid', '', 'ok'),
(29, '2022-33-30', 'Cash', 'Admission Fee', 'ketan', '22', '2022', '2023', 'SC', '3694521822', 'MBA', '2584', 'Paid', '', ''),
(30, '2022-37-30', 'Cash', 'Admission Fee', 'vaibhav', '32', '2022', '2023', 'OPEN', '65498723332', 'MCA', '2542', 'Paid', 'Two Thousand Five Hundred Forty Two', 'yes');

-- --------------------------------------------------------

--
-- Table structure for table `pending_fee`
--

CREATE TABLE `pending_fee` (
  `reciptNo` int(11) NOT NULL,
  `data` varchar(30) NOT NULL,
  `paymentmod` varchar(30) NOT NULL,
  `Fee_Types` varchar(30) NOT NULL,
  `Student_Name` varchar(30) NOT NULL,
  `roll` varchar(30) NOT NULL,
  `year01` varchar(30) NOT NULL,
  `year02` varchar(30) NOT NULL,
  `Castes` varchar(30) NOT NULL,
  `MobileNo` varchar(30) NOT NULL,
  `courname` varchar(30) NOT NULL,
  `Total_Amounts` varchar(30) NOT NULL,
  `ped_unpe` varchar(30) NOT NULL,
  `no_word` varchar(50) NOT NULL,
  `reparkk` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `pending_fee`
--

INSERT INTO `pending_fee` (`reciptNo`, `data`, `paymentmod`, `Fee_Types`, `Student_Name`, `roll`, `year01`, `year02`, `Castes`, `MobileNo`, `courname`, `Total_Amounts`, `ped_unpe`, `no_word`, `reparkk`) VALUES
(1, '2022-09-28', 'Cash', 'Pending Fee', 'jadhav', '2', '2022', '2023', 'OPEN', '8521479630', 'BCO', '5000', 'Paid', '', ''),
(2, '2022-32-30', 'Cash', 'Pending Fee', 'gaurav', '13', '2022', '2023', 'OPEN', '3214567892', 'MCOM', '1200', 'Paid', '', '');

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
-- Indexes for table `exam_fee`
--
ALTER TABLE `exam_fee`
  ADD PRIMARY KEY (`reciptNo`);

--
-- Indexes for table `feess`
--
ALTER TABLE `feess`
  ADD PRIMARY KEY (`reciptN`);

--
-- Indexes for table `pending_fee`
--
ALTER TABLE `pending_fee`
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
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=22;

--
-- AUTO_INCREMENT for table `exam_fee`
--
ALTER TABLE `exam_fee`
  MODIFY `reciptNo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `feess`
--
ALTER TABLE `feess`
  MODIFY `reciptN` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=31;

--
-- AUTO_INCREMENT for table `pending_fee`
--
ALTER TABLE `pending_fee`
  MODIFY `reciptNo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `signupp`
--
ALTER TABLE `signupp`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
