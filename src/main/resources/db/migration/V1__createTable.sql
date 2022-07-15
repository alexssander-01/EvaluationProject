CREATE TABLE public.client
(
    idclient serial NOT NULL,
    nameclient varchar(100) NOT NULL,
    emailclient varchar(100) NOT NULL,
    birthdatecliente date,
    PRIMARY KEY (idclient)
);
ALTER TABLE IF EXISTS public.client
    OWNER to postgres;
CREATE TABLE public.product
(
    idproduct serial NOT NULL,
    nameproduct varchar(40) NOT NULL,
    descriptproduct varchar(200),
    priceproduct double precision NOT NULL,
    PRIMARY KEY (idproduct)
);
ALTER TABLE IF EXISTS public.product
    OWNER to postgres;
CREATE TABLE public.sale
(
    idsale serial NOT NULL,
    idclient integer NOT NULL,
    PRIMARY KEY (idsale),
    CONSTRAINT fk_client FOREIGN KEY (idclient) references client(idclient)
);
ALTER TABLE IF EXISTS public.sale
    OWNER to postgres;
CREATE TABLE public.productsale
(
    idproductsale serial NOT NULL,
    idproduct integer NOT NULL,
    idsale integer NOT NULL,
    PRIMARY KEY (idproductsale),
    CONSTRAINT fk_product FOREIGN KEY (idproduct) references Product(idproduct),
    CONSTRAINT fk_sale FOREIGN KEY (idsale) references Sale(idsale)
)