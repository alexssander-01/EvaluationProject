package com.br.alexssander.evaluationproject.model;

import java.util.HashMap;

public class Sale {
    private Integer idSale;
    private Client clientSale;
    private HashMap<Integer,Product> listProductsSale;

    public Integer getIdSale() {
        return idSale;
    }
    public void setIdSale(Integer idSale) {
        this.idSale = idSale;
    }
    public Client getClientSale() {
        return clientSale;
    }
    public void setClientSale(Client clientSale) {
        this.clientSale = clientSale;
    }
    public HashMap<Integer, Product> getListProductsSale() {
        return listProductsSale;
    }
    public void addProduct(Product product){
        listProductsSale.put(product.getIdProduct(),product);
    }
    public void removeProduct(Integer id){
        listProductsSale.remove(id);
    }
    public void clearSale(){
        listProductsSale.clear();
    }
}
