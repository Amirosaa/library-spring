package com.holamundo.ejemplo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaMundoController {

    @GetMapping("/hola")
    public String holaMundo() {
        return "¡Aranea y astra hola!";
    }

    @GetMapping("/chau")
    public String chauMundo() {
        return "¡Aranea y astra adios!";
    }
}


