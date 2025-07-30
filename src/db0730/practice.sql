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