package ar.edu.unlam.tallerweb1.dao;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import ar.edu.unlam.tallerweb1.modelo.Usuario;

@Repository("buscarUsuarioDao")

public class BuscarUsuarioImpl implements BuscarUsuarioDao{
	
	@Inject
    private SessionFactory sessionFactory;

	@Override
	public List<Usuario> buscarDatos() {

		final Session session = sessionFactory.getCurrentSession();
	
		List<Usuario> usuarios= session.createCriteria(Usuario.class)
		.add(Restrictions.like("nombre", "j%"))
		.list(); 

        return usuarios;
                       
	}	

}
