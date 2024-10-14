package com.example.mutantApi.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class MutantController {

    @PostMapping("/")
    public ResponseEntity<String> isMutant(@RequestBody DnaRequest dnaRequest) {
        boolean isMutant = detectMutant(dnaRequest.getDna());

        if (isMutant) {
            return ResponseEntity.ok("Mutant detected");
        } else {
            return ResponseEntity.status(HttpStatus.FORBIDDEN).body("Not a mutant");
        }
    }

    private boolean detectMutant(String[] dna) {
        return false;
    }
}
