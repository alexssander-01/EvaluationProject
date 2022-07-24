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

    public Integer getIdClient() {
        return idClient;
    }

    public void setIdClient(Integer idCliente) {
        this.idClient = idCliente;
    }

    public String getNameClient() {
        return nameClient;
    }

    public void setNameClient(String nameCliente) {
        this.nameClient = nameCliente;
    }

    public String getEmailClient() {
        return emailClient;
    }

    public void setEmailClient(String emailCliente) {
        this.emailClient = emailCliente;
    }

    public LocalDate getBirthDateClient() {
        return birthDateClient;
    }

    public void setBirthDateClient(LocalDate birthDateCliente) {
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