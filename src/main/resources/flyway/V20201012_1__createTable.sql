DROP TABLE IF EXISTS Products;
DROP TABLE IF EXISTS Category;

Create Table Category(
  category_id int PRIMARY KEY,
  category_name varchar(255),
  description varchar(255),
  subcategory varchar(255)
);

Create table Products(
  product_id int PRIMARY KEY,
  category_id int,
  product_name varchar(255),
  product_price float,
  description varchar(255),
  production_date varchar(255),
  expiry_date varchar(255),
  barcode varchar(255),
  weight varchar(255),
  CONSTRAINT Fk_category FOREIGN KEY(category_id) REFERENCES Category(category_id)
);
INSERT INTO Category (category_id,category_name,description,subcategory)
VALUES
(10,'Kitchen','for home','chemical'),
(20,'bathroom','for home','chemical'),
(30,'building','for home','chemical');


INSERT INTO Products (product_id,category_id,product_name,product_price,description,production_date,expiry_date,barcode,weight)
VALUES
(1,10,'Powder',720,'for clean','January','May','546543265','450g'),
(2,20,'soap',230,'for clean','August 2020','May 2021','84848484','120g'),
(3,30,'shampoo',500,'for clean','April','Januray','741852963','180g');



