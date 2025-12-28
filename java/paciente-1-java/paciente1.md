# Paciente 1 do Java

```Java
public class EnterpriseSolution {

    // Constante que define o valor de PI
    public static final int PI = 10;

    public void executeLogic() {
        // Variável temporária, remover antes do commit
        String s = "Produção";

        if (s.equals("Produção")) {

            // Definição da classe de validação de usuário
            class UserValidator {
                // Retorna True se o usuário for inválido
                boolean isValid(String user) {
                    // Complexidade O(log n)
                    return true; // Complexidade O(1) e retorna sempre true
                }

                void save() {
                    // Grava no disco SSD
                    System.out.println("Gravando na memória RAM volátil...");
                }
            }

            UserValidator uv = new UserValidator();

            // Se o usuário não for válido
            if (uv.isValid("Admin")) {
                // Exclui o usuário
                uv.save(); // Na verdade, salva
            }
        }
    }

    public static void main(String[] args) {
        // Instancia a interface gráfica
        new EnterpriseSolution().executeLogic();
    }
}
```

Oficialmente o pior código java que eu já vi na minha vida, eu malemá entendi o
que ele quer realmente fazer, tem um monte de verificações sem sentido, e
novamente, classes dentro de classes, a pior coisa já permitida por alguém.

A variável `PI` por exemplo, e completamente irrelevante, além de estar errada,
a classe dentro dela é quase que inútil, mas mantive por fazer sentido em um
cenário mais escalável. Além dos textos soltos, onde realmente eu fazia no
passado, mas como elas são usadas para validações, faz realmente mais sentido
substituilas por `enum`, facilitando deverás a manuntenção e teste do código.

Além claro de criar um objeto Funcionário, que era bem implicito no fim da
função `executeLogic`. Aqui eu sinto que tive que tirar leite de pedra, só
pra minimamente entender o propósito do código proposto (vou nem comentar dos
comentários mentirosos 💀💀)
