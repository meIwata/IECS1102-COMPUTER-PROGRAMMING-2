-- ==========================================
-- 基本查詢 SELECT
-- ==========================================

-- 查詢所有客戶資料
SELECT * FROM D1397221_Flight.Customers;

-- 查詢所有航班資料並依照航班編號排序
SELECT * FROM D1397221_Flight.Flights ORDER BY flight_no;

-- 查詢特定欄位
SELECT name, email FROM D1397221_Flight.Customers;

-- 查詢所有機票的乘客姓名
SELECT passenger_name FROM D1397221_Flight.Tickets;

-- 使用 DISTINCT 查詢不重複的艙等
SELECT DISTINCT class FROM D1397221_Flight.OrderDetails;

-- 使用別名 (AS)
SELECT customer_id AS 客戶編號, name AS 客戶姓名, email AS 電子信箱
FROM D1397221_Flight.Customers;

-- ==========================================
-- 條件查詢 WHERE
-- ==========================================

-- 查詢特定客戶
SELECT * FROM D1397221_Flight.Customers WHERE customer_id = 'C001';

-- 查詢累積里程大於 3000 的客戶
SELECT name AS 客戶姓名, accumulated_miles AS 累積里程
FROM D1397221_Flight.Customers
WHERE accumulated_miles > 3000;

-- 查詢不等於 (MariaDB 支援 <> 和 !=)
SELECT * FROM D1397221_Flight.Customers WHERE gender <> '男';
SELECT * FROM D1397221_Flight.Customers WHERE gender != '男';

-- 查詢訂單金額大於 20000 的訂單
SELECT * FROM D1397221_Flight.Orders WHERE total_amount > 20000;

-- 查詢特定日期之後的訂單
SELECT * FROM D1397221_Flight.Orders WHERE order_date > '2025-08-13';

-- ==========================================
-- 模糊查詢 LIKE
-- ==========================================

-- 查詢姓名以「王」開頭的客戶
SELECT * FROM D1397221_Flight.Customers WHERE name LIKE '王%';

-- 查詢姓名包含「明」的客戶
SELECT * FROM D1397221_Flight.Customers WHERE name LIKE '%明%';

-- 查詢航班編號以「CI」開頭的航班
SELECT * FROM D1397221_Flight.Flights WHERE flight_no LIKE 'CI%';

-- 查詢姓名以特定字結尾的客戶
SELECT * FROM D1397221_Flight.Customers WHERE name LIKE '%華';

-- ==========================================
-- NULL 值查詢
-- ==========================================

-- 查詢沒有電話號碼的客戶（但目前所有客戶都有電話）
SELECT * FROM D1397221_Flight.Customers WHERE phone IS NULL;

-- 查詢有電話號碼的客戶
SELECT * FROM D1397221_Flight.Customers WHERE phone IS NOT NULL;

-- 查詢沒有護照號碼的客戶
SELECT * FROM D1397221_Flight.Customers WHERE passport_no IS NULL;

-- ==========================================
-- 子查詢 EXISTS
-- ==========================================

-- 查詢有行李的機票
SELECT * FROM D1397221_Flight.Tickets t WHERE EXISTS (
    SELECT * FROM D1397221_Flight.Baggages b
    WHERE b.tickets_id = t.tickets_id
);

-- 查詢有訂單的客戶
SELECT * FROM D1397221_Flight.Customers c WHERE EXISTS (
    SELECT * FROM D1397221_Flight.Orders o
    WHERE o.customer_id = c.customer_id
);

-- 查詢沒有行李的機票
SELECT * FROM D1397221_Flight.Tickets t WHERE NOT EXISTS (
    SELECT 1 FROM D1397221_Flight.Baggages b
    WHERE b.tickets_id = t.tickets_id
);

-- ==========================================
-- 範圍查詢 BETWEEN, IN, NOT IN
-- ==========================================

-- 查詢訂單金額在 15000 到 30000 之間的訂單
SELECT order_id AS 訂單編號, total_amount AS 訂單金額, status AS 狀態
FROM D1397221_Flight.Orders
WHERE total_amount BETWEEN 15000 AND 30000;

SELECT * FROM D1397221_Flight.Orders o WHERE o.total_amount >= 15000 AND o.total_amount <=30000

