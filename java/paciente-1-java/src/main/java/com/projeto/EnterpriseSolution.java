package com.projeto;

import com.projeto.enums.EstadoSistema;

public class EnterpriseSolution {

    private UserValidator userValidator;
    private EstadoSistema estado;

    public EnterpriseSolution(EstadoSistema estado) {
        this.userValidator = new UserValidator();
        this.estado = estado;
    }

    public void executeLogic(Funcionario usuario) {
        if (userValidator.isValido(usuario) && estado.equals(EstadoSistema.PRODUCAO)) {
            userValidator.save(usuario);
        }
    }

	public EstadoSistema getEstado() {
		return estado;
	}

	public void setEstado(EstadoSistema estado) {
		this.estado = estado;
	}

}
