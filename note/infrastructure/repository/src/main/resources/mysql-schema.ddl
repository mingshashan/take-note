create table note_category(
    id BIGINT(20) NOT NULL COMMENT '主键ID',
    name VARCHAR(255) NOT NULL COMMENT 'category name',
    -- 通用字段
    gmt_create timestamp(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6) COMMENT '创建时间',
    gmt_modified timestamp(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6) COMMENT '修改时间',
    creator varchar(32) DEFAULT NULL COMMENT '创建人',
    modifier varchar(32) DEFAULT NULL COMMENT '修改人',
    is_valid tinyint(4) DEFAULT NULL COMMENT '有效标识',
    tenant_code varchar(32) DEFAULT NULL COMMENT '租户代码',
  	PRIMARY KEY (`id`),
  	KEY `idx_category_name` (`name`)
)COMMENT = 'category table';