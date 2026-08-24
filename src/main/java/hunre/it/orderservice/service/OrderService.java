package hunre.it.orderservice.service;

import hunre.it.orderservice.repository.OrderRepository;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final OrderRepository orderRepository;

    public String checkHealth() {
        return "Order Service is Up";
    }
}