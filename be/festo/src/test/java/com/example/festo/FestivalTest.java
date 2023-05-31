package com.example.festo;

import com.example.festo.festival.adapter.out.persistence.FestivalEntity;
import com.example.festo.festival.adapter.out.persistence.FestivalRepository;
import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.StopWatch;

import java.util.List;

@SpringBootTest
public class FestivalTest {

    @Autowired
    private FestivalRepository festivalRepository;
    @Test
    @DisplayName("축제 전체 조회 테스트")
    void 축제전체조회(){
        StopWatch stopWatch = new StopWatch("Stop Watch");
        stopWatch.start("Print");
        List<FestivalEntity> entityList = festivalRepository.findAll();
        stopWatch.stop();
        System.out.println(stopWatch.toString());
        System.out.println();
        System.out.println(stopWatch.prettyPrint());
    }




}
