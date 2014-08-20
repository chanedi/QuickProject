create table T_FAC_MAINTAIN_RECORD_ITEM
(
   ID                   VARCHAR2(50)         not null,
   ITEM_ID              VARCHAR2(50),
   RECORD_ID            VARCHAR2(50),
   VALUE                NUMERIC(10, 2),
   IS_PASSED            CHAR(1)              default '0',
   REMARKS              VARCHAR2(1000),
   INTVALUE                 NUMERIC(10),
   CREATE_TIME          TIMESTAMP            not null,
   CREATE_USER_CODE     VARCHAR2(50),
   MODIFY_TIME          TIMESTAMP            not null,
   MODIFY_USER_CODE     VARCHAR2(50),
   constraint PK_T_FAC_MAINTAIN_RECORD_ITEM primary key (ID)
);

comment on table T_FAC_MAINTAIN_RECORD_ITEM is
'维护记录项';

comment on column T_FAC_MAINTAIN_RECORD_ITEM.ID is
'ID';

comment on column T_FAC_MAINTAIN_RECORD_ITEM.ITEM_ID is
'点检项目';

comment on column T_FAC_MAINTAIN_RECORD_ITEM.RECORD_ID is
'点检表';

comment on column T_FAC_MAINTAIN_RECORD_ITEM.VALUE is
'测量值';

comment on column T_FAC_MAINTAIN_RECORD_ITEM.IS_PASSED is
'是否通过检查';

comment on column T_FAC_MAINTAIN_RECORD_ITEM.REMARKS is
'备注';

comment on column T_FAC_MAINTAIN_RECORD_ITEM.CREATE_TIME is
'创建时间';

comment on column T_FAC_MAINTAIN_RECORD_ITEM.CREATE_USER_CODE is
'创建人';

comment on column T_FAC_MAINTAIN_RECORD_ITEM.MODIFY_TIME is
'修改时间';

comment on column T_FAC_MAINTAIN_RECORD_ITEM.MODIFY_USER_CODE is
'修改人';