package com.example.demo.controller;

import com.example.demo.model.Suporte;
import com.example.demo.service.SuporteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/suportes")
public class SuporteController {

    @Autowired
    private SuporteService suporteService;

    @GetMapping
    public List<Suporte> getAllSuportes() {
        return suporteService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Suporte> getSuporteById(@PathVariable Long id) {
        return suporteService.findById(id);
    }

    @PostMapping
    public Suporte createSuporte(@RequestBody Suporte suporte) {
        return suporteService.save(suporte);
    }

    @PutMapping("/{id}")
    public Suporte updateSuporte(@PathVariable Long id, @RequestBody Suporte suporte) {
        suporte.setId(id);
        return suporteService.save(suporte);
    }

    @DeleteMapping("/{id}")
    public void deleteSuporte(@PathVariable Long id) {
        suporteService.deleteById(id);
    }

}
