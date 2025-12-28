package com.projeto;

import com.projeto.enums.Cargo;

public class Funcionario {

    private Cargo cargo;

    public Funcionario (Cargo cargo) {
        this.cargo = cargo;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

}
