import java.time.LocalDate;

import br.com.mrcruz.desafio.dominio.Bootcamp;
import br.com.mrcruz.desafio.dominio.Curso;
import br.com.mrcruz.desafio.dominio.Dev;
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
		
//		System.out.println(curso);
//		System.out.println(curso2);
//		System.out.println(mentoria);
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Dev Java Samuray");
		bootcamp.setDescricao("Descrição bootcamp java");
		bootcamp.getConteudos().add(mentoria);
		bootcamp.getConteudos().add(curso);
		bootcamp.getConteudos().add(curso2);
		
		Dev dev = new Dev();
		dev.setNome("Ewdemy");
		
		dev.inscreverBootcamp(bootcamp);
		
		dev.progredir();
		
		System.out.println("Conteúdos inscritos: " + dev.getConteudosInscritos());
		System.out.println("Conteúdos concluidos: " + dev.getConteudosConcluidos());
		System.out.println("XP: " + dev.calcularTotalXP());

	}

}
