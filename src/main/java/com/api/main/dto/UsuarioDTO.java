package com.api.main.dto;

import java.util.List;

public class UsuarioDTO {

  private Long id;

  private String nome;

  private String logradouro;

  private String cep;

  private String cidade;

  private String bairro;

  private String cpfcnpj;

  private String contato;

  private String telefone;

  private String email;

  private List<EnderecoDTO> enderecos;

  
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

  public List<EnderecoDTO> getEnderecos() {
    return enderecos;
  }

  public void setEnderecos(List<EnderecoDTO> enderecos) {
    this.enderecos = enderecos;
  }

}