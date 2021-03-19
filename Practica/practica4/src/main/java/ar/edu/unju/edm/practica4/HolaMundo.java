package ar.edu.unju.edm.practica4;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HolaMundo {
    @RequestMapping(method = RequestMethod.GET)
    public String home(){
        return "Hola Mundo";
    }

}
