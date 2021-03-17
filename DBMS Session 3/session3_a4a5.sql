SELECT state,city, pincode AS Zipcode FROM address ORDER BY state, city;

CREATE VIEW last_60_orders AS
SELECT p.product_id, p.product_name AS title, p.product_price, c.customer_name, o.order_amount, c.customer_email,o.order_date_time,
o.order_status FROM products p JOIN customer c JOIN orders o ON c.customer_id=o.customer_id WHERE 
DATEDIFF(CURDATE(),o.order_date_time)<=60 ORDER BY (o.order_date_time);

SELECT title FROM last_60_orders where order_status = 'shipped' GROUP BY title;

SELECT title, COUNT(product_id) as total FROM last_60_orders GROUP BY title ORDER BY COUNT(product_id) DESC LIMIT 5;