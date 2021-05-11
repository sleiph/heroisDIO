package com.dio.heroisdio.repository;

import com.dio.heroisdio.document.Heroes;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

@EnableScan

public interface HeroesRepository extends CrudRepository<Heroes, String> {
}
