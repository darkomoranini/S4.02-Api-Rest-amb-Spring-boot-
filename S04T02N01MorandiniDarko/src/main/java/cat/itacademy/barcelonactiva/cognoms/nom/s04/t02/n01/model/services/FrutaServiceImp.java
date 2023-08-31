package cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n01.model.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n01.model.Iservices.IFrutaService;
import cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n01.model.domain.FrutaModel;
import cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n01.model.repository.FrutaRepository;

@Service
public class FrutaServiceImp implements IFrutaService {
    private final FrutaRepository repositorioFruta;

    @Autowired
    public FrutaServiceImp(FrutaRepository repositorioFruta) {
        this.repositorioFruta = repositorioFruta;
    }

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
        repositorioFruta.deleteById((long) id);
    }

    @Override
    public FrutaModel getFruta(int id) {
        return repositorioFruta.findById((long) id).orElse(null);
    }

    @Override
    public List<FrutaModel> getAllFrutas() {
        return repositorioFruta.findAll();
    }
}
