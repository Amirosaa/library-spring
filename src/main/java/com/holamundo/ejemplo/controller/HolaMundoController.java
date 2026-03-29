package com.holamundo.ejemplo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaMundoController {

    @GetMapping("/hola")
    public String holaMundo() {
        return "¡Aranea y Astra hola!";
    }

    @GetMapping("/chau")
    public String chauMundo() {
        return "¡Aranea y Astra adios!";
    }

    @GetMapping("/poto")
    public String potoMundo() {
        return "¡Aranea y Astra poto!";
    }
}


