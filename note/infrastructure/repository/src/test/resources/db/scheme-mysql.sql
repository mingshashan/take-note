create table note_article
(
    `id`                VARCHAR(64)  NOT NULL COMMENT 'ID',
    `name`              VARCHAR(128) NOT NULL COMMENT '文章名',
    `title`             VARCHAR(128) NOT NULL COMMENT '文章标题',
    `back_ground_image` VARCHAR(258) NOT NULL COMMENT '文章标题',
    `content`           TEXT         NOT NULL COMMENT '文章内容',
    `category`          VARCHAR(258) NOT NULL COMMENT '文章所属目录',
    `tags`              VARCHAR(258) NOT NULL COMMENT '文章标签',
    `gmt_create`        timestamp(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6) COMMENT '创建时间',
    `gmt_modified`      timestamp(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6) COMMENT '修改时间',
    `creator`           varchar(32)           DEFAULT NULL COMMENT '创建人',
    `modifier`          varchar(32)           DEFAULT NULL COMMENT '修改人',
    `is_valid`          tinyint(4) DEFAULT NULL COMMENT '有效标识',
    PRIMARY KEY (`id`)
) COMMENT = '文章表'
;
CREATE
INDEX note_article_name ON note_article (name);
