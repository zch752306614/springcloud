package com.springcloud.productviewserviceribbon.service;

import com.springcloud.productviewserviceribbon.pojo.Product;
import com.springcloud.productviewserviceribbon.ribbon.ProductClientRibbon;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ProductService {

    @Resource
    ProductClientRibbon productClientRibbon;
    public List<Product> listProducts(){
        return productClientRibbon.listProducts();
    }

}
