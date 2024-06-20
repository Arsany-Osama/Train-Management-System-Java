-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 20, 2024 at 02:08 AM
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
-- Database: `trainproject`
--

-- --------------------------------------------------------

--
-- Table structure for table `reservations`
--

CREATE TABLE `reservations` (
  `id` varchar(10) NOT NULL,
  `tcode` varchar(7) NOT NULL,
  `journey` varchar(3) NOT NULL,
  `kilometers` varchar(10) NOT NULL,
  `cost` varchar(10) NOT NULL,
  `stime` varchar(10) NOT NULL,
  `atime` varchar(10) NOT NULL,
  `duration` varchar(10) NOT NULL,
  `individuals` varchar(3) NOT NULL,
  `Date` varchar(20) NOT NULL,
  `rdays` varchar(10) NOT NULL,
  `tfrom` varchar(10) NOT NULL,
  `tto` varchar(10) NOT NULL,
  `type` varchar(20) NOT NULL,
  `Address` varchar(100) NOT NULL,
  `way` varchar(20) NOT NULL,
  `seat` varchar(100) NOT NULL DEFAULT '0',
  `car` varchar(5) NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `seats`
--

CREATE TABLE `seats` (
  `Journey` varchar(3) NOT NULL,
  `CarNo` varchar(3) NOT NULL,
  `s1` varchar(3) NOT NULL DEFAULT 'f',
  `s2` varchar(3) NOT NULL DEFAULT 'f',
  `s3` varchar(3) NOT NULL DEFAULT 'f',
  `s4` varchar(3) NOT NULL DEFAULT 'f',
  `s5` varchar(3) NOT NULL DEFAULT 'f',
  `s6` varchar(3) NOT NULL DEFAULT 'f',
  `s7` varchar(3) NOT NULL DEFAULT 'f',
  `s8` varchar(3) NOT NULL DEFAULT 'f',
  `s9` varchar(3) NOT NULL DEFAULT 'f',
  `s10` varchar(3) NOT NULL DEFAULT 'f',
  `s11` varchar(3) NOT NULL DEFAULT 'f',
  `s12` varchar(3) NOT NULL DEFAULT 'f',
  `s13` varchar(3) NOT NULL DEFAULT 'f',
  `s14` varchar(3) NOT NULL DEFAULT 'f',
  `s15` varchar(3) NOT NULL DEFAULT 'f',
  `s16` varchar(3) NOT NULL DEFAULT 'f',
  `s17` varchar(3) NOT NULL DEFAULT 'f',
  `s18` varchar(3) NOT NULL DEFAULT 'f',
  `s19` varchar(3) NOT NULL DEFAULT 'f',
  `s20` varchar(3) NOT NULL DEFAULT 'f',
  `s21` varchar(3) NOT NULL DEFAULT 'f',
  `s22` varchar(3) NOT NULL DEFAULT 'f',
  `s23` varchar(3) NOT NULL DEFAULT 'f',
  `s24` varchar(3) NOT NULL DEFAULT 'f',
  `s25` varchar(3) NOT NULL DEFAULT 'f',
  `s26` varchar(3) NOT NULL DEFAULT 'f',
  `s27` varchar(3) NOT NULL DEFAULT 'f',
  `s28` varchar(3) NOT NULL DEFAULT 'f',
  `s29` varchar(3) NOT NULL DEFAULT 'f',
  `s30` varchar(3) NOT NULL DEFAULT 'f',
  `s31` varchar(3) NOT NULL DEFAULT 'f',
  `s32` varchar(3) NOT NULL DEFAULT 'f',
  `s33` varchar(3) NOT NULL DEFAULT 'f',
  `s34` varchar(3) NOT NULL DEFAULT 'f',
  `s35` varchar(3) NOT NULL DEFAULT 'f',
  `s36` varchar(3) NOT NULL DEFAULT 'f',
  `s37` varchar(3) NOT NULL DEFAULT 'f',
  `s38` varchar(3) NOT NULL DEFAULT 'f',
  `s39` varchar(3) NOT NULL DEFAULT 'f',
  `s40` varchar(3) NOT NULL DEFAULT 'f',
  `s41` varchar(3) NOT NULL DEFAULT 'f',
  `s42` varchar(3) NOT NULL DEFAULT 'f',
  `s43` varchar(3) NOT NULL DEFAULT 'f',
  `s44` varchar(3) NOT NULL DEFAULT 'f',
  `s45` varchar(3) NOT NULL DEFAULT 'f',
  `s46` varchar(3) NOT NULL DEFAULT 'f',
  `s47` varchar(3) NOT NULL DEFAULT 'f',
  `s48` varchar(3) NOT NULL DEFAULT 'f'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `seats`
--

INSERT INTO `seats` (`Journey`, `CarNo`, `s1`, `s2`, `s3`, `s4`, `s5`, `s6`, `s7`, `s8`, `s9`, `s10`, `s11`, `s12`, `s13`, `s14`, `s15`, `s16`, `s17`, `s18`, `s19`, `s20`, `s21`, `s22`, `s23`, `s24`, `s25`, `s26`, `s27`, `s28`, `s29`, `s30`, `s31`, `s32`, `s33`, `s34`, `s35`, `s36`, `s37`, `s38`, `s39`, `s40`, `s41`, `s42`, `s43`, `s44`, `s45`, `s46`, `s47`, `s48`) VALUES
('1', 'c1', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f'),
('1', 'c2', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f'),
('1', 'c3', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f'),
('1', 'c4', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f'),
('1', 'c5', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f'),
('2', 'c1', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f'),
('2', 'c2', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f'),
('2', 'c3', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f'),
('2', 'c4', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f'),
('2', 'c5', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f', 'f');

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `id` varchar(11) NOT NULL,
  `name` varchar(1000) NOT NULL,
  `password` varchar(8) NOT NULL,
  `age` varchar(3) NOT NULL,
  `pensioner` varchar(5) NOT NULL,
  `Money` varchar(100) NOT NULL DEFAULT '0',
  `Travels` varchar(5) NOT NULL DEFAULT '0',
  `Kilometers` varchar(10) NOT NULL DEFAULT '0',
  `Day` varchar(3) NOT NULL DEFAULT '0',
  `Month` varchar(3) NOT NULL DEFAULT '0',
  `PreferredSt` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
