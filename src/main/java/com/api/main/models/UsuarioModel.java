package com.api.main.models;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuario")
public class UsuarioModel implements Serializable {

  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  @Column(nullable = true, unique = false, length = 40)
  private String nome;

  @Column(nullable = true, unique = false, length = 40)
  private String logradouro;

  @Column(nullable = true, unique = false, length = 40)
  private String cep;

  @Column(nullable = true, unique = false, length = 40)
  private String cidade;

  @Column(nullable = true, unique = false, length = 40)
  private String bairro;

  @Column(nullable = true, unique = false, length = 40)
  private String cpfcnpj;

  @Column(nullable = true, unique = false, length = 40)
  private String contato;

  @Column(nullable = true, unique = false, length = 40)
  private String telefone;

  @Column(nullable = true, unique = false, length = 40)
  private String email;

  @ManyToMany(mappedBy = "usuarios")
  private List<EnderecoModel> enderecos;

  public static long getSerialversionuid() {
    return serialVersionUID;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getLogradouro() {
    return logradouro;
  }

  public void setLogradouro(String logradouro) {
    this.logradouro = logradouro;
  }

  public String getCep() {
    return cep;
  }

  public void setCep(String cep) {
    this.cep = cep;
  }

  public String getCidade() {
    return cidade;
  }

  public void setCidade(String cidade) {
    this.cidade = cidade;
  }

  public String getBairro() {
    return bairro;
  }

  public void setBairro(String bairro) {
    this.bairro = bairro;
  }

  public String getCpfcnpj() {
    return cpfcnpj;
  }

  public void setCpfcnpj(String cpfcnpj) {
    this.cpfcnpj = cpfcnpj;
  }

  public String getContato() {
    return contato;
  }

  public void setContato(String contato) {
    this.contato = contato;
  }

  public String getTelefone() {
    return telefone;
  }

  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public List<EnderecoModel> getEnderecos() {
    return enderecos;
  }

  public void setEnderecos(List<EnderecoModel> enderecos) {
    this.enderecos = enderecos;
  }

}