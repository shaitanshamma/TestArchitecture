package lesson6.repo;

import lesson6.entyties.Brand;
import lesson6.entyties.Glue;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GlueRepository extends JpaRepository<Glue, Long> {
    List<Glue> findByWidth(double width);

    List<Glue> findByBrand(Brand brand);
}
