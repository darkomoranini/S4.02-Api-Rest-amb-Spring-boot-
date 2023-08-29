package cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n02.model.servicesImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n02.model.domain.FrutaModel;
import cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n02.model.repository.FrutaRepository;
import cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n02.model.services.FrutaService;

@Service
public class FrutaServiceImp implements FrutaService{

	@Autowired
	private FrutaRepository repositorioFruta;

	@Override
	public FrutaModel addFruta(FrutaModel fruta) {
		return repositorioFruta.save(fruta);
	}

	@Override
	public void updateFruta(FrutaModel fruta) {
		repositorioFruta.save(fruta);
		
	}

	@Override
	public void deleteFruta(int id) {
		repositorioFruta.deleteById(id);
		
	}

	@Override
	public FrutaModel getFruta(int id) {
		return repositorioFruta.findById(id).orElse(null);
	}

	@Override
	public List<FrutaModel> getAllFrutas() {
		return repositorioFruta.findAll();
	}

}
