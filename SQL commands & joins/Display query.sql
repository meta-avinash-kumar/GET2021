SELECT p.product_id, p.product_name,category.category_name, p.product_price from products p join category where status = 'active' order by product_date DESC;

SELECT p.product_name from products p join image where image.img IS NULL;

SELECT sc.subcategory_id, sc.subcategory_name,category.category_name from subcategory sc join category order by category_name, sc.subcategory_name;

SELECT sc.subcategory_id, sc.subcategory_name from subcategory sc;

SELECT p.product_name, p.product_price, p.product_description from products p join subcategory sc 
where sc.subcategory_name = 'mobile';

SELECT product_name, stock from products where stock < 50;

SELECT order_id, order_date_time, order_amount from orders order by order_date_time desc LIMIT 50;

SELECT order_id, order_date_time, order_amount from orders order by order_amount desc LIMIT 10;

SELECT order_id, order_date_time, order_amount from orders where order_status = 'not Shipped' and 
CURDATE()-order_date_time>=10;

SELECT c.customer_id, c.customer_name from customer c join orders o ON c.customer_id=o.customer_id 
where c.customer_id NOT IN (SELECT c.customer_id from customer c join orders o where
c.customer_id=o.customer_id and CURDATE()-o.order_date_time<=31);

SELECT c.customer_id, c.customer_name from customer c join orders o ON c.customer_id=o.customer_id 
where CURDATE()-o.order_date_time<15;

SELECT order_id, order_date_time, order_status from orders where order_status = 'Shipped';

SELECT order_id, order_date_time, order_amount from orders where order_amount >=20 and order_amount<=50;
