package com.example.festo.booth.adapter.out.dto;

import com.example.festo.festival.adapter.out.persistence.FestivalEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.time.LocalTime;
@Getter
@RequiredArgsConstructor
public class BoothDTO {

    private Long boothId;
    private String name;
    private String imageUrl;
    private String boothDescription;
    private FestivalEntity festival;

    public BoothDTO(Long boothId, String name, String imageUrl, String boothDescription, FestivalEntity festival) {
        this.boothId = boothId;
        this.name = name;
        this.imageUrl = imageUrl;
        this.boothDescription = boothDescription;
        this.festival = festival;
    }
}
