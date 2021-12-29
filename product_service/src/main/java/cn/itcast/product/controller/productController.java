package cn.itcast.product.controller;

import cn.itcast.product.entity.Product;
import cn.itcast.product.service.ProductService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/product")
public class productController {
    @Resource
    private ProductService productService;

    @Resource
    @Value("${server.port}")
    private String port;

    @Resource
    @Value("${spring.cloud.client.ip-address}")
    private String ip;

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public Product findById(@PathVariable Long id){
        Product product = productService.findById(id);
        product.setProductName(ip+"使用的端口号"+port);
        return product;
    }
    @RequestMapping(value = "",method = RequestMethod.POST)
    public String Save(@RequestBody Product product){
        productService.save(product);
        return "ok";
    }
}
