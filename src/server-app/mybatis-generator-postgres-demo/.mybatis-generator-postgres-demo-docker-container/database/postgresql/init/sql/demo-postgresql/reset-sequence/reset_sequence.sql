SELECT pg_catalog.setval(pg_get_serial_sequence('tbl_company', 'company_id'), (SELECT MAX(company_id) FROM tbl_company) + 1);
SELECT pg_catalog.setval(pg_get_serial_sequence('tbl_user', 'user_id'), (SELECT MAX(user_id) FROM tbl_user) + 1);
