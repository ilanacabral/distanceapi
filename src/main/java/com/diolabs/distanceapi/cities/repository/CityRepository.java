package com.diolabs.distanceapi.cities.repository;

import com.diolabs.distanceapi.cities.model.City;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends JpaRepository<City, Long> {

    @Query(value = "SELECT ((SELECT lat_lon FROM cidade WHERE id=?1) <@> (SELECT lat_lon FROM cidade WHERE id=?2)) as distance", nativeQuery = true)
    double calculateDistanteByPoinysInMiles(Long idCity1, Long idCity2);

    @Query(value = "SELECT earth_distance(ll_to_earth(?1,?2), ll_to_earth(?3,?4)) as distance", nativeQuery = true)
    double calculateDistanceByCubeInMeters(final Double lat1, final Double lon1, final Double lat2, final Double lon2);

  
  
    
}
