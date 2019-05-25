package ar.edu.unlam.tallerweb1.servicios;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.unlam.tallerweb1.dao.BuscarUsuarioDao;

import ar.edu.unlam.tallerweb1.modelo.Usuario;

@Service("ServicioBuscar")
@Transactional

public class ServicioBuscarImpl implements ServicioBuscar{
	@Inject
	//Interface	-tipo Interface //Atrib 
	private BuscarUsuarioDao BuscarUsuarioAtributo;


	@Override
	//Lista		//Metodo
	public List<Usuario> buscarDatos() {
	return BuscarUsuarioAtributo.buscarDatos();
}


	

}
