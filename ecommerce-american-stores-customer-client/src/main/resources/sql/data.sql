insert into customer (customer_id, name, email, username, created_at, mobile_phone)
SELECT * FROM (SELECT 1, 'Messi Soares','messi@admin.com','admin',SYSDATE(),'11 96464-7854') AS tmp
WHERE NOT EXISTS (
    SELECT username FROM customer WHERE username = 'admin'
) LIMIT 1;

commit;