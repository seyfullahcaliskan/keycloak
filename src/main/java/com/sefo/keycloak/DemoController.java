package com.sefo.keycloak;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/demo")
public class DemoController {

    @GetMapping
    @PreAuthorize("hasRole('client_user')")
    public String hello(){
        return "Hello from Spring boot & keycloak";
    }

    @GetMapping("/hello-2")
    public String hello2(){
        return "Hello-2 from Spring boot & keycloak - ADMIN";    }
}
