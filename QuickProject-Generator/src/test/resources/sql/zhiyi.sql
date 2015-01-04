/*==============================================================*/
/* Table: TB_COMPANY                                            */
/*==============================================================*/
create table TB_COMPANY
(
   ID                   varchar(50) not null,
   NAME                 varchar(100) not null comment '名称',
   ADDRESS              varchar(100) comment '地址',
   DESCRIPTION          varchar(1000) comment '描述',
   TEL                  varchar(20) comment '联系电话',
   LINKMAN              varchar(30) comment '联系人',
   OPERATOR             varchar(30),
   CREATE_TIME          datetime,
   MODIFY_TIME          datetime,
   primary key (ID)
);

alter table TB_COMPANY comment '企业';