package cl.example.demo.controller;

import cl.example.demo.domain.responses.AppResponse;
import cl.example.demo.services.AppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/app")
public class RestAppController {

    @Autowired
    private AppService appService;

    @GetMapping
    public ResponseEntity<AppResponse> getAppInfo(){
        return ResponseEntity.ok(appService.getApp());
    }
}
