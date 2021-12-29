package cn.itcast.product.service.impl;

import cn.itcast.product.dao.ProductDao;
import cn.itcast.product.entity.Product;
import cn.itcast.product.service.ProductService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ProductServiceImpl implements ProductService {
    @Resource
    private ProductDao productDao;
    @Override
    public Product findById(Long id) {
        return productDao.findById(id).get();
    }

    @Override
    public void save(Product product) {
        productDao.save(product);
    }

    @Override
    public void update(Product product) {
        productDao.save(product);
    }

    @Override
    public void delete(Product product) {
        productDao.delete(product);
    }
}
