package com.example.rentaautos.controller;

import com.example.rentaautos.beans.Auto;
import com.example.rentaautos.beans.Sede;
import com.example.rentaautos.beans.Seguro;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

@Controller
public class AppController {
    //Data
    //Sedes
    Sede sede1 = new Sede(1, "Miraflores", "Av. Larco 345");
    Sede sede2 = new Sede(2, "San Isidro", "Av. Javier Prado 123");
    Sede sede3 = new Sede(3, "San Borja", "Av. Aviación 456");
    //Autos
    Auto auto1 = new Auto(1, "Toyota Yaris", "Rojo", "1000", sede1, "50");
    Auto auto2 = new Auto(2, "Toyota Corolla", "Azul", "2000", sede2, "60");
    Auto auto3 = new Auto(3, "Toyota Hilux", "Blanco", "3000", sede3, "70");
    //Seguros
    Seguro seguro1 = new Seguro(1, "Todo Riesgo", "100", "200");
    Seguro seguro2 = new Seguro(2, "Terceros", "50", "100");
    Seguro seguro3 = new Seguro(3, "Contra Todo", "150", "300");

    //Formulario de Registro de Autos
    @GetMapping("/registroAutos")
    public String registroAutos() {
        return "formAutos";
    }
    ArrayList<Auto> autos = new ArrayList<>();
    //RequestParam para autos
    @PostMapping("/registroAutos")
    public String registroAuto(@RequestParam("idAuto") int idAuto,
                               @RequestParam("modelo")String modelo,
                               @RequestParam("color") String color,
                               @RequestParam("kilometraje") String kilometraje,
                               @RequestParam("sede") String Sede,
                               @RequestParam("costoDiario") String costoDiario) {
        Auto auto = new Auto(idAuto, modelo, color, kilometraje, sede1, costoDiario);
        autos.add(auto);

        return "formAutos";
    }
    //Listar autos
    @GetMapping("/listarAutos")
    public String listarAutos(Model model) {
        model.addAttribute("listaAutos",autos);
        return "listaAutos";
    }
    //Formulario de Registro de Seguros
    @GetMapping("/registroSeguros")
    public String registroSeguros() {
        return "formSeguros";
    }
    ArrayList<Seguro> seguros = new ArrayList<>();
    //Data Binding de Seguros
    @PostMapping("/registroSeguros")
    public String registroSeguro(Seguro seguro) {
        seguros.add(seguro);
        return "formSeguros";
    }
    //Listar seguros
    @GetMapping("/listarSeguros")
    public String listarSeguros(Model model) {
        model.addAttribute("listaSeguros",seguros);
        return "listaSeguros";
    }
    //Eliminar Seguros
    @GetMapping("/eliminarSeguro")
    public String eliminarSeguro(@RequestParam("idSeguro") int idSeguro) {
        for (Seguro s : seguros) {
            if (s.getIdSeguro() == idSeguro) {
                seguros.remove(s);
                break;
            }
        }
        return "listaSeguros";
    }
    //Formulario de Registro de Sedes
    @GetMapping("/registroSedes")
    public String registroSedes() {
        return "formSedes";
    }
    ArrayList<Sede> sedes = new ArrayList<>();
    //Data Binding de Sedes
    @PostMapping("/registroSedes")
    public String registroSede(Sede sede) {
        sedes.add(sede);
        return "formSedes";
    }
    //Listar sedes
    @GetMapping("/listarSedes")
    public String listarSedes(Model model) {
        model.addAttribute("listaSedes",sedes);
        return "listaSedes";
    }
}
