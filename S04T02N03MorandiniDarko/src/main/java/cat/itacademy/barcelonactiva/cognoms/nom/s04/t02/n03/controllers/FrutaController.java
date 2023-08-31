package cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n03.controllers;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n03.model.Iservices.IFrutaService;
import cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n03.model.domain.FrutaModel;

import java.util.List;

@RestController
@RequestMapping("/fruta")
public class FrutaController {
	@Autowired
	IFrutaService servicioIFruta;

    @PostMapping("/add")
    public ResponseEntity<String> addFruta(@RequestBody FrutaModel fruta) {
    	servicioIFruta.addFruta(fruta);
        return new ResponseEntity<>("Fruita added successfully", HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<String> updateFruta(@RequestBody FrutaModel fruta) {
    	servicioIFruta.updateFruta(fruta);
        return new ResponseEntity<>("Fruita updated successfully", HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteFruta(@PathVariable int id) {
    	servicioIFruta.deleteFruta(id);
        return new ResponseEntity<>("Fruita deleted successfully", HttpStatus.OK);
    }

    @GetMapping("/getOne/{id}")
    public ResponseEntity<FrutaModel> getFruta(@PathVariable int id) {
        FrutaModel fruta = servicioIFruta.getFruta(id);
        if (fruta != null) {
            return new ResponseEntity<>(fruta, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<FrutaModel>> getAllFrutas() {
        List<FrutaModel> listaFrutas = servicioIFruta.getAllFrutas();
        return new ResponseEntity<>(listaFrutas, HttpStatus.OK);
    }
}
