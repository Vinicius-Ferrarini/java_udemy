package com.example.demo.service;

import com.example.demo.model.Suporte;
import com.example.demo.repository.SuporteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SuporteService {

    @Autowired
    private SuporteRepository suporteRepository;

    public List<Suporte> findAll() {
        return suporteRepository.findAll();
    }

    public Optional<Suporte> findById(Long id) {
        return suporteRepository.findById(id);
    }

    public Suporte save(Suporte suporte) {
        return suporteRepository.save(suporte);
    }

    public void deleteById(Long id) {
        suporteRepository.deleteById(id);
    }
}
