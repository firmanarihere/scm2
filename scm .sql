-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 10, 2018 at 05:47 AM
-- Server version: 10.1.26-MariaDB
-- PHP Version: 7.0.22

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `scm`
--

-- --------------------------------------------------------

--
-- Table structure for table `aset`
--

CREATE TABLE `aset` (
  `id_aset` int(11) NOT NULL,
  `id_user` int(11) NOT NULL,
  `koin` int(11) NOT NULL,
  `bibit` int(11) NOT NULL,
  `jagung` int(11) NOT NULL,
  `minyak_goreng` int(11) NOT NULL,
  `garam` int(11) NOT NULL,
  `gudanglv` int(11) NOT NULL,
  `pabriklv` int(11) NOT NULL,
  `tokolv` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `aset`
--

INSERT INTO `aset` (`id_aset`, `id_user`, `koin`, `bibit`, `jagung`, `minyak_goreng`, `garam`, `gudanglv`, `pabriklv`, `tokolv`) VALUES
(1, 1, 1000, 12, 10, 1, 6, 1, 1, 1),
(2, 2, 900, 3, 5, 7, 3, 1, 1, 1),
(3, 3, 800, 5, 3, 2, 1, 1, 1, 1),
(4, 4, 1000, 5, 4, 3, 2, 1, 1, 1),
(5, 5, 980, 5, 3, 2, 1, 1, 1, 1),
(6, 6, 700, 5, 3, 2, 1, 1, 1, 1),
(7, 7, 900, 5, 3, 2, 1, 1, 1, 1),
(8, 8, 900, 5, 3, 2, 1, 1, 1, 1),
(9, 9, 1000, 5, 4, 3, 4, 1, 1, 1),
(10, 10, 100, 10, 10, 10, 10, 10, 10, 10);

-- --------------------------------------------------------

--
-- Table structure for table `penjualan`
--

CREATE TABLE `penjualan` (
  `id_penjualan` int(11) NOT NULL,
  `id_user` int(11) NOT NULL,
  `marningA` int(11) NOT NULL,
  `marningB` int(11) NOT NULL,
  `marningC` int(11) NOT NULL,
  `empingA` int(11) NOT NULL,
  `empingB` int(11) NOT NULL,
  `empingC` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `penjualan`
--

INSERT INTO `penjualan` (`id_penjualan`, `id_user`, `marningA`, `marningB`, `marningC`, `empingA`, `empingB`, `empingC`) VALUES
(1, 1, 3, 4, 5, 2, 1, 2),
(2, 2, 7, 67, 1, 7, 8, 9),
(3, 3, 8, 7, 5, 4, 3, 0),
(4, 4, 8, 7, 6, 5, 4, 8),
(5, 5, 6, 5, 4, 3, 2, 0),
(6, 6, 0, 9, 0, 0, 0, 0),
(7, 7, 7, 6, 5, 0, 4, 0),
(8, 8, 0, 0, 0, 0, 0, 0),
(9, 9, 0, 4, 1, 0, 0, 0),
(10, 10, 8, 7, 6, 5, 4, 1);

-- --------------------------------------------------------

--
-- Table structure for table `sawah`
--

CREATE TABLE `sawah` (
  `id_tanam` int(11) NOT NULL,
  `id_user` int(11) NOT NULL,
  `blok1` int(11) NOT NULL,
  `blok2` int(11) NOT NULL,
  `blok3` int(11) NOT NULL,
  `blok4` int(11) NOT NULL,
  `blok5` int(11) NOT NULL,
  `blok6` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `id_user` int(11) NOT NULL,
  `username` varchar(12) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`id_user`, `username`) VALUES
(1, 'test1'),
(2, 'coba2'),
(3, 'ass3'),
(4, 'frweq4'),
(5, 'sd'),
(6, 'coba6'),
(7, 'tes7'),
(8, 'lagi8'),
(9, 'lala'),
(10, 'coba akun');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `aset`
--
ALTER TABLE `aset`
  ADD PRIMARY KEY (`id_aset`),
  ADD KEY `id_user` (`id_user`);

--
-- Indexes for table `penjualan`
--
ALTER TABLE `penjualan`
  ADD PRIMARY KEY (`id_penjualan`),
  ADD KEY `id_user` (`id_user`);

--
-- Indexes for table `sawah`
--
ALTER TABLE `sawah`
  ADD PRIMARY KEY (`id_tanam`),
  ADD KEY `id_user` (`id_user`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id_user`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `penjualan`
--
ALTER TABLE `penjualan`
  MODIFY `id_penjualan` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `id_user` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `aset`
--
ALTER TABLE `aset`
  ADD CONSTRAINT `aset_ibfk_1` FOREIGN KEY (`id_user`) REFERENCES `user` (`id_user`);

--
-- Constraints for table `penjualan`
--
ALTER TABLE `penjualan`
  ADD CONSTRAINT `penjualan_ibfk_1` FOREIGN KEY (`id_user`) REFERENCES `user` (`id_user`);

--
-- Constraints for table `sawah`
--
ALTER TABLE `sawah`
  ADD CONSTRAINT `sawah_ibfk_1` FOREIGN KEY (`id_user`) REFERENCES `user` (`id_user`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
