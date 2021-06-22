create table PRODUCT
(
   sku INT AUTO_INCREMENT PRIMARY KEY,
   brand VARCHAR(250)  NOT NULL,
   price  INT NOT NULL,
   color VARCHAR(250)  NOT NULL,
   size VARCHAR(10)  NOT NULL,
   category_id  INT NOT NULL,
   supplier_id  INT NOT NULL
);


create table PROD_CTAEGORY
(
   id INT AUTO_INCREMENT  PRIMARY KEY,
   type VARCHAR(250)  NOT NULL
);

create table SUPPLIER
(
   id INT AUTO_INCREMENT  PRIMARY KEY,
   name VARCHAR(250)  NOT NULL
);