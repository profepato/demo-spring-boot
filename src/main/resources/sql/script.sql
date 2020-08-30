CREATE DATABASE products_db;

USE products_db;

CREATE TABLE product(
    product_id      INTEGER AUTO_INCREMENT,
    product_name    VARCHAR(200),
    product_brand   VARCHAR(200),
    product_price   INTEGER,
    product_stock   INTEGER,
    PRIMARY KEY(product_id)
);

INSERT INTO
    product (product_name, product_brand, product_price, product_stock)
VALUES
    ('Name 1','Brand 1',100, 1000),
    ('Name 2','Brand 2',200, 2000),
    ('Name 3','Brand 3',300, 3000);

SELECT * FROM product;