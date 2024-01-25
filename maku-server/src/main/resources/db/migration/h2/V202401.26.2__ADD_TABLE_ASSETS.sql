INSERT INTO sys_menu (id, pid, name, url, authority, type, open_style, icon, sort, version, deleted, creator,
                      create_time, updater, update_time)
VALUES (1007, 1002, '资产概览', 'ass/check/overview', 'ass:check:overview', 0, 0, 'icon-barchart', -1, 0, 0, 10000, now(), 10000,
        now());

CREATE TABLE purchase (
                          id INT PRIMARY KEY COMMENT '采购单ID',
                          version INT COMMENT '版本号',
                          deleted INT COMMENT '删除标志',
                          creator INT COMMENT '创建者ID',
                          create_time TIMESTAMP COMMENT '创建时间',
                          updater INT COMMENT '更新者ID',
                          update_time TIMESTAMP COMMENT '更新时间',
                          item_name VARCHAR(255) COMMENT '采购物品名称',
                          quantity INT COMMENT '数量',
                          unit_price DECIMAL(10, 2) COMMENT '单价',
                          total_price DECIMAL(10, 2) COMMENT '总价',
                          note TEXT COMMENT '备注',
                          manufacturer VARCHAR(255) COMMENT '厂家',
                          purchase_reason TEXT COMMENT '采购理由',
                          category VARCHAR(50) COMMENT '类目',
                          status VARCHAR(20) COMMENT '采购状态',
                          approval_status VARCHAR(20) COMMENT '审批状态',
                          approval_comment TEXT COMMENT '审批备注'
);

COMMENT ON TABLE purchase IS '采购表，记录采购信息';

COMMENT ON COLUMN purchase.id IS '采购单ID';
COMMENT ON COLUMN purchase.version IS '版本号';
COMMENT ON COLUMN purchase.deleted IS '删除标志';
COMMENT ON COLUMN purchase.creator IS '创建者ID';
COMMENT ON COLUMN purchase.create_time IS '创建时间';
COMMENT ON COLUMN purchase.updater IS '更新者ID';
COMMENT ON COLUMN purchase.update_time IS '更新时间';
COMMENT ON COLUMN purchase.item_name IS '采购物品名称';
COMMENT ON COLUMN purchase.quantity IS '数量';
COMMENT ON COLUMN purchase.unit_price IS '单价';
COMMENT ON COLUMN purchase.total_price IS '总价';
COMMENT ON COLUMN purchase.note IS '备注';
COMMENT ON COLUMN purchase.manufacturer IS '厂家';
COMMENT ON COLUMN purchase.purchase_reason IS '采购理由';
COMMENT ON COLUMN purchase.category IS '类目';
COMMENT ON COLUMN purchase.status IS '采购状态';
COMMENT ON COLUMN purchase.approval_status IS '审批状态';
COMMENT ON COLUMN purchase.approval_comment IS '审批备注';
