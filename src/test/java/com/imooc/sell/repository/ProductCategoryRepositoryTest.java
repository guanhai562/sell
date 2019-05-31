package com.imooc.sell.repository;

import com.imooc.sell.dataobject.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.*;

/**
 * @author guanhai562@gmail.com
 * @date 2019/5/30 10:59
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepositoryTest {

    @Autowired
    private ProductCategoryRepository repository;

    @Test
    @Transactional
    public void findOneTest(){
        ProductCategory category = repository.getOne(1);
        System.out.println(category.toString());
    }

    @Test
    public void saveTest(){
//        ProductCategory category = repository.getOne(1);
        ProductCategory category = repository.findById(1).get();

        category.setCategoryType(2);
        repository.save(category);
    }


    @Test
    public void saveTest01(){
        ProductCategory productCategory=new ProductCategory("女生最爱",4);
        ProductCategory result = repository.save(productCategory);
        Assert.assertNotNull(result);
    }


    @Test
    public void findByCategoryTypeInTest(){
        List<Integer> list = Arrays.asList(3,4,5);

        List<ProductCategory> result = repository.findByCategoryTypeIn(list);
        Assert.assertNotEquals(0,result.size());
    }
}