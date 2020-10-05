package edu.fatec.lp.entidade;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class Aluno {
    private String nome;
    private String curso;
    private Integer matricula;
    private  Prova[] provas;

    public Aluno(Integer matricula, String nome, String curso){
        provas = new Prova[4];
        this.matricula = matricula;
        this.nome = nome;
        this.curso = curso;
    }

}
