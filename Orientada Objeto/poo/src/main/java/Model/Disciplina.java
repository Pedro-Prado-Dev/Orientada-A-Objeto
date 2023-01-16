package Model;

import Interfaces.IDisciplinaService;

import java.util.ArrayList;

public abstract class Disciplina  implements IDisciplinaService {
    public String nome;
    public int id;
    public String conteudo;

    public ArrayList<Aluno> alunos =new ArrayList<Aluno>();

    @Override
    public void buscaAluno() {
        for (Aluno aluno:this.alunos) {
            System.out.println("Nome: " + aluno.nome);
            System.out.println("Curso: " + aluno.curso);
            System.out.println("Matricula: "+ aluno.matricula +"\n");
            System.out.println("------------------------------------------");
        }
    }

    @Override
    public void buscaAlunoPorId(int matricula) {
        for (Aluno aluno:this.alunos) {

            if (aluno.matricula == matricula){
                System.out.println("Nome: " + aluno.nome);
                System.out.println("Curso: " + aluno.curso);
                System.out.println("Matricula: "+ aluno.matricula +"\n");
            }
        }
    }

    @Override
    public void adicionaAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    @Override
    public void deletaAluno(Aluno aluno) {
        alunos.remove(aluno);
    }
}
