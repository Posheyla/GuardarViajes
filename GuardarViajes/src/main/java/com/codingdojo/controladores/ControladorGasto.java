package com.codingdojo.controladores;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.codingdojo.modelos.Gasto;
import com.codingdojo.servicios.ServicioGasto;

@Controller

public class ControladorGasto {
	private final ServicioGasto servicioGasto;
	
	public ControladorGasto(ServicioGasto servicio) {
		this.servicioGasto = servicio;
	}
	
	@RequestMapping(value="/gastos", method=RequestMethod.GET)
	public String despliegaGastos(Model model) {
		List<Gasto> listaGastos = servicioGasto.selectAllFromGastos();
		model.addAttribute("listaGastos", listaGastos);
		return "gastos.jsp";
	}
	
	@RequestMapping(value="/gastos/agregar", method=RequestMethod.GET)
	public String despliegaRegistro(@ModelAttribute("gasto") Gasto nuevoGasto) {
		return "registro.jsp";
	}
	
	@RequestMapping(value="/gastos/agregando", method=RequestMethod.POST)
	public String registrarGasto(@Valid @ModelAttribute("gasto") Gasto nuevoGasto, BindingResult result ) {
		if(result.hasErrors()){
			return ("registro.jsp");
		}
		else {
			servicioGasto.insertIntoGastos(nuevoGasto);
			return "redirect:/gastos";
		}
	}
	
	@RequestMapping("/gastos/{id}/editar")
    public String desplazarGastos(@PathVariable("id") Long id, Model model) {
    	Gasto gasto = servicioGasto.findGasto(id);
    	model.addAttribute("gasto", gasto);
        return "editar.jsp";
    }
    
    @PutMapping("/gastos/{id}")
    public String update(@Valid @ModelAttribute("gasto") Gasto gasto, BindingResult result) {
        if (result.hasErrors()) {
            return "editar.jsp";
        } else {

            servicioGasto.updateGasto(gasto);
            return "redirect:/gastos";
        }
    }
    
    @RequestMapping("/gastos/{id}")
    public String show(@PathVariable("id") Long id, Model model) {
    	Gasto gasto = servicioGasto.findGasto(id);
    	model.addAttribute("gasto", gasto);
        return "mostrar.jsp";
    }

    @RequestMapping("/gastos/{id}/eliminar")
    public String destroy(@PathVariable("id") Long id, Model model) {
    	servicioGasto.deleteFromGastos(id);
    	List<Gasto> listaGastos = servicioGasto.selectAllFromGastos();
		model.addAttribute("listaGastos", listaGastos);
        return "gastos.jsp";
    }
	
}
