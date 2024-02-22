package com.api.main.models;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "documento")
public class DocumentoModel implements Serializable {

  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  @Column(nullable = true, unique = false, length = 40)
  private String numero;

  @Column(nullable = true, unique = false, length = 40)
  private String processo;

  @Column(nullable = true, unique = false, length = 40)
  private String sei;

  @ManyToOne
  @JoinColumn(name = "tipo")
  private DocumentoTipoModel tipo;

  @ManyToMany(mappedBy = "documentos")
  private List<EnderecoModel> enderecos;

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

  public String getProcesso() {
    return processo;
  }

  public void setProcesso(String processo) {
    this.processo = processo;
  }

  public String getSei() {
    return sei;
  }

  public void setSei(String sei) {
    this.sei = sei;
  }

}