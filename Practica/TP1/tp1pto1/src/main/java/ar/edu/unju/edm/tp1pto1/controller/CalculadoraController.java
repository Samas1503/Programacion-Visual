package ar.edu.unju.edm.tp1pto1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unju.edm.tp1pto1.models.Calculadora;

@Controller
public class CalculadoraController {
    @Autowired
    Calculadora unaCalculadora;

    @GetMapping({"calculadora"})
    public String controladorCalculadora(){
        return "calculadora";
    }

    @GetMapping({"/calculadora/CalculoSuma"})
    public ModelAndView CalculoSuma(@RequestParam (name = "num1") String num1, @RequestParam (name ="num2") String num2){
        unaCalculadora.setNum1(Double.valueOf(num1));
        unaCalculadora.setNum2(Double.valueOf(num2));
        double resultadoSuma = unaCalculadora.suma();
        ModelAndView modelView = new ModelAndView("respuesta");
        modelView.addObject("resultado",resultadoSuma);
        return modelView;
    }
    @GetMapping({"/calculadora/CalculoResta"})
    public ModelAndView CalculoResta(@RequestParam (name = "num1") String num1, @RequestParam (name ="num2") double num2){
        unaCalculadora.setNum1(Double.valueOf(num1));
        unaCalculadora.setNum2(num2);
        double resultadoResta = unaCalculadora.resta();
        ModelAndView modelView = new ModelAndView();
        modelView.addObject("CalculoResta",resultadoResta);
        return modelView;
    }
    @GetMapping({"/calculadora/CalculoProducto"})
    public ModelAndView CalculoPoroducto(@RequestParam (name = "num1") String num1, @RequestParam (name ="num2") double num2){
        unaCalculadora.setNum1(Double.valueOf(num1));
        unaCalculadora.setNum2(num2);
        double resultadoProducto = unaCalculadora.multilpicar();
        ModelAndView modelView = new ModelAndView();
        modelView.addObject("CalculoSuma",resultadoProducto);
        return modelView;
    }
    @GetMapping({"/calculadora/CalculoCociente"})
    public ModelAndView CalculoDivision(@RequestParam (name = "num1") String num1, @RequestParam (name ="num2") double num2){
        unaCalculadora.setNum1(Double.valueOf(num1));
        unaCalculadora.setNum2(num2);
        double resultadoDivision = unaCalculadora.dividir();
        ModelAndView modelView = new ModelAndView();
        modelView.addObject("CalculoSuma",resultadoDivision);
        return modelView;
    }
}