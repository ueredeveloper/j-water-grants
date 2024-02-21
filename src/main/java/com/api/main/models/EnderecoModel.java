package com.api.main.models;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name = "endereco")
public class EnderecoModel implements Serializable {

  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String logradouro;
  private String cidade;
  private String cep;

  @ManyToMany
  @JoinTable(name = "documento_endereco", joinColumns = @JoinColumn(name = "endereco_id"), inverseJoinColumns = @JoinColumn(name = "documento_id"))
  private List<DocumentoModel> documentos;


  @ManyToMany
  @JoinTable(name = "usuario_endereco", joinColumns = @JoinColumn(name = "endereco_id"), inverseJoinColumns = @JoinColumn(name = "usuario_id"))
  private List<UsuarioModel> usuarios;

  public static long getSerialversionuid() {
    return serialVersionUID;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getLogradouro() {
    return logradouro;
  }

  public void setLogradouro(String logradouro) {
    this.logradouro = logradouro;
  }

  public String getCidade() {
    return cidade;
  }

  public void setCidade(String cidade) {
    this.cidade = cidade;
  }

  public String getCep() {
    return cep;
  }

  public void setCep(String cep) {
    this.cep = cep;
  }

  public List<DocumentoModel> getDocumentos() {
    return documentos;
  }

  public void setDocumentos(List<DocumentoModel> documentos) {
    this.documentos = documentos;
  }

}