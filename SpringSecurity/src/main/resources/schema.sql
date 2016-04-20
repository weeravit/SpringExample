/*Table structure for table movie */

DROP TABLE IF EXISTS movie;

CREATE TABLE movie (
  id int(10) unsigned NOT NULL AUTO_INCREMENT,
  name varchar(255) NOT NULL,
  PRIMARY KEY (id),
  UNIQUE KEY name (name)
);

/*Table structure for table role */

DROP TABLE IF EXISTS role;

CREATE TABLE role (
  id int(10) unsigned NOT NULL AUTO_INCREMENT,
  name varchar(255) NOT NULL,
  PRIMARY KEY (id)
);



