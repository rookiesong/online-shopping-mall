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

drop table if exists cart;

drop table if exists deliveryAddress;

drop table if exists paymentRecord;

set character_set_results=utf8;

/*==============================================================*/
/* Table: "orders"                                               */
/*==============================================================*/
create table orders
(
   orders_id            varchar(60) not null,
   paying_method        varchar(20),
   product_id           varchar(20),
   user_mailaddress     varchar(40),
   number               int not null,
   price				int not null,
   status				varchar(20) not null,
   product_name			varchar(40) not null,
   address        		varchar(200),
   user_phone           varchar(20),
   name					varchar(20),
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
   type                 varchar(20) ,
   producer             varchar(20) ,
   producing_area       varchar(20) ,
   stock                bigint not null,
   sales_volume			int not null,
   price				int not null,
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

/*==============================================================*/
/* Table: cart                                                  */
/*==============================================================*/
create table cart
(
  cart_id				varchar(60) not null,
  num_product			int NOT NULL ,
  user_mailaddress     varchar(40) NOT NULL ,
  product_id           varchar(20) not null,
  primary key (cart_id)
);
/*==============================================================*/
/* Table: deliveryAddress                                       */
/*==============================================================*/
create table deliveryAddress
(
   id   				int not null AUTO_INCREMENT,
   address        		varchar(200) not null,
   user_mailaddress		varchar(40) not null,
   user_phone           varchar(20) not null,
   name					varchar(20) not null,
   primary key (id)
);
alter table deliveryAddress  auto_increment = 1;

/*==============================================================*/
/* Table: paymentRecord                                         */
/*==============================================================*/
create table paymentRecord
(
	record_id			 varchar(80) not null,
	orders_id            varchar(60) not null,
	paying_method        varchar(20) not null,
	amount				 int not null,
	build_day			 varchar(30),
	primary key (record_id,orders_id,build_day)
);

alter table orders add constraint FK_Relationship_1 foreign key (product_id)
      references product (product_id) on delete restrict on update restrict;

alter table orders add constraint FK_Relationship_2 foreign key (user_mailaddress)
      references user (user_mailaddress) on delete restrict on update restrict;

alter table orders add constraint FK_Relationship_3 foreign key (paying_method)
      references payment (paying_method) on delete restrict on update restrict;

alter table cart add constraint FK_Relationship_4 foreign key (user_mailaddress)
      references user (user_mailaddress) on delete restrict on update restrict;

alter table cart add constraint FK_Relationship_5 foreign key (product_id)
      references product (product_id) on delete restrict on update restrict;

alter table deliveryAddress add constraint FK_Relationship_6 foreign key (user_mailaddress)
      references user (user_mailaddress) on delete restrict on update restrict;
	  
alter table paymentRecord add constraint FK_Relationship_7 foreign key (paying_method)
      references payment (paying_method) on delete restrict on update restrict;