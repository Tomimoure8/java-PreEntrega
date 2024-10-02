package edu.coderhouse.jpa.entity;

import jakarta.persistence.*;

@Entity
@Table (name = "PRODUCTO")
public class Producto {
    public Producto(Long id, String nombre, Double precio, String descripcion, Integer stock) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.descripcion = descripcion;
        this.stock = stock;
    }

    @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column(nullable = false)

        private String nombre;

        @Column(nullable = false)
        private Double precio;

        @Column(columnDefinition
                = "TEXT")
        private String descripcion;

        @Column(nullable = false)
        private Integer stock;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }
}
