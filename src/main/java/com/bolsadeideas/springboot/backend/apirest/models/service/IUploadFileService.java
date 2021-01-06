package com.bolsadeideas.springboot.backend.apirest.models.service;

import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.file.Path;

import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

public interface IUploadFileService {
	public Path getPath(String nombreArchivo);
	public boolean eliminar(String nombreArchivo) ;
	public String copiar(MultipartFile archivo) throws IOException;
	public Resource cargar(String nombreArchivo) throws MalformedURLException;

}
