-- phpMyAdmin SQL Dump
-- version 4.6.4
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: 12 Des 2017 pada 15.28
-- Versi Server: 5.7.15-log
-- PHP Version: 5.6.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `dbkuis1102`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `cv_1102`
--

CREATE TABLE `cv_1102` (
  `id` bigint(20) NOT NULL,
  `agama` varchar(255) DEFAULT NULL,
  `domisili` varchar(255) DEFAULT NULL,
  `jk` varchar(255) DEFAULT NULL,
  `nama_lengkap` varchar(100) NOT NULL,
  `status` varchar(255) DEFAULT NULL,
  `ttl` varchar(255) DEFAULT NULL,
  `id_nilai` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data untuk tabel `cv_1102`
--

INSERT INTO `cv_1102` (`id`, `agama`, `domisili`, `jk`, `nama_lengkap`, `status`, `ttl`, `id_nilai`) VALUES
(1, 'Islam', 'Sumatera Barat', 'Perempuan', 'Ulfa Hanum', 'Pelajar', 'Padang Luar, 09 Desember 1996', 1),
(2, 'Islam', 'Padang Panjang', 'Perempuan', 'Shella Marshelina', 'Pelajar', 'Padang Panjang,12 Agustus 1997', 1),
(3, 'Islam', 'Dumai', 'Perempuan', 'Risya Listya Rizalni', 'Pelajar', 'Dumai, 21 February 1998', 1);

-- --------------------------------------------------------

--
-- Struktur dari tabel `nilai_1102`
--

CREATE TABLE `nilai_1102` (
  `id_nilai` bigint(20) NOT NULL,
  `keterangan` varchar(255) DEFAULT NULL,
  `nilai` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data untuk tabel `nilai_1102`
--

INSERT INTO `nilai_1102` (`id_nilai`, `keterangan`, `nilai`) VALUES
(1, 'Sangat Bagus', '85');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `cv_1102`
--
ALTER TABLE `cv_1102`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `UK_2ofnvk9mg21qofq2c115nt5bh` (`nama_lengkap`),
  ADD KEY `FKj3btjyb58va9mmbbiav5kt4xj` (`id_nilai`);

--
-- Indexes for table `nilai_1102`
--
ALTER TABLE `nilai_1102`
  ADD PRIMARY KEY (`id_nilai`),
  ADD UNIQUE KEY `UK_a2d568m7odtq2andgqoj1qdlh` (`nilai`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `cv_1102`
--
ALTER TABLE `cv_1102`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT for table `nilai_1102`
--
ALTER TABLE `nilai_1102`
  MODIFY `id_nilai` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- Ketidakleluasaan untuk tabel pelimpahan (Dumped Tables)
--

--
-- Ketidakleluasaan untuk tabel `cv_1102`
--
ALTER TABLE `cv_1102`
  ADD CONSTRAINT `FKj3btjyb58va9mmbbiav5kt4xj` FOREIGN KEY (`id_nilai`) REFERENCES `nilai_1102` (`id_nilai`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
