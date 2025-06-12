CREATE TABLE student (
	id INT NOT NULL Primary Key AUTO_INCREMENT,
	username VARCHAR(20),
	univ VARCHAR(40),
	birth DATE,
	email VARCHAR(40)
);

INSERT INTO student(username, univ, birth, email) VALUES('김길동', 'AA대학교', '1999-10-21', 'kim@aa.com');
INSERT INTO student(username, univ, birth, email) VALUES('박사랑', 'BB대학교', '2000-01-21', 'park@bb.com');
INSERT INTO student(username, univ, birth, email) VALUES('나최고', 'CC대학교', '1998-07-11', 'na@cc.com');
INSERT INTO student(username, univ, birth, email) VALUES('김길동', 'BB대학교', '1999-03-10', 'kim@bb.com');
INSERT INTO student(username, univ, birth, email) VALUES('홍길동', 'AA대학교', '1999-12-10', 'hong@aa.com');

-- 현재 등록된 테이블 자료 보기
SELECT * FROM student