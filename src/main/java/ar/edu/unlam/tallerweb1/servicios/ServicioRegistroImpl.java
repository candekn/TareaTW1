package ar.edu.unlam.tallerweb1.servicios;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.unlam.tallerweb1.dao.UsuarioDao;
import ar.edu.unlam.tallerweb1.modelo.Usuario;

@Service("ServicioRegistro")
@Transactional
public class ServicioRegistroImpl implements ServicioRegistro{
	@Inject
	private UsuarioDao usuarioDaoServicioRegistro;
	@Override
	public void guardarUsuario(Usuario usuario) {
		usuarioDaoServicioRegistro.guardarUsuario(usuario);
	}

}
