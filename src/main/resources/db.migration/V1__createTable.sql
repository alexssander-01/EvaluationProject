CREATE table usuario(
                        id numeric not null,
                        nome text not null,
                        primary key (id)
);
/*
CREATE TABLE public.Client
(
    "idClient" numeric NOT NULL,
    "nameClient" text NOT NULL,
    "emailClient" text NOT NULL,
    "birthDateCliente" date,
    PRIMARY KEY ("idClient")
);
ALTER TABLE IF EXISTS public.Client
    OWNER to postgres;
CREATE TABLE public.Product
(
    "idProduct" numeric NOT NULL,
    "nameProduct" text NOT NULL,
    "descriptProduct" text,
    "priceProduct" double precision NOT NULL,
    PRIMARY KEY ("idProduct")
);
ALTER TABLE IF EXISTS public.Product
    OWNER to postgres;
CREATE TABLE public.Sale
(
    "idSale" numeric NOT NULL,
    "idClient" numeric NOT NULL,
    PRIMARY KEY ("idSale"),
    CONSTRAINT fk_client FOREIGN KEY ("idClient") references Client("idClient")
);
ALTER TABLE IF EXISTS public.Sale
    OWNER to postgres;
CREATE TABLE public.ProductSale
(
    "idProductSale" numeric NOT NULL,
    "idProduct" numeric NOT NULL,
    "idSale" numeric NOT NULL,
    PRIMARY KEY ("idProductSale"),
    CONSTRAINT fk_product FOREIGN KEY ("idProduct") references Product("idProduct"),
    CONSTRAINT fk_sale FOREIGN KEY ("idSale") references Sale("idSale")
)*/