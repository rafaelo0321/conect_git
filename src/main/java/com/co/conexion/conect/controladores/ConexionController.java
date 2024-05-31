package com.co.conexion.conect.controladores;

import com.co.conexion.conect.servicios.ConexionServiceConGit;
import com.co.conexion.conect.entidades.BuscarUsuarioEnGit;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/conexion")
public class ConexionController {


    private final ConexionServiceConGit conexionServiceConGit;

    public ConexionController(ConexionServiceConGit conexionServiceConGit) {
        this.conexionServiceConGit = conexionServiceConGit;
    }

    @GetMapping("/buscar/usuarios")
    public ResponseEntity<BuscarUsuarioEnGit> buscarUsuariosGit(@RequestParam String nombre) {
        BuscarUsuarioEnGit respuestaGit = conexionServiceConGit.buscarUsuarios(nombre);
        return new ResponseEntity<>(respuestaGit, HttpStatus.OK);
    }
}