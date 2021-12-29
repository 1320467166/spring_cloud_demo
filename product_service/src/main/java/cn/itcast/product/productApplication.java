package cn.itcast.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EntityScan("cn.itcast.product.entity")
//激活eurekaClient
@EnableEurekaClient
public class productApplication {
    public static void main(String[] args) {
        SpringApplication.run(productApplication.class,args);
    }
}
