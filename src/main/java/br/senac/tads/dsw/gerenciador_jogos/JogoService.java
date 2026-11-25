package br.senac.tads.dsw.gerenciador_jogos;

import java.util.List;
import java.util.Optional;

public interface JogoService {
    List<JogoDto> obterJogos();
    Optional<JogoDto> obterJogo(Integer id);
    JogoDto incluirNovoJogo(JogoDto jogo);
    JogoDto alterarJogo(Integer id, JogoDto jogoAlteracao);
    void removerJogo(Integer id);
}