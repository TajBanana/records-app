-- init.sql
CREATE DATABASE IF NOT EXISTS records;

USE records;

CREATE TABLE persons (
                     personal_id CHAR(9) PRIMARY KEY,
                     name VARCHAR(255),
                     location VARCHAR(255)
);

INSERT INTO persons (personal_id, name, location) VALUES ('123456789', 'Bob Johnson', 'REGISTRATION');
INSERT INTO persons (personal_id, name, location) VALUES ('987654321', 'John Doe', 'WASHING');
INSERT INTO persons (personal_id, name, location) VALUES ('202938476', 'Mary Joe', 'PACKING');
INSERT INTO persons (personal_id, name, location) VALUES ('283746665', 'Jerry Rig', 'STORAGE');
