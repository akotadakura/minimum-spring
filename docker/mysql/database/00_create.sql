DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`(
    `id`            INT(20)     NOT NULL    AUTO_INCREMENT,
    `name`          VARCHAR(50) NOT NULL,
    `created_at`    DATETIME    NOT NULL    DEFAULT now(),
    `updated_at`    DATETIME,
    PRIMARY KEY(id)
);