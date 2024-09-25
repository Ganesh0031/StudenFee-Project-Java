-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Feb 11, 2023 at 05:18 PM
-- Server version: 10.4.27-MariaDB
-- PHP Version: 8.2.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `mca`
--

-- --------------------------------------------------------

--
-- Table structure for table `corsee`
--

CREATE TABLE `corsee` (
  `id` int(11) NOT NULL,
  `C_name` varchar(30) NOT NULL,
  `cost` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `corsee`
--

INSERT INTO `corsee` (`id`, `C_name`, `cost`) VALUES
(4, 'MCA', '660000');

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
  `MobileNo` varchar(30) NOT NULL,
  `courname` varchar(30) NOT NULL,
  `Total_Amounts` varchar(30) NOT NULL,
  `ped_unpe` varchar(30) NOT NULL,
  `no_word` varchar(100) NOT NULL,
  `reparkk` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `exam_fee`
--

INSERT INTO `exam_fee` (`reciptNo`, `data`, `paymentmod`, `Fee_Types`, `Student_Name`, `roll`, `year01`, `year02`, `Castes`, `MobileNo`, `courname`, `Total_Amounts`, `ped_unpe`, `no_word`, `reparkk`) VALUES
(1, '2023-59-11', 'Cash', 'Exam Fee', 'vaibhav', '1', '2022', '2023', 'SC', '951247823', 'BCO', '5465', 'Paid', 'Five Thousand Four Hundred Sixty Five', ''),
(2, '2023-10-11', 'Cash', 'Exam Fee', 'jadhav', '32', '2022', '2023', 'OPEN', '9638521470', 'MCA', '2545', 'Paid', 'Two Thousand Five Hundred Forty Five', '');

-- --------------------------------------------------------

--
-- Table structure for table `feess`
--

CREATE TABLE `feess` (
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
  `no_word` varchar(100) NOT NULL,
  `reparkk` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `feess`
--

INSERT INTO `feess` (`reciptNo`, `data`, `paymentmod`, `Fee_Types`, `Student_Name`, `roll`, `year01`, `year02`, `Castes`, `MobileNo`, `courname`, `Total_Amounts`, `ped_unpe`, `no_word`, `reparkk`) VALUES
(1, '2023-52-11', 'Cash', 'Admission Fee', 'vaibhav', '1', '2022', '2023', 'OPEN', '962585652', 'BCO', '4211', 'Paid', 'Four Thousand Two Hundred Eleven', ''),
(2, '2023-59-11', 'Cash', 'Admission Fee', 'vaibhav', '1', '2022', '2023', 'SC', '951247823', 'BCO', '5465', 'Paid', 'Five Thousand Four Hundred Sixty Five', ''),
(3, '2023-01-11', 'Cash', 'Admission Fee', 'jadhav', '3', '2022', '2023', 'OPEN', '9638521470', 'MCA', '200000', 'Paid', 'Two Lakh', ''),
(4, '2023-05-11', 'Cash', 'Admission Fee', 'jadhav', '23', '2022', '2023', 'OPEN', '9874562132', 'MCA', '5486512', 'Paid', 'Fifty Four Lakh Eighty Six Thousand Five Hundred Twelve', '');

-- --------------------------------------------------------

--
-- Table structure for table `pending_fee`
--

CREATE TABLE `pending_fee` (
  `reciptNo` int(11) NOT NULL,
  `data` varchar(11) NOT NULL,
  `paymentmod` varchar(11) NOT NULL,
  `Fee_Types` varchar(11) NOT NULL,
  `Student_Name` varchar(11) NOT NULL,
  `roll` varchar(11) NOT NULL,
  `year01` varchar(30) NOT NULL,
  `year02` varchar(30) NOT NULL,
  `Castes` varchar(30) NOT NULL,
  `MobileNo` varchar(30) NOT NULL,
  `courname` varchar(30) NOT NULL,
  `Total_Amounts` varchar(30) NOT NULL,
  `ped_unpe` varchar(30) NOT NULL,
  `no_word` varchar(100) NOT NULL,
  `reparkk` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `pending_fee`
--

INSERT INTO `pending_fee` (`reciptNo`, `data`, `paymentmod`, `Fee_Types`, `Student_Name`, `roll`, `year01`, `year02`, `Castes`, `MobileNo`, `courname`, `Total_Amounts`, `ped_unpe`, `no_word`, `reparkk`) VALUES
(1, '2023-12-11', 'Cash', 'Pending Fee', 'jadhav', '326', '2022', '2023', 'OPEN', '96527566645', 'MCA', '2545', 'Paid', 'Two Thousand Five Hundred Forty Five', ''),
(2, '2023-12-11', 'Cash', 'Pending Fee', 'jadhav', '326', '2022', '2023', 'OPEN', '96527566645', 'MCA', '2545', 'Paid', 'Two Thousand Five Hundred Forty Five', ''),
(3, '2023-12-11', 'Cash', 'Pending Fee', 'jadhav', '326', '2022', '2023', 'OPEN', '96527566645', 'MCA', '2545', 'Paid', 'Two Thousand Five Hundred Forty Five', '');

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
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `signupp`
--

INSERT INTO `signupp` (`id`, `Firstname`, `Lastname`, `username`, `CPassword`, `Password`, `date`, `Contact_no`) VALUES
(1, 'vaibhav', 'jadhav', 'vaibhav', '123', '123', '2022-15-23', '1234567890'),
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
  ADD PRIMARY KEY (`reciptNo`);

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
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `exam_fee`
--
ALTER TABLE `exam_fee`
  MODIFY `reciptNo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `feess`
--
ALTER TABLE `feess`
  MODIFY `reciptNo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `pending_fee`
--
ALTER TABLE `pending_fee`
  MODIFY `reciptNo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `signupp`
--
ALTER TABLE `signupp`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
