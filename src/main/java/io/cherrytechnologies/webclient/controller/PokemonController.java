package io.cherrytechnologies.webclient.controller;

import io.cherrytechnologies.webclient.domain.Pokemon;
import io.cherrytechnologies.webclient.dto.ResponseDto;
import io.cherrytechnologies.webclient.service.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/pokemon")
public class PokemonController {

    @Autowired
    private PokemonService service;

    @GetMapping("/{id}")
    public Mono<ResponseDto<Pokemon>> getPokemonById(@PathVariable int id){
        return service.getPokemonBuId(id);
    }
}
