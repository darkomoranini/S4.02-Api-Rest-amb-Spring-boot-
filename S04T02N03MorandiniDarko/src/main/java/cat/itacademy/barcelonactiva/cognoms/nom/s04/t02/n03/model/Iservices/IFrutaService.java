package cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n03.model.Iservices;

import java.util.List;

import cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n03.model.domain.FrutaModel;

public interface IFrutaService {
	
	FrutaModel addFruta(FrutaModel fruta);
	
	void updateFruta(FrutaModel fruta);
	
	void deleteFruta(int id);
	
	FrutaModel getFruta(int id);
	
	List<FrutaModel> getAllFrutas();
}
