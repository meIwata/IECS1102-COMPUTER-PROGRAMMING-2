-- D1397221_0724.Course definition

CREATE TABLE `Course` (
                          `course_id` int(11) NOT NULL AUTO_INCREMENT,
                          `course_name` varchar(100) NOT NULL,
                          `course_description` text DEFAULT NULL,
                          `credits` int(11) NOT NULL,
                          PRIMARY KEY (`course_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='儲存課程資料';

-- D1397221_0724.Enrollment definition

CREATE TABLE `Enrollment` (
                              `student_id` int(11) NOT NULL,
                              `course_id` int(11) NOT NULL,
                              `enrollment_date` date NOT NULL,
                              PRIMARY KEY (`student_id`,`course_id`),
                              KEY `Enrollment_Course_FK` (`course_id`),
                              CONSTRAINT `Enrollment_Course_FK` FOREIGN KEY (`course_id`) REFERENCES `Course` (`course_id`),
                              CONSTRAINT `Enrollment_Student_FK` FOREIGN KEY (`student_id`) REFERENCES `Student` (`student_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='儲存選課資料';

-- D1397221_0724.Student definition

CREATE TABLE `Student` (
                           `student_id` int(11) NOT NULL AUTO_INCREMENT,
                           `first_name` varchar(100) NOT NULL,
                           `last_name` varchar(100) NOT NULL,
                           `date_of_birth` date DEFAULT NULL,
                           `email` varchar(100) NOT NULL,
                           PRIMARY KEY (`student_id`),
                           UNIQUE KEY `Student_UNIQUE` (`email`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='儲存學生資料';


-- 老師示範
INSERT Into T04012_0724.Teacher VALUES(null, 'Andy', 'andy@fcu.edu.tw', 22)
--


Insert into D1397221_0724.Course values(null, 'English', null, 3)
Insert into D1397221_0724.Course values(null, 'Accunting', null, 3)
Insert into D1397221_0724.Course values(null, 'PE-Swim', '要帶泳具', 3)
Insert into D1397221_0724.Course values(null, 'Software Development', '要帶筆電', 3)

Insert into D1397221_0724.Student values (null, 'Anna', 'Wang', '2000-05-10', 'anna_wang@gmail.com');
Insert into D1397221_0724.Student values (null, 'Jack', 'Fok', '2003-12-10', 'jfok@gmail.com');
Insert into D1397221_0724.Student values (null, 'Emma', 'Lin', '04-12-10', 'emma@gmail.com');

-- 因為第一個欄位是id為autoincrement，如果第一欄不寫null的話，values前面可以加上要輸入進去的欄位，如下
INSERT INTO D1397221_0724.Student (first_name, last_name, date_of_birth, email) VALUES ('Brain', 'Chang', '00-08-15', 'brainchang@gmail.com');

INSERT INTO D1397221_0724.Enrollment values(1, 1, '2025-07-30')
INSERT INTO D1397221_0724.Enrollment values(1, 3, '2025-07-30')
INSERT INTO D1397221_0724.Enrollment values(2, 3, '2025-07-30')
INSERT INTO D1397221_0724.Enrollment values(2, 2, '2025-07-30')
INSERT INTO D1397221_0724.Enrollment values(3, 4, '2025-07-30')
INSERT INTO D1397221_0724.Enrollment values(3, 1, '2025-07-30')

-- 修改資料
UPDATE D1397221_0724.Student SET email = 'brainchang@fcu.edu.tw' WHERE student_id = 5 -- 更改一欄
UPDATE D1397221_0724.Student SET email = 'brainchang@o365.fcu.edu.tw', date_of_birth='00-08-16' WHERE student_id = 5 -- 更改多欄

UPDATE D1397221_0724.Student SET email = "123@yahoo.com.tw" WHERE email LIKE '%@o365.fcu.edu.tw'

UPDATE D1397221_0724.Course SET course_description = "要帶統計計算機", course_name = "Statistics" WHERE course_id = 2
UPDATE D1397221_0724.Course SET credits = 2 WHERE course_id = 1
UPDATE D1397221_0724.Course SET credits = 1 WHERE course_id = 3

-- 刪除資料
DELETE FROM D1397221_0724.Student WHERE student_id = 5


-- 再新增一點資料
INSERT INTO D1397221_0724.Student VALUES (null, 'Kent', 'Chen', '2001-03-08', 'kentchen@hotmail.com')
INSERT INTO D1397221_0724.Student VALUES (null, 'Kent', 'Wang', '1999-07-21', 'kentwang@hotmail.com')
INSERT INTO D1397221_0724.Student VALUES (null, 'Kent', 'Lee', '2002-11-15', 'kent.lee@gmail.com')
INSERT INTO D1397221_0724.Student VALUES (null, 'David', 'Hsu', '2000-02-27', 'davidhsu@gmail.com')
INSERT INTO D1397221_0724.Student VALUES (null, 'Mandy', 'Lin', '2003-09-30', 'mandy.lin@gmail.com')


DELETE FROM D1397221_0724.Student WHERE first_name = 'Kent' AND email LIKE '%@hotmail%'; -- 刪除名字是Kent且email包含@hotmail

-- 2025.07.31
-- 查詢表格資料
SELECT * from D1397221_0724.Student s

SELECT * from D1397221_0724.Student s ORDER BY email;
SELECT email, first_name   from D1397221_0724.Student s;

SELECT * from D1397221_HW.OrderDetails od;
SELECT departure from D1397221_HW.OrderDetails od;

SELECT DISTINCT first_name FROM D1397221_0724.Student s; -- 使用 DISTINCT， 如果first_name一樣就只會出現一筆

SELECT email AS 電子信箱, s.last_name AS 姓 ,s.first_name AS 名 FROM D1397221_0724.Student s;

SELECT email AS 電子信箱, s.last_name AS 姓 ,s.first_name AS 名 FROM D1397221_0724.Student s WHERE s.student_id =10;

SELECT s.date_of_birth AS 生日, email AS 電子信箱, s.last_name AS 姓 ,s.first_name AS 名 FROM D1397221_0724.Student s WHERE s.date_of_birth < '2001-01-01';

SELECT email AS 電子信箱, s.last_name AS 姓 ,s.first_name AS 名 FROM D1397221_0724.Student s WHERE s.first_name <> 'Tom' -- <>是不等於

SELECT email AS 電子信箱, s.last_name AS 姓 ,s.first_name AS 名 FROM D1397221_0724.Student s WHERE s.first_name = 'Tom'; -- =是等於

SELECT * from D1397221_0724.Student WHERE date_of_birth > '2002-01-01';

SELECT * FROM D1397221_0724.Student s WHERE s.last_name like '%g';
SELECT * FROM D1397221_0724.Student s WHERE s.first_name like 'K%';
SELECT * FROM D1397221_0724.Student s WHERE s.first_name like '%n%';

SELECT * from D1397221_0724.Course WHERE course_description is NULL; -- 找出欄位資料是空值的

-- 子查詢
SELECT * FROM D1397221_HW.Tickets t WHERE EXISTS (
    SELECT passenger_name FROM D1397221_HW.Baggages b
    WHERE b.tickets_id = t.tickets_id
);

SELECT * FROM T04012_0724.Teacher WHERE EXISTS (
    SELECT teacher from T04012_0724.Course
    WHERE T04012_0724.Teacher.teacher_id = T04012_0724.Course.teacher
);


SELECT teacher_id as 教職員編號, name as 教師姓名, email as 電子郵件, age as 年紀 from T04012_0724.Teacher WHERE age  between 30 and 40;
SELECT teacher_id as 教職員編號, name as 教師姓名, email as 電子郵件, age as 年紀 from T04012_0724.Teacher WHERE age  in (20, 25, 30);
SELECT teacher_id as 教職員編號, name as 教師姓名, email as 電子郵件, age as 年紀 from T04012_0724.Teacher WHERE age  not in (20, 25, 30);
SELECT teacher_id as 教職員編號, name as 教師姓名, email as 電子郵件, age as 年紀 from T04012_0724.Teacher WHERE name like '%y' or age < 30;
SELECT teacher_id as 教職員編號, name as 教師姓名, email as 電子郵件, age as 年紀 from T04012_0724.Teacher WHERE name like '%y' and age < 30;
SELECT count(*) from T04012_0724.Teacher; -- 找到幾筆資料
SELECT avg(age) from T04012_0724.Teacher; -- 算年紀的平均
SELECT max(age) from T04012_0724.Teacher; -- 查詢 Teacher 表中最大的年齡
SELECT min(age) from T04012_0724.Teacher; -- 查詢 Teacher 表中最小的年齡
SELECT sum(age) from T04012_0724.Teacher; -- 計算 Teacher 表中所有年齡的總和


-- 2025.08.06
select age, count(teacher_id) from T04012_0724.Teacher; -- 查詢每個年齡的教師人數（不分組篩選，顯示所有資料）
select age, count(teacher_id) from T04012_0724.Teacher group by age; -- 查詢每個年齡（age）對應的教師人數（teacher_id 數量）
select age, count(teacher_id) from T04012_0724.Teacher group by age having count(teacher_id) >=2; -- 查詢每個年齡的教師人數，只顯示教師人數大於等於2的年齡組
select age, count(*) as amount from T04012_0724.Teacher group by age having count(teacher_id) >=2; -- 查詢每個年齡的教師人數（欄位別名為amount），只顯示教師人數大於等於2的年齡組
