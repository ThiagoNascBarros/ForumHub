create table topic (
    id bigint not null auto_increment,
    title varchar(120) not null,
    description varchar(350) not null,
    date datetime not null,
    user_id bigint not null,

    primary key (id),
    constraint fk_topic_user_id foreign key (user_id) references user(id)
)