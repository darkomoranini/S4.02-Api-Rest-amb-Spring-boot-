package cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n01.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n01.model.domain.FrutaModel;

@Repository
public interface FrutaRepository extends JpaRepository<FrutaModel, Long> {
    
}
