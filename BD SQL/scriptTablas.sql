CREATE DATABASE bd;

use bd;
CREATE TABLE Productos
(
id int primary key not null,
nombre varchar (50),
precioclp double
);

INSERT INTO Productos(id,nombre,precioclp) VALUES ('1', 'Pantalon Regular', '9000');
INSERT INTO Productos(id,nombre,precioclp) VALUES ('2', 'Pantalon a medida regular', '20000');
INSERT INTO Productos(id,nombre,precioclp) VALUES ('3', 'Pantalon luxury', '90000');
INSERT INTO Productos(id,nombre,precioclp) VALUES ('4', 'Pantalon a medida luxury', '200000');
INSERT INTO Productos(id,nombre,precioclp) VALUES ('5', 'Camisa Regular', '5000');
INSERT INTO Productos(id,nombre,precioclp) VALUES ('6', 'Camisa Regular a medida', '15000');
INSERT INTO Productos(id,nombre,precioclp) VALUES ('7', 'Camisa luxury', '50000');
INSERT INTO Productos(id,nombre,precioclp) VALUES ('8', 'Camisa luxury a medida', '150000');
INSERT INTO Productos(id,nombre,precioclp) VALUES ('9', 'Crocs', '999999');