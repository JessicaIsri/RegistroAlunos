package edu.fatec.lp.entidade;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class Turma {
    private Aluno[] alunos;
    private Integer indice = 0;

    public Turma(Integer qtdeAlunos)
    {
        setAlunos(new Aluno[qtdeAlunos]);
    }

    public Aluno consultarPorMatricula(int matricula){

        for (int i = 0; i < (getIndice() - 1); i++){
            Aluno alunoConsultado = getAlunos()[i];
            if (alunoConsultado.getMatricula() == matricula){
                return alunoConsultado;
            }
        }
        return null;
    }

    public Aluno consultarPorNome(String nome){

        for (int i = 0; i < (getIndice() - 1); i++){
            Aluno alunoConsultado = getAlunos()[i];
            if (alunoConsultado.getNome().equals(nome)){
                return alunoConsultado;
            }
        }
        return null;
    }

    public Boolean insereAluno(Aluno aluno){
        if (getIndice() < getAlunos().length){
            if(consultarPorMatricula(aluno.getMatricula()) == null){
                getAlunos()[getIndice()] = aluno;
                setIndice(getIndice() + 1);
                return true;
            }
            return false;
        }
        else{
            return false;
        }

    }

    public void imprimeAlunos(){
        for (int i = 0; i < alunos.length; i++){
            try{
                System.out.println(alunos[i].getNome());
            }
            catch (NullPointerException e){
                System.out.println("Vaga Disponivel");
            }

        }
    }

    public void excluirAluno(String nome){
        Aluno aluno = consultarPorNome(nome);
        if (aluno != null){
            System.out.println("Aluno " + aluno.getNome() + " excluido!");
            aluno = null;
            setIndice(getIndice() - 1);
        }
        else{
            System.out.println("Aluno não encontrado");
        }
    }
}
