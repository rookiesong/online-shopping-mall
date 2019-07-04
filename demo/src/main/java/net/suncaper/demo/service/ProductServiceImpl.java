package net.suncaper.demo.service;

import net.suncaper.demo.domain.Product;
import net.suncaper.demo.domain.ProductExample;
import net.suncaper.demo.mapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.Comparator;
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

    @Override
    public List<Product> recommendByType(String productId,String type){
        ProductExample recommendexample = new ProductExample();
        if(type != null && !type.equals("")){
            recommendexample.or().andTypeEqualTo(type).andProductIdNotEqualTo(productId);
        }
        List<Product> similarlist= productMapper.selectByExample(recommendexample);

        Collections.sort(similarlist, new Comparator<Product>() {

            public int compare(Product product1, Product product2) {
                if (product1.getSalesVolume().compareTo(product2.getSalesVolume()) == 0) {
                    //按销量排序
                    return product1.getProductId().compareTo(product2.getProductId());
                } else {
                    return product1.getSalesVolume().compareTo(product2.getSalesVolume());
                }
            }
        });

        return similarlist;
    }

}
