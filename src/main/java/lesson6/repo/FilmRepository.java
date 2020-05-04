package lesson6.repo;

import lesson6.entyties.Brand;
import lesson6.entyties.Film;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FilmRepository extends JpaRepository<Film, Long> {

    List<Film> findByColor(String color);

    List<Film> findByWidth(double width);

    List<Film> findByBrand(Brand brand);
}
