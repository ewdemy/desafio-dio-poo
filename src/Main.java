import java.time.LocalDate;

import br.com.mrcruz.desafio.dominio.Curso;
import br.com.mrcruz.desafio.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {
		
		Curso curso = new Curso();
		curso.setTitulo("Python");
		curso.setDescricao("Curso de python para criação de APIs");
		curso.setCargaHoraria(80);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("Java");
		curso2.setDescricao("Curso de Java com Spring Boot");
		curso2.setCargaHoraria(60);
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("mentoria de Java");
		mentoria.setDescricao("Mentoria do curso de Java");
		mentoria.setData(LocalDate.now());
		
		System.out.println(curso);
		System.out.println(curso2);
		System.out.println(mentoria);

	}

}
