package stephan.kitschminyof.springtemplate.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloWorldController {

    @GetMapping("/api")
    public ResponseEntity<String> helloWorld() {
        return new ResponseEntity<>("Hello world !", HttpStatus.OK);
    }
}
