
INSERT INTO BRANDS (name) VALUES
                              ('ZARA'),
                              ('ZARA 2'),
                              ('ZARA 3');

INSERT INTO PRODUCTS (name,product_id) VALUES
                                ('Camisa Caballero',35455),
                                ('Camisa Dama',35455),
                                ('Pantalon Dama',35455);

INSERT INTO PRICES  (curr,end_date,name,price,priority,start_date,id_brand,id_product) VALUES
                                                                                           ('USD',now(),'Promocion Camisas',34,1,now(),1,1),
                                                                                           ('USD',now(),'Promocion Camisas',34,1,now(),1,1),
                                                                                           ('USD',now(),'Promocion Camisas',34,1,now(),1,1);