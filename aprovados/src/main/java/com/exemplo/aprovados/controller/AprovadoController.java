package com.exemplo.aprovados.controller;
import com.exemplo.aprovados.model.Aprovado;
import com.exemplo.aprovados.repository.AprovadoRepository;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import java.io.File;
import java.nio.file.Files;
@RestController
@RequestMapping("/aprovados")
@CrossOrigin
public class AprovadoController {
  private final AprovadoRepository repository;
  public AprovadoController(AprovadoRepository repository) {
    this.repository = repository;
  }
  @PostMapping
  public Aprovado salvar(
    @RequestParam String nome,
    @RequestParam String email,
    @RequestParam String telefone,
    @RequestParam String concursos,
    @RequestParam MultipartFile imagem
  ) throws Exception {
    File pasta = new File("uploads");
    if (!pasta.exists()) pasta.mkdir();
    String caminhoImagem = "uploads/" + imagem.getOriginalFilename();
    Files.write(new File(caminhoImagem).toPath(), imagem.getBytes());
    Aprovado a = new Aprovado();
    a.setNome(nome);
    a.setEmail(email);
    a.setTelefone(telefone);
    a.setConcursos(concursos);
    a.setImagem(caminhoImagem);
    return repository.save(a);
  }
}