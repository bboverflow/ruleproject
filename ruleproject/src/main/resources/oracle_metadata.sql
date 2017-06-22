


CREATE TABLE sys_user
(
id VARCHAR2(36) PRIMARY KEY,
username VARCHAR2(64) NOT NULL,
password VARCHAR2(32) NOT NULL,
locked VARCHAR2(1) NOT NULL
);
COMMENT ON TABLE sys_user IS '系统用户表';
COMMENT ON COLUMN sys_user.id IS '主键UUID';
COMMENT ON COLUMN sys_user.username IS '用户名';
COMMENT ON COLUMN sys_user.id IS '密码';
COMMENT ON COLUMN sys_user.username IS '0--未锁定,1--锁定';



CREATE TABLE sys_role
(
id VARCHAR2(36) PRIMARY KEY,
role_name VARCHAR2(128) NOT NULL,
available VARCHAR2(1) NOT NULL
);
COMMENT ON TABLE sys_role IS '系统角色表';
COMMENT ON COLUMN sys_role.id IS '主键UUID';
COMMENT ON COLUMN sys_role.username IS '角色名';
COMMENT ON COLUMN sys_role.available IS '0--无效,1--有效';


CREATE TABLE sys_user_role
(
id VARCHAR2(36) PRIMARY KEY,
sys_user_id VARCHAR2(36) NOT NULL,
sys_role_id VARCHAR2(36) NOT NULL,
);
COMMENT ON TABLE sys_user_role IS '用户角色关系表';
COMMENT ON COLUMN sys_user_role.id IS '主键UUID';
COMMENT ON COLUMN sys_user_role.sys_user_id IS '用户ID';
COMMENT ON COLUMN sys_user_role.sys_role_id IS '角色ID';


CREATE TABLE sys_permission
(
id NUMBER(20) PRIMARY KEY,
name VARCHAR2(128),
type VARCHAR2(32),
url VARCHAR(32) NOT NULL,
percode VARCHAR2(128) NOT NULL,
parentid NUMBER(20) NOT NULL,
parentids VARCHAR2(128) NOT NULL,
sortstring VARCHAR2(218) ,
available VARCHAR2(1) NOT NULL
);
COMMENT ON TABLE  sys_permission IS '系统权限表';
COMMENT ON COLUMN sys_permission.id IS '主键UUID';
COMMENT ON COLUMN sys_permission.name IS '权限名称';
COMMENT ON COLUMN sys_permission.type IS '权限类型';
COMMENT ON COLUMN sys_permission.url IS '操作url';
COMMENT ON COLUMN sys_permission.percode IS '操作代码';
COMMENT ON COLUMN sys_permission.parentid IS '父节点ID';
COMMENT ON COLUMN sys_permission.parentids IS '完整节点ID';
COMMENT ON COLUMN sys_permission.sortstring IS '顺序';
COMMENT ON COLUMN sys_permission.available IS '0--无效,1--有效';



CREATE TABLE sys_role_permission
(
id VARCHAR2(36) PRIMARY KEY,
sys_role_id VARCHAR(36) NOT NULL,
sys_permission_id NUMBER(20) NOT NULL
);
COMMENT ON TABLE  sys_role_permission IS '角色权限关系表';
COMMENT ON COLUMN sys_role_permission.id IS '主键UUID';
COMMENT ON COLUMN sys_role_permission.sys_role_id IS '角色ID';
COMMENT ON COLUMN sys_role_permission.sys_permission_id IS '权限ID';
