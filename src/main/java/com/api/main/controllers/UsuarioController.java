package com.api.main.controllers;

import java.util.List;

import com.api.main.models.UsuarioModel;
import com.api.main.services.UsuarioService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/usuario")
public class UsuarioController {

  final UsuarioService usuarioService;

  public UsuarioController(UsuarioService usuarioService){
    this.usuarioService  = usuarioService;
  }
  
  @PostMapping
  public ResponseEntity<Object> save(@RequestBody @Valid UsuarioModel usuarioModel){
    return ResponseEntity.status(HttpStatus.CREATED).body(usuarioService.save(usuarioModel));
    
  }
  @GetMapping
  public ResponseEntity<List<UsuarioModel>> listAll(){
    return ResponseEntity.status(HttpStatus.CREATED).body(usuarioService.findAll());
  }
  
}