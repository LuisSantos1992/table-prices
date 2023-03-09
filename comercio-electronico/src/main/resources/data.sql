
INSERT INTO BRANDS (name) VALUES
                              ('ZARA'),
                              ('ZARA 2'),
                              ('ZARA 3');

INSERT INTO PRODUCTS (name) VALUES
                                ('Camisa Caballero'),
                                ('Camisa Dama'),
                                ('Pantalon Dama');

INSERT INTO PRICES  (curr,end_date,name,price,priority,start_date,id_brand,id_product) VALUES
                                                                                           ('USD',now(),'Promocion Camisas',34,1,now(),1,1),
                                                                                           ('USD',now(),'Promocion Camisas',34,1,now(),1,1),
                                                                                           ('USD',now(),'Promocion Camisas',34,1,now(),1,1);