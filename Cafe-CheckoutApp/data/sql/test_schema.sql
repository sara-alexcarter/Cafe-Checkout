drop database if exists Cafe_Checkout_test;
create database Cafe_Checkout_test;
use Cafe_Checkout_test;

create table item (
	itemId int primary key auto_increment,
    `type` varchar(50),
    `name` varchar(50) not null,
    price decimal(5,2)
    );
    
delimiter // 
create procedure set_known_good_state()
begin
    delete from user;
    alter table user auto_increment=1;

    INSERT INTO item (`type`, `name`, price) VALUES
    ('HOT_COFFEE', 'Blackbeard''s Brew', 4.75),
	('HOT_COFFEE', 'Pirate''s Potion (Spiced Mocha)', 5.25),
	('HOT_COFFEE', 'Jolly Roger Java (Hazelnut Latte)', 4.95),
	('ICED_COFFEE', 'Captain''s Cold Brew', 4.50),
	('ICED_COFFEE', 'Buccaneer''s Blend (Iced Caramel Macchiato)', 5.00),
	('ICED_COFFEE', 'Sea Rover''s Refresh (Vanilla Cold Brew)', 4.75),
	('TEA', 'Pirate''s Parley (Chai Tea)', 3.75),
	('TEA', 'Scurvy Scoundrel''s Sip (Citrus Green Tea)', 4.25),
	('TEA', 'Treasure Island Iced Tea', 4.00),
	('FOOD', 'Plunderer''s Platter (Assorted Pastries)', 9.50),
	('FOOD', 'Cannonball Crunch (Popcorn Chicken)', 7.50),
	('FOOD', 'Davy Jones'' Delight (Seafood Dumplings)', 10.00);
end //
delimiter ;