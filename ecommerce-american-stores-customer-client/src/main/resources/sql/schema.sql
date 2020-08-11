CREATE TABLE IF NOT EXISTS customer (
  customer_id INT(10) NOT NULL PRIMARY KEY,
  name VARCHAR(100) NOT NULL,
  email VARCHAR(50) NOT NULL,
  username VARCHAR(50),
  mobile_phone VARCHAR(50),
  landline_phone VARCHAR(50),
  created_at DATE NOT NULL,
  modified_at DATE,
  FOREIGN KEY (username) REFERENCES user(username)
);

CREATE TABLE IF NOT EXISTS customer_address (
  customer_address_id INT(10) NOT NULL PRIMARY KEY,
  customer_id INT(10) NOT NULL,
  address VARCHAR(500) NOT NULL,
  complement VARCHAR(500),
  city VARCHAR(50) NOT NULL,
  state VARCHAR(50)NOT NULL,
  country VARCHAR(50) NOT NULL,
  created_at DATE NOT NULL,
  modified_at DATE,
  FOREIGN KEY (customer_id) REFERENCES customer (customer_id)
);