package br.com.douglas.projeto.dto.projeto;

import org.springframework.beans.BeanUtils;

import br.com.douglas.projeto.entity.projeto.UsuarioEntity;
import jakarta.persistence.Column;

public class UsuarioDto {

    private Long id;
    private String nome;
    private String login;
    private String senha;
    private String email;


  // contrutor para converter de entity p/ DTO
    public UsuarioDto (UsuarioEntity usuario) {
        BeanUtils.copyProperties(usuario, this);
    }

     public UsuarioDto () {
    }

     public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return this.login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return this.senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}

