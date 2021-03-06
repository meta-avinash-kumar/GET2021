DROP database store;
CREATE database store;

create table address(address_id int NOT NULL AUTO_INCREMENT primary key, customer_id int, house_no int,
city varchar(100), state varchar(100), country varchar(100), pincode int );

create table image(img_id int NOT NULL AUTO_INCREMENT primary key, img BLOB, product_id int);

create table products(product_id int NOT NULL AUTO_INCREMENT primary key, product_name varchar(100),
product_description varchar(100), status char(20) DEFAULT 'active',product_date datetime, category_id int, product_price decimal(10,2),stock int, img_id int, 
foreign key(img_id) references image(img_id));

create table subcategory(subcategory_id int NOT NULL AUTO_INCREMENT primary key, subcategory_name varchar(100),
product_id int);

create table category(category_id int NOT NULL AUTO_INCREMENT primary key, category_name varchar(100),
product_id int);

create table payment(order_id int, payment_id int  NOT NULL AUTO_INCREMENT primary key, payment_method
varchar(100), payment_amount decimal(10,2), payment_date datetime);

create table Orders(order_id int NOT NULL AUTO_INCREMENT primary key, customer_id int, order_date_time 
datetime, order_amount decimal(19,2), order_status varchar(225), product_id int, payment_id int,foreign
key(payment_id) references Payment(payment_id));

create table Customer(customer_id int NOT NULL AUTO_INCREMENT primary key, customer_name varchar(100),
customer_mobile varchar(15), customer_email varchar(225), customer_pswd char(60));

create table Admin(admin_username varchar(100), admin_pw char(60) );

drop table products;


create table products(product_id int NOT NULL AUTO_INCREMENT primary key, product_name varchar(100),
product_description varchar(100), status char(20) DEFAULT 'active',product_date datetime, category_id int, product_price decimal(10,2),stock int, img_id int, 
foreign key(img_id) references image(img_id));
