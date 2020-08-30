CREATE DATABASE products_db;

USE products_db;

CREATE TABLE product(
    id      INTEGER AUTO_INCREMENT,
    name    VARCHAR(200),
    brand   VARCHAR(200),
    price   INTEGER,
    stock   INTEGER,
    PRIMARY KEY(id)
);

INSERT INTO
    product (name, brand, price, stock)
VALUES
    ('Name 1','Brand 1',100, 1000),
    ('Name 2','Brand 2',200, 2000),
    ('Name 3','Brand 3',300, 3000);

SELECT * FROM product;