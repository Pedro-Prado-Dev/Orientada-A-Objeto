package Services;

import Interfaces.IDisciplinaService;
import Model.Aluno;

public class DisciplinaServices {

    private IDisciplinaService _disciplinaServices;

    public DisciplinaServices(IDisciplinaService disciplinaServices) {
        this._disciplinaServices = disciplinaServices;
    }

    public void listaAluno(){
        _disciplinaServices.buscaAluno();
    }
    public void adicionaAluno(Aluno aluno){
        _disciplinaServices.adicionaAluno(aluno);
    }

    public void listaAlunoPorMatricula(int matricula){
        _disciplinaServices.buscaAlunoPorId(matricula);
    }
    public void excluiAluno(Aluno aluno){
        _disciplinaServices.deletaAluno(aluno);
    }
}
