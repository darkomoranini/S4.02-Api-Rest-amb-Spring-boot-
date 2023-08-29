package cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n02.model.repository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n02.model.domain.FrutaModel;

@Repository
public interface FrutaRepository extends MongoRepository<FrutaModel, Integer> {
    
}
