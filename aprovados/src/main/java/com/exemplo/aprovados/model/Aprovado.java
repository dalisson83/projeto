package com.exemplo.aprovados.model;
import jakarta.persistence.*;
@Entity
public class Aprovado {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String nome;
  private String email;
  private String telefone;
  private String concursos;
  private String imagem;
  public Long getId() { return id; }
  public String getNome() { return nome; }
  public void setNome(String nome) { this.nome = nome; }
  public String getEmail() { return email; }
  public void setEmail(String email) { this.email = email; }
  public String getTelefone() { return telefone; }
  public void setTelefone(String telefone) { this.telefone = telefone; }
  public String getConcursos() { return concursos; }
  public void setConcursos(String concursos) { this.concursos = concursos; }
  public String getImagem() { return imagem; }
  public void setImagem(String imagem) { this.imagem = imagem; }
}