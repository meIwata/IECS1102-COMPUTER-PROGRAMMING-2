USE D1397221_Flight;

-- 建立 Airports 表
CREATE TABLE `Airports` (
                            `airport_id` char(3) NOT NULL,
                            `name` varchar(50) NOT NULL,
                            `city` varchar(50) NOT NULL,
                            `country` varchar(50) NOT NULL,
                            PRIMARY KEY (`airport_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- 建立 Customers 表
CREATE TABLE `Customers` (
                             `customer_id` varchar(10) NOT NULL,
                             `name` varchar(50) NOT NULL,
                             `gender` enum('男','女') NOT NULL,
                             `email` varchar(100) NOT NULL,
                             `phone` varchar(20) DEFAULT NULL,
                             `passport_no` varchar(20) DEFAULT NULL,
                             `address` varchar(200) DEFAULT NULL,
                             `nationality` varchar(50) DEFAULT NULL,
                             `accumulated_miles` int(11) DEFAULT 0,
                             PRIMARY KEY (`customer_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- 建立 Flights 表
CREATE TABLE `Flights` (
                           `flight_id` varchar(10) NOT NULL,
                           `airline_id` varchar(20) NOT NULL,
                           `flight_no` varchar(20) NOT NULL,
                           `departure` char(3) NOT NULL,
                           `arrival` char(3) NOT NULL,
                           `departure_time` datetime NOT NULL,
                           `arrival_time` datetime NOT NULL,
                           PRIMARY KEY (`flight_id`),
                           KEY `Flights_Airports_Departure_FK` (`departure`),
                           KEY `Flights_Airports_Arrival_FK` (`arrival`),
                           CONSTRAINT `Flights_Airports_Departure_FK` FOREIGN KEY (`departure`) REFERENCES `Airports` (`airport_id`),
                           CONSTRAINT `Flights_Airports_Arrival_FK` FOREIGN KEY (`arrival`) REFERENCES `Airports` (`airport_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- 建立 Orders 表
CREATE TABLE `Orders` (
                          `order_id` varchar(10) NOT NULL,
                          `customer_id` varchar(10) NOT NULL,
                          `order_date` date NOT NULL,
                          `total_amount` int(11) NOT NULL,
                          `status` varchar(20) NOT NULL,
                          PRIMARY KEY (`order_id`),
                          KEY `Orders_Customers_FK` (`customer_id`),
                          CONSTRAINT `Orders_Customers_FK` FOREIGN KEY (`customer_id`) REFERENCES `Customers` (`customer_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- 建立 OrderDetails 表
CREATE TABLE `OrderDetails` (
                                `order_id` varchar(10) NOT NULL,
                                `flight_id` varchar(10) NOT NULL,
                                `class` varchar(20) NOT NULL,
                                `price` int(11) NOT NULL,
                                `quantity` int(11) NOT NULL,
                                PRIMARY KEY (`order_id`, `flight_id`, `class`),
                                KEY `OrderDetails_Flights_FK` (`flight_id`),
                                CONSTRAINT `OrderDetails_Flights_FK` FOREIGN KEY (`flight_id`) REFERENCES `Flights` (`flight_id`),
                                CONSTRAINT `OrderDetails_Orders_FK` FOREIGN KEY (`order_id`) REFERENCES `Orders` (`order_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- 建立 Tickets 表
CREATE TABLE `Tickets` (
                           `tickets_id` varchar(10) NOT NULL,
                           `order_id` varchar(10) NOT NULL,
                           `flight_id` varchar(10) NOT NULL,
                           `class` varchar(20) NOT NULL,
                           `seat_no` varchar(5) NOT NULL,
                           `passenger_name` varchar(50) NOT NULL,
                           PRIMARY KEY (`tickets_id`),
                           KEY `Tickets_OrderDetail_FK` (`order_id`, `flight_id`, `class`),
                           KEY `Tickets_Flights_FK` (`flight_id`),
                           CONSTRAINT `Tickets_OrderDetail_FK` FOREIGN KEY (`order_id`, `flight_id`, `class`) REFERENCES `OrderDetails` (`order_id`, `flight_id`, `class`),
                           CONSTRAINT `Tickets_Flights_FK` FOREIGN KEY (`flight_id`) REFERENCES `Flights` (`flight_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- 建立 Baggages 表
CREATE TABLE `Baggages` (
                            `baggages_id` varchar(10) NOT NULL,
                            `tickets_id` varchar(10) NOT NULL,
                            `weight` varchar(10) NOT NULL,
                            `type` varchar(20) NOT NULL,
                            PRIMARY KEY (`baggages_id`),
                            KEY `Baggages_Tickets_FK` (`tickets_id`),
                            CONSTRAINT `Baggages_Tickets_FK` FOREIGN KEY (`tickets_id`) REFERENCES `Tickets` (`tickets_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;




-- 插入機場資料
INSERT INTO `Airports` VALUES
                           ('TPE', '桃園國際機場', '桃園', '台灣'),
                           ('NRT', '成田國際機場', '東京', '日本'),
                           ('ICN', '仁川國際機場', '首爾', '韓國'),
                           ('SIN', '樟宜機場', '新加坡', '新加坡'),
                           ('BKK', '蘇凡納布機場', '曼谷', '泰國');

-- 插入客戶資料
INSERT INTO `Customers` VALUES
                            ('C001', '王小明', '男', 'wang@email.com', '0912345678', 'A123456789', '台北市信義區', '台灣', 5000),
                            ('C002', '李美華', '女', 'li@email.com', '0987654321', 'B987654321', '台中市西屯區', '台灣', 3000),
                            ('C003', '陳大同', '男', 'chen@email.com', '0956789123', 'C456789123', '高雄市前鎮區', '台灣', 0);

-- 插入航班資料
INSERT INTO `Flights` VALUES
                          ('F001', 'CI', 'CI100', 'TPE', 'NRT', '2025-08-15 08:00:00', '2025-08-15 12:00:00'),
                          ('F002', 'BR', 'BR130', 'TPE', 'ICN', '2025-08-16 10:30:00', '2025-08-16 14:00:00'),
                          ('F003', 'CI', 'CI750', 'TPE', 'SIN', '2025-08-17 23:30:00', '2025-08-18 05:30:00'),
                          ('F004', 'TG', 'TG635', 'TPE', 'BKK', '2025-08-18 14:20:00', '2025-08-18 17:00:00'),
                          ('F005', 'CI', 'CI101', 'NRT', 'TPE', '2025-08-20 14:00:00', '2025-08-20 17:30:00');

-- 插入訂單資料（王小明幫家人訂票的情境）
INSERT INTO `Orders` VALUES
                         ('O001', 'C001', '2025-08-13', 45000, '已確認'),
                         ('O002', 'C001', '2025-08-13', 28000, '已確認'),
                         ('O003', 'C002', '2025-08-13', 15000, '已確認'),
                         ('O004', 'C003', '2025-08-13', 12000, '已確認');

-- 插入訂單明細資料
INSERT INTO `OrderDetails` VALUES
-- 王小明幫家人訂東京機票（3張經濟艙）
('O001', 'F001', '經濟艙', 15000, 3),
-- 王小明訂首爾機票（2張商務艙）
('O002', 'F002', '商務艙', 14000, 2),
-- 李美華訂新加坡機票（1張經濟艙）
('O003', 'F003', '經濟艙', 15000, 1),
-- 陳大同訂曼谷機票（1張經濟艙）
('O004', 'F004', '經濟艙', 12000, 1);

-- 插入機票資料
INSERT INTO `Tickets` VALUES
-- 王小明家人的東京機票
('T001', 'O001', 'F001', '經濟艙', '12A', '王小明'),
('T002', 'O001', 'F001', '經濟艙', '12B', '王太太'),
('T003', 'O001', 'F001', '經濟艙', '12C', '王小孩'),
-- 王小明的首爾機票
('T004', 'O002', 'F002', '商務艙', '2A', '王小明'),
('T005', 'O002', 'F002', '商務艙', '2B', '王朋友'),
-- 李美華的新加坡機票
('T006', 'O003', 'F003', '經濟艙', '25F', '李美華'),
-- 陳大同的曼谷機票
('T007', 'O004', 'F004', '經濟艙', '18D', '陳大同');

-- 插入行李資料
INSERT INTO `Baggages` VALUES
                           ('B001', 'T001', '20kg', '托運行李'),
                           ('B002', 'T002', '18kg', '托運行李'),
                           ('B003', 'T003', '15kg', '托運行李'),
                           ('B004', 'T004', '25kg', '托運行李'),
                           ('B005', 'T005', '22kg', '托運行李'),
                           ('B006', 'T006', '20kg', '托運行李'),
                           ('B007', 'T007', '23kg', '托運行李'),
                           ('B008', 'T001', '7kg', '手提行李'),
                           ('B009', 'T004', '8kg', '手提行李'),
                           ('B010', 'T006', '6kg', '手提行李');

