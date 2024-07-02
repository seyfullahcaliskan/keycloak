package com.sefo.keycloak.Resource;

import com.sefo.keycloak.Entity.TestEntity;
import com.sefo.keycloak.Service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/test")
public class TestResource {

    @Autowired
    private final TestService testService;

    public TestResource(TestService testService) {
        this.testService = testService;
    }
    @GetMapping
    public ResponseEntity<List<TestEntity>> findAll() {
        return testService.findAll();
    }

    @GetMapping("/hello-5")
    public String hello2() {
        return "Hello-2 from Spring boot & keycloak - ADMIN";
    }

}
