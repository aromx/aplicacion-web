package com.example.aplicacionweb;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;








@RestController
@RequestMapping("api/v2/personas")
public class PersonaController {

    @GetMapping
    public List<Persona> getPersonas(){
        return
                List.of(new Persona("Ana",9),
                        new Persona("Arturo", 9));
    }
}
