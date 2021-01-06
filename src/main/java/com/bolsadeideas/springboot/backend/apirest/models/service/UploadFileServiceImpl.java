package com.bolsadeideas.springboot.backend.apirest.models.service;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class UploadFileServiceImpl implements IUploadFileService {

	private final static Logger log = LoggerFactory.getLogger(UploadFileServiceImpl.class);

	private final String DIRECTORIO_UPLOAD = "uploads";

	@Override
	public Path getPath(String nombreArchivo) {
		return Paths.get(DIRECTORIO_UPLOAD).resolve(nombreArchivo).toAbsolutePath();
	}

	@Override
	public boolean eliminar(String nombreArchivo) {
		if (nombreArchivo != null && nombreArchivo.length() > 0) {
			Path rutaFotoAnterior = getPath(nombreArchivo);
			File archivoRutaFotoAnterior = rutaFotoAnterior.toFile();
			if (archivoRutaFotoAnterior.exists() && archivoRutaFotoAnterior.canRead()) {
				archivoRutaFotoAnterior.delete();
				return true;
			}
		}
		return false;
	}

	@Override
	public String copiar(MultipartFile archivo) throws IOException {

		String nombreArchivo = UUID.randomUUID() + "_" + archivo.getOriginalFilename().replace(" ", "");
		Path rutaArchivo = getPath(nombreArchivo);
		log.info(rutaArchivo.toString());

		Files.copy(archivo.getInputStream(), rutaArchivo);

		return nombreArchivo;
	}

	@Override
	public Resource cargar(String nombreArchivo) throws MalformedURLException {

		Path rutaArchivo = getPath(nombreArchivo);
		Resource recurso = null;

		log.info(rutaArchivo.toString());

		recurso = new UrlResource(rutaArchivo.toUri());

		return recurso;
	}

}
