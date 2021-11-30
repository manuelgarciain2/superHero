package com.in2.superHeroe.SuperHeroe.repository;

import com.in2.superHeroe.SuperHeroe.model.SuperHero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public interface SuperHerorepository extends JpaRepository<SuperHero,Long> {

    List<SuperHero> findBysuperHeroNameContaining(String name);


}
