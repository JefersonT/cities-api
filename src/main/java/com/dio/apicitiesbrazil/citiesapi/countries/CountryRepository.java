package com.dio.apicitiesbrazil.citiesapi.countries;

import com.dio.apicitiesbrazil.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {

}
