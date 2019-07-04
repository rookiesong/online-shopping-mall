package net.suncaper.demo.service;

import net.suncaper.demo.domain.Product;
import net.suncaper.demo.domain.ProductExample;
import net.suncaper.demo.mapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class HomeServiceImpl implements HomeService {

    @Autowired
    private ProductMapper productMapper;

    @Override
    public List<Product> recommendBySale() {
        ProductExample example = new ProductExample();
        example.createCriteria().andProductNameLike("%"+""+"%");
        List<Product> list=productMapper.selectByExample(example);

        Collections.sort(list, new Comparator<Product>() {

            public int compare(Product product1, Product product2) {
                if (product1.getSalesVolume().compareTo(product2.getSalesVolume()) == 0) {
                    //按销量排序
                    return product1.getProductId().compareTo(product2.getProductId());
                } else {
                    return product1.getSalesVolume().compareTo(product2.getSalesVolume());
                }
            }
        });

//        Set<Product> Hset = new HashSet<Product>(3);
//
//        Hset.add(list.get(list.size()-1));
//        Hset.add(list.get(list.size()-2));
//        Hset.add(list.get(list.size()-3));

//        List<Product> rlist = new ArrayList<Product>();
//        rlist.addAll(Hset);

        List<Product> result = new ArrayList<>();
        result.add(list.get(list.size()-1));
        result.add(list.get(list.size()-2));
        result.add(list.get(list.size()-3));
        return result;
    }

    }