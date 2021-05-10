-- phpMyAdmin SQL Dump
-- version 4.8.2
-- https://www.phpmyadmin.net/
--
-- Host: localhost:8889
-- Generation Time: Sep 25, 2018 at 01:29 AM
-- Server version: 5.7.21
-- PHP Version: 7.2.7

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `beacukai`
--

-- --------------------------------------------------------

--
-- Table structure for table `importeksport`
--

CREATE TABLE `importeksport` (
  `tanggal` int(20) NOT NULL,
  `jenis` varchar(15) NOT NULL,
  `kodebarang` int(5) NOT NULL,
  `namabarang` varchar(40) NOT NULL,
  `jumlahbarang` int(10) NOT NULL,
  `jumlahmaksimal` int(10) NOT NULL,
  `hargabarang` int(50) NOT NULL,
  `pajakperbarang` int(30) NOT NULL,
  `pajaktotal` int(30) NOT NULL,
  `namapengirim` varchar(30) NOT NULL,
  `asalnegara` int(20) NOT NULL,
  `kotatujuan` int(20) NOT NULL,
  `negaratujuan` int(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `username` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`username`, `password`) VALUES
('admin', 'admin');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `importeksport`
--
ALTER TABLE `importeksport`
  ADD PRIMARY KEY (`kodebarang`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`username`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
