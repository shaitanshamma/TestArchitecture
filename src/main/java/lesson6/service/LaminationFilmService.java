package lesson6.service;

import lesson6.entyties.Brand;
import lesson6.entyties.LaminationFilm;
import lesson6.repo.LaminationFilmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LaminationFilmService {

    @Autowired
    LaminationFilmRepository laminationFilmRepository;

    public List<LaminationFilm> findAll() {
        return laminationFilmRepository.findAll();
    }

    public Optional findById(Long id) {
        return laminationFilmRepository.findById(id);
    }

    public List<LaminationFilm> findByThick(double thickness) {
        return laminationFilmRepository.findByThickness(thickness);
    }

    public List<LaminationFilm> findByWidth(double width) {
        return laminationFilmRepository.findByWidth(width);
    }

    public List<LaminationFilm> findByBrand(Brand brand) {
        return laminationFilmRepository.findByBrand(brand);
    }

    public LaminationFilm save(LaminationFilm laminationFilm){
        return laminationFilmRepository.save(laminationFilm);
    }

    public void delete(Long id){
        laminationFilmRepository.deleteById(id);
    }

}
