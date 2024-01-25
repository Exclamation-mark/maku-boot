CREATE SEQUENCE pur_ass_id_seq;
ALTER SEQUENCE pur_ass_id_seq RESTART WITH (SELECT MAX(id) FROM purchase);

commit;