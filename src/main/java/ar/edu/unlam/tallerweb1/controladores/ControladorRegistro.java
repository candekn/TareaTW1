package ar.edu.unlam.tallerweb1.controladores;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unlam.tallerweb1.modelo.Usuario;
import ar.edu.unlam.tallerweb1.servicios.ServicioBuscar;
import ar.edu.unlam.tallerweb1.servicios.ServicioRegistro;

@Controller
public class ControladorRegistro {
	@Inject
	private ServicioRegistro servicioRegistro;
	
	
	@Inject
	private ServicioBuscar serviciobuscar;

	
	
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
	
	
	
	@RequestMapping(path = "/MuestroDatosBD")	
	public ModelAndView consultarDatosenBD()
		{
		ModelMap modelo = new ModelMap();
		
		//Atributo tipo Interfaz . Metodo en Interfaz
		
		List <Usuario> usuarioBuscado = serviciobuscar.buscarDatos();
		if (usuarioBuscado.isEmpty() ) {
			modelo.put("mensaje", "Usuario no encontrado");
			
			
		} else {
			// si el usuario no existe agrega un mensaje de error en el modelo.
			modelo.put("mensaje", "Usuario encontrado");
		}
		modelo.put("usuarioBuscado", usuarioBuscado);
		
		return new ModelAndView("DatosBD",modelo);
		}


	
	
	
	
	
	
	
}
