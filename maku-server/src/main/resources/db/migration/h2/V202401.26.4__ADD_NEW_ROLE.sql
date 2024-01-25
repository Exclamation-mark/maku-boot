INSERT INTO sys_org (pid, name, sort, creator, create_time, updater, update_time, version, deleted)
VALUES
    (1, '总务处', 0, 10000, now(), 10000, now(), 0, 0),
    (1, '德育处', 1, 10000, now(), 10000, now(), 0, 0),
    (1, '教导处', 2, 10000, now(), 10000, now(), 0, 0),
    (1, '信息中心', 3, 10000, now(), 10000, now(), 0, 0),
    (1, '办公室', 4, 10000, now(), 10000, now(), 0, 0),
    (1, '西校区', 5, 10000, now(), 10000, now(), 0, 0);


-- 插入数据到 sys_role 表
INSERT INTO sys_role (
    name, role_code, remark, data_scope, org_id, creator, create_time, updater, update_time, version, deleted
) VALUES (
             '副校长', 'fuxiaozhang', '', 3, NULL, 10000, '2024-01-26 05:45:58.345', 10000, '2024-01-26 05:45:58.345', 0, 0
         );

-- 插入数据到 sys_role_menu 表
INSERT INTO sys_role_menu (role_id, menu_id, creator, create_time, updater, update_time, version, deleted)
VALUES
    (1, 1002, 10000, '2024-01-26 05:45:58.36', 10000, '2024-01-26 05:45:58.36', 0, 0),
    (1, 1007, 10000, '2024-01-26 05:45:58.361', 10000, '2024-01-26 05:45:58.361', 0, 0),
    (1, 1004, 10000, '2024-01-26 05:45:58.363', 10000, '2024-01-26 05:45:58.363', 0, 0),
    (1, 1006, 10000, '2024-01-26 05:45:58.364', 10000, '2024-01-26 05:45:58.364', 0, 0);


INSERT INTO sys_role (
    name, role_code, remark, data_scope, org_id, creator, create_time, updater, update_time, version, deleted
) VALUES (
             '教师', 'jiaoshi', '', 3, NULL, 10000, NOW(), 10000, NOW(), 0, 0
         );


-- 插入数据到 sys_role_menu 表
INSERT INTO sys_role_menu (role_id, menu_id, creator, create_time, updater, update_time, version, deleted)
VALUES
    (2, 1002, 10000, NOW(), 10000, NOW(), 0, 0),
    (2, 1007, 10000, NOW(), 10000, NOW(), 0, 0),
    (2, 1003, 10000, NOW(), 10000, NOW(), 0, 0),
    (2, 1005, 10000, NOW(), 10000, NOW(), 0, 0);

INSERT INTO sys_user (
    username, password, real_name, gender, email, mobile, org_id, super_admin,
    status, creator, create_time, updater, update_time, version, deleted
) VALUES (
             'liming', '{bcrypt}$2a$10$CICe8umZ.CRiSMAu/QCRTuVAa/Z.mdJldP0ve2nLGl.vHh7tvDt1a',
             '李明', 0, '', '13475518111', 2, 0, 1, 10000, CURRENT_TIMESTAMP(),
             10000, CURRENT_TIMESTAMP(), 0, 0
         );

-- 插入数据到 sys_user_role 表
INSERT INTO sys_user_role (role_id, user_id, creator, create_time, updater, update_time, version, deleted)
VALUES
    (2, 1, 10000, CURRENT_TIMESTAMP(), 10000, CURRENT_TIMESTAMP(), 0, 0);

-- 插入数据到 sys_user 表
INSERT INTO sys_user (
    username, password, real_name, gender, email, mobile, org_id, super_admin,
    status, creator, create_time, updater, update_time, version, deleted
) VALUES (
             'zhang', '{bcrypt}$2a$10$txPMULf29TG3CKbvv0ifPuDqAA5s2NiJ3CDToxQirRpoRJcbD5PR6',
             '张校长', 0, '', '13475567231', 2, 0, 1, 10000, CURRENT_TIMESTAMP(),
             10000, CURRENT_TIMESTAMP(), 0, 0
         );

-- 插入数据到 sys_user_role 表
INSERT INTO sys_user_role (role_id, user_id, creator, create_time, updater, update_time, version, deleted)
VALUES
    (1, 2, 10000, CURRENT_TIMESTAMP(), 10000, CURRENT_TIMESTAMP(), 0, 0);
