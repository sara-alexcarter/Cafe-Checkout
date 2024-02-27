drop database if exists Cafe_Checkout;
create database Cafe_Checkout;
use Cafe_Checkout; 

create table item (
	itemId int primary key auto_increment,
    `type` varchar(50),
    `name` varchar(50) not null,
    price decimal(5,2)
    );
    

