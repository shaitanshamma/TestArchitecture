package lesson6.service;

import lesson6.entyties.Brand;
import lesson6.entyties.Glue;
import lesson6.repo.GlueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GlueService {

    @Autowired
    GlueRepository glueRepository;

    public List<Glue> findAll() {
        return glueRepository.findAll();
    }

    public Optional findById(Long id) {
        return glueRepository.findById(id);
    }

    public List<Glue> findByWidth(double width) {
        return glueRepository.findByWidth(width);
    }

    public List<Glue> findByBrand(Brand brand) {
        return glueRepository.findByBrand(brand);
    }

    public Glue save(Glue glue) {
        return glueRepository.save(glue);
    }

    public void delete(Long id) {
        glueRepository.deleteById(id);
    }

}
