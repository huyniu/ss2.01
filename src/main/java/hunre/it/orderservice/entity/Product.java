package hunre.it.orderservice.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "products")
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String sku;

    // Thông tin nhạy cảm (không được để lộ cho khách hàng)
    private Double importPrice;
    private Integer stockQuantity;

    // Thông tin public (được phép hiển thị)
    private Double sellPrice;
}