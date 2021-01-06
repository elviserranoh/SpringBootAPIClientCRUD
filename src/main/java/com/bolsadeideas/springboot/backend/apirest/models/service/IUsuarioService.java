package com.bolsadeideas.springboot.backend.apirest.models.service;

import com.bolsadeideas.springboot.backend.apirest.models.entity.Usuario;

public interface IUsuarioService {
	public Usuario findByUsername(String username);
}
