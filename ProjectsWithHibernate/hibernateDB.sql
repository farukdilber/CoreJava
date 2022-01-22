create table musteri(
isim varchar (50),
tel varchar (20),
email varchar (30),
krediKarti varchar(30)
);
create table telefonlar(
 id int primary key auto_increment,
 fiyat double,
 indirimOrani int,
 urunAdi varchar(40), 
 marka varchar(40), 
 hafizaBilgisi varchar(40), 
 ekranBoyutu varchar(40), 
 pilGucu varchar(40), 
 ram varchar(40), 
 renk varchar(40)
);
create table laptoplar(
 id int primary key auto_increment,
 fiyat double,
 indirimOrani int,
 urunAdi varchar(40), 
 marka varchar(40), 
 hafizaBilgisi varchar(40), 
 ekranBoyutu varchar(40), 
 pilGucu varchar(40), 
 ram varchar(40), 
 renk varchar(40)
);
insert into telefonlar values(id,5000, 10, 'Mi Note 10', 'Xiaomi','64 gb', '6.1', '4000', ' 4 gb', 'Mavi');
insert into telefonlar values(id,3000, 20, 'Galaxy Note 10', 'Samsung', '128 gb', '6.5', '5000', ' 6 gb', 'Siyah');
insert into telefonlar values(id,7000, 5, 'Iphone 12', 'Apple', '256 gb', '6.1', '5000', ' 4 gb', 'Gri');
insert into telefonlar values(id,6000, 15, 'P40 Pro', 'Huawei', '512 gb', '6.3', '5000', ' 6 gb', 'Kirmizi');
insert into telefonlar values(id,2000, 5,'ZenPhone', 'Asus', '64 gb', '6.1', '5000', ' 3 gb', 'Gri');
insert into telefonlar values(id,1000, 5,'T12', 'Casper', '32 gb', '5.1', '3000', ' 2 gb', 'Gri');

insert into laptoplar values(id,1500, 10, "Nirvana", "Casper", "128 gb", "15.6", "4000", " 4 gb", "Siyah");
insert into laptoplar values(id,2000, 5, "G50", "Lenovo", "128 gb", "15.6", "5000", " 4 gb", "Siyah");
insert into laptoplar values(id,2500, 15, "Pavilion", "HP", "256 gb", "15.6", "5000", " 6 gb", "Gri");
insert into laptoplar values(id,3000, 25, "TUF", "Asus", "256 gb", "17", "3000", " 6 gb", "Kirmizi");
insert into laptoplar values(id,4000, 10, "MateBook", "Huawei", "1512 gb", "15.6", "4000", " 8 gb", "Mavi");
insert into laptoplar values(id,5000, 20,"GalaxyBook", "Samsung", "512 gb", "13.3", "5000", " 8 gb", "Siyah");
insert into laptoplar values(id,8000, 25, "Razer X", "Monster", "1 tb", "15.6", "5000", " 16 gb", "Gri");
insert into laptoplar values(id,12000, 15, "Macbook Air", "Apple", "1 tb", "13.3", "5000", " 16 gb", "Gri");

delete from telefonlar;
delete from laptoplar;
select * from telefonlar;
select * from laptoplar;
commit;

