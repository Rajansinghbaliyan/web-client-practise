package io.cherrytechnologies.webclient.service;

import io.cherrytechnologies.webclient.domain.Pokemon;
import io.cherrytechnologies.webclient.dto.ResponseDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
@Slf4j
public class PokemonService {

    @Autowired
    private WebClient webClient;

    public Mono<ResponseDto<Pokemon>> getPokemonBuId(int id) {
        return webClient
                .get()
                .uri("/{id}", id)
                .retrieve()
                .bodyToMono(Pokemon.class)
                .doOnNext(pokemon -> log.debug("Pokemon is :" + pokemon))
                .map(ResponseDto::new);
    }
}
