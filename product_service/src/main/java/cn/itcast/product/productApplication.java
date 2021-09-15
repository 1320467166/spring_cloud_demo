package cn.itcast.product;

import cn.itcast.product.service.ProductService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;


@SpringBootApplication
@EntityScan("cn.itcast.product.entity")
public class productApplication {
    public static void main(String[] args) {
        SpringApplication.run(productApplication.class,args);
    }
}
