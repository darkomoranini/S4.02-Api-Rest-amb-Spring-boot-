package cat.itacademy.barcelonactiva.cognoms.nom.s04.t01.n02;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/HelloWorld")
    public String saluda(@RequestParam(value = "nombre", defaultValue = "UNKNOWN") String nombre) {
        return "Hola, " + nombre + ". Estas ejecutando un proyecto Gradle.";
    }

    @GetMapping("/HelloWorld2/{nom}")
    public String saluda2(@PathVariable(required = false) String nombre) {
        if (nombre == null) {
            return "Hola, UNKNOWN. Estas ejecutando un proyecto Gradle.";
        }
        return "Hola, " + nombre + ". Estas ejecutando un proyecto Gradle.";
    }
}
