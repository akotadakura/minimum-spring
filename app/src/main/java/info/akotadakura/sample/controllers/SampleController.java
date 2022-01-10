package info.akotadakura.sample.controllers;

import info.akotadakura.sample.services.SampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    private final SampleService sampleService;

    @Autowired
    public SampleController(SampleService sampleService){
        this.sampleService = sampleService;
    }

    @GetMapping("/")
    public String init(){
        return sampleService.getName(1);
    }
}
