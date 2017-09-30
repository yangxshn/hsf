/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2017\9\30 ÐÇÆÚÁù 10:22:11                       */
/*==============================================================*/


drop table if exists user;

/*==============================================================*/
/* Table: user                                                  */
/*==============================================================*/
create table user
(
   id                   char(32) not null,
   nickname             varchar(255) not null,
   password             varchar(255) not null,
   name                 varchar(16),
   email                varchar(255),
   phone                char(11),
   primary key (id)
);

