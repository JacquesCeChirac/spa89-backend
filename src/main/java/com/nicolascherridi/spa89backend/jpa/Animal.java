package com.nicolascherridi.spa89backend.jpa;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "animal")
public class Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private short id;
    @Column(name = "adopted")
    private boolean adopted;
    @Column(name = "name")
    private String name;
    @Column(name = "species")
    private String species;
    @Column(name = "race")
    private String race;
    @Column(name = "loof")
    private boolean loof;
    @Column(name = "color")
    private String color;
    @Column(name = "birthdate")
    private Date birthdate;
    @Column(name = "abandonment")
    private Date abandonment;
    @Column(name = "adoption")
    private Date adoption;
    @Column(name = "caracter")
    private String caracter;
    @Column(name = "comment")
    private String comment;

    public Animal(){}

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                ", adopted=" + adopted +
                ", name='" + name + '\'' +
                ", species='" + species + '\'' +
                ", race='" + race + '\'' +
                ", loof=" + loof +
                ", color='" + color + '\'' +
                ", birthdate=" + birthdate +
                ", abandonment=" + abandonment +
                ", adoption=" + adoption +
                ", caracter='" + caracter + '\'' +
                ", comment='" + comment + '\'' +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(short id) {
        this.id = id;
    }

    public boolean getAdopted() {
        return adopted;
    }

    public void setAdopted(boolean status) {
        this.adopted = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public boolean isLoof() {
        return loof;
    }

    public void setLoof(boolean loof) {
        this.loof = loof;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public Date getAbandonment() {
        return abandonment;
    }

    public void setAbandonment(Date abandonment) {
        this.abandonment = abandonment;
    }

    public Date getAdoption() {
        return adoption;
    }

    public void setAdoption(Date adoption) {
        this.adoption = adoption;
    }

    public String getCaracter() {
        return caracter;
    }

    public void setCaracter(String caracter) {
        this.caracter = caracter;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
