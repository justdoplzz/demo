CREATE TABLE t_board (
    board_idx INT PRIMARY KEY AUTO_INCREMENT,
    title VARCHAR(255) NOT NULL,
    contents TEXT,
    hit_cnt INT DEFAULT 0,
    creator_id VARCHAR(50) NOT NULL,
    created_datetime DATETIME NOT NULL,
    update_id VARCHAR(50),
    updated_datetime DATETIME,
    deleted_yn CHAR(1) DEFAULT 'N'
);
