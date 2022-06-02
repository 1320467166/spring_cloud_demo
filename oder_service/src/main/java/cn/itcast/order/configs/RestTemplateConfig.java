package cn.itcast.order.configs;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfig {
    /*
     *  使用spring提供的RestTemplate发送http请求
     *   1、在创建RestTemplate对象交给容器管理
     *   2、在使用的时候，调用其方法完成操作
     * */
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
