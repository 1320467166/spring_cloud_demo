package cn.itcast.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;


@SpringBootApplication
@EntityScan("cn.itcast.order.entity")
public class orderApplication {

//    /*
//    *  使用spring提供的RestTemplate发送http请求
//    *   1、在创建RestTemplate对象交给容器管理
//    *   2、在使用的时候，调用其方法完成操作
//    * */
//    @Bean
//    @LoadBalanced
//    public RestTemplate restTemplate(){
//        return new RestTemplate();
//    }

    public static void main(String[] args) {
        SpringApplication.run(orderApplication.class,args);
    }
}
