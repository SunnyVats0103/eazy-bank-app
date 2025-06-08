INSERT IGNORE INTO users VALUES ('user', '{noop}Sunny@dmin1393', '1');
INSERT IGNORE INTO users VALUES ('admin', '{bcrypt}$2a$10$F4qeM/mOvktHmwz5IC3ZG.f1XswNLqj/QRqo2g/3Ec8cai9KAGA5C', '1');

INSERT IGNORE INTO authorities VALUES ('user', 'read');
INSERT IGNORE INTO authorities VALUES ('admin', 'admin');