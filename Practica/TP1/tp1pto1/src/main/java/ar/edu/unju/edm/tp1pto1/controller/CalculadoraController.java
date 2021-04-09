package ar.edu.unju.edm.tp1pto1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unju.edm.tp1pto1.models.Calculadora;

@Controller
public class CalculadoraController {
    @Autowired
    private Calculadora unaCalculadora;

    @GetMapping(value="/calculadora")
    public String controladorCalculadora(){
        return "calculadora";
    }

    @GetMapping(value="/calculadora/CalculoSuma")
    public ModelAndView CalcularSuma(@RequestParam (name = "num1") String num1, @RequestParam (name="num2") double num2){
        unaCalculadora.setNum1(Double.valueOf(num1));
        unaCalculadora.setNum2(num2);
        double resultadoSuma = unaCalculadora.suma();
        ModelAndView modelView = new ModelAndView("respuesta");
        modelView.addObject("resultado", resultadoSuma);
        return modelView;
    }

    @GetMapping(value="/calculadora/CalculoResta")
    public ModelAndView CalcularResta(@RequestParam (name = "num1") String num1, @RequestParam (name ="num2") double num2){
        unaCalculadora.setNum1(Double.valueOf(num1));
        unaCalculadora.setNum2(num2);
        double resultadoResta = unaCalculadora.resta();
        ModelAndView modelView = new ModelAndView("respuesta");
        modelView.addObject("resultado",resultadoResta);
        return modelView;
    }
    @GetMapping(value="/calculadora/CalculoProducto")
    public ModelAndView CalcularPoroducto(@RequestParam (name = "num1") String num1, @RequestParam (name ="num2") double num2){
        unaCalculadora.setNum1(Double.valueOf(num1));
        unaCalculadora.setNum2(num2);
        double resultadoProducto = unaCalculadora.multilpicar();
        ModelAndView modelView = new ModelAndView("respuesta");
        modelView.addObject("resultado",resultadoProducto);
        return modelView;
    }
    @GetMapping(value="/calculadora/CalculoCociente")
    public ModelAndView CalcularDivision(@RequestParam (name = "num1") String num1, @RequestParam (name ="num2") double num2){
        unaCalculadora.setNum1(Double.valueOf(num1));
        unaCalculadora.setNum2(num2);
        double resultadoDivision = unaCalculadora.dividir();
        ModelAndView modelView = new ModelAndView("respuesta");
        modelView.addObject("resultado",resultadoDivision);
        return modelView;
    }
}