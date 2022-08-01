package cn.itcast.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cache.annotation.EnableCaching;


@SpringBootApplication
@EntityScan("cn.itcast.product.entity")
@EnableCaching
public class productApplication {
    public static void main(String[] args) {
        SpringApplication.run(productApplication.class,args);
    }
}
