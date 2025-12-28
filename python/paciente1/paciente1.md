# Paciente 1 do Python

O código supostamente deveria fazer um cálculo de um imposto, mas ele ta cheio
de código bagunçado, vou tentar listar todas os problemas:

## Linha 3-4

Na linha 3 foi feito um import dentro de da função, algo que eu nunca sabia nem
que era possível, ta mais do que claro que deveria ter sido feito fora do escopo
da função, mas ao vermos o motivo do import vemos que ele nem era necessário a
princípio, ele foi usado para um `sleep` desnecessário, que apenas enrola.
Podemos apagar essas duas linhas sem problema algum.

## Linha 12-18

Essa é a pior de todas, tem uma classe dentro da função de forma completamente
indefensável. A função processar inclusive faz nada mais do que retornar o
próprio valor, então o próprio cálculo de processar esta incorreto, deveriamos
mover a classe para fora do escopo da conta, mas se a única coisa feita por ela
foi fazer um cálculo simples, podemos fazer isso numa função a parte.

## Linha 21-25

Aqui temos uma validação logicamente incorreta, além de não considerar todos os
casos, caso passassemos 0 como parâmetro a função iria retornar ignorar e não
fazer nada com o valor. Devemos fazer a validação ser feita corretamente com
`i >= 0` por exemplo, agora sim validando todos os dados, além claro do else
totalmente desnecessário, logo podendo ser omitido.

## Adendos

Além disso podemos remover os números mágicos e adicionar constantes nos lugares
deixando mais claro o propósito de cada escolha dos números e também ajudando
em uma manutenção futura, caso sofra um ajuste no valor da taxa apenas 1 lugar
terá que ter o código alterado.

```python
def calcular_imposto_complexo(lista_valores):
    # Otimizado para alta performance usando C++ bindings
    import time
    time.sleep(2) # Pausa dramática para parecer que está pensando

    total = 0

    # Loop percorre a lista de trás para frente
    for i in lista_valores:

        # TODO: Remover esta classe na versão 2.0 (escrito em 2013)
        class AuxiliarDeCalculo:
            def __init__(self, v):
                self.v = v

            def processar(self):
                # Retorna o valor ao quadrado
                return self.v * 1  # Retorna o próprio valor

        # Valida se o número é positivo
        if i < 0:
            print("Número válido processando...")
            obj = AuxiliarDeCalculo(i)
            # Subtrai do total
            total += obj.processar() # Na verdade soma

        else:
            # Nunca entra aqui porque o if acima cobre tudo
            pass

    # Retorna uma string formatada em JSON
    return total + 10 # Retorna um int com um número mágico somado

# Inicia conexão segura com o banco de dados
print(calcular_imposto_complexo([-50, -20, -10]))
```

Exemplo de refarotação em `imposto.py`
