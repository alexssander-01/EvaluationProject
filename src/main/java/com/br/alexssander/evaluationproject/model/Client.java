package com.br.alexssander.evaluationproject.model;
import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "client", schema = "public")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idclient")
    private Integer idClient;
    @Column(name = "nameclient", nullable = false)
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private String nameClient;
    @Column(name = "emailclient", nullable = false)
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private String emailClient;
    @Column(name = "birthdatecliente")
    @JsonFormat(pattern = "dd-MM-yyyy")
    private LocalDate birthDateClient;

    public Integer getIdCliente() {
        return idClient;
    }

    public void setIdCliente(Integer idCliente) {
        this.idClient = idCliente;
    }

    public String getNameCliente() {
        return nameClient;
    }

    public void setNameCliente(String nameCliente) {
        this.nameClient = nameCliente;
    }

    public String getEmailCliente() {
        return emailClient;
    }

    public void setEmailCliente(String emailCliente) {
        this.emailClient = emailCliente;
    }

    public LocalDate getBirthDateCliente() {
        return birthDateClient;
    }

    public void setBirthDateCliente(LocalDate birthDateCliente) {
        this.birthDateClient = birthDateCliente;
    }
    @Override
    public String toString() {
        return "Client{" +
                "idClient=" + idClient +
                ", nameClient='" + nameClient + '\'' +
                ", emailClient='" + emailClient + '\'' +
                ", birthDateClient=" + birthDateClient +
                '}';
    }
}