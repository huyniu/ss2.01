package hunre.it.orderservice.controller;

import hunre.it.orderservice.dto.ProductResponseDTO;
import hunre.it.orderservice.entity.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {

    @GetMapping("/test-dto")
    public ProductResponseDTO getProductInfo() {
        // 1. Giả lập việc Query lấy ProductEntity từ DB
        Product productEntity = new Product();
        productEntity.setId(1L);
        productEntity.setName("Laptop Gaming Dell");
        productEntity.setSku("DELL-G15-001");
        productEntity.setImportPrice(15000000.0); // Nhạy cảm: Giá nhập 15 triệu
        productEntity.setStockQuantity(50);       // Nhạy cảm: Còn 50 cái trong kho
        productEntity.setSellPrice(20000000.0);   // Public: Giá bán 20 triệu

        // 2. Map dữ liệu từ Entity sang DTO
        ProductResponseDTO responseDTO = ProductResponseDTO.builder()
                .id(productEntity.getId())
                .name(productEntity.getName())
                .sellPrice(productEntity.getSellPrice())
                .build();

        // 3. Trả về DTO
        return responseDTO;
    }
}