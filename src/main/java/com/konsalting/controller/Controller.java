package com.konsalting.controller;

import com.konsalting.service.StringService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {

    private final StringService service;

    public Controller(StringService service) {
        this.service = service;
    }

    @Operation(
            summary = "Передаем любую строку, для получение количества каждого символов в ней.",
            responses = {
                    @ApiResponse(
                            responseCode = "200",
                            description = "результат разбора строки"
                    )
            }
    )
    @PostMapping("/startString")
    public String createString(@RequestParam String s) {
        return service.countSymbols(s);
    }
}
