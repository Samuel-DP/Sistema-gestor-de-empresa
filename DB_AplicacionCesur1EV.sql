-- SCRIPT DB COMPLETA
CREATE DATABASE Aplicacion_Cesur1Ev

-- Me defino los enums de mis tablas
CREATE TYPE tipo_pago AS ENUM ('efectivo','tarjeta','domiciliacion_bancaria');
CREATE TYPE estado_pedido AS ENUM ('encargado','facturado','anulado');
CREATE TYPE tipo_iva AS ENUM ('normal','reducido','super_reducido');


CREATE TABLE empresa (
  id_empresa          bigserial PRIMARY KEY,
  nombre_comercial    varchar(100) NOT NULL,
  razon_social        varchar(120),
  registro_mercantil  varchar(60),
  nif                 varchar(20) UNIQUE,
  nombre_calle        varchar(80),
  codigo_postal       integer CHECK (codigo_postal > 0),
  ciudad              varchar(40),
  provincia           varchar(40),
  pais                varchar(40),
  telefono            varchar(17),
  correo              varchar(100),
  web                 varchar(120),
  iban                varchar(34)
);


CREATE TABLE empleados (
  id_empleado         bigserial PRIMARY KEY,
  dni                 varchar(20) NOT NULL UNIQUE,
  nombre              varchar(60) NOT NULL,
  apellido1           varchar(60) NOT NULL,
  apellido2           varchar(60),
  nombre_calle        varchar(80) NOT NULL,
  codigo_postal       integer NOT NULL CHECK (codigo_postal > 0),
  ciudad              varchar(40) NOT NULL,
  provincia           varchar(40) NOT NULL,
  pais                varchar(40) NOT NULL,
  telefono            varchar(17),
  correo              varchar(100) NOT NULL,
  departamento        varchar(60) NOT NULL,
  puesto              varchar(60) NOT NULL,
  salario             numeric(12,2) NOT NULL CHECK (salario > 0),
  domiciliacion_bancaria varchar(50) NOT NULL,
  fecha_nacimiento    date CHECK (fecha_nacimiento < CURRENT_DATE),
  fecha_alta          date NOT NULL,
  activo              boolean NOT NULL DEFAULT true
);


CREATE TABLE clientes (
  id_cliente          bigserial PRIMARY KEY,
  razon_social        varchar(40),           -- si es empresa
  nombre_comercial    varchar(40) NOT NULL,  -- o nombre y apellidos si es persona
  tipo_pago           tipo_pago NOT NULL,
  nombre_calle        varchar(50) NOT NULL,
  codigo_postal       integer NOT NULL CHECK (codigo_postal > 0),
  ciudad              varchar(20) NOT NULL,
  provincia           varchar(20) NOT NULL,
  pais                varchar(20) NOT NULL,
  correo              varchar(100) NOT NULL,
  telefono            varchar(17),
  nif				          varchar(20) UNIQUE NOT NULL
);


CREATE TABLE productos (
  id_producto         bigserial PRIMARY KEY,
  nombre              varchar(40) NOT NULL,
  descripcion         varchar(200) NOT NULL,
  marca               varchar(40) NOT NULL,
  ud_venta            varchar(25) NOT NULL,       -- L, Kg, ud...
  codigo_barras       varchar(50) UNIQUE,
  sku                 varchar(50) UNIQUE,
  estado              boolean NOT NULL DEFAULT true,
  stock               integer NOT NULL CHECK (stock >= 0),
  stock_max           integer NOT NULL CHECK (stock_max > 0),
  stock_min           integer NOT NULL CHECK (stock_min > 0),
  CHECK (stock_min <= stock_max)
);


CREATE TABLE pedidos (
  id_pedido           bigserial PRIMARY KEY,
  num_factura         varchar(25) NOT NULL UNIQUE,
  fecha_factura       date NOT NULL,
  fecha_venta         date NOT NULL,
  id_cliente          bigint NOT NULL REFERENCES clientes(id_cliente), 
  tipo_pago           tipo_pago NOT NULL,
  fecha_entrega       date NOT NULL,
  estado_pedido       estado_pedido NOT NULL,
  CHECK (fecha_factura >= fecha_venta),
  CHECK (fecha_entrega >= fecha_venta)
);


CREATE TABLE detalles_pedidos (
  id_pedido           bigint NOT NULL REFERENCES pedidos(id_pedido),
  id_producto         bigint NOT NULL REFERENCES productos(id_producto),
  cantidad            integer NOT NULL CHECK (cantidad > 0),
  precio_unit         numeric(12,2) NOT NULL CHECK (precio_unit > 0), -- sin IVA
  iva                 tipo_iva NOT NULL,                               -- normal/reducido/super_reducido
  descuento           numeric(5,2) CHECK (descuento IS NULL OR (descuento >= 0 AND descuento <= 100)),
  PRIMARY KEY (id_pedido, id_producto)
);


--INSERTS 

INSERT INTO empresa
(nombre_comercial, razon_social, registro_mercantil, nif, nombre_calle, codigo_postal, ciudad, provincia, pais, telefono, correo, web, iban)
VALUES
('CESUR', 'CESUR Formación Profesional S.L.', 'RM-ZA-12345', 'B98765432',
 'C/ Innovación 15', 50018, 'Zaragoza', 'Zaragoza', 'España',
 '954000111', 'info@cesurformacion.com', 'https://www.cesurformacion.com', 'ES7620770024003102575766');


