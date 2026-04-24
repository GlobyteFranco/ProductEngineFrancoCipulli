
package com.api.productengine.model;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "ordenes")
public class Orden {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Cada orden es por un producto
    @ManyToOne
    @JoinColumn(name = "product_id", nullable = false)
    private Product product;

    // Total de la orden (saldo)
    @Column(nullable = false)
    private BigDecimal total;

    // Constructor vacío obligatorio para JPA
    public Orden() {
    }

    public Orden(Product product, BigDecimal total) {
        this.product = product;
        this.total = total;
    }

    public Long getId() {
        return id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }
}
