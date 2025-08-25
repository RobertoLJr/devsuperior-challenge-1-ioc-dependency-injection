package com.robertoljr.project_ioc_dependency_injection;

import com.robertoljr.project_ioc_dependency_injection.entity.Order;
import com.robertoljr.project_ioc_dependency_injection.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjectIocDependencyInjectionApplication implements CommandLineRunner {

    private OrderService orderService;

    @Autowired
    public ProjectIocDependencyInjectionApplication(OrderService orderService) {
        this.orderService = orderService;
    }

    public static void main(String[] args) {
		SpringApplication.run(ProjectIocDependencyInjectionApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
        Order order1 = new Order(1034, 150.0, 20.0);
        Order order2 = new Order(2282, 800.0, 10.0);
        Order order3 = new Order(1309, 95.90, 0.0);

        for (Order order : new Order[]{order1, order2, order3}) {
            System.out.println(
                    "Pedido código " + order.getCode() + "\n"
                    + "Valor total: R$ " + orderService.calculateTotalValue(order) + "\n"
            );
        }
    }
}
