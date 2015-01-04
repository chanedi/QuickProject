/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2015/1/4 15:10:05                            */
/*==============================================================*/


/*==============================================================*/
/* Table: TB_BATCH                                              */
/*==============================================================*/
create table TB_BATCH
(
   ID                   varchar(50) not null,
   COMPANY_ID           varchar(50) not null,
   CONTRACT_ID          varchar(50) not null,
   EXP_BEGIN_TIME       datetime comment '预计开始时间',
   EXP_END_TIME         datetime comment '预计结束时间',
   STATUS               varchar(20) not null comment '状态',
   OPERATOR             varchar(30),
   CREATE_TIME          datetime,
   MODIFY_TIME          datetime,
   primary key (ID)
);

alter table TB_BATCH comment '批次';

/*==============================================================*/
/* Table: TB_COMMENT                                            */
/*==============================================================*/
create table TB_COMMENT
(
   ID                   varchar(50) not null,
   MASSAGE_ID           varchar(50) not null,
   CUSTOMER_ID          varchar(50) not null,
   PRO_DEGREE           tinyint(2) comment '专业度',
   ATTITUDE_DEGREE      tinyint(2) comment '服务态度',
   EVALUATION           varchar(1000) comment '评价',
   OPERATOR             varchar(30),
   CREATE_TIME          datetime,
   MODIFY_TIME          datetime,
   primary key (ID)
);

alter table TB_COMMENT comment '客户评价';

/*==============================================================*/
/* Table: TB_COMPANY                                            */
/*==============================================================*/
create table TB_COMPANY
(
   ID                   varchar(50) not null,
   NAME                 varchar(100) not null comment '名称',
   ADDRESS              varchar(100) comment '地址',
   DESCRIPTION          varchar(500) comment '描述',
   TEL                  varchar(20) comment '联系电话',
   LINKMAN              varchar(30) comment '联系人',
   OPERATOR             varchar(30),
   CREATE_TIME          datetime,
   MODIFY_TIME          datetime,
   primary key (ID)
);

alter table TB_COMPANY comment '企业';

/*==============================================================*/
/* Table: TB_CONTRACT                                           */
/*==============================================================*/
create table TB_CONTRACT
(
   ID                   varchar(50) not null,
   COMPANY_ID           varchar(50),
   BEGIN_TIME           datetime comment '生效日期',
   END_TIME             datetime comment '结束日期',
   STATUS               varchar(20) not null comment '状态',
   TRIGGER_RULE         varchar(100) comment '触发规则',
   OPERATOR             varchar(30),
   CREATE_TIME          datetime,
   MODIFY_TIME          datetime,
   primary key (ID)
);

alter table TB_CONTRACT comment '合同
';

/*==============================================================*/
/* Table: TB_CUSTOMER                                           */
/*==============================================================*/
create table TB_CUSTOMER
(
   ID                   varchar(50) not null,
   COMPANY_ID           varchar(50),
   NAME                 varchar(30) comment '姓名',
   GENDER               varchar(20) comment '性别',
   TEL                  varchar(20) comment '手机',
   WECHAT_NO            varchar(50) comment '微信号',
   OPERATOR             varchar(30),
   CREATE_TIME          datetime,
   MODIFY_TIME          datetime,
   primary key (ID)
);

alter table TB_CUSTOMER comment '客户';

/*==============================================================*/
/* Table: TB_HEALTH_HISTORY                                     */
/*==============================================================*/
create table TB_HEALTH_HISTORY
(
   ID                   varchar(50) not null,
   CUSTOMER_ID          varchar(50),
   RECORD_ID            varchar(50),
   MASSAGE_ID           varchar(50) not null,
   HISTORY              varchar(1000) comment '记录',
   OPERATOR             varchar(30),
   CREATE_TIME          datetime,
   MODIFY_TIME          datetime,
   primary key (ID)
);

alter table TB_HEALTH_HISTORY comment '客户理疗记录';

/*==============================================================*/
/* Table: TB_MASSAGE                                            */
/*==============================================================*/
create table TB_MASSAGE
(
   ID                   varchar(50) not null,
   NAME                 varchar(30) comment '姓名',
   GENDER               varchar(20) comment '性别',
   TEL                  varchar(20) comment '手机',
   SKILL_LEVEL          tinyint(2) comment '技能等级',
   CITY                 varchar(20) comment '城市',
   HEAD_PATH            varchar(100) comment '头像路径',
   OPERATOR             varchar(30),
   CREATE_TIME          datetime,
   MODIFY_TIME          datetime,
   primary key (ID)
);

alter table TB_MASSAGE comment '技师';

/*==============================================================*/
/* Table: TB_MASSAGE_BATCH                                      */
/*==============================================================*/
create table TB_MASSAGE_BATCH
(
   ID                   varchar(50) not null,
   MASSAGE_ID           varchar(50) not null,
   BATCH_ID             varchar(50) not null,
   primary key (ID)
);

alter table TB_MASSAGE_BATCH comment '技师订单关联表';

/*==============================================================*/
/* Table: TB_ORDER                                              */
/*==============================================================*/
create table TB_ORDER
(
   ID                   varchar(50) not null,
   BATCH_ID             varchar(50) not null,
   CUSTOMER_ID          varchar(50) not null,
   MASSAGE_ID           varchar(50) not null,
   EXPECTED_TIME        datetime comment '预计服务时间',
   ACTUAL_BEGIN_TIME    datetime comment '实际服务开始时间',
   ACTUAL_END_TIME2     datetime comment '实际服务结束时间',
   STATUS               varchar(20) not null comment '状态',
   OPERATOR             varchar(30),
   CREATE_TIME          datetime,
   MODIFY_TIME          datetime,
   primary key (ID)
);

alter table TB_ORDER comment '订单';

