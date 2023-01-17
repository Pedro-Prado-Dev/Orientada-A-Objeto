package Interfaces;

import Model.Aluno;

public interface IDisciplinaService {

    public void buscaAluno();
    public void buscaAlunoPorId(int matricula);
    public void adicionaAluno(Aluno aluno);
    public void deletaAluno(Aluno aluno);
}
