package ar.edu.unlam.tallerweb1.controladores;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unlam.tallerweb1.modelo.Usuario;
import ar.edu.unlam.tallerweb1.servicios.ServicioRegistro;

@Controller
public class ControladorRegistro {
	@Inject
	private ServicioRegistro servicioRegistro;
	
	@RequestMapping("/registro")
	public ModelAndView registro(){
		ModelMap model = new ModelMap();
		Usuario usuario = new Usuario();
		model.put("usuario", usuario);
		return new ModelAndView("RegistroTarea", model);
	}
	
	@RequestMapping(path="/validarRegistro", method=RequestMethod.POST)
	public ModelAndView ValidarRegistro(@ModelAttribute("usuario") Usuario usuario, HttpServletRequest request){
		servicioRegistro.guardarUsuario(usuario);
		return new ModelAndView("RegistroTarea");
	}
	
	
	
	
	
	
	
}
