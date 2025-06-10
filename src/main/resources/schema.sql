CREATE TABLE users (
    username VARCHAR(50) NOT NULL PRIMARY KEY,
    password VARCHAR(500) NOT NULL,
    enabled BOOLEAN NOT NULL
);
CREATE TABLE authorities (
    username VARCHAR(50) NOT NULL,
    authority VARCHAR(50) NOT NULL,
    CONSTRAINT fk_authorities_users FOREIGN KEY (username)
        REFERENCES users (username)
);
create unique index ix_auth_username on authorities (username,authority);

CREATE TABLE customer (
    id int NOT NULL AUTO_INCREMENT,
    username varchar(50) NOT NULL UNIQUE,
    email varchar(100) NOT NULL,
    pwd varchar(200) NOT NULL,
    role varchar(50) NOT NULL,
    PRIMARY KEY (id)
);