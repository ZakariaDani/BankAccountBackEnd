package com.example.demo.client;

import javax.persistence.*;

@Entity
@Table
public class Client {
    @Id
    @SequenceGenerator(
            name = "client_sequence",
            sequenceName = "client_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "client_sequence"
    )
    private Long id;
    private String nom;
    private String prenom;
    private String adress;
    private String phone;
    private String cin;

    public Client(String nom, String prenom, String adress, String phone, String cin, Long id) {
        this.nom = nom;
        this.prenom = prenom;
        this.adress = adress;
        this.phone = phone;
        this.cin = cin;
        this.id = id;
    }

    public Client() {
    }
    public Client(String nom, String prenom, String adress, String phone, String cin) {
        this.nom = nom;
        this.prenom = prenom;
        this.adress = adress;
        this.phone = phone;
        this.cin = cin;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", adress='" + adress + '\'' +
                ", phone='" + phone + '\'' +
                ", cin='" + cin + '\'' +
                '}';
    }
}
