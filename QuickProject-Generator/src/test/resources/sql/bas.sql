create table T_EVE_EVENT_PROCESS 
(
   ID                   VARCHAR2(50)         not null,
   EVENT_TYPE_ID        VARCHAR2(50),
   PROCESS_SEQ          NUMERIC(2),
   PROCESS_TYPE         VARCHAR2(50),
   CREATE_USER_CODE     VARCHAR2(50),
   CREATE_TIME          TIMESTAMP,
   MODIFY_USER_CODE     VARCHAR2(50),
   MODIFY_TIME          TIMESTAMP,
   STEP_INTERVAL        NUMERIC(8,2),
   STATUS               VARCHAR2(50),
   constraint PK_EVE_EVENT_PROCESS_ID primary key (ID)
);

comment on table T_EVE_EVENT_PROCESS is
'事件处理流程定义';

comment on column T_EVE_EVENT_PROCESS.ID is
'ID';

comment on column T_EVE_EVENT_PROCESS.EVENT_TYPE_ID is
'事件类型ID';

comment on column T_EVE_EVENT_PROCESS.PROCESS_SEQ is
'事件处理步骤';

comment on column T_EVE_EVENT_PROCESS.PROCESS_TYPE is
'处理方式包括:发系统消息,发邮件';

comment on column T_EVE_EVENT_PROCESS.CREATE_USER_CODE is
'创建人';

comment on column T_EVE_EVENT_PROCESS.CREATE_TIME is
'创建时间';

comment on column T_EVE_EVENT_PROCESS.MODIFY_USER_CODE is
'修改人';

comment on column T_EVE_EVENT_PROCESS.MODIFY_TIME is
'修改时间';

comment on column T_EVE_EVENT_PROCESS.STEP_INTERVAL is
'本步骤与上步骤间隔时间(分钟)';

comment on column T_EVE_EVENT_PROCESS.STATUS is
'状态';