-- 查詢特定客戶的訂單
SELECT * FROM D1397221_Flight.Orders
WHERE customer_id IN ('C001', 'C002');

SELECT * FROM D1397221_Flight.Tickets t WHERE t.class = '經濟艙' OR t.class = '商務艙';


-- 查詢非特定客戶的訂單
SELECT * FROM D1397221_Flight.Orders
WHERE customer_id NOT IN ('C001');

-- 查詢特定艙等的訂單明細
SELECT * FROM D1397221_Flight.OrderDetails
WHERE class IN ('經濟艙', '商務艙');

-- ==========================================
-- 邏輯運算子 AND, OR
-- ==========================================

-- 查詢男性且累積里程大於 0 的客戶
SELECT * FROM D1397221_Flight.Customers
WHERE gender = '男' AND accumulated_miles > 0;

-- 查詢王小明或李美華的客戶資料
SELECT * FROM D1397221_Flight.Customers
WHERE name = '王小明' OR name = '李美華';

-- 查詢累積里程大於 3000 或住址包含「台北」的客戶
SELECT * FROM D1397221_Flight.Customers
WHERE accumulated_miles > 3000 OR address LIKE '%台北%';

-- ==========================================
-- 統計函數
-- ==========================================

-- 計算總客戶數
SELECT COUNT(*) AS 總客戶數 FROM D1397221_Flight.Customers;

-- 計算平均累積里程
SELECT AVG(accumulated_miles) AS 平均累積里程 FROM D1397221_Flight.Customers;

-- 查詢最高累積里程
SELECT MAX(accumulated_miles) AS 最高累積里程 FROM D1397221_Flight.Customers;

-- 查詢最低累積里程
SELECT MIN(accumulated_miles) AS 最低累積里程 FROM D1397221_Flight.Customers;

-- 計算所有訂單總金額
SELECT SUM(total_amount) AS 總訂單金額 FROM D1397221_Flight.Orders;

-- 計算總機票數
SELECT COUNT(*) AS 總機票數 FROM D1397221_Flight.Tickets;

-- ==========================================
-- GROUP BY 和 HAVING
-- ==========================================

-- 查詢每個客戶的訂單數量
SELECT customer_id, COUNT(order_id) AS 訂單數量
FROM D1397221_Flight.Orders
GROUP BY customer_id;

-- 查詢每個艙等的訂單數量
SELECT class, COUNT(*) AS 訂單數量
FROM D1397221_Flight.OrderDetails
GROUP BY class;

-- 查詢訂單數量大於等於 2 的客戶
SELECT customer_id, COUNT(order_id) AS 訂單數量
FROM D1397221_Flight.Orders
GROUP BY customer_id
HAVING COUNT(order_id) >= 2;

-- 查詢每個艙等的平均價格，只顯示平均價格大於 14000 的艙等
SELECT class, AVG(price) AS 平均價格
FROM D1397221_Flight.OrderDetails
GROUP BY class
HAVING AVG(price) > 14000;

-- 查詢每個性別的平均累積里程
SELECT gender, AVG(accumulated_miles) AS 平均累積里程
FROM D1397221_Flight.Customers
GROUP BY gender;

-- ==========================================
-- CROSS JOIN（笛卡兒積）
-- ==========================================

-- 使用 CROSS JOIN 查詢客戶和訂單的關聯
SELECT c.*, o.*
FROM D1397221_Flight.Customers c
         CROSS JOIN D1397221_Flight.Orders o
WHERE c.customer_id = o.customer_id;

-- 使用代稱查詢航班和機場的關聯
SELECT f.flight_no, a1.name AS 出發機場, a2.name AS 抵達機場
FROM D1397221_Flight.Flights f
         CROSS JOIN D1397221_Flight.Airports a1
         CROSS JOIN D1397221_Flight.Airports a2
WHERE f.departure = a1.airport_id AND f.arrival = a2.airport_id;

-- ==========================================
-- INNER JOIN
-- ==========================================

-- 查詢每個客戶的訂單資訊
SELECT c.name AS 客戶姓名, o.order_id AS 訂單編號, o.total_amount AS 訂單金額
FROM D1397221_Flight.Customers c
         INNER JOIN D1397221_Flight.Orders o ON c.customer_id = o.customer_id;

