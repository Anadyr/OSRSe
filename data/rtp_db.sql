-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Dec 30, 2015 at 07:20 AM
-- Server version: 10.1.9-MariaDB
-- PHP Version: 5.6.15

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `rtp_db`
--

-- --------------------------------------------------------

--
-- Table structure for table `clan_association`
--

CREATE TABLE `clan_association` (
  `global_id` int(9) NOT NULL,
  `username` varchar(12) NOT NULL,
  `name` varchar(15) DEFAULT NULL,
  `permissions` varchar(3) NOT NULL DEFAULT '0;9',
  `friends_list` text,
  `ranks` text,
  `ignore_list` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `player_data`
--

CREATE TABLE `player_data` (
  `global_id` int(9) NOT NULL,
  `deployed` tinyint(1) NOT NULL DEFAULT '0',
  `name` varchar(12) DEFAULT NULL,
  `password` varchar(22) DEFAULT NULL,
  `rights` tinyint(1) NOT NULL DEFAULT '0',
  `coord_x` int(5) NOT NULL DEFAULT '-1',
  `coord_y` int(5) NOT NULL DEFAULT '-1',
  `coord_z` tinyint(1) NOT NULL DEFAULT '-1',
  `login_date` date DEFAULT NULL,
  `interaction_details` varchar(9) NOT NULL DEFAULT '0,0,0,0,0' COMMENT 'public,private,trade,assist',
  `levels` varchar(72) NOT NULL DEFAULT '1;1;1;10;1;1;1;1;1;1;1;1;1;1;1;1;1;1;1;1;1;1;1;1',
  `experience` varchar(240) DEFAULT '0;0;0;1154;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0',
  `equipment` varchar(100) NOT NULL DEFAULT '-1;-1;-1;-1;-1;-1;-1;-1;-1;-1;-1;-1;-1;-1',
  `equipment_values` varchar(108) DEFAULT '0;0;0;0;0;0;0;0;0;0;0;0;0;0',
  `inventory_list` varchar(168) NOT NULL DEFAULT '-1;-1;-1;-1;-1;-1;-1;-1;-1;-1;-1;-1;-1;-1;-1;-1;-1;-1;-1;-1;-1;-1;-1;-1;-1;-1;-1;-1',
  `inventory_values` varchar(308) NOT NULL DEFAULT '0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0',
  `bank_list` text,
  `bank_values` text
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `player_data`
--

--
-- Indexes for dumped tables
--

--
-- Indexes for table `player_data`
--
ALTER TABLE `player_data`
  ADD PRIMARY KEY (`global_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `player_data`
--
ALTER TABLE `player_data`
  MODIFY `global_id` int(9) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
