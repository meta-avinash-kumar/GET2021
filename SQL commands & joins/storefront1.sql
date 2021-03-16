DROP database store;
CREATE database store;

create table Products(product_id int NOT NULL AUTO_INCREMENT primary key, product_name varchar(100),
product_description varchar(100), category_id int, product_price decimal(10,2) );

create table Customer(customer_id int NOT NULL AUTO_INCREMENT primary key, customer_name varchar(100),
customer_mobile varchar(15), customer_email varchar(225), customer_pswd char(60) );

create table Category(category_id int NOT NULL AUTO_INCREMENT primary key, category_name varchar(100) );

create table Orders(order_id int NOT NULL AUTO_INCREMENT primary key, customer_id int, order_date_time date,
order_amount decimal(19,2), order_status varchar(225), product_id int, payment_id int );

create table Address(address_id int NOT NULL AUTO_INCREMENT primary key, customer_id int, house_no int, city varchar(100), state varchar(100), country varchar(100), pincode int );

create table Admin(admin_username varchar(100), admin_pw char(60) );

create table Payment(order_id int, payment_id int  NOT NULL AUTO_INCREMENT primary key, payment_method varchar(100), payment_amount decimal(10,2), payment_date date);

create table image(img_id int NOT NULL AUTO_INCREMENT primary key, img_name varchar(100), product_id int);

drop table products;

create table Products(product_id int NOT NULL AUTO_INCREMENT primary key, product_name varchar(100),
product_description varchar(100), category_id int, product_price decimal(10,2) );
