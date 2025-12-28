package com.projeto;

import com.projeto.enums.Cargo;

public class UserValidator {

    public boolean isValido(Funcionario usuario) {
        return usuario.getCargo().equals(Cargo.ADMIN);
    }

    public void save(Funcionario funcionario) {
        System.out.println("Funcionário com cargo: "+funcionario.getCargo()+
            "\nFoi salvo com sucesso!");
    }
}
