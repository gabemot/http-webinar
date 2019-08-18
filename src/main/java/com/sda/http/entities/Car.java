package com.sda.http.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "car")
public class Car {

    private long id;
    private String brand;
    private String model;
    private String engine;
    private String color;

    public Car() {

    }

    public Car(String brand, String model, String engine, String color) {
        this.brand = brand;
        this.model = model;
        this.engine = engine;
        this.color = color;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    @Column(name = "brand", nullable = false)
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Column(name = "model", nullable = false)
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }

    @Column(name = "engine", nullable =  false)
    public String getEngine() {
        return  engine;
    }
    public void setEngine(String engine) {
        this.engine = engine;
    }

    @Column(name = "color", nullable = false)
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car [id=" + id + ", brand=" + brand + ", model=" + model + ", engine=" + engine + ", color=" + color + "]";
    }

}
