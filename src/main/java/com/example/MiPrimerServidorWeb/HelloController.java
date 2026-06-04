package com.example.MiPrimerServidorWeb;

import org.springframework.web.bind.annotation.*;

@RestController                  // registra esta clase como controlador HTTP
@RequestMapping("/api")          // prefijo base de las rutas
public class HelloController {

    @GetMapping("/hello")        // GET /api/hello
    public String hello() {
        return "¡Hola desde mi controlador Spring Boot!";
    }
        @GetMapping("/saludo")       // GET /api/saludo?nombre=Antonio
        public String saludar (@RequestParam String nombre){
            return "Hola, " + nombre + " este es mi servidor de aplicación!";
        }

        @PostMapping("/mensaje")
    public String recibirMensaje(@RequestBody String mensaje){
        return "Recibí tu mensaje " + mensaje;
        }
    }
