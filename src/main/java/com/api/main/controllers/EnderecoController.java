package com.api.main.controllers;

import java.util.List;

import com.api.main.models.DocumentoModel;
import com.api.main.models.EnderecoModel;
import com.api.main.services.EnderecoService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/endereco")
public class EnderecoController {

  final EnderecoService enderecoService;

  public EnderecoController(EnderecoService enderecoService) {
    this.enderecoService = enderecoService;
  }

  
  @PostMapping
  public ResponseEntity<Object> save(@RequestBody @Valid EnderecoModel enderecoModel) {
    return ResponseEntity.status(HttpStatus.CREATED).body(enderecoService.save(enderecoModel));

  }

  @GetMapping
  public ResponseEntity<List<EnderecoModel>> listAll() {
    return ResponseEntity.status(HttpStatus.CREATED).body(enderecoService.findAll());
  }

  @GetMapping("/documentos")
  public ResponseEntity<List<DocumentoModel>> listAllDocumentosByEndereco(@RequestParam("id") Long enderecoId) {
    List<DocumentoModel> documentos = enderecoService.findAllDocumentosByEndereco(enderecoId);
    return ResponseEntity.ok().body(documentos);
  }
}