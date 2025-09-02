package br.com.douglas.projeto.repository.projeto;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.douglas.projeto.entity.projeto.UsuarioEntity;

public interface UsuarioRepository  extends JpaRepository<UsuarioEntity, Long> {

}
