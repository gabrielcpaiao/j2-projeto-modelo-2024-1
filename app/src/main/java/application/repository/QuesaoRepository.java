package application.repository;

import org.springframework.data.repository.CrudRepository;

import application.model.Questao;

public interface QuesaoRepository extends CrudRepository<Questao, Long> {
    
}
