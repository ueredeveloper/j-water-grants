package com.api.main.models;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "anexo")
public class AnexoModel implements Serializable {

  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(nullable = true, unique = false, length = 40)
  private String numero;

  @ManyToOne
  @JoinColumn(name = "processo", referencedColumnName = "id")
  private ProcessoModel processo;

  public AnexoModel() {
    super();
  }

  public AnexoModel(String numero) {
    super();
    this.numero = numero;
  }

  public static long getSerialversionuid() {
    return serialVersionUID;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getNumero() {
    return numero;
  }

  public void setNumero(String numero) {
    this.numero = numero;
  }

  public ProcessoModel getProcesso() {
    return processo;
  }

  public void setProcesso(ProcessoModel processo) {
    this.processo = processo;
  }

}
