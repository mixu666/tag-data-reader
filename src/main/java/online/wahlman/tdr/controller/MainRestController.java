package online.wahlman.tdr.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainRestController {
    @PostMapping(path = "/")
    public String printReceivedTag(@RequestBody String requestBody) {
        System.out.println("Received request: " + requestBody);
        return "ok";
    }
}
