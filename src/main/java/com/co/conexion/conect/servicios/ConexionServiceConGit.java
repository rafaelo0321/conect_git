package com.co.conexion.conect.servicios;

import com.co.conexion.conect.entidades.BuscarUsuarioEnGit;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ConexionServiceConGit {

    private final RestTemplate restTemplate;

    public ConexionServiceConGit(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public BuscarUsuarioEnGit buscarUsuarios(String peticion) {
        String url = "https://api.github.com/search/users?q=" + peticion;
        return restTemplate.getForObject(url, BuscarUsuarioEnGit.class);
    }
}