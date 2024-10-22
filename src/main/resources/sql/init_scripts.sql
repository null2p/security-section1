create table users(username varchar(50) not null primary key,password varchar(500) not null,enabled boolean not null);
create table authorities (username varchar(50) not null,authority varchar(50) not null,constraint fk_authorities_users foreign key(username) references users(username));
create unique index ix_auth_username on authorities (username,authority);

INSERT IGNORE INTO users VALUES ('user','{noop}EaszyBytes@12345','1');
INSERT IGNORE INTO authorities values ('user','read');

INSERT IGNORE INTO users values ('admin','{bcrypt}$2a$12$.D9sDVggsxVRFoyx2UwmXumLq8dfB/GUoJyNcZ1EX5hP/yEIPbjAC','1');
INSERT IGNORE INTO authorities values ('admin','admin');

# 사용자정의 테이블
CREATE TABLE customer
(
    id    int          NOT NULL AUTO_INCREMENT,
    email varchar(45)  NOT NULL,
    pwd   varchar(200) NOT NULL,
    role  varchar(45)  NOT NULL,
    PRIMARY KEY (id)
);

INSERT INTO customer (email, pwd, role) values ('happy@example.com','{noop}EaszyBytes@12345','read');
INSERT INTO customer (email, pwd, role) values ('admin@example.com','{bcrypt}$2a$12$.D9sDVggsxVRFoyx2UwmXumLq8dfB/GUoJyNcZ1EX5hP/yEIPbjAC','admin');

