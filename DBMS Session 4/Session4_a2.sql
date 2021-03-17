DROP PROCEDURE IF EXISTS  avgSalesForMonth;

DELIMITER /

CREATE PROCEDURE avgSalesForMonth(inMonth int, inyear int)
BEGIN
    
    select p.product_id, p.product_name, o.order_date_time, sum(o.order_amount), avg(o.order_amount) from orders o join products p on
    o.product_id = p.product_id where month(o.order_date_time)=inMonth and year(o.order_date_time) = inYear
    group by p.product_id;
    
END/

DELIMITER ;

call avgSalesForMonth(03, 2021);


DROP PROCEDURE IF EXISTS  ordersInRange;

DELIMITER /

CREATE PROCEDURE ordersInRange(startDate DATE, endDate DATE)
BEGIN
    
    select order_id, order_status, order_date_time from orders where order_date_time
    BETWEEN startDate AND endDate group by order_id;
    
END/

DELIMITER ;

call ordersInRange('2021-01-16', CURDATE());

