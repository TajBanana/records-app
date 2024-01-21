-- init.sql
CREATE DATABASE IF NOT EXISTS records;

use records;

CREATE TABLE persons (
                         id INT AUTO_INCREMENT PRIMARY KEY,
                         name VARCHAR(255),
                         personal_id CHAR(9),
                         location VARCHAR(255)
);

INSERT INTO persons (name, personal_id, location) VALUES ('Bob Johnson', '123456789', 'REGISTRATION');
INSERT INTO persons (name, personal_id, location) VALUES ('John Doe', '987654321', 'WASHING');
INSERT INTO persons (name, personal_id, location) VALUES ('Mary Joe', '202938476', 'PACKING');
INSERT INTO persons (name, personal_id, location) VALUES ('Jerry Rig', '283746665', 'STORAGE');

