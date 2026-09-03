package com.backend.rental_events.configs;

import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@Configuration
@OpenAPIDefinition(
    info = @Info(
        title = "Rental Eventos API",
        description = "E-mail para contato: saldanhar494@gmail.com"
    )
)
public class Swagger {
    
}
