package br.senac.tads.dsw.gerenciador_jogos.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.senac.tads.dsw.gerenciador_jogos.entidade.JogoEntity;

@Repository
public interface JogoRepository extends JpaRepository<JogoEntity, Integer> {
}
