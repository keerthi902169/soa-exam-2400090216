package com.klef.soa.exam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.klef.soa.exam.entity.CraftWorkshopEntity;
import com.klef.soa.exam.service.CraftWorkshopService;

@RestController

public class CraftWorkshopController {

    @Autowired
    private CraftWorkshopService service;

    @GetMapping("/")
    public String home() {
        return "Crudservice is running";
    }

    @PostMapping("/Add")
    public CraftWorkshopEntity addCrud(
            @RequestBody CraftWorkshopEntity crud) {
        return service.addCrud(crud);
    }

    @GetMapping("/displayAll")
    public List<CraftWorkshopEntity> getAllCrud() {
        return service.getAllCrud();
    }

    @DeleteMapping("/delete/{id}")
    public String deleteCrud(@PathVariable Long id) {
        return service.deleteCrud(id);
    }
}