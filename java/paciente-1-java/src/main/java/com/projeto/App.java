package com.projeto;

import com.projeto.enums.Cargo;
import com.projeto.enums.EstadoSistema;

public class App {

    public static void main(String[] args) {
        EnterpriseSolution empresa = new EnterpriseSolution(EstadoSistema.PRODUCAO);
        Funcionario usr1 = new Funcionario(Cargo.MOTORISTA);
        Funcionario usr2 = new Funcionario(Cargo.ADMIN);

        empresa.executeLogic(usr1);
        empresa.executeLogic(usr2);

        System.out.println("Estado da empresa: " + empresa.getEstado());

        empresa.setEstado(EstadoSistema.PAUSA);

        Funcionario usr3 = new Funcionario(Cargo.ADMIN);
        Funcionario usr4 = new Funcionario(Cargo.MOTORISTA);
        empresa.executeLogic(usr3);
        empresa.executeLogic(usr4);

        System.out.println("Estado da empresa: " + empresa.getEstado());
    }
}
