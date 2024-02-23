package com.api.main.controllers;

import java.util.List;

import com.api.main.dto.ProcessoDTO;
import com.api.main.models.ProcessoModel;
import com.api.main.services.ProcessoService;

import org.springframework.beans.BeanUtils;
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
@RequestMapping("/processo")
@CrossOrigin(origins = "*", maxAge = 3600)
public class ProcessoController {
  final ProcessoService processoService;

  public ProcessoController(ProcessoService processoService) {
    this.processoService = processoService;
  }

  
  @PostMapping
  public ResponseEntity<Object> save(@RequestBody @Valid ProcessoDTO processoDTO) {

    ProcessoModel processoModel = new ProcessoModel();
    BeanUtils.copyProperties(processoDTO, processoModel);
    return ResponseEntity.status(HttpStatus.CREATED).body(processoService.save(processoModel));

  }

  @GetMapping
  public ResponseEntity<List<ProcessoModel>> listAll() {
    return ResponseEntity.status(HttpStatus.CREATED).body(processoService.findAll());
  }

}