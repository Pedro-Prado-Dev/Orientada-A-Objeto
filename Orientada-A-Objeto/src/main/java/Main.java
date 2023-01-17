import Model.Aluno;
import Model.Diciplinas.Algoritmos;
import Model.Diciplinas.BancoDeDados;
import Model.Disciplina;
import Services.DisciplinaServices;

public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Pedro","Computação", 1685);
        Aluno aluno2 = new Aluno("Flávio","Computação", 1450);

        Algoritmos algoritmos = new Algoritmos();
        BancoDeDados bancoDeDados = new BancoDeDados();

        DisciplinaServices disciplinaServices1 = new DisciplinaServices(algoritmos);
        DisciplinaServices disciplinaServices2 = new DisciplinaServices(bancoDeDados);

        disciplinaServices1.listaAluno();
        disciplinaServices1.adicionaAluno(aluno1);
        disciplinaServices1.adicionaAluno(aluno2);
        System.out.println("\nListando alunos por matricula\n");
        disciplinaServices1.listaAlunoPorMatricula(3000);
        System.out.println("\nListando todos os alunos\n");
        disciplinaServices1.listaAluno();
        System.out.println("\nExcluindo aluno\n");
        disciplinaServices1.excluiAluno(aluno1);
        System.out.println("\nListando todos os alunos\n");
        disciplinaServices1.listaAluno();

        System.out.println("######################################################");

        Aluno aluno3 = new Aluno("Rafaela", "Eng Computacao", 1451);
        Aluno aluno4 = new Aluno("Leticia", "Eng Computacao", 3001);

        disciplinaServices2.listaAluno();
        disciplinaServices2.adicionaAluno(aluno3);
        disciplinaServices2.adicionaAluno(aluno4);
        System.out.println("\nListando alunos por matricula\n");
        disciplinaServices2.listaAlunoPorMatricula(3001);
        System.out.println("\nListando todos os alunos\n");
        disciplinaServices2.listaAluno();
        System.out.println("\nExcluindo aluno\n");
        disciplinaServices2.excluiAluno(aluno3);
        System.out.println("\nListando todos os alunos\n");
        disciplinaServices2.listaAluno();

    }
}
