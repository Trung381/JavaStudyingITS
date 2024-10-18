package com.example.vuvantrung.Controller;

import com.example.vuvantrung.Entity.TierConfig;
import com.example.vuvantrung.Service.TierConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/TierConfig")
public class TierConfigController {
    @Autowired
    private TierConfigService tierConfigService;

    @PostMapping
    public ResponseEntity<TierConfig> createTierConfig(@RequestBody TierConfig tierConfig){
        return ResponseEntity.ok(tierConfigService.createTierConfig(tierConfig));
    }

    @GetMapping
    public ResponseEntity<List<TierConfig>> getAllTierConfigs(){
        return ResponseEntity.ok(tierConfigService.getAllTierConfigs());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<TierConfig> deleteTierConfigById(@PathVariable Long id){
        return ResponseEntity.ok(tierConfigService.deleteTierConfigById(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<TierConfig> updateTierConfig(@PathVariable Long id, @RequestBody TierConfig updatedTierConfig) {
        return ResponseEntity.ok(tierConfigService.updateTierConfig(id, updatedTierConfig));
    }
}
