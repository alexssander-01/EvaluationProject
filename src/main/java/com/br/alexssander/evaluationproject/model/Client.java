package com.br.alexssander.evaluationproject.model;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "client")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer idCliente;
    @Column(name = "namecliente")
    private String nameCliente;
    @Column(name = "emailcliente")
    private String emailCliente;
    @Column(name = "birthdatecliente",nullable = false)
    private Date birthDateCliente;

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public String getNameCliente() {
        return nameCliente;
    }

    public void setNameCliente(String nameCliente) {
        this.nameCliente = nameCliente;
    }

    public String getEmailCliente() {
        return emailCliente;
    }

    public void setEmailCliente(String emailCliente) {
        this.emailCliente = emailCliente;
    }

    public Date getBirthDateCliente() {
        return birthDateCliente;
    }

    public void setBirthDateCliente(Date birthDateCliente) {
        this.birthDateCliente = birthDateCliente;
    }
}
