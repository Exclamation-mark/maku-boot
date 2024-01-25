INSERT INTO sys_menu (id, pid, name, url, authority, type, open_style, icon, sort, version, deleted, creator, create_time,
                      updater, update_time)
VALUES (1002, 0, '资产管理', '', '', 0, 0, 'icon-insertrowbelow', 0, 0, 0, 10000, now(), 10000, now());

INSERT INTO sys_menu (id, pid, name, url, authority, type, open_style, icon, sort, version, deleted, creator,
                      create_time, updater, update_time)
VALUES (1003, 1002, '资产初审', 'ass/check/first', 'ass:check:first', 0, 0, 'icon-message-fill', 1, 0, 0, 10000, now(), 10000,
        now());

INSERT INTO sys_menu (id, pid, name, url, authority, type, open_style, icon, sort, version, deleted, creator,
                      create_time, updater, update_time)
VALUES (1004, 1002, '资产列表', 'ass/check/list', 'ass:check:list', 0, 0, 'icon-project', 0, 0, 0, 10000, now(), 10000,
        now());

INSERT INTO sys_menu (id, pid, name, url, authority, type, open_style, icon, sort, version, deleted, creator,
                      create_time, updater, update_time)
VALUES (1005, 1002, '资产复审', 'ass/check/second', 'ass:check:second', 0, 0, 'icon-formatpainter', 2, 0, 0, 10000, now(), 10000,
        now());

INSERT INTO sys_menu (id, pid, name, url, authority, type, open_style, icon, sort, version, deleted, creator,
                      create_time, updater, update_time)
VALUES (1006, 1002, '资产审核', 'ass/check/all', 'ass:check:all', 0, 0, 'icon-minus-square-fill', 3, 0, 0, 10000, now(), 10000,
        now());

