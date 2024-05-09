CREATE DATABASE `euclidiana`;

USE `euclidiana`;

CREATE TABLE tabla_a (
id_a INT AUTO_INCREMENT,
column_x INT,
column_y INT,
obs_a VARCHAR(255),
PRIMARY KEY (id_a)
);

CREATE TABLE tabla_b (
id_b INT AUTO_INCREMENT,
column_x INT,
column_y INT,
obs_b VARCHAR(255),
PRIMARY KEY(id_b)
);

TRUNCATE TABLE tabla_a;
TRUNCATE TABLE tabla_b;