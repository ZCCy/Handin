CREATE TABLE `user` (
                        `id` int(32) NOT NULL AUTO_INCREMENT,
                        `user_name` varchar(32) NOT NULL,
                        `user_password` varchar(64) NOT NULL,
                        `user_display_name` varchar(32) NOT NULL,
                        'user_email' varchar(64) DEFAULT NULL,
                        PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

create TABLE 'list_role'(
    `id` INTEGER(32) NOT NULL AUTO_INCREMENT,
    'role' varchar(16) NOT NULL ,
    'description' varchar(64) NOT NULL ,
    PRIMARY KEY ('id')
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

CREATE TABLE 'list_permission' (
    'id' INTEGER(32) NOT NULL AUTO_INCREMENT,

)