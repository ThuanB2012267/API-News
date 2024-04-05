package com.example.webtintuc.controller;

import com.example.webtintuc.model.TinModel;
import com.example.webtintuc.repository.TinRepository;
import com.example.webtintuc.service.TinService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tin")
@CrossOrigin(origins = "*")
public class TinController {
    private final TinService tinService;

    public TinController(TinService tinService) {
        this.tinService = tinService;
    }

    @PostMapping
    public ResponseEntity addTin(@RequestBody TinModel tin){
        tinService.addTin(tin);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @PutMapping
    public ResponseEntity updateTin(@RequestBody TinModel tin){
        tinService.updateTin(tin);
        return ResponseEntity.ok().build();
    }
    @GetMapping
    public ResponseEntity<List<TinModel>> getallTin(){
        return ResponseEntity.ok(tinService.getallTin());
    }

    @GetMapping("/{name}")
    public ResponseEntity<TinModel> getTinByName(@PathVariable String name){
        return ResponseEntity.ok(tinService.getTinByName(name));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteTin(@PathVariable String id){
        tinService.deleteTin(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }


}
