package com.develhope.Exercise0201;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1")
public class NameController {
    @GetMapping("/name")
    public String nome (@RequestParam String name) {
        return name;
    }


    @PostMapping("/reversename")
    public String reverseName (@RequestBody String name) {
        StringBuilder stringBuilder = new StringBuilder(name).reverse();
        return stringBuilder.toString();
    }


}
