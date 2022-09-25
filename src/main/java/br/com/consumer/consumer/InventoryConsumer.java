package br.com.consumer.consumer;

import br.com.lib.constant.RabbitMQConstant;
import br.com.lib.model.Product;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class InventoryConsumer {

    @RabbitListener(queues = RabbitMQConstant.PRODUCT_QUEUE_NAME)
    private void consumeQueue(Product product) {
        System.out.println("==============================");
        System.out.println(product.getProductId());
        System.out.println(product.getProductPrice());
        System.out.println("==============================");
    }

}
