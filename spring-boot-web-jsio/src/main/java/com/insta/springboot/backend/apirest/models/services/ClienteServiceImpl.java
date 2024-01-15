package com.insta.springboot.backend.apirest.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.insta.springboot.backend.apirest.models.dao.IClienteDao;
import com.insta.springboot.backend.apirest.models.entity.Cliente;



@Service
public class ClienteServiceImpl implements IClienteService{
	
	@Autowired
	private IClienteDao ClienteDao;
	
	@Override
	@Transactional (readOnly = true)
	public List<Cliente> findAll() {
		
		
		return (List<Cliente>) ClienteDao.findAll();
	}

	@Override
	@Transactional 
	public Cliente save(Cliente cliente) {
		
		return ClienteDao.save(cliente);
	}

	@Override
	@Transactional (readOnly = true)
	public Cliente findById(Long id) {
		
		return ClienteDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		
		
		ClienteDao.deleteById(id);
		
	}

}
