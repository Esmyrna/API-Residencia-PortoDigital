package br.com.cursos.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cursos.model.Curso;
import br.com.cursos.service.CursoService;

@RestController
@RequestMapping("/cursos")
public class CursoController {
	private final CursoService cursoService;

	public CursoController(CursoService cursoService) {
		this.cursoService = cursoService;
	}
	
	@GetMapping("/list")
	public List<Curso> listarCursos(){
		return cursoService.listar();
	}
	
	@GetMapping("/{id}")
	public Curso pegarPorId(@PathVariable Long id) {
		return cursoService.listarPorId(id);
	}
	
	@PostMapping
	public Curso adicionarCurso(@RequestBody Curso curso) {
		return cursoService.adicionarCurso(curso);
	}
	
	@PutMapping("/{id}")
	public Curso atualizarCurso(@RequestBody Curso curso, @PathVariable Long id) {
		return cursoService.atualizarCurso(id, curso);
	}
	
	@DeleteMapping("/{id}")
	public void deletarCurso(@PathVariable Long id) {
		cursoService.deletarCurso(id);
	}
}
