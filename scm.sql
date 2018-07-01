-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: 01 Jul 2018 pada 21.41
-- Versi Server: 10.1.26-MariaDB
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
-- Struktur dari tabel `aset`
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
-- Dumping data untuk tabel `aset`
--

INSERT INTO `aset` (`id_aset`, `id_user`, `koin`, `bibit`, `jagung`, `minyak_goreng`, `garam`, `gudanglv`, `pabriklv`, `tokolv`) VALUES
(1, 1, 8000000, 0, 93, 8, 10, 1, 1, 1),
(2, 2, 2710, 2, 24, 7, 3, 1, 1, 1),
(3, 3, 800, 5, 3, 2, 1, 1, 1, 1),
(4, 4, 1440, 1, 155, 3, 2, 1, 1, 1),
(5, 5, 980, 5, 3, 2, 1, 1, 1, 1),
(6, 6, 640, 7, 14, 2, 1, 1, 1, 1),
(7, 7, 900, 5, 3, 2, 1, 1, 1, 1),
(8, 8, 780, 5, 5, 2, 1, 1, 1, 1),
(9, 9, 1210, 4, 6, 3, 4, 1, 1, 1),
(10, 10, 660, 10, 10, 10, 10, 10, 10, 10),
(11, 11, 990, 4, 5, 2, 4, 1, 1, 1),
(12, 12, 960, 2, 24, 2, 3, 1, 1, 1),
(13, 13, 1490, 4, 7, 2, 3, 1, 1, 1),
(14, 14, 1000, 5, 5, 2, 3, 1, 1, 1),
(15, 15, 1000, 3, 18, 2, 3, 1, 1, 1);

-- --------------------------------------------------------

--
-- Struktur dari tabel `penjualan`
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
-- Dumping data untuk tabel `penjualan`
--

INSERT INTO `penjualan` (`id_penjualan`, `id_user`, `marningA`, `marningB`, `marningC`, `empingA`, `empingB`, `empingC`) VALUES
(1, 1, 0, 0, 4, 2, 1, 2),
(2, 2, 0, 35, 0, 7, 8, 9),
(3, 3, 8, 7, 5, 4, 3, 0),
(4, 4, 2, 4, 5, 5, 4, 8),
(5, 5, 6, 5, 4, 3, 2, 0),
(6, 6, 0, 9, 0, 0, 0, 0),
(7, 7, 7, 6, 5, 0, 4, 0),
(8, 8, 0, 0, 0, 0, 0, 0),
(9, 9, 0, 2, 0, 0, 0, 0),
(10, 10, 0, 0, 0, 5, 4, 1),
(11, 11, 0, 0, 0, 0, 0, 0),
(12, 12, 0, 0, 0, 0, 0, 0),
(13, 13, 1, 0, 0, 0, 0, 0),
(14, 14, 0, 0, 0, 0, 0, 0),
(15, 15, 0, 0, 0, 0, 0, 0);

-- --------------------------------------------------------

--
-- Struktur dari tabel `produksi`
--

CREATE TABLE `produksi` (
  `id_produksi` int(11) NOT NULL,
  `id_user` int(11) NOT NULL,
  `jagungCuci` int(11) NOT NULL,
  `jagungRendam` int(11) NOT NULL,
  `JagungBumbu` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Struktur dari tabel `sawah`
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
-- Struktur dari tabel `user`
--

CREATE TABLE `user` (
  `id_user` int(11) NOT NULL,
  `username` varchar(12) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `user`
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
(10, 'coba akun'),
(11, 'misyu'),
(12, 'saya'),
(13, 'qwerty'),
(14, 'qq'),
(15, 'asdos');

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
-- Indexes for table `produksi`
--
ALTER TABLE `produksi`
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
  MODIFY `id_penjualan` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `id_user` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;

--
-- Ketidakleluasaan untuk tabel pelimpahan (Dumped Tables)
--

--
-- Ketidakleluasaan untuk tabel `aset`
--
ALTER TABLE `aset`
  ADD CONSTRAINT `aset_ibfk_1` FOREIGN KEY (`id_user`) REFERENCES `user` (`id_user`);

--
-- Ketidakleluasaan untuk tabel `penjualan`
--
ALTER TABLE `penjualan`
  ADD CONSTRAINT `penjualan_ibfk_1` FOREIGN KEY (`id_user`) REFERENCES `user` (`id_user`);

--
-- Ketidakleluasaan untuk tabel `produksi`
--
ALTER TABLE `produksi`
  ADD CONSTRAINT `produksi_ibfk_1` FOREIGN KEY (`id_user`) REFERENCES `user` (`id_user`);

--
-- Ketidakleluasaan untuk tabel `sawah`
--
ALTER TABLE `sawah`
  ADD CONSTRAINT `sawah_ibfk_1` FOREIGN KEY (`id_user`) REFERENCES `user` (`id_user`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
