package br.com.alura.screenmatch.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SerieController {


    @GetMapping("/series")
    public String obterSeries() {
        return "as séries estão aqui";
    }

}
