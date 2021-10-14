/*package com.example.Darbs.Cilveki;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@Service
@RestController

public class CilvekiController {

    private CilvekiService cilvekiService;

    @Autowired
    public CilvekiController(CilvekiService cilvekiService) {
        this.cilvekiService = cilvekiService;
    }




    @GetMapping
    public List<Cilveki> getCilveki() {
    return CilvekiService.getCilveki();
    }
}
*/