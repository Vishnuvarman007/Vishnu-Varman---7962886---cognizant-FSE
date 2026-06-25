SET SERVEROUTPUT ON;

BEGIN
    FOR rec IN (
        SELECT customer_id
        FROM customers
        WHERE balance > 10000
    ) LOOP

UPDATE customers
SET isvip = 'TRUE'
WHERE customer_id = rec.customer_id;

DBMS_OUTPUT.PUT_LINE(
            'VIP status granted to Customer ID ' ||
            rec.customer_id
        );

END LOOP;

COMMIT;
END;
/