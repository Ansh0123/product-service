DROP TABLE IF EXISTS product;
CREATE TABLE product (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  name VARCHAR(250) NOT NULL,
  rating_id INTEGER AUTO_INCREMENT,
  quantity INTEGER DEFAULT 0
);

INSERT INTO product (name, quantity) VALUES
  ('One Plus 6T', 15),
  ('One Plus 7T', 12),
  ('IPhone X', 22);
