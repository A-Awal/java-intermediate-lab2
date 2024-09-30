CREATE TABLE Customers (
                           id INT AUTO_INCREMENT PRIMARY KEY,
                           name VARCHAR(100) NOT NULL,
                           email VARCHAR(255) UNIQUE
                        );

CREATE TABLE Purchases (
                        id INT AUTO_INCREMENT PRIMARY KEY,
                        customer_id INT,
                        date DATE,
                        FOREIGN KEY (customer_id) REFERENCES Customers(id)
                        );

-- CREATE TABLE Products (
--                         purchase_id INT,
--                         product_id INT,
--                         quantity INT,
--                         PRIMARY KEY (purchase_id, product_id),
--                         FOREIGN KEY (purchase_id) REFERENCES Purchases(purchase_id),
--
--                     );