INSERT INTO empleados (
  dni, nombre, apellido1, apellido2, nombre_calle, codigo_postal, ciudad, provincia, pais,
  telefono, correo, departamento, puesto, salario, domiciliacion_bancaria,
  fecha_nacimiento, fecha_alta, activo
) VALUES
('12345678A','María','García','López','Calle Mayor 12',28001,'Madrid','Madrid','España','600111222','maria.garcia@empresa.com','Ventas','Comercial',24000.00,'ES9820385778983000760234','1990-05-14','2023-01-10',true),
('45678912B','Juan','Pérez','Santos','Av. Libertad 45',41002,'Sevilla','Sevilla','España','600222333','juan.perez@empresa.com','Compras','Responsable',30000.00,'ES5521000418450200051332','1985-08-22','2022-09-15',true),
('98765432C','Ana','López','Fernández','C/ Real 8',03003,'Alicante','Alicante','España','600333444','ana.lopez@empresa.com','Almacén','Mozo de almacén',19000.00,'ES4321000813610123456789','1994-12-02','2024-02-01',true),
('74125896D','Carlos','Ruiz','Martín','C/ Sol 21',29005,'Málaga','Málaga','España','600444555','carlos.ruiz@empresa.com','Dirección','Gerente',45000.00,'ES2100041954853100001234','1980-03-18','2021-06-20',true),
('15935728E','Laura','Martínez','Gómez','C/ Luna 3',08007,'Barcelona','Barcelona','España','600555666','laura.martinez@empresa.com','Marketing','Diseñadora',27000.00,'ES3100750123456789012345','1992-10-10','2023-04-12',true);


INSERT INTO clientes (
  razon_social, nombre_comercial, tipo_pago, nombre_calle, codigo_postal, ciudad, provincia, pais, correo, telefono, nif
) VALUES
('Panadería Sol S.L.','Panadería Sol','efectivo','C/ Pan 9',28015,'Madrid','Madrid','España','contacto@panaderiasol.com','911234567','B12345678'),
(NULL,'Claudia Torres','tarjeta','C/ Río 22',50004,'Zaragoza','Zaragoza','España','claudia.torres@mail.com','622334455','12345678Z'),
('Supermercados Pico S.A.','Super Pico','domiciliacion_bancaria','Av. Comercio 56',08014,'Barcelona','Barcelona','España','info@superpico.com','933112233','A87654321'),
(NULL,'Luis Fernández','efectivo','C/ Alta 3',41003,'Sevilla','Sevilla','España','luisf@gmail.com','612223344','23456789L'),
('Electro Hogar S.L.','Electro Hogar','tarjeta','C/ Industria 12',46010,'Valencia','Valencia','España','ventas@electrohogar.com','963556677','B99887766');


-- PRODUCTOS 
INSERT INTO productos (
  nombre, descripcion, marca, ud_venta, codigo_barras, sku, estado, stock, stock_max, stock_min
) VALUES
('Lavavajillas 1L','Lavavajillas concentrado ecológico','EcoClean','L','123456789001','LAVA-001',true,120,300,50),
('Detergente 3L','Detergente ropa aroma fresco','CleanHome','L','123456789002','DETER-003',true,80,200,40),
('Guantes limpieza','Guantes resistentes talla M','HomeSafe','ud','123456789003','GUA-M',true,200,500,100),
('Ambientador Lavanda','Ambientador en spray aroma lavanda','AromaPlus','ud','123456789004','AMB-LAV',true,50,150,20),
('Limpiacristales 750ml','Limpiacristales sin amoníaco','CrystalPro','L','123456789005','CRYS-750',true,100,250,30);


-- PEDIDOS 
INSERT INTO pedidos (
  num_factura, fecha_factura, fecha_venta, id_cliente, tipo_pago, fecha_entrega, estado_pedido
) VALUES
('F2024-001','2024-02-10','2024-02-10',1,'efectivo','2024-02-12','facturado'),
('F2024-002','2024-02-11','2024-02-11',2,'tarjeta','2024-02-13','facturado'),
('F2024-003','2024-02-11','2024-02-10',3,'domiciliacion_bancaria','2024-02-14','encargado'),
('F2024-004','2024-02-12','2024-02-12',4,'efectivo','2024-02-15','facturado'),
('F2024-005','2024-02-12','2024-02-11',5,'tarjeta','2024-02-14','anulado');


-- DETALLES_PEDIDOS 
INSERT INTO detalles_pedidos (
  id_pedido, id_producto, cantidad, precio_unit, iva, descuento
) VALUES
(1,1,3,2.50,'normal',0),
(2,2,1,4.80,'reducido',0),
(3,3,10,0.90,'super_reducido',5),
(4,4,2,3.40,'normal',0),
(5,5,4,1.95,'reducido',10);

select * from empresa
select * from clientes
select * from empleados
select * from productos
select * from pedidos
select * from detalles_pedidos


-- CON ESTO BORRO TODOS LOS INSERTS, PK, FK
TRUNCATE empresa, empleados, clientes, productos, pedidos, detalles_pedidos
RESTART IDENTITY CASCADE;




