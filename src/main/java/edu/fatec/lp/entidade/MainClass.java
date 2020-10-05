package edu.fatec.lp.entidade;

public class MainClass {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno(123, "Jessica", "BD");
        Aluno aluno2 = new Aluno(321, "João", "BD");
        Aluno aluno3 = new Aluno(132, "Maria", "BD");
        Aluno aluno4 = new Aluno(132, "Jonas", "BD");
        Turma turma1 = new Turma(3);
        turma1.insereAluno(aluno1);
        turma1.insereAluno(aluno2);
        turma1.insereAluno(aluno3);
        turma1.imprimeAlunos();

        Aluno consultaByMatricula =  turma1.consultarPorMatricula(123);
        Aluno consultaByNome = turma1.consultarPorNome("João");
        System.out.println(consultaByMatricula.getNome());
        System.out.println(consultaByNome.getMatricula());

        turma1.excluirAluno("João");
        System.out.println(turma1.insereAluno(aluno4));




    }
}
