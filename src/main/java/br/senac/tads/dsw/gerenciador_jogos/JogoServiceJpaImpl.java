package br.senac.tads.dsw.gerenciador_jogos;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.senac.tads.dsw.gerenciador_jogos.entidade.JogoEntity;
import br.senac.tads.dsw.gerenciador_jogos.repositorio.JogoRepository;

@Service
public class JogoServiceJpaImpl implements JogoService {

    private final JogoRepository jogoRepository;

    public JogoServiceJpaImpl(JogoRepository jogoRepository) {
        this.jogoRepository = jogoRepository;
    }

    private JogoDto toDto(JogoEntity entity) {
        return new JogoDto(
            entity.getId(),
            entity.getTitulo(),
            entity.getAnoLancamento(),
            entity.getPlataforma(),
            entity.getDisponivel(),
            entity.getObservacoes()
        );
    }

    @Override
    public List<JogoDto> obterJogos() {
        return jogoRepository.findAll().stream().map(this::toDto).toList();
    }

    @Override
    public Optional<JogoDto> obterJogo(Integer id) {
        return jogoRepository.findById(id).map(this::toDto);
    }

    @Override
    @Transactional
    public JogoDto incluirNovoJogo(JogoDto dto) {
        JogoEntity entity = new JogoEntity();
        entity.setTitulo(dto.getTitulo().trim());
        entity.setAnoLancamento(dto.getAnoLancamento());
        entity.setPlataforma(dto.getPlataforma().trim());
        entity.setDisponivel(dto.getDisponivel());
        entity.setObservacoes(dto.getObservacoes() != null ? dto.getObservacoes().trim() : null);

        JogoEntity salvo = jogoRepository.save(entity);
        return toDto(salvo);
    }

    @Override
    @Transactional
    public JogoDto alterarJogo(Integer id, JogoDto dto) {
        JogoEntity entity = jogoRepository.findById(id)
            .orElseThrow(() -> new NaoEncontradoException("Jogo não encontrado com ID: " + id));

        entity.setTitulo(dto.getTitulo().trim());
        entity.setAnoLancamento(dto.getAnoLancamento());
        entity.setPlataforma(dto.getPlataforma().trim());
        entity.setDisponivel(dto.getDisponivel());
        entity.setObservacoes(dto.getObservacoes() != null ? dto.getObservacoes().trim() : null);

        JogoEntity atualizado = jogoRepository.save(entity);
        return toDto(atualizado);
    }

    @Override
    @Transactional
    public void removerJogo(Integer id) {
        if (!jogoRepository.existsById(id)) {
            throw new NaoEncontradoException("Jogo não encontrado com ID: " + id);
        }
        jogoRepository.deleteById(id);
    }
}