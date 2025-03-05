-- 게시판 테이블

create database project;
use project;



create table board(
	bno int auto_increment,
    title varchar(20) not null,
    content longtext,
    writer varchar(10),
    view int default 0,
    date datetime default now(),
    
    primary key(bno)
);

insert into board(title, content) values('그림' , '이름');

insert into board( bno,title, content,writer,view) values( '1', '하루하루' , '늦어져가네에에' , '빅뱅' , '1' );
insert into board( bno,title, content,writer,view) values( '1', '휘영청밝은달빛아래' , '칼을허리에차고' , '이수' , '1');

select * from board;
