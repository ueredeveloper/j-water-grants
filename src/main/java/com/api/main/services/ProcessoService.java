package com.api.main.services;

import java.util.List;

import com.api.main.models.ProcessoModel;
import com.api.main.repositories.ProcessoRepository;

import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
public class ProcessoService {
  final ProcessoRepository processoRepository;

  public ProcessoService(ProcessoRepository processoRepository) {
    this.processoRepository = processoRepository;
  }

  @Transactional
  public ProcessoModel save(ProcessoModel processo) {
    return processoRepository.save(processo);
  }

  @Transactional
  public List<ProcessoModel> findAll() {
    return processoRepository.findAll();
  }

  @Transactional
  public ProcessoModel findById(Long id) {
    return processoRepository.findById(id).get();
  }

  @Transactional
  public void deleteById(Long id) {
    processoRepository.deleteById(id);
  }

  @Transactional
  public void delete(ProcessoModel processo) {
    processoRepository.delete(processo);
  }

  @Transactional
  public void deleteAll() {
    processoRepository.deleteAll();
  }

}