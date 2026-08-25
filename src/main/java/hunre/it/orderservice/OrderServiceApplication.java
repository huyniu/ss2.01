package hunre.it.orderservice.service;

import hunre.it.orderservice.entity.Order;
import hunre.it.orderservice.exception.ResourceNotFoundException;
import hunre.it.orderservice.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final OrderRepository orderRepository;

    public String checkHealth() {
        return "Order Service is Up";
    }

    public Order getOrderById(Long id) {
        return orderRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Order với ID " + id + " không tồn tại trên hệ thống!"));
    }
}