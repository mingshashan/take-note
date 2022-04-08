create table note_article
(
    id                VARCHAR(64)  NOT NULL,
    name              VARCHAR(128) NOT NULL,
    title             VARCHAR(128) NOT NULL,
    back_ground_image VARCHAR(258) NOT NULL,
    content           TEXT         NOT NULL,
    category          VARCHAR(258) NOT NULL,
    tags              VARCHAR(258) NOT NULL,
    gmt_create        timestamp(6) NOT NULL DEFAULT CURRENT_TIMESTAMP,
    gmt_modified      timestamp(6) NOT NULL DEFAULT CURRENT_TIMESTAMP,
    creator           varchar(32)           DEFAULT NULL,
    modifier          varchar(32)           DEFAULT NULL,
    is_valid          tinyint(4) DEFAULT NULL COMMENT,
    PRIMARY KEY (id)
);
CREATE
INDEX note_article_name ON note_article (name);
comment on table note_article is '文章表';

comment on column note_article.id                   is 'ID';
comment on column note_article.name                 is '文章名';
comment on column note_article.title                is '文章标题';
comment on column note_article.back_ground_image    is '文章标题';
comment on column note_article.content              is '文章内容';
comment on column note_article.category             is '文章所属目录';
comment on column note_article.tags                 is '文章标签';
comment on column note_article.gmt_create           is '创建时间';
comment on column note_article.gmt_modified         is '修改时间';
comment on column note_article.creator              is '创建人';
comment on column note_article.modifier             is '修改人';
comment on column note_article.is_valid             is '有效标识';