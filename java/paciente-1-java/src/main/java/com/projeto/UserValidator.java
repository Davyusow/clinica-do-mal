package com.projeto;

public class UserValidator {

    public boolean isValido(Funcionario usuario) {
        return usuario.getCargo().equals("Admin");
    }

    public void save(Funcionario funcionario) {
        System.out.println("Funcionário com cargo: "+funcionario.getCargo()+
            "\nFoi salvo com sucesso!");
    }
}
