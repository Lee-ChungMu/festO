package com.example.festo;

import com.example.festo.booth.adapter.out.dto.BoothDTO;
import com.example.festo.booth.adapter.out.persistence.BoothEntity;
import com.example.festo.booth.adapter.out.persistence.BoothRepository;
import com.example.festo.booth.domain.Booth;
import com.example.festo.booth.domain.BoothStatus;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StopWatch;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@SpringBootTest
public class BoothTest {
    @Autowired
    private BoothRepository boothRepository;
    @Test
    @DisplayName("부스 전체 조회 테스트")
    @Transactional
    void 부스전체조회(){
        StopWatch stopWatch = new StopWatch("Stop Watch");
        stopWatch.start("부스 전체 조회");
        List<BoothEntity> entityList = boothRepository.findAll();
        List<Booth> domainList = new ArrayList<>();
        for(BoothEntity dto : entityList) {
            if (dto.getFestival().getStartDate().isBefore(LocalDate.now()) && dto.getFestival().getEndDate().isAfter(LocalDate.now())) {
                Booth domain = Booth.builder()
                        .boothId(dto.getBoothId())
                        .name(dto.getName())
                        .boothDescription(dto.getBoothDescription())
                        .imageUrl(dto.getImageUrl())
                        .build();

                domainList.add(domain);
            }
        }
        stopWatch.stop();
        System.out.println(stopWatch.toString());
        System.out.println();
        System.out.println(stopWatch.prettyPrint());
    }
    @Test
    @DisplayName("v1 현재시간과 비교하여 열려있는 부스 전체 조회(축제도 열려있는 시간이어야함)")
    @Transactional
    void 열려있는부스전체조회v1(){
        StopWatch stopWatch = new StopWatch("Stop Watch");
        stopWatch.start("기본");
        List<BoothEntity> entityList = boothRepository.findOpenBoothsAtCurrentTime(BoothStatus.OPEN, LocalTime.now());
        List<Booth> domainList = new ArrayList<>();
        for(BoothEntity dto : entityList){
            if(dto.getFestival().getStartDate().isBefore(LocalDate.now())  && dto.getFestival().getEndDate().isAfter(LocalDate.now())){
                Booth domain = Booth.builder()
                        .boothId(dto.getBoothId())
                        .name(dto.getName())
                        .boothDescription(dto.getBoothDescription())
                        .imageUrl(dto.getImageUrl())
                        .build();

                domainList.add(domain);
            }

        }
        stopWatch.stop();
        System.out.println(stopWatch.toString());
        System.out.println();
        System.out.println(stopWatch.prettyPrint());
    }
    @Test
    @DisplayName("v2 현재시간과 비교하여 열려있는 부스 전체 조회(축제도 열려있는 시간이어야함)")
    @Transactional
    void 열려있는부스전체조회v2(){
        StopWatch stopWatch = new StopWatch("Stop Watch");
        stopWatch.start("dto, join");
        List<BoothDTO> entityList = boothRepository.findOpenBoothsAtCurrentTimeTest(BoothStatus.OPEN, LocalTime.now());
        List<Booth> domainList = new ArrayList<>();
        for(BoothDTO dto : entityList){
            if(dto.getFestival().getStartDate().isBefore(LocalDate.now())  && dto.getFestival().getEndDate().isAfter(LocalDate.now())){
                Booth domain = Booth.builder()
                        .boothId(dto.getBoothId())
                        .name(dto.getName())
                        .boothDescription(dto.getBoothDescription())
                        .imageUrl(dto.getImageUrl())
                        .build();

                domainList.add(domain);
            }

        }
        stopWatch.stop();
        System.out.println(stopWatch.toString());
        System.out.println();
        System.out.println(stopWatch.prettyPrint());
    }

}
