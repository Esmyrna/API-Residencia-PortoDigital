package br.com.cursos.service;

import java.util.List;

import org.springframework.stereotype.Service;
import br.com.cursos.model.Curso;
import br.com.cursos.repository.CursoRepository;

@Service
public class CursoService {
	private final CursoRepository cursoRepository;

	public CursoService(CursoRepository cursoRepository) {
		this.cursoRepository = cursoRepository;
	}
	
	public List<Curso> listar(){
		return cursoRepository.findAll();
	}
	
	public Curso listarPorId(Long id) {
		return cursoRepository.findById(id).get();
	}
	
	public Curso adicionarCurso(Curso curso) {
		return cursoRepository.save(curso);
	}
	
	public Curso atualizarCurso(Long id, Curso curso) {
		var cursoAtualizado = listarPorId(id);
		cursoAtualizado.setDescricao(curso.getDescricao());
		cursoAtualizado.setNome(curso.getNome());
		cursoAtualizado.setId(curso.getId());
	    return cursoRepository.save(cursoAtualizado);
	    
	}
	
	public void deletarCurso(Long id) {
	    cursoRepository.deleteById(id);
	}
}
