package com.api.main.controllers;

import com.api.main.dto.DocumentoDTO;
import com.api.main.models.DocumentoModel;
import com.api.main.services.DocumentoService;

import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/documento")
public class DocumentoControlller {
  final DocumentoService documentoService;

  public DocumentoControlller(DocumentoService documentoService) {
    this.documentoService = documentoService;
  }

  @PostMapping
  public ResponseEntity<Object> save(@RequestBody @Valid DocumentoDTO documentoDTO) {

    DocumentoModel documentoModel = new DocumentoModel();
    BeanUtils.copyProperties(documentoDTO, documentoModel);
    return ResponseEntity.status(HttpStatus.CREATED).body(documentoService.save(documentoModel));
  }
}