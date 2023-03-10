INSERT INTO BRANDS (name) VALUES
                              ('ZARA'),
                              ('Pull & Bears'),
                              ('Perry ellis');

INSERT INTO PRODUCTS (name,product_id) VALUES
                                           ('Camisa Caballero T-M',35455),
                                           ('Camisa Dama T-S',35465),
                                           ('Pantalon T- 34',35475);

INSERT INTO PRICES  (curr,end_date,name,price,priority,start_date,brand_id,id) VALUES
                                                                                           ('USD', {ts '2020-06-14 00.00.00'},'Promocion Camisas',35.50,0, {ts '2020-12-31 23.59.59'},1,1),
                                                                                           ('USD', {ts '2020-06-14 15.00.00'},'Promocion Camisas',25.45,1, {ts '2020-06-14 18.30.00'},1,1),
                                                                                           ('USD', {ts '2020-06-15 00.00.00'},'Promocion Camisas',30.50,1, {ts '2020-06-15 11.00.00'},1,1),
                                                                                           ('USD', {ts '2020-06-15 16.00.00'},'Promocion Camisas',38.95,1, {ts '2020-12-31 23.59.59'},1,1);