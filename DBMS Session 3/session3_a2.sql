SELECT c.customer_id, c.customer_name, c.customer_mobile, c.customer_email FROM customer c
join orders o ON c.customer_id=o.customer_id GROUP BY c.customer_id;

SELECT c.customer_id, c.customer_name, c.customer_mobile, c.customer_email FROM customer c
join orders o ON c.customer_id=o.customer_id WHERE DATEDIFF(CURDATE(),o.order_date_time)<=30
GROUP BY o.customer_id ORDER BY COUNT(o.order_id) DESC LIMIT 10;

SELECT p.product_name, COUNT(p.product_id) AS order_count FROM products p join orders o ON 
p.product_id=o.product_id WHERE DATEDIFF(CURDATE(),o.order_date_time)<=60 GROUP BY o.product_id 
ORDER BY count(o.product_id) DESC LIMIT 20;;

SELECT MONTH(order_date_time) as Month ,SUM(order_amount) FROM Orders WHERE
MONTH(CURDATE())-MONTH(order_date_time)<=6 GROUP BY MONTH(order_date_time);

SET SQL_SAFE_UPDATES=0;

UPDATE Products p set p.status='inactive' WHERE p.status='active' AND p.product_id NOT IN 
(SELECT o.product_id FROM orders o WHERE DATEDIFF(CURDATE(),o.order_date_time)<=90);

SELECT p.product_name FROM products p join category c WHERE c.category_name='electronics';

SELECT p.product_name FROM products p join orders o WHERE o.order_status='cancelled' GROUP BY
p.product_name ORDER BY count(p.product_id) DESC LIMIT 10;;
