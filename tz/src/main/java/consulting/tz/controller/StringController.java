
package consulting.tz.controller;

import consulting.tz.service.StringService;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StringController {
    @Autowired
    StringService service;
    @GetMapping("/characters/{s}")
    public ResponseEntity<Map<Character,Integer>> getNumberOfCharacters(@PathVariable String s){
        
        return ResponseEntity.ok().body(service.getNumberOfString(s));
    }
    
}
