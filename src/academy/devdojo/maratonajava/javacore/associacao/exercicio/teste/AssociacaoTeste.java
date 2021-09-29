package academy.devdojo.maratonajava.javacore.associacao.exercicio.teste;

import academy.devdojo.maratonajava.javacore.associacao.exercicio.dominio.Aluno;
import academy.devdojo.maratonajava.javacore.associacao.exercicio.dominio.Local;
import academy.devdojo.maratonajava.javacore.associacao.exercicio.dominio.Professor;
import academy.devdojo.maratonajava.javacore.associacao.exercicio.dominio.Seminario;

public class AssociacaoTeste {

    public static void main(String[] args) {
        Local local = new Local("Rua das Laranjeiras");
        Aluno aluno = new Aluno("Luffy", 17);
        Professor professor = new Professor("Barba Branca", "Pirata");
        Aluno[] alunosParaSeminario = {aluno};
        Seminario seminario = new Seminario("Onde achar One Piece", alunosParaSeminario, local);
        Seminario[] seminariosDisponiveis = {seminario};
        professor.setSeminarios(seminariosDisponiveis);

        professor.imprimir();
    }

}
