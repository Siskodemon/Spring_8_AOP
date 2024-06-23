package com.evilcorp.aspect;

import com.evilcorp.SumArgs;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@Component
@RestController
public class SumController {

    SumArgs sumArgs= new SumArgs();

    @GetMapping("/aspect/i/{i}")
    public Integer setI(@PathVariable Integer i){
        sumArgs.setI(i);
        return sumArgs.getI();
    }

    @GetMapping("/aspect/j/{j}")
    public Integer setJ(@PathVariable Integer j){
        sumArgs.setJ(j);
        return sumArgs.getJ();
    }

    @GetMapping("/aspect/sum")
    public Integer sumIJ(){
        return sumArgs.sumIJ();
    }
}
