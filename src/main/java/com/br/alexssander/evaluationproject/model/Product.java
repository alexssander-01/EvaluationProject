package com.br.alexssander.evaluationproject.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;

@Entity
@Table(name = "product",schema = "public")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idproduct")
    private Integer idProduct;
    @Column(name = "nameproduct")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private String nameProduct;
    @Column(name = "descriptproduct")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private String descriptionProduct;
    @Column(name = "priceproduct")
    private Double priceProduct;

    public Integer getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(Integer idProduct) {
        this.idProduct = idProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getDescriptionProduct() {
        return descriptionProduct;
    }

    public void setDescriptionProduct(String descriptionProduct) {
        this.descriptionProduct = descriptionProduct;
    }

    public Double getPriceProduct() {
        return priceProduct;
    }

    public void setPriceProduct(Double priceProduct) {
        this.priceProduct = priceProduct;
    }
}
