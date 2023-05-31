package com.example.festo;

import com.example.festo.booth.adapter.out.persistence.BoothEntity;
import com.example.festo.product.adapter.out.persistence.ProductEntity;
import com.example.festo.product.adapter.out.persistence.ProductRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.StopWatch;

import java.util.List;
@SpringBootTest
public class ProductTest {

    @Autowired
    private ProductRepository productRepository;

    @Test
    @DisplayName("메뉴 전체 조회 테스트")
    void 메뉴전체조회(){
        StopWatch stopWatch = new StopWatch("Stop Watch");
        stopWatch.start("메뉴 전체 조회");
        List<ProductEntity> entityList = productRepository.findAll();
        stopWatch.stop();
        System.out.println(stopWatch.toString());
        System.out.println();
        System.out.println(stopWatch.prettyPrint());
    }
}
