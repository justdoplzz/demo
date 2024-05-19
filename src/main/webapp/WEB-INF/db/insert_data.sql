INSERT INTO t_board (board_idx, title, contents, hit_cnt, creator_id, created_datetime, update_id, updated_datetime, deleted_yn)
VALUES
(1, 'First Post', 'This is the contents of the first post.', 0, 'admin', '2024-01-01 10:00:00', NULL, NULL, 'N'),
(2, 'Second Post', 'This is the contents of the second post.', 0, 'admin', '2024-01-02 11:00:00', NULL, NULL, 'N'),
(3, 'Third Post', 'This is the contents of the third post.', 0, 'user1', '2024-01-03 12:00:00', NULL, NULL, 'N'),
(4, 'Fourth Post', 'This is the contents of the fourth post.', 0, 'user2', '2024-01-04 13:00:00', NULL, NULL, 'N'),
(5, 'Fifth Post', 'This is the contents of the fifth post.', 0, 'user3', '2024-01-05 14:00:00', NULL, NULL, 'N');


INSERT INTO t_board (title, contents, creator_id, created_datetime)
VALUES
('First Post', 'This is the contents of the first post.', 'admin', '2024-01-01 10:00:00'),
('Second Post', 'This is the contents of the second post.', 'admin', '2024-01-02 11:00:00'),
('Third Post', 'This is the contents of the third post.', 'user1', '2024-01-03 12:00:00'),
('Fourth Post', 'This is the contents of the fourth post.', 'user2', '2024-01-04 13:00:00'),
('Fifth Post', 'This is the contents of the fifth post.', 'user3', '2024-01-05 14:00:00');
