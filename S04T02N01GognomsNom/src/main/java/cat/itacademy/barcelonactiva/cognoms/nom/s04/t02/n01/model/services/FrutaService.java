package cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n01.model.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n01.model.domain.FrutaModel;
import cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n01.model.repository.FrutaRepository;

@Service
public class FrutaService {
	FrutaRepository repositorioFruta;
	
	@Autowired
	public FrutaService(FrutaRepository repositorioFruta) {
		this.repositorioFruta= repositorioFruta;
	}

    public FrutaModel addFruta(FrutaModel fruta) {
    	return repositorioFruta.save(fruta);
    }

    public void updateFruta(FrutaModel fruta) {
    	repositorioFruta.save(fruta);
    }

    public void deleteFruta(long id) {
    	repositorioFruta.deleteById(id);
    }

    public FrutaModel getFruta(long id) {
        return repositorioFruta.findById(id).orElse(null);
    }

    public List<FrutaModel> getAllFrutas() {
        return repositorioFruta.findAll();
    }
}
