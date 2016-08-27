-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Jan 15, 2016 at 10:22 AM
-- Server version: 10.1.9-MariaDB
-- PHP Version: 5.6.15

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `osrse_db`
--

-- --------------------------------------------------------

--
-- Table structure for table `data_deadman`
--

CREATE TABLE `data_deadman` (
  `uid` int(9) NOT NULL COMMENT 'Unique Id',
  `x` int(5) NOT NULL DEFAULT '-1',
  `y` int(5) NOT NULL DEFAULT '-1',
  `z` tinyint(1) NOT NULL DEFAULT '-1',
  `chat_settings` varchar(9) NOT NULL DEFAULT '0,1,0,0,0' COMMENT 'public,private,trade,assist',
  `levels` varchar(72) NOT NULL DEFAULT '1;1;1;10;1;1;1;1;1;1;1;1;1;1;1;1;1;1;1;1;1;1;1;1',
  `exp` varchar(240) DEFAULT '0;0;0;1154;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0',
  `equip_list` varchar(72) DEFAULT NULL COMMENT 'Equipment Id''s',
  `equip_values` varchar(132) DEFAULT NULL,
  `inv_list` varchar(168) DEFAULT NULL COMMENT 'Inventory Id''s',
  `inv_values` varchar(308) DEFAULT NULL COMMENT 'Inventory Count',
  `bank_list` text,
  `bank_values` text
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `data_deadman`
--

INSERT INTO `data_deadman` (`uid`, `x`, `y`, `z`, `chat_settings`, `levels`, `exp`, `equip_list`, `equip_values`, `inv_list`, `inv_values`, `bank_list`, `bank_values`) VALUES
(1, -1, -1, -1, '0,1,0,0,0', '1;1;1;10;1;1;1;1;1;1;1;1;1;1;1;1;1;1;1;1;1;1;1;1', '0;0;0;1154;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0', NULL, NULL, NULL, NULL, NULL, NULL),
(2, -1, -1, -1, '0,1,0,0,0', '1;1;1;10;1;1;1;1;1;1;1;1;1;1;1;1;1;1;1;1;1;1;1;1', '0;0;0;1154;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0', NULL, NULL, NULL, NULL, NULL, NULL),
(3, -1, -1, -1, '0,1,0,0,0', '1;1;1;10;1;1;1;1;1;1;1;1;1;1;1;1;1;1;1;1;1;1;1;1', '0;0;0;1154;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0', NULL, NULL, NULL, NULL, NULL, NULL),
(4, -1, -1, -1, '0,1,0,0,0', '1;1;1;10;1;1;1;1;1;1;1;1;1;1;1;1;1;1;1;1;1;1;1;1', '0;0;0;1154;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0', NULL, NULL, NULL, NULL, NULL, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `data_economy`
--

CREATE TABLE `data_economy` (
  `uid` int(9) NOT NULL COMMENT 'Unique Id',
  `x` int(5) NOT NULL DEFAULT '-1',
  `y` int(5) NOT NULL DEFAULT '-1',
  `z` tinyint(1) NOT NULL DEFAULT '-1',
  `chat_settings` varchar(9) NOT NULL DEFAULT '0,1,0,0,0' COMMENT 'public,private,trade,assist',
  `levels` varchar(72) NOT NULL DEFAULT '1;1;1;10;1;1;1;1;1;1;1;1;1;1;1;1;1;1;1;1;1;1;1;1',
  `exp` varchar(240) DEFAULT '0;0;0;1154;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0',
  `equip_list` varchar(72) DEFAULT NULL COMMENT 'Equipment Id''s',
  `equip_values` varchar(132) DEFAULT NULL,
  `inv_list` varchar(168) DEFAULT NULL COMMENT 'Inventory Id''s',
  `inv_values` varchar(308) DEFAULT NULL COMMENT 'Inventory Count',
  `bank_list` text,
  `bank_values` text
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `data_spawn`
--

CREATE TABLE `data_spawn` (
  `uid` int(9) NOT NULL COMMENT 'Unique Id',
  `x` int(5) NOT NULL DEFAULT '-1',
  `y` int(5) NOT NULL DEFAULT '-1',
  `z` tinyint(1) NOT NULL DEFAULT '-1',
  `chat_settings` varchar(9) NOT NULL DEFAULT '0,1,0,0,0' COMMENT 'public,private,trade,assist',
  `levels` varchar(72) NOT NULL DEFAULT '1;1;1;10;1;1;1;1;1;1;1;1;1;1;1;1;1;1;1;1;1;1;1;1',
  `exp` varchar(240) DEFAULT '0;0;0;1154;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0',
  `equip_list` varchar(72) DEFAULT NULL COMMENT 'Equipment Id''s',
  `equip_values` varchar(132) DEFAULT NULL,
  `inv_list` varchar(168) DEFAULT NULL COMMENT 'Inventory Id''s',
  `inv_values` varchar(308) DEFAULT NULL COMMENT 'Inventory Count',
  `bank_list` text,
  `bank_values` text
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `friends`
--

CREATE TABLE `friends` (
  `uid` int(8) NOT NULL,
  `friend_id` int(8) NOT NULL,
  `clanrank` int(2) NOT NULL DEFAULT '1'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `friends`
--

INSERT INTO `friends` (`uid`, `friend_id`, `clanrank`) VALUES
(4, 1, 1);

-- --------------------------------------------------------

--
-- Table structure for table `ignores`
--

CREATE TABLE `ignores` (
  `uid` int(9) NOT NULL,
  `ignored` int(9) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `npc`
--

CREATE TABLE `npc` (
  `idx` int(6) NOT NULL,
  `mob_id` int(5) NOT NULL,
  `name` varchar(15) NOT NULL,
  `x` int(5) NOT NULL,
  `y` int(5) NOT NULL,
  `z` int(2) NOT NULL,
  `health` int(5) NOT NULL,
  `level` int(4) NOT NULL,
  `stand` int(5) NOT NULL,
  `walk` int(5) NOT NULL,
  `turnleft` int(5) NOT NULL,
  `turnright` int(5) NOT NULL,
  `turnaround` int(5) NOT NULL,
  `actions` text NOT NULL,
  `anims` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
 
--
-- Table structure for table `playerinfo`
--

CREATE TABLE `playerinfo` (
  `uid` int(9) NOT NULL COMMENT 'Unique Id',
  `online` tinyint(2) NOT NULL DEFAULT '0' COMMENT 'World Id',
  `username` varchar(12) DEFAULT NULL,
  `password` varchar(105) DEFAULT NULL,
  `last_user` varchar(12) DEFAULT NULL,
  `privilege` tinyint(1) NOT NULL DEFAULT '0',
  `login_date` date DEFAULT NULL,
  `clan` varchar(11) DEFAULT NULL COMMENT 'Clan chat name',
  `clan_join` int(1) NOT NULL DEFAULT '0' COMMENT 'Join Requirement',
  `clan_kick` int(1) NOT NULL DEFAULT '7' COMMENT 'Kick Requirement'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `playerinfo`
--

INSERT INTO `playerinfo` (`uid`, `online`, `username`, `password`, `last_user`, `privilege`, `login_date`, `clan`, `clan_join`, `clan_kick`) VALUES
(1, 0, 'john', '1000:45ebfb4f95d51d89ec6b59907b95e8e442434b258aaad0ec:84834134400d15c249303158af6b3e1140f8c3402b898708', NULL, 2, NULL, NULL, 0, 7),
(2, 0, 'j', '1000:382ee19a139faf544361cace7b7505ea0e1f95328c81bf9e:b7dc5909811d543053f1b4b285fd3ec6c017dfb73fb60ca6', NULL, 0, NULL, NULL, 0, 7),
(3, 0, 'poop', '1000:1c10bd782204747cdf4673f9623916d89227f6d5cb92b6ee:e435842d7ace0a549877a312b69878c9f2c43328ba69491c', NULL, 0, NULL, NULL, 0, 7),
(4, 0, 'test', '1000:950e7fa98d49b0862a4891ca19d95a411b0b17d6163bfda9:1988e161acb28115e27835df12215191139db92a4b81ecb3', NULL, 0, NULL, NULL, 0, 7);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `data_deadman`
--
ALTER TABLE `data_deadman`
  ADD UNIQUE KEY `uid` (`uid`) USING BTREE;

--
-- Indexes for table `data_economy`
--
ALTER TABLE `data_economy`
  ADD UNIQUE KEY `uid` (`uid`);

--
-- Indexes for table `data_spawn`
--
ALTER TABLE `data_spawn`
  ADD UNIQUE KEY `uid` (`uid`);

--
-- Indexes for table `npc`
--
ALTER TABLE `npc`
  ADD UNIQUE KEY `idx` (`idx`);

--
-- Indexes for table `playerinfo`
--
ALTER TABLE `playerinfo`
  ADD PRIMARY KEY (`uid`),
  ADD UNIQUE KEY `uid` (`uid`),
  ADD UNIQUE KEY `username` (`username`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `playerinfo`
--
ALTER TABLE `playerinfo`
  MODIFY `uid` int(9) NOT NULL AUTO_INCREMENT COMMENT 'Unique Id', AUTO_INCREMENT=5;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
