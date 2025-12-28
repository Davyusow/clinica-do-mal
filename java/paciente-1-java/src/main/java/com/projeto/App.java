package com.projeto;

public class App {

    public static void main(String[] args) {
        EnterpriseSolution empresa = new EnterpriseSolution("Produção");
        Funcionario usr1 = new Funcionario("Motorista");
        Funcionario usr2 = new Funcionario("Admin");

        empresa.executeLogic(usr1);
        empresa.executeLogic(usr2);

        System.out.println("Estado da empresa: " + empresa.getEstado());

        empresa.setEstado("Pausa");

        Funcionario usr3 = new Funcionario("Motorista");
        Funcionario usr4 = new Funcionario("Admin");
        empresa.executeLogic(usr3);
        empresa.executeLogic(usr4);

        System.out.println("Estado da empresa: " + empresa.getEstado());
    }
}
