package cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n01.controllers;

import org.springframework.web.bind.annotation.*;

import cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n01.model.domain.FrutaModel;
import cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n01.model.services.FrutaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import java.util.List;

@RestController
@RequestMapping("/fruta")
public class FrutaController {
	FrutaService servicioFruta;
	
	@Autowired
    public FrutaController(FrutaService servicioFruta) {
        this.servicioFruta = servicioFruta;
    }

    @PostMapping("/add")
    public ResponseEntity<String> addFruta(@RequestBody FrutaModel fruta) {
    	servicioFruta.addFruta(fruta);
        return new ResponseEntity<>("Fruita added successfully", HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<String> updateFruta(@RequestBody FrutaModel fruta) {
    	servicioFruta.updateFruta(fruta);
        return new ResponseEntity<>("Fruita updated successfully", HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteFruta(@PathVariable long id) {
    	servicioFruta.deleteFruta(id);
        return new ResponseEntity<>("Fruita deleted successfully", HttpStatus.OK);
    }

    @GetMapping("/getOne/{id}")
    public ResponseEntity<FrutaModel> getFruta(@PathVariable long id) {
        FrutaModel fruta = servicioFruta.getFruta(id);
        if (fruta != null) {
            return new ResponseEntity<>(fruta, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<FrutaModel>> getAllFrutas() {
        List<FrutaModel> listaFrutas = servicioFruta.getAllFrutas();
        return new ResponseEntity<>(listaFrutas, HttpStatus.OK);
    }
}

