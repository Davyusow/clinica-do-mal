IMPOSTO = 1.2 # imposto de 20%
TAXA_FIXA = 10

def processar(valor):
    return valor * IMPOSTO

def calcular_imposto(lista_valores):
    total = 0
    for valor in lista_valores:
        if valor >= 0:
            total += processar(valor)
    return total + TAXA_FIXA

valores = [-50,-20,-10, 5, 10 ,50, 25, 0]
resultado = calcular_imposto(valores)

print(f'Com os valores {valores}\n O resultado total do imposto é {resultado} ')
