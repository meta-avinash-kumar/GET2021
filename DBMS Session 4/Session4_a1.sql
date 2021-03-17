DROP FUNCTION IF EXISTS countOrders;
DELIMITER //
CREATE FUNCTION countOrders(inMonthYear DATE) RETURNS int DETERMINISTIC
BEGIN
    RETURN (SELECT count(order_id) FROM orders where MONTH(order_date_time)=MONTH(inMonthYear) and
        YEAR(order_date_time)=YEAR(inMonthYear));
END //

DELIMITER ;
SELECT countOrders(CURDATE());

DROP FUNCTION IF EXISTS maxOrderMonth;

DELIMITER //
CREATE FUNCTION maxOrderMonth(inMonthYear DATE) RETURNS int DETERMINISTIC
BEGIN
    
    RETURN (SELECT order_month FROM (SELECT count(order_id) AS order_count,
    MONTH(order_date_time) AS order_month FROM orders where YEAR(order_date_time)=YEAR(inMonthYear) 
    GROUP BY month(order_date_time) ORDER BY order_date_time DESC) AS X  LIMIT 1);
END //

DELIMITER ;

SELECT maxOrderMonth(CURDATE());