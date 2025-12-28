package com.projeto;

public class EnterpriseSolution {

    private UserValidator userValidator;
    private String estado;

    public EnterpriseSolution(String estado) {
        this.userValidator = new UserValidator();
        this.estado = estado;
    }

    public void executeLogic(Funcionario usuario) {
        if (userValidator.isValido(usuario) && estado.equals("Produção")) {
            userValidator.save(usuario);
        }
    }

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

}
