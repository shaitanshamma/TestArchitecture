package lesson6.service;

import lesson6.entyties.Brand;
import lesson6.repo.BrandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BrandService {

    @Autowired
    BrandRepository brandRepository;

    public List<Brand> findAll() {
        return brandRepository.findAll();
    }

    public Optional findById(Long id) {
        return brandRepository.findById(id);
    }

    public Brand save(Brand brand) {
        return brandRepository.save(brand);
    }

    public void delete(Long id) {
        brandRepository.deleteById(id);
    }
}
