package br.julio.starrebelde.controller;

import br.julio.starrebelde.model.Rebel;
import br.julio.starrebelde.repository.rebeldeRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/rebeldes")
@AllArgsConstructor
public class RebeldeController {

    private final rebeldeRepository rebeldeRepository;

    @GetMapping
    public List<Rebel> list (){
        return rebeldeRepository.findAll();
    }
}
