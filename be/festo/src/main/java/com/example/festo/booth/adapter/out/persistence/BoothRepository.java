package com.example.festo.booth.adapter.out.persistence;

import com.example.festo.booth.adapter.out.dto.BoothDTO;
import com.example.festo.booth.domain.BoothStatus;
import com.example.festo.festival.adapter.out.persistence.FestivalEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalTime;
import java.util.List;

@Repository
public interface BoothRepository extends JpaRepository<BoothEntity, Long> {
    @Query("SELECT DISTINCT b.festival FROM BoothEntity b WHERE b.owner.id = :ownerId")
    List<FestivalEntity> findDistinctFestivalsByOwnerId(Long ownerId);
    List<BoothEntity> findAllByFestivalFestivalId(Long festivalId);
    List<BoothEntity> findAllByOwnerId(Long ownerId);
    List<BoothEntity> findByBoothStatus(BoothStatus status);
    @Query("SELECT b FROM BoothEntity b " +
            "WHERE b.boothStatus = :status " +
            "AND :currentTime BETWEEN b.openTime AND b.closeTime")
    List<BoothEntity> findOpenBoothsAtCurrentTime(
            @Param("status") BoothStatus status,
            @Param("currentTime") LocalTime currentTime);
    @Query("SELECT new com.example.festo.booth.adapter.out.dto.BoothDTO(b.boothId,b.name,b.imageUrl,b.boothDescription, b.festival) FROM BoothEntity b " +
            "WHERE b.boothStatus = :status " +
            "AND :currentTime BETWEEN b.openTime AND b.closeTime")
    List<BoothDTO> findOpenBoothsAtCurrentTimeTest(
            @Param("status") BoothStatus status,
            @Param("currentTime") LocalTime currentTime);


}
