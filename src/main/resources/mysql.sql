
drop database artisan;
create database artisan;

use artisan;

create table t_role (
id int(12) auto_increment,
role_name varchar(60) not null,
note varchar(256) null,
primary key(id)
);

insert into t_role(role_name, note) values('artisan_1', 'note_1');
insert into t_role(role_name, note) values('artisan_2', 'note_2');
insert into t_role(role_name, note) values('artisan_3', 'note_3');


select * from t_role;