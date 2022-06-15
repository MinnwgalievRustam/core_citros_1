create table users
(
    user_id bigint primary key not null auto_increment,
    surname   varchar(255),
    name      varchar(125),
    last_name varchar(125),
    job_title varchar(255)
);
create table assignments
(
    assignment_id bigint primary key not null auto_increment,
    subject_order  varchar(125),
    sign_control  varchar(125),
    sign_performance  varchar(125),
    text_order  text
);
create table users_assignments
(
    user_id bigint not null,
    assignment_id bigint not null,
    foreign key (user_id) references users(user_id),
    foreign key (assignment_id) references assignments(assignment_id)
);
insert into users (surname,name,last_name,job_title)
values('Ivanov','Ivan','Ivanovich','Developer'),
      ('Ivanov2','Ivan2','Ivanovich2','Developer'),
      ('Ivanov3','Ivan3','Ivanovich3','Developer'),
      ('Ivanov4','Ivan4','Ivanovich4','Developer'),
      ('Ivanov5','Ivan5','Ivanovich5','Developer'),
      ('Ivanov6','Ivan6','Ivanovic6','Developer'),
      ('Ivanov7','Ivan7','Ivanovich7','Developer');
insert into assignments (subject_order,sign_control,sign_performance,text_order)
values('Заполнить','В процессе', 'Под наблюдением','Заполнить все документы1'),
      ('Заполнить2','В процессе2', 'Под наблюдением2','Заполнить все документы2'),
      ('Заполнить3','В процессе3', 'Под наблюдением3','Заполнить все документы3'),
      ('Заполнить4','В процессе4', 'Под наблюдением4','Заполнить все документы4'),
      ('Заполнить5','В процессе5', 'Под наблюдением5','Заполнить все документы5'),
      ('Заполнить6','В процессе6', 'Под наблюдением6','Заполнить все документы6'),
      ('Заполнить7','В процессе7', 'Под наблюдением7','Заполнить все документы7');
insert into users_assignments(user_id,assignment_id)
values(1,1),
      (1,1),
      (1,2),
      (1,3),
      (1,4),
      (1,5),
      (2,1),
      (2,2),
      (2,7),
      (2,6),
      (4,3);
