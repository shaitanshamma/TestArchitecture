package lesson6.repo;

import lesson6.entyties.Brand;
import lesson6.entyties.LaminationFilm;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LaminationFilmRepository extends JpaRepository<LaminationFilm, Long> {
    List<LaminationFilm> findByThickness(double thickness);

    List<LaminationFilm> findByWidth(double width);

    List<LaminationFilm> findByBrand(Brand brand);
}
