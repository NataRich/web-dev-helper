package org.example.web.redis;

import org.example.domain.dto.TokenHeaderDTO;
import org.example.domain.dto.repo.TokenHeaderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("redis")
public class RedisController {
    TokenHeaderRepository repo;

    @Autowired
    public RedisController(TokenHeaderRepository repo) {
        this.repo = repo;
    }

    @GetMapping
    public Object index() {
        return "You are on redis page";
    }

    @GetMapping("/g")
    public Object getTokenHeader(@RequestParam("id") String id) {
        if (repo.existsById(id))
            return repo.findById(id);
        return "Not Found";
    }

    @GetMapping("/s")
    public String saveTokenHeader(@RequestParam("id") String id, @RequestParam("header") String header,
                                  @RequestParam("ttl") Long ttl) {
        TokenHeaderDTO tokenHeaderDTO = new TokenHeaderDTO(id, header, ttl);
        repo.save(tokenHeaderDTO);
        return "Success";
    }

    @GetMapping("/d")
    public String deleteTokenHeader(@RequestParam("id") String id) {
        if (repo.existsById(id)) {
            repo.deleteById(id);
            return repo.existsById(id) ? "Failure" : "Success";
        }
        return "Not Found";
    }
}
