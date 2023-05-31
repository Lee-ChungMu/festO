package com.example.festo;

import com.example.festo.booth.adapter.out.persistence.BoothEntity;
import com.example.festo.booth.adapter.out.persistence.BoothRepository;
import com.example.festo.booth.domain.BoothStatus;
import com.example.festo.common.exception.CustomNoSuchException;
import com.example.festo.common.model.Money;
import com.example.festo.festival.adapter.out.persistence.FestivalEntity;

import com.example.festo.festival.adapter.out.persistence.FestivalRepository;
import com.example.festo.festival.domain.FestivalStatus;
import com.example.festo.member.adapter.out.persistence.MemberRepository;
import com.example.festo.member.domain.Member;
import com.example.festo.product.adapter.out.persistence.ProductEntity;
import com.example.festo.product.adapter.out.persistence.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Optional;
import java.util.Random;

@SpringBootTest
class FestoApplicationTests {

    @Autowired
    private MemberRepository memberRepository;
    @Autowired
    private FestivalRepository festivalRepository;
    @Autowired
    private BoothRepository boothRepository;
    @Autowired
    private ProductRepository productRepository;


//    @Test
//    void 더미데이터_축제() {
//        Member member = memberRepository.getById(1L);
//        for(int i=1;i<=10;i++){
//            FestivalEntity festivalEntity = FestivalEntity.builder()
//                    .name(i + "번째" + "축제")
//                    .description("test" + i)
//                    .address("test address")
//                    .startDate(LocalDate.now())
//                    .endDate(LocalDate.of(2024,1,1))
//                    .imageUrl("")
//                    .inviteCode(randomCode())
//                    .festivalStatus(FestivalStatus.CLOSE)
//                    .manager(member)
//                    .build();
//
//            festivalRepository.save(festivalEntity);
//        }
//    }
//    @Test
//    void 더미데이터_부스() {
//        Member member = memberRepository.getById(1L);
//        for(long j=1;j<=10;j++){
//            Optional<FestivalEntity> festival = festivalRepository.findById(j);
//            if(festival.isEmpty()){
//                System.out.println("에러 발생");
//            }
//
//            for(int i=1;i<=j+1;i++){
//                BoothEntity entity = BoothEntity.builder()
//                        .name(j+"번째 축제 "+ i + "번째 booth")
//                        .openTime(LocalTime.of(6,0))
//                        .closeTime(LocalTime.of(18,0))
//                        .locationDescription("광주")
//                        .boothDescription(i+"번째부스")
//                        .imageUrl("")
//                        .boothStatus(BoothStatus.CLOSE)
//                        .owner(member)
//                        .festival(festival.get())
//                        .build();
//
//                boothRepository.save(entity);
//            }
//        }
//
//    }
//    @Test
//    void 더미데이터_메뉴_() {
//        for(long j=1;j<= 65;j++){
//            Optional<BoothEntity> booth = boothRepository.findById(j);
//            for(int i=1;i<=j+1;i++){
//                ProductEntity entity = ProductEntity.builder()
//                        .name(j+"번째 부스 " + i +"번째 메뉴")
//                        .price(new Money(1000))
//                        .imageUrl("")
//                        .booth(booth.get())
//                        .build();
//
//                productRepository.save(entity);
//            }
//        }
//
//    }


    @Test
    void 더미데이터_축제_대용량() {
        Member member = memberRepository.getById(1L);
        for(int i=0;i<1000;i++){
            FestivalEntity festivalEntity = FestivalEntity.builder()
                    .name(i + "번째" + "축제")
                    .description("test" + i)
                    .address("test address")
                    .startDate(LocalDate.now())
                    .endDate(LocalDate.of(2024,1,1))
                    .imageUrl("")
                    .inviteCode(randomCode())
                    .festivalStatus(FestivalStatus.CLOSE)
                    .manager(member)
                    .build();

            festivalRepository.save(festivalEntity);
        }
    }
    @Test
    void 더미데이터_부스_대용량() {
        Member member = memberRepository.getById(1L);
        for(long j=1;j<=1000;j++){
            Optional<FestivalEntity> festival = festivalRepository.findById(j);
            if(festival.isEmpty()){
                System.out.println("에러 발생");
            }

            for(int i=1;i<=1000;i++){
                BoothEntity entity;
                entity = BoothEntity.builder()
                        .name(j+"번째 축제 "+ i + "번째 booth")
                        .openTime(LocalTime.of(6,0))
                        .closeTime(LocalTime.of(18,0))
                        .locationDescription("광주")
                        .boothDescription(i+"번째부스")
                        .imageUrl("")
                        .boothStatus(BoothStatus.OPEN)
                        .owner(member)
                        .festival(festival.get())
                        .build();
//                if(i%2==0){
//                    entity = BoothEntity.builder()
//                            .name(j+"번째 축제 "+ i + "번째 booth")
//                            .openTime(LocalTime.of(6,0))
//                            .closeTime(LocalTime.of(18,0))
//                            .locationDescription("광주")
//                            .boothDescription(i+"번째부스")
//                            .imageUrl("")
//                            .boothStatus(BoothStatus.OPEN)
//                            .owner(member)
//                            .festival(festival.get())
//                            .build();
//                }
//                else{
//                    entity = BoothEntity.builder()
//                            .name(j+"번째 축제 "+ i + "번째 booth")
//                            .openTime(LocalTime.of(6,0))
//                            .closeTime(LocalTime.of(18,0))
//                            .locationDescription("광주")
//                            .boothDescription(i+"번째부스")
//                            .imageUrl("")
//                            .boothStatus(BoothStatus.CLOSE)
//                            .owner(member)
//                            .festival(festival.get())
//                            .build();
//                }


                boothRepository.save(entity);
            }
        }

    }
    @Test
    void 더미데이터_메뉴_대용량() {
        for(long j=1;j<=100000;j++){
            Optional<BoothEntity> booth = boothRepository.findById(j);
            for(int i=1;i<=10;i++){
                ProductEntity entity = ProductEntity.builder()
                        .name(j+"번째 부스 " + i +"번째 메뉴")
                        .price(new Money(1000))
                        .imageUrl("")
                        .booth(booth.get())
                        .build();

                productRepository.save(entity);
            }
        }

    }

    private String randomCode() {
        boolean flag = false;
        String uniqueCode = "";
        while (!flag) {
            Random random = new Random();
            int randomNum = random.nextInt(900000) + 100000; // 100000 ~ 999999 범위의 랜덤한 정수

            uniqueCode = Integer.toString(randomNum);

            if (!festivalRepository.existsByInviteCode(uniqueCode)) {
                flag = true;
            }
        }
        return uniqueCode;
    }
}