-- 查詢每張機票的詳細航班資訊
SELECT t.tickets_id, t.passenger_name, f.flight_no, f.departure_time, f.arrival_time
FROM D1397221_Flight.Tickets t
         INNER JOIN D1397221_Flight.Flights f ON t.flight_id = f.flight_id;

-- 查詢機票和對應的訂單明細
SELECT t.tickets_id, t.passenger_name, t.seat_no, od.price, od.class
FROM D1397221_Flight.Tickets t
         INNER JOIN D1397221_Flight.OrderDetails od
                    ON t.order_id = od.order_id
                        AND t.flight_id = od.flight_id
                        AND t.class = od.class;

-- ==========================================
-- θ合併查詢（多表連接使用 WHERE）
-- ==========================================

-- 查詢完整的訂票資訊（客戶、訂單、航班、機票）
SELECT c.name AS 客戶姓名, o.order_id AS 訂單編號, f.flight_no AS 航班編號,
       t.passenger_name AS 乘客姓名, t.seat_no AS 座位號
FROM D1397221_Flight.Customers c, D1397221_Flight.Orders o,
     D1397221_Flight.Flights f, D1397221_Flight.Tickets t
WHERE c.customer_id = o.customer_id
  AND o.order_id = t.order_id
  AND t.flight_id = f.flight_id;

-- 查詢機票和行李資訊
SELECT t.tickets_id, t.passenger_name, t.seat_no, b.weight, b.type
FROM D1397221_Flight.Tickets t, D1397221_Flight.Baggages b
WHERE t.tickets_id = b.tickets_id;

-- ==========================================
-- 使用 INNER JOIN 的多表連接
-- ==========================================

-- 查詢完整的航班和機場資訊
SELECT f.flight_no AS 航班編號,
       a1.name AS 出發機場, a1.city AS 出發城市,
       a2.name AS 抵達機場, a2.city AS 抵達城市,
       f.departure_time AS 起飛時間, f.arrival_time AS 抵達時間
FROM D1397221_Flight.Flights f
         INNER JOIN D1397221_Flight.Airports a1 ON f.departure = a1.airport_id
         INNER JOIN D1397221_Flight.Airports a2 ON f.arrival = a2.airport_id;

-- 查詢完整的訂票明細
SELECT c.name AS 客戶姓名, o.order_id AS 訂單編號,
       od.class AS 艙等, od.price AS 價格, od.quantity AS 數量,
       t.passenger_name AS 乘客姓名, t.seat_no AS 座位號
FROM D1397221_Flight.Customers c
         INNER JOIN D1397221_Flight.Orders o ON c.customer_id = o.customer_id
         INNER JOIN D1397221_Flight.OrderDetails od ON o.order_id = od.order_id
         INNER JOIN D1397221_Flight.Tickets t ON od.order_id = t.order_id
    AND od.flight_id = t.flight_id AND od.class = t.class;

-- ==========================================
-- LEFT JOIN
-- ==========================================

-- 查詢所有客戶及其訂單（包含沒有訂單的客戶）
SELECT c.name AS 客戶姓名, o.order_id AS 訂單編號, o.total_amount AS 訂單金額
FROM D1397221_Flight.Customers c
         LEFT JOIN D1397221_Flight.Orders o ON c.customer_id = o.customer_id;

-- 查詢所有機票及其行李（包含沒有行李的機票）
SELECT t.tickets_id, t.passenger_name, b.baggages_id, b.weight, b.type
FROM D1397221_Flight.Tickets t
         LEFT JOIN D1397221_Flight.Baggages b ON t.tickets_id = b.tickets_id;

-- ==========================================
-- RIGHT JOIN
-- ==========================================

-- 查詢所有訂單及其客戶資訊
SELECT c.name AS 客戶姓名, o.order_id AS 訂單編號, o.total_amount AS 訂單金額
FROM D1397221_Flight.Customers c
         RIGHT JOIN D1397221_Flight.Orders o ON c.customer_id = o.customer_id;

-- ==========================================
-- UNION 連集
-- ==========================================

