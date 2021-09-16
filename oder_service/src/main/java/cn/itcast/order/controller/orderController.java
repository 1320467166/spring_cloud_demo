package cn.itcast.order.controller;

import cn.itcast.order.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/order")
public class orderController {
    //注入restTemplate对象
    @Autowired
    private RestTemplate restTemplate;
    //注入DiscoveryClient
    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping(value = "/buy/{id}",method = RequestMethod.GET)
    public Product findById(@PathVariable Long id){
       List<ServiceInstance> instances = discoveryClient.getInstances("service-product");
/*        for (ServiceInstance serviceInstance:instances){
            System.out.println(instances);
        }*/
        ServiceInstance serviceInstance = instances.get(0);

       Product product = restTemplate.getForObject("http://"+serviceInstance.getHost()+":"+serviceInstance.getPort()+"/product/1",Product.class);
        return product;
    }
}
