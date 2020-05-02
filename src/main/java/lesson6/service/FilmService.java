package lesson6.service;

import lesson6.entyties.Brand;
import lesson6.entyties.Film;
import lesson6.repo.FilmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FilmService {

    @Autowired
    FilmRepository filmRepository;

    public List<Film> findAll() {
        return filmRepository.findAll();
    }

    public Optional findById(Long id) {
        return filmRepository.findById(id);
    }

    public List<Film> findByColor(String color) {
        return filmRepository.findByColor(color);
    }

    public List<Film> findByWidth(double width) {
        return filmRepository.findByWidth(width);
    }

    public List<Film> findByBrand(Brand brand) {
        return filmRepository.findByBrand(brand);
    }

    public Film save(Film film){
        return filmRepository.save(film);
    }

    public void delete(Long id){
        filmRepository.deleteById(id);
    }
}
