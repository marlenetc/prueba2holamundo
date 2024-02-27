package com.example.Java.Spring.Boot;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MiControlador {
    @GetMapping("/saludo")
    public String getMessage(){

        return "¡Hola mundo!, soy Marlene Toscano y es mi primer despliegue";
    }
}
