package cn.itcast.order.controller;

import cn.itcast.order.entity.Product;
import cn.itcast.order.utils.RedisUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cloud.client.discovery.DiscoveryClient;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

@RestController
@RequestMapping("/order")
@Api(value = "消费者",tags = "消费者")
public class orderController {
    //注入restTemplate对象
    @Resource
    private RestTemplate restTemplate;
    //注入DiscoveryClient
    @Resource
    private DiscoveryClient discoveryClient;
    @Resource
//    @Qualifier("redisTemplate")
    private RedisTemplate redisTemplate;
    @Resource
    private RedisUtils redisUtils;
    /**
    * @Description: 使用redisTemplate时记得序列化或指明具体泛型 否则在redis中找不到对应值
    * @Author: yejisheng
    * @Date: 2021/12/27
    */
    @RequestMapping(value = "/buy/{id}", method = RequestMethod.GET)
    @ApiOperation(value = "消费",notes = "消费")
    public Product findById(@PathVariable Long id) {
        Product product = restTemplate.getForObject("http://service-product/product/"+id, Product.class);
        return product;
    }
}
