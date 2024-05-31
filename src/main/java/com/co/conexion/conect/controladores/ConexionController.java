package com.co.conexion.conect.controladores;

import com.co.conexion.conect.ConexionServiceConGit;
import com.co.conexion.conect.entidades.BuscarUsuarioEnGit;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/conec")
public class ConexionController {


    private final ConexionServiceConGit conexionServiceConGit;

    public ConexionController(ConexionServiceConGit conexionServiceConGit) {
        this.conexionServiceConGit = conexionServiceConGit;
    }

    @GetMapping("/search/users")
    public ResponseEntity<BuscarUsuarioEnGit> buscarUsuariosGit(@RequestParam String nombre) {
        BuscarUsuarioEnGit response = conexionServiceConGit.buscarUsuarios(nombre);
        return ResponseEntity.ok(response);
    }
}