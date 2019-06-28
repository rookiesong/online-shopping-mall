package net.suncaper.demo.service;

import net.suncaper.demo.domain.Product;
import net.suncaper.demo.domain.ProductExample;
import net.suncaper.demo.mapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductMapper productMapper;

    @Override
    public List<Product> findProduct(String name) {
        ProductExample example = new ProductExample();
        if(name != null && !name.equals("")){
            example.createCriteria().andProductNameLike("%"+name+"%");
        }
        return productMapper.selectByExample(example);
    }

    @Override
    public Product findProductById(String productId){
        return productMapper.selectByPrimaryKey(productId);
    }


}
