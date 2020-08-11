CREATE TABLE IF NOT EXISTS manufacturer (
  manufacturer_id INT(10) NOT NULL PRIMARY KEY,
  fantasy_name VARCHAR(100) NOT NULL,
  company_name VARCHAR(100) NOT NULL,
  cnpj VARCHAR(50) NOT NULL,
  created_at DATE NOT NULL,
  modified_at DATE
);

CREATE TABLE IF NOT EXISTS product (
  product_id INT(10) NOT NULL PRIMARY KEY,
  manufacturer_id INT(10),
  description VARCHAR(500) NOT NULL,
  price  DECIMAL(7,2) NOT NULL,
  stock INT(8) NOT NULL,
  technical_specification VARCHAR(4000) NOT NULL,
  dimension VARCHAR(4000) NOT NULL,
  characteristic VARCHAR(4000) NOT NULL,
  created_at DATE NOT NULL,
  modified_at DATE,
   FOREIGN KEY (manufacturer_id) REFERENCES manufacturer (manufacturer_id)
);

CREATE TABLE IF NOT EXISTS product_picture (
  product_picture_id INT(10) NOT NULL PRIMARY KEY,
  product_id INT(10),
  name VARCHAR(500) NOT NULL,
  image  BLOB NOT NULL,
  main_image CHAR(1) NOT NULL,
  FOREIGN KEY (product_id) REFERENCES product (product_id)
);

CREATE TABLE IF NOT EXISTS discount_coupon (
  discount_coupon_id INT(10) NOT NULL PRIMARY KEY,
  name VARCHAR(100) NOT NULL,
  location VARCHAR(100) NOT NULL,
  discount  DECIMAL(7,2) NOT NULL,
  discount_coupon DECIMAL(7,2) NOT NULL,
  dth_expiration DATE NOT NULL,
  active CHAR(1) DEFAULT '0',
  created_at DATE NOT NULL,
  modified_at DATE
);

CREATE TABLE IF NOT EXISTS sales_order (
  sales_order_id INT(10) NOT NULL PRIMARY KEY,
  customer_id INT(10),
  status VARCHAR(100) NOT NULL,
  created_at DATE NOT NULL,
  modified_at DATE,
  FOREIGN KEY (customer_id) REFERENCES customer (customer_id)
);

CREATE TABLE IF NOT EXISTS product_order (
  product_order_id INT(10) NOT NULL PRIMARY KEY,
  product_id INT(10),
  sales_order_id INT(10),
  price  DECIMAL(7,2) NOT NULL,
  discount DECIMAL(7,2) NOT NULL,
  discount_coupon_id INT(10),
  created_at DATE NOT NULL,
  modified_at DATE,
  FOREIGN KEY (product_id) REFERENCES product(product_id),
  FOREIGN KEY (sales_order_id) REFERENCES sales_order(sales_order_id),
  FOREIGN KEY (discount_coupon_id) REFERENCES discount_coupon(discount_coupon_id)
);