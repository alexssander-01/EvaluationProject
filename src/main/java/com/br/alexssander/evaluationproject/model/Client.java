package com.br.alexssander.evaluationproject.model;

import java.util.Date;

public class Client {
    private Integer idCliente;
    private String nameCliente;
    private String emailCliente;
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
