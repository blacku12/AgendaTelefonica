create database agenda;
use agenda;
CREATE USER 'user'@'localhost' IDENTIFIED BY 'root';
GRANT ALL PRIVILEGES ON agenda.* TO 'user'@'localhost';

CREATE TABLE contacte (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nume VARCHAR(50) NOT NULL,
    prenume VARCHAR(50) NOT NULL,
    data_nastere DATE NOT NULL,
    nr_fix VARCHAR(10),
    nr_mobil VARCHAR(10)
);

INSERT INTO `contacte` VALUES (23,'Popescu','Alex','1983-03-17','0213654789','0721365478'),(28,'Vasile','Ionita','1234-02-05','','0721365478'),(30,'Popescu','Alex','1983-03-17','0219874569',''),(38,'Ionescu','Paul','1956-06-29','','0721369696'),(39,'Blandiana','Ana','1979-02-12','0213265874','0721365874'),(40,'Adrian','Copilminune','1979-12-02','0213698745',''),(41,'Johnny','Bravo','1978-02-13','0219365478',''),(42,'Joacabine','Mirel','1875-02-02','','0721698745');
