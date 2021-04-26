-- phpMyAdmin SQL Dump
-- version 4.8.2
-- https://www.phpmyadmin.net/
--
-- Host: localhost:8889
-- Generation Time: Oct 16, 2018 at 04:41 AM
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
  `tanggal` date NOT NULL,
  `jenis` varchar(15) NOT NULL,
  `kodebarang` int(5) NOT NULL,
  `namabarang` varchar(40) NOT NULL,
  `jumlahbarang` int(10) NOT NULL,
  `jumlahmaksimal` int(10) NOT NULL,
  `hargabarang` int(50) NOT NULL,
  `pajakperbarang` int(30) NOT NULL,
  `pajaktotal` int(30) NOT NULL,
  `namapengirim` varchar(30) NOT NULL,
  `asalnegara` varchar(20) NOT NULL,
  `kotatujuan` varchar(20) NOT NULL,
  `negaratujuan` varchar(20) NOT NULL,
  `minggu` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `importeksport`
--

INSERT INTO `importeksport` (`tanggal`, `jenis`, `kodebarang`, `namabarang`, `jumlahbarang`, `jumlahmaksimal`, `hargabarang`, `pajakperbarang`, `pajaktotal`, `namapengirim`, `asalnegara`, `kotatujuan`, `negaratujuan`, `minggu`) VALUES
('2018-10-16', 'IMPORT BARANG', 91287, 'kjsdvkjbsdv', 80, 100, 10000, 1000, 80000, 'jbskdbv', 'skev', 'jsbvks', 'svbs', '3102018'),
('2018-10-16', 'IMPORT BARANG', 183197, 'sifuvbisu', 20, 100, 10000, 1000, 20000, 'bsiufbviuv', 'osbfoib', 'oisbfoi', 'osifb', '3102018'),
('2018-10-16', 'EKSPORT BARANG', 193791, 'isvduyvsud', 20, 100, 80000, 8000, 160000, 'oibsdiuv', 'isycvduyc', 'isuvdiyv', 'sviduyvsuydf', '3102018'),
('2018-10-16', 'EKSPORT BARANG', 543564, 'hgfjfg', 100, 100, 1000, 100, 10000, 'jhgjh', 'hvh', 'hjhf', 'jhgjhg', '3102018'),
('2018-10-23', 'IMPORT BARANG', 8123871, 'jwefjewf', 80, 100, 1000, 100, 8000, 'kjbaekjbef', 'ksefn', 'oisehf', 'soevse', '4102018'),
('2018-11-16', 'EKSPORT BARANG', 8172631, '80', 10, 100, 10000, 100, 1000, 'skhfksef', 'sfeh', 'shef', 'iuhefisef', '3112018'),
('2018-10-16', 'IMPORT BARANG', 9018379, 'osusgdsiuogd', 80, 100, 10000, 1000, 80000, 'oaigdoug', 'uisdgb', 'ousbd', 'osubd', '3102018'),
('2019-10-16', 'IMPORT BARANG', 1928371932, 'hskhfkef', 50, 100, 10000, 1000, 50000, 'kjefhkefh', 'kefbkae', 'jhefbef', 'jefhbew', '3102019');

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`username`, `password`, `email`) VALUES
(' abelherl', 'abelherl', 'abaflejb@baiudfb.com'),
(' ilham', '12345', 'ilham@gmail.com'),
(' irfan', 'irfan', 'irfan@gmail.com'),
(' usaew', '12345', 'usaew@gmail.com'),
('andypewe ', 'andypewe', 'andypewe@gmail.com');

-- --------------------------------------------------------

--
-- Table structure for table `sitaan`
--

CREATE TABLE `sitaan` (
  `tanggal` varchar(16) NOT NULL,
  `jenis` varchar(15) NOT NULL,
  `kodebarang` int(5) NOT NULL,
  `namabarang` varchar(40) NOT NULL,
  `jumlahbarang` int(10) NOT NULL,
  `jumlahmaksimal` int(10) NOT NULL,
  `hargabarang` int(50) NOT NULL,
  `pajakperbarang` int(30) NOT NULL,
  `pajaktotal` int(30) NOT NULL,
  `namapengirim` varchar(30) NOT NULL,
  `asalnegara` varchar(20) NOT NULL,
  `kotatujuan` varchar(20) NOT NULL,
  `negaratujuan` varchar(20) NOT NULL,
  `minggu` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `sitaan`
--

INSERT INTO `sitaan` (`tanggal`, `jenis`, `kodebarang`, `namabarang`, `jumlahbarang`, `jumlahmaksimal`, `hargabarang`, `pajakperbarang`, `pajaktotal`, `namapengirim`, `asalnegara`, `kotatujuan`, `negaratujuan`, `minggu`) VALUES
('2018-10-16', 'IMPORT BARANG', 10397, 'isufgiuygf', 300, 100, 138000, 13800, 4140000, 'siufgiug', 'sudiug', 'iyvsdiyv', 'iusfiyf', '3102018'),
('2018-10-16', 'IMPORT BARANG', 13097, 'soifisuv', 190, 100, 89000, 8900, 1691000, 'osigiyuf', 'iusvfivu', 'iyuvsfiyv', 'iusvdiuyv', '3102018');

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
-- Indexes for table `login`
--
ALTER TABLE `login`
  ADD PRIMARY KEY (`username`);

--
-- Indexes for table `sitaan`
--
ALTER TABLE `sitaan`
  ADD PRIMARY KEY (`kodebarang`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`username`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
