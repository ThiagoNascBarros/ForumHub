create table user (
    id bigint not null auto_increment,
    fullname varchar(255) not null,
    simplename varchar(100) not null,
    email varchar(255) not null,
    password varchar(255) not null,

    primary key (id)
);