-- 合併客戶編號和機票編號
SELECT customer_id AS id, name AS description, '客戶' AS type
FROM D1397221_Flight.Customers
UNION
SELECT tickets_id AS id, passenger_name AS description, '機票' AS type
FROM D1397221_Flight.Tickets;

-- 合併出發和抵達機場
SELECT departure AS airport_code FROM D1397221_Flight.Flights
UNION
SELECT arrival AS airport_code FROM D1397221_Flight.Flights;

-- ==========================================
-- MariaDB 特殊功能：日期時間函數
-- ==========================================

-- 查詢今天的訂單（使用 CURDATE()）
SELECT * FROM D1397221_Flight.Orders WHERE order_date = CURDATE();

-- 查詢最近 7 天的訂單
SELECT * FROM D1397221_Flight.Orders
WHERE order_date >= DATE_SUB(CURDATE(), INTERVAL 7 DAY);

-- 查詢今年 8 月的航班
SELECT * FROM D1397221_Flight.Flights
WHERE YEAR(departure_time) = 2025 AND MONTH(departure_time) = 8;

-- 格式化日期時間顯示
SELECT flight_no,
       DATE_FORMAT(departure_time, '%Y年%m月%d日 %H:%i') AS 起飛時間,
       DATE_FORMAT(arrival_time, '%Y年%m月%d日 %H:%i') AS 抵達時間
FROM D1397221_Flight.Flights;

-- ==========================================
-- 複雜查詢範例（仿照老師最後的範例）
-- ==========================================

-- 查詢航班的出發地、目的地、起飛時間、抵達時間、乘客名字
SELECT f.flight_no AS 航班編號,
       a1.name AS 出發機場, f.departure_time AS 起飛時間,
       a2.name AS 抵達機場, f.arrival_time AS 抵達時間,
       t.passenger_name AS 乘客姓名, t.seat_no AS 座位號
FROM D1397221_Flight.Flights f, D1397221_Flight.Airports a1,
     D1397221_Flight.Airports a2, D1397221_Flight.Tickets t
WHERE f.departure = a1.airport_id
  AND f.arrival = a2.airport_id
  AND t.flight_id = f.flight_id;

-- 查詢每個客戶的完整旅行資訊
SELECT c.name AS 客戶姓名, o.order_date AS 訂單日期,
       f.flight_no AS 航班編號, od.class AS 艙等,
       a1.city AS 出發城市, a2.city AS 抵達城市,
       t.passenger_name AS 乘客姓名, t.seat_no AS 座位號,
       od.price AS 票價
FROM D1397221_Flight.Customers c, D1397221_Flight.Orders o,
     D1397221_Flight.OrderDetails od, D1397221_Flight.Flights f,
     D1397221_Flight.Airports a1, D1397221_Flight.Airports a2,
     D1397221_Flight.Tickets t
WHERE c.customer_id = o.customer_id
  AND o.order_id = od.order_id
  AND od.flight_id = f.flight_id
  AND f.departure = a1.airport_id
  AND f.arrival = a2.airport_id
  AND t.order_id = o.order_id
  AND t.flight_id = f.flight_id
  AND t.class = od.class;

-- ==========================================
-- MariaDB 實用查詢範例
-- ==========================================

-- 查詢每個客戶的總消費金額
SELECT c.name AS 客戶姓名, SUM(o.total_amount) AS 總消費金額
FROM D1397221_Flight.Customers c
         INNER JOIN D1397221_Flight.Orders o ON c.customer_id = o.customer_id
GROUP BY c.customer_id, c.name;

-- 查詢最受歡迎的目的地
SELECT a.city AS 目的地城市, COUNT(*) AS 航班數量
FROM D1397221_Flight.Flights f
         INNER JOIN D1397221_Flight.Airports a ON f.arrival = a.airport_id
GROUP BY a.city
ORDER BY 航班數量 DESC;

-- 查詢每個乘客的行李總重量
SELECT t.passenger_name AS 乘客姓名,
       COALESCE(SUM(CAST(REPLACE(b.weight, 'kg', '') AS DECIMAL(5,2))), 0) AS 總重量
FROM D1397221_Flight.Tickets t
         LEFT JOIN D1397221_Flight.Baggages b ON t.tickets_id = b.tickets_id
GROUP BY t.tickets_id, t.passenger_name;
