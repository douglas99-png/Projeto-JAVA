package br.com.douglas.projeto.service.projeto;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.douglas.projeto.dto.projeto.UsuarioDto;
import br.com.douglas.projeto.entity.projeto.UsuarioEntity;
import br.com.douglas.projeto.repository.projeto.UsuarioRepository;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<UsuarioDto> listarTodoList() {
        List<UsuarioEntity> usuarios = usuarioRepository.findAll();
        return usuarios.stream().map(UsuarioDto::new).toList();
    }
        public void inserir(UsuarioDto usuarioDto) {
            UsuarioEntity entity = new UsuarioEntity();
            usuarioRepository.save(entity);
        }   
        public void atualizar(UsuarioDto usuario) {
            UsuarioEntity entity = new UsuarioEntity(usuario);
            usuarioRepository.save(entity);
        }
        public void deletar(Long id) {
            usuarioRepository.deleteById(id);
        }   
        public UsuarioDto buscarPorId(Long id) {
            UsuarioEntity usuario = usuarioRepository.findById(id).get();
            return new UsuarioDto(usuario);
        }
}
