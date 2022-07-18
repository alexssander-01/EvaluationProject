package com.br.alexssander.evaluationproject.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "sale", schema = "public")
public class Sale {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idsale")
    private Integer idSale;
    @ManyToOne(fetch = FetchType.LAZY,optional = false)
    @JoinColumn(name = "idclient",nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private Client clientSale;
    @ManyToMany(fetch = FetchType.LAZY,
        cascade = {
            CascadeType.PERSIST, CascadeType.MERGE
        })
    @JoinTable(name = "itenssale",joinColumns = {@JoinColumn(name = "idsale")},
    inverseJoinColumns = {@JoinColumn(name = "idproduct") })
    private List<Product> listProductsSale;

    public Sale() {
        listProductsSale = new ArrayList<>();
    }

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
    public List<Product> getListProductsSale() {
        return listProductsSale;
    }
    public void addProduct(Product product){
        listProductsSale.add(product);
    }
//    public void removeProduct(Integer id){
//        listProductsSale.remove(id.intValue());
//     Arrumar o remove.
//    }
    public void clearSale(){
        listProductsSale.clear();
    }

    @Override
    public String toString() {
        return "Sale{" +
                "idSale=" + idSale +
                ", clientSale=" + clientSale;
    }
}
