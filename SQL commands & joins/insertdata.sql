INSERT INTO Admin (admin_username,admin_pw) VALUES ('Avinash',MD5('pass'));

INSERT INTO customer (customer_name, customer_mobile, customer_email, customer_pswd) VALUES ('Abhi','9999244567','abh@gmail.com', MD5(MD5('pass')));
INSERT INTO customer (customer_name, customer_mobile, customer_email, customer_pswd) VALUES ('Avi','9999244567','avi@gmail.com',MD5('pass'));
INSERT INTO customer (customer_name, customer_mobile, customer_email, customer_pswd) VALUES ('Adi','9999244567','adi@gmail.com',MD5('pass'));
INSERT INTO customer (customer_name, customer_mobile, customer_email, customer_pswd) VALUES ('Arun','9999244567','arun@gmail.com',MD5('pass'));
INSERT INTO customer (customer_name, customer_mobile, customer_email, customer_pswd) VALUES ('Veena','9999244567','veena@gmail.com',MD5('pass'));
INSERT INTO customer (customer_name, customer_mobile, customer_email, customer_pswd) VALUES ('Vamika','9999244567','vam@gmail.com',MD5('pass'));

INSERT INTO category (category_name,product_id) VALUES ('Grocery',1);
INSERT INTO category (category_name,product_id) VALUES ('Life Style',2);
INSERT INTO category (category_name,product_id) VALUES ('Electronics',3);
INSERT INTO category (category_name,product_id) VALUES ('Furniture',4);
INSERT INTO category (category_name,product_id) VALUES ('Automotive',5);

INSERT INTO subcategory (subcategory_name,product_id) VALUES ('Wheat',1);
INSERT INTO subcategory (subcategory_name,product_id) VALUES ('Jeans',2);
INSERT INTO subcategory (subcategory_name,product_id) VALUES ('Mobile',3);
INSERT INTO subcategory (subcategory_name,product_id) VALUES ('Chair',4);
INSERT INTO subcategory (subcategory_name,product_id) VALUES ('laptop',5);

INSERT INTO image (product_id) VALUES (1);
INSERT INTO image (product_id) VALUES (2);
INSERT INTO image (product_id) VALUES (3);
INSERT INTO image (product_id) VALUES (4);
INSERT INTO image (product_id) VALUES (5);

INSERT INTO products (product_name, product_description, status, product_date, category_id, product_price,stock, img_id) VALUES ('Abc','Description','active',NOW(),1, 200,10,1);
INSERT INTO products (product_name, product_description, status, product_date, category_id, product_price,stock, img_id) VALUES ('snjb','Description','inactive',NOW(),2,245,17,2);
INSERT INTO products (product_name, product_description, status, product_date, category_id, product_price,stock, img_id) VALUES ('jsja','Description','active',NOW(),2,341,20,5);
INSERT INTO products (product_name, product_description, status, product_date, category_id, product_price,stock, img_id) VALUES ('yhak','Description','active',NOW(),4,444,40,3);
INSERT INTO products (product_name, product_description, status, product_date, category_id, product_price,stock, img_id) VALUES ('jnal','Description','active',NOW(),4,500,50,4);
INSERT INTO products (product_name, product_description, status, product_date, category_id, product_price,stock, img_id) VALUES ('oMLW','Description','active',NOW(),3,199,100,4);

INSERT INTO payment(order_id, payment_method,payment_amount, payment_date) VALUES (1,'UPI',249,NOW());
INSERT INTO payment(order_id, payment_method,payment_amount, payment_date) VALUES (2,'UPI',249,NOW());
INSERT INTO payment(order_id, payment_method,payment_amount, payment_date) VALUES (3,'card',249,NOW());
INSERT INTO payment(order_id, payment_method,payment_amount, payment_date) VALUES (4,'UPI',249,'2021-02-5');
INSERT INTO payment(order_id, payment_method,payment_amount, payment_date) VALUES (5,'card',249,'2021-03-14');


INSERT INTO orders (customer_id,order_date_time,order_amount,order_status,product_id,payment_id) VALUES (1,NOW(),200,'shipped',1,1);
INSERT INTO orders (customer_id,order_date_time,order_amount,order_status,product_id,payment_id) VALUES (2,'2021-02-5',499,'Delivered',2,2);
INSERT INTO orders (customer_id,order_date_time,order_amount,order_status,product_id,payment_id) VALUES (3,NOW(),249,'shipped',3,4);
INSERT INTO orders (customer_id,order_date_time,order_amount,order_status,product_id,payment_id) VALUES (3,'2021-03-14',355,'Delivered',4,5);
INSERT INTO orders (customer_id,order_date_time,order_amount,order_status,product_id,payment_id) VALUES (1,NOW(),750,'shipped',4,6);
INSERT INTO orders (customer_id,order_date_time,order_amount,order_status,product_id,payment_id) VALUES (1,'2021-03-1',750,'Not shipped',4,6);


INSERT INTO address (customer_id,house_no,city,state,country,pincode) VALUES (1,1,'jaipur','rajasthan','India',302022);
INSERT INTO address (customer_id,house_no,city,state,country,pincode) VALUES (2,5,'mumbai','maharashtra','India',200201);
INSERT INTO address (customer_id,house_no,city,state,country,pincode) VALUES (3,3,'patna','bihar','India',800020);
INSERT INTO address (customer_id,house_no,city,state,country,pincode) VALUES (3,20,'delhi','delhi','India',100023);
INSERT INTO address (customer_id,house_no,city,state,country,pincode) VALUES (1,56,'kanpur','up','India',400021);
INSERT INTO address (customer_id,house_no,city,state,country,pincode) VALUES (1,202,'agra','up','India',400402);
