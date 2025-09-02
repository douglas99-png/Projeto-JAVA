package br.com.douglas.projeto.controller.projeto;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.douglas.projeto.dto.projeto.UsuarioDto;
import br.com.douglas.projeto.service.projeto.UsuarioService;



@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping
    public List<UsuarioDto> listarTodoList() {
        return usuarioService.listarTodoList();
    }

    @PostMapping
    public void inserir(@RequestBody UsuarioDto usuarioDto) {
        usuarioService.inserir(usuarioDto);
    }

    @PutMapping
    public void atualizar(@RequestBody UsuarioDto usuarioDto) {
        usuarioService.atualizar(usuarioDto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        usuarioService.deletar(id);
        return ResponseEntity.ok().build();
    }
}
