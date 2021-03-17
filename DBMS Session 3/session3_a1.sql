SELECT p.product_id, p.product_name,count(p.product_id) FROM products p join category c on
c.product_id=p.product_id having count(c.product_id)>1;

SELECT count(product_id) as total FROM Products WHERE Price BETWEEN 0 AND 100;
SELECT count(product_id) as total FROM Products WHERE Price BETWEEN 100 AND 500;
SELECT count(product_id) as total FROM Products WHERE Price>500;

SELECT category_name, count(p.category_id) as total FROM category c join products p on 
p.category_id=c.category_id GROUP BY c.category_id;