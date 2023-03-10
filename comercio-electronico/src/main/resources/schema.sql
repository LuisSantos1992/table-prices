drop table if exists brands CASCADE; 
drop table if exists prices CASCADE ;
drop table if exists products CASCADE; 
create table brands (brand_id bigint generated by default as identity, name varchar(255), primary key (brand_id));
create table prices (price_list integer generated by default as identity, curr varchar(255), start_date timestamp, name varchar(255), price double, priority integer not null, end_date timestamp, brand_id bigint, prod_Id bigint, primary key (price_list));
create table products (prod_Id bigint generated by default as identity, name varchar(255), product_id varchar(255), primary key (prod_Id));
alter table prices add constraint FKtfkvp7f37rned2mybilsmh5m5 foreign key (brand_id) references brands;
alter table prices add constraint FKslvjixu5l71ycruj0e1eaih0u foreign key (prod_Id) references products;