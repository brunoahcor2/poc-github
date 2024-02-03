package br.com.bahcor.pocgithub.resource;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("api/v1/start")
public class StartResource {

    @GetMapping(value = "/{input}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> start(@PathVariable String input) {
        String response = "Voce escreveu o valor [ "+input+" ] em PathVariable.";
        return ResponseEntity.ok(response);
    }
    
}
