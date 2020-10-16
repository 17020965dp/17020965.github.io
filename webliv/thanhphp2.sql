-- phpMyAdmin SQL Dump
-- version 4.9.1
-- https://www.phpmyadmin.net/
--
-- Máy chủ: 127.0.0.1
-- Thời gian đã tạo: Th10 13, 2019 lúc 05:06 PM
-- Phiên bản máy phục vụ: 10.4.8-MariaDB
-- Phiên bản PHP: 7.3.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Cơ sở dữ liệu: `thanhphp2`
--

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `admin`
--

CREATE TABLE `admin` (
  `id` int(11) NOT NULL,
  `name` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `address` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `email` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `password` varchar(50) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `phone` char(15) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `status` tinyint(4) DEFAULT 1,
  `level` tinyint(4) DEFAULT 1,
  `avatar` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `created_at` timestamp NULL DEFAULT current_timestamp() ON UPDATE current_timestamp(),
  `updated_at` timestamp NULL DEFAULT current_timestamp() ON UPDATE current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Đang đổ dữ liệu cho bảng `admin`
--

INSERT INTO `admin` (`id`, `name`, `address`, `email`, `password`, `phone`, `status`, `level`, `avatar`, `created_at`, `updated_at`) VALUES
(1, 'Phạm Văn Thành', 'Nam Định', 'udanchi3105@gmail.com', '6b5a94a55646a8bcd3588923ac495338', '0942495160', 1, 2, NULL, NULL, NULL),
(2, 'Nguyễn Anh Tuấn', 'HN', 'tuan160498@gmail.com', '3367717821fb9efa37bd114d26cc413a', '0337417474', 1, 1, NULL, NULL, NULL);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `category`
--

CREATE TABLE `category` (
  `id` int(11) NOT NULL,
  `name` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `slug` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `images` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `banner` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `home` tinyint(4) DEFAULT 0,
  `status` tinyint(4) DEFAULT 1,
  `created_at` timestamp NULL DEFAULT current_timestamp() ON UPDATE current_timestamp(),
  `updated_at` timestamp NULL DEFAULT current_timestamp() ON UPDATE current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Đang đổ dữ liệu cho bảng `category`
--

INSERT INTO `category` (`id`, `name`, `slug`, `images`, `banner`, `home`, `status`, `created_at`, `updated_at`) VALUES
(1, 'Áo', 'ao', NULL, NULL, 1, 1, '2019-11-13 07:34:41', '2019-11-13 07:34:41'),
(2, 'Quần', 'quan', NULL, NULL, 1, 1, '2019-11-13 07:34:41', '2019-11-13 07:34:41'),
(3, 'Giày', 'giay', NULL, NULL, 1, 1, '2019-11-13 07:34:42', '2019-11-13 07:34:42'),
(4, 'Túi', 'tui', NULL, NULL, 1, 1, '2019-11-13 07:34:42', '2019-11-13 07:34:42'),
(5, 'Váy', 'vay', NULL, NULL, 1, 1, '2019-11-13 07:34:43', '2019-11-13 07:34:43'),
(6, 'Phụ kiện khác', 'phu-kien-khac', NULL, NULL, 1, 1, '2019-11-13 07:34:43', '2019-11-13 07:34:43');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `feedback`
--

CREATE TABLE `feedback` (
  `id` int(11) NOT NULL,
  `name` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `email` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `content` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `feedback`
--

INSERT INTO `feedback` (`id`, `name`, `email`, `content`) VALUES
(1, 'Thành', '1123123@gmail.com', 'chan 					\r\n            				'),
(2, 'Tuấn', 'tuan160498@gmail.com', 'WEb bán hàng chất lượng quá             				');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `orders`
--

CREATE TABLE `orders` (
  `id` int(11) NOT NULL,
  `transaction_id` int(11) DEFAULT NULL,
  `product_id` int(11) DEFAULT NULL,
  `qty` tinyint(4) DEFAULT NULL,
  `price` int(11) DEFAULT NULL,
  `created_at` timestamp NULL DEFAULT current_timestamp() ON UPDATE current_timestamp(),
  `updated_at` timestamp NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Đang đổ dữ liệu cho bảng `orders`
--

INSERT INTO `orders` (`id`, `transaction_id`, `product_id`, `qty`, `price`, `created_at`, `updated_at`) VALUES
(1, 3, 32, 3, 855000, NULL, NULL),
(2, 3, 0, 2, 0, NULL, NULL),
(3, 3, 34, 14, 899999, NULL, NULL),
(4, 3, 39, 1, 599999, NULL, NULL),
(5, 3, 38, 1, 475000, NULL, NULL),
(6, 3, 36, 1, 599999, NULL, NULL),
(7, 4, 34, 1, 899999, NULL, NULL),
(8, 4, 33, 1, 480000, NULL, NULL),
(9, 4, 32, 2, 855000, NULL, NULL),
(10, 5, 39, 1, 599999, NULL, NULL);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `product`
--

CREATE TABLE `product` (
  `id` int(11) NOT NULL,
  `name` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `slug` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `price` int(11) DEFAULT NULL,
  `sale` tinyint(4) DEFAULT 0,
  `thunbar` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `category_id` int(11) DEFAULT NULL,
  `content` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `number` int(11) NOT NULL DEFAULT 0,
  `head` int(11) DEFAULT 0,
  `view` int(11) DEFAULT 0,
  `hot` tinyint(4) DEFAULT 0,
  `pay` int(11) DEFAULT 0,
  `created_at` timestamp NULL DEFAULT current_timestamp() ON UPDATE current_timestamp(),
  `updated_at` timestamp NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Đang đổ dữ liệu cho bảng `product`
--

INSERT INTO `product` (`id`, `name`, `slug`, `price`, `sale`, `thunbar`, `category_id`, `content`, `number`, `head`, `view`, `hot`, `pay`, `created_at`, `updated_at`) VALUES
(32, '  Áo sơ mi đẹp', '  Áo sơ mi đẹp', 900000, 5, 'ao so mi.jpg', 1, 'Áo sơ mi dài tay thiết kế cổ đức, dáng suông, điểm nhấn đường nổi mặt trước. Chất liệu lụa cao cấp cùng với gam màu tối vừa đơn giản nhưng vẫn nổi bật. là sản phẩm không thể thiếu trong tủ đồ của chị em công sở.', 200, 0, 0, 0, 0, NULL, '2019-11-12 10:23:33'),
(33, 'Quần âu ', 'quan-au', 600000, 20, 'quần nam 1.jpg', 2, 'ok', 150, 0, 0, 0, 0, NULL, NULL),
(34, 'Vest trắng', 'vest-trang', 999999, 10, 'vest nu 1.jpg', 1, 'vest', 30, 0, 0, 0, 0, NULL, NULL),
(35, '    Sơ mi trắng như ngọc trinh', '    Sơ mi trắng như ngọc trinh', 1000000, 0, 'somi2.jpg', 1, 'ao-dep-lung-linh', 111, 0, 0, 0, 0, NULL, '2019-11-09 09:27:17'),
(36, 'Áo khoác ', 'ao-khoac', 666666, 10, 'áo khoác nữ 1.jpg', 1, 'ao', 2112, 0, 0, 0, 0, NULL, NULL),
(38, ' Quần vải xanh', ' Quần vải xanh', 500000, 5, 'quan nam.jpg', 2, 'Quần vải xanh thiết kế độc quyền bởi thương hiệu Thành Tuấn. Được tạo ra từ chất liệu vải  co dãn nhẹ và thấm hút mồ hôi cực tốt giúp cho người mặc thoải mái khi di chuyển. Là dáng quần cơ bản có thể dễ dàng mix&match cùng với bất kì với trang phục nào đi', 50, 0, 0, 0, 0, NULL, '2019-11-12 10:21:30'),
(39, 'Giày nâu', 'giay-nau', 666666, 10, 'giay nam 1.jpg', 3, 'zxcv', 99, 0, 0, 0, 1, NULL, '2019-11-11 08:23:52'),
(40, 'Áo sơ mi họa tiết', 'ao-so-mi-hoa-tiet', 350000, 10, 'xinh 1.jpg', 1, 'ok', 200, 0, 0, 0, 0, NULL, NULL),
(41, 'Túi da couple', 'tui-da-couple', 1000000, 0, 'tui nam nu 1.jpg', 4, 'tui-dep-qua-ta', 51, 0, 0, 0, 0, NULL, NULL),
(42, 'Váy hoàn hảo ', 'vay-hoan-hao', 500000, 10, 'váy 2.jpg', 5, 'vay-hoan-hao-lammua-diiii', 50, 0, 0, 0, 0, '2019-11-12 10:47:47', '2019-11-12 10:47:47'),
(43, 'Kính râm', 'kinh-ram', 200000, 5, 'kinh 3.jpg', 6, 'kinh-chong-nang-hieu-qua', 200, 0, 0, 0, 0, '2019-11-13 14:46:53', '2019-11-13 14:46:53'),
(44, 'Váy modern', 'vay-modern', 300000, 10, 'tải xuống.jpg', 5, 'vay-duoc-thiet-ke-dep-hien-dai-hop-thoi-trang-theo-phong-cach-han-quoc', 200, 0, 0, 0, 0, '2019-11-13 14:48:53', '2019-11-13 14:48:53'),
(45, 'Giày da nữ đẹp', 'giay-da-nu-dep', 400000, 5, 'giay nu 1.jpg', 3, 'hop-voi-moi-outfit-cong-so', 400000, 0, 0, 0, 0, '2019-11-13 14:51:43', '2019-11-13 14:51:43'),
(46, 'Quần sành điệu', 'quan-sanh-dieu', 450000, 0, 'quần nữ 2.jpg', 2, 'Khá là đẹp cho chị em phụ nữ', 150, 0, 0, 0, 0, '2019-11-13 14:57:18', '2019-11-13 14:57:18');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `transaction`
--

CREATE TABLE `transaction` (
  `id` int(11) NOT NULL,
  `amount` int(11) DEFAULT NULL,
  `users_id` int(11) DEFAULT NULL,
  `note` varchar(255) DEFAULT NULL,
  `status` tinyint(4) DEFAULT 0,
  `created_at` timestamp NULL DEFAULT current_timestamp(),
  `updated_at` timestamp NULL DEFAULT current_timestamp() ON UPDATE current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Đang đổ dữ liệu cho bảng `transaction`
--

INSERT INTO `transaction` (`id`, `amount`, `users_id`, `note`, `status`, `created_at`, `updated_at`) VALUES
(1, 123123, 1, 'Free ship', 1, '2019-11-11 04:16:43', '2019-11-11 06:52:31'),
(2, 154232, 2, 'ok', 1, '2019-11-11 04:31:05', '2019-11-11 08:09:52'),
(3, 18523985, 1, 'noooo', 1, '2019-11-11 08:00:43', '2019-11-11 08:14:08'),
(4, 3398999, 1, 'test', 1, '2019-11-11 08:18:04', '2019-11-11 08:19:09'),
(5, 659999, 2, 'yeah', 1, '2019-11-11 08:23:06', '2019-11-11 08:23:52');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `users`
--

CREATE TABLE `users` (
  `id` int(11) NOT NULL,
  `name` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `email` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `password` varchar(50) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `phone` char(15) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `address` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `avatar` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `status` tinyint(4) DEFAULT 1,
  `token` varchar(50) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `created_at` timestamp NULL DEFAULT current_timestamp(),
  `updated_at` timestamp NULL DEFAULT current_timestamp() ON UPDATE current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Đang đổ dữ liệu cho bảng `users`
--

INSERT INTO `users` (`id`, `name`, `email`, `password`, `phone`, `address`, `avatar`, `status`, `token`, `created_at`, `updated_at`) VALUES
(1, 'Phạm Văn Thành', 'udanchi3105@gmail.com', '6b5a94a55646a8bcd3588923ac495338', '0942495160', '123123', NULL, 1, NULL, NULL, NULL),
(2, 'Nguyễn Anh Tuấn', 'tuan160498@gmail.com', '3367717821fb9efa37bd114d26cc413a', '093242341', 'HN', NULL, 1, NULL, NULL, NULL),
(3, 'Phạm Đạt', 'kietsi95@gmail.com', '75ab043f3a105901cbd40b3993fc8a80', '0963043773', 'Ninh Bình', NULL, 1, NULL, NULL, NULL);

--
-- Chỉ mục cho các bảng đã đổ
--

--
-- Chỉ mục cho bảng `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`id`);

--
-- Chỉ mục cho bảng `category`
--
ALTER TABLE `category`
  ADD PRIMARY KEY (`id`);

--
-- Chỉ mục cho bảng `feedback`
--
ALTER TABLE `feedback`
  ADD PRIMARY KEY (`id`);

--
-- Chỉ mục cho bảng `orders`
--
ALTER TABLE `orders`
  ADD PRIMARY KEY (`id`),
  ADD KEY `transaction_id` (`transaction_id`),
  ADD KEY `product_id` (`product_id`);

--
-- Chỉ mục cho bảng `product`
--
ALTER TABLE `product`
  ADD PRIMARY KEY (`id`);

--
-- Chỉ mục cho bảng `transaction`
--
ALTER TABLE `transaction`
  ADD PRIMARY KEY (`id`),
  ADD KEY `users_id` (`users_id`);

--
-- Chỉ mục cho bảng `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT cho các bảng đã đổ
--

--
-- AUTO_INCREMENT cho bảng `admin`
--
ALTER TABLE `admin`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT cho bảng `category`
--
ALTER TABLE `category`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- AUTO_INCREMENT cho bảng `feedback`
--
ALTER TABLE `feedback`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT cho bảng `orders`
--
ALTER TABLE `orders`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT cho bảng `product`
--
ALTER TABLE `product`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=47;

--
-- AUTO_INCREMENT cho bảng `transaction`
--
ALTER TABLE `transaction`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT cho bảng `users`
--
ALTER TABLE `users`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
