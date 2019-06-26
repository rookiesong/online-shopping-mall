/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2019/6/22 14:39:42                           */
/*==============================================================*/


create database team14;
use team14;
drop table if exists orders;

drop table if exists payment;

drop table if exists product;

drop table if exists user;

/*==============================================================*/
/* Table: "orders"                                               */
/*==============================================================*/
create table orders
(
   orders_id             varchar(20) not null,
   paying_method        varchar(20),
   product_id           varchar(20),
   user_mailaddress     varchar(20),
   number               varchar(20) not null,
   primary key (orders_id)
);

/*==============================================================*/
/* Table: payment                                               */
/*==============================================================*/
create table payment
(
   paying_method        varchar(20) not null,
   primary key (paying_method)
);

/*==============================================================*/
/* Table: product                                               */
/*==============================================================*/
create table product
(
   product_id           varchar(20) not null,
   product_name         varchar(40) not null,
   type                 varchar(20) not null,
   producer             varchar(20) ,
   producing_area       varchar(20) ,
   stock                bigint not null,
   primary key (product_id)
);

/*==============================================================*/
/* Table: user                                                  */
/*==============================================================*/
create table user
(
   user_name            varchar(20) ,
   pass_word			varchar(20) not null,
   user_phone           numeric(11,0) ,
   user_mailaddress     varchar(40) not null,
   user_sex             bool,
   birthday             date,
   build_day			timestamp default 0,
   head                 longblob,
   primary key (user_mailaddress)
);

alter table orders add constraint FK_Relationship_1 foreign key (product_id)
      references product (product_id) on delete restrict on update restrict;

alter table orders add constraint FK_Relationship_2 foreign key (user_mailaddress)
      references user (user_mailaddress) on delete restrict on update restrict;

alter table orders add constraint FK_Relationship_3 foreign key (paying_method)
      references payment (paying_method) on delete restrict on update restrict;

