package br.senac.tads.dsw.gerenciador_jogos;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ProblemDetail;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/jogos")
public class JogoController {

    private final JogoService jogoService;

    public JogoController(JogoService jogoService) {
        this.jogoService = jogoService;
    }

    @GetMapping
    public List<JogoDto> obterJogos() {
        return jogoService.obterJogos();
    }

    @GetMapping("/{id}")
    public JogoDto obterJogo(@PathVariable("id") Integer id) {
        Optional<JogoDto> optJogo = jogoService.obterJogo(id);
        if (optJogo.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Jogo não encontrado");
        }
        return optJogo.get();
    }

    @PostMapping
    public ResponseEntity<JogoDto> incluirNovo(@RequestBody @Valid JogoDto jogo) {
        JogoDto salvo = jogoService.incluirNovoJogo(jogo);
        URI location = ServletUriComponentsBuilder
            .fromCurrentContextPath()
            .path("/jogos/{id}")
            .buildAndExpand(salvo.getId())
            .toUri();
        return ResponseEntity.created(location).body(salvo);
    }

    @PutMapping("/{id}")
    public ResponseEntity<JogoDto> atualizar(@PathVariable("id") Integer id,
            @RequestBody @Valid JogoDto jogo) {
        JogoDto atualizado = jogoService.alterarJogo(id, jogo);
        return ResponseEntity.ok(atualizado);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> remover(@PathVariable("id") Integer id) {
        jogoService.removerJogo(id);
        return ResponseEntity.noContent().build();
    }

    @ExceptionHandler(NaoEncontradoException.class)
    public ResponseEntity<ProblemDetail> tratarNaoEncontrado(NaoEncontradoException ex) {
        ProblemDetail pd = ProblemDetail.forStatusAndDetail(
                HttpStatusCode.valueOf(404), ex.getMessage());
        return ResponseEntity.of(pd).build();
    }
}