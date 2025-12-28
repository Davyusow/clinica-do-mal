package main

import (
	"fmt"
	"time"
)

const (
	API_KEY = "123"
)

type Produto struct {
	nome  string
	preco float64
}

func validaApi(chave string) bool {
	fmt.Println("Conectando ao servidor...")
	time.Sleep(time.Second) // só pra simular a conexão
	if chave == API_KEY {
		return true
	} else {
		fmt.Println("Erro ao conectar com o servidor!")
		return false
	}
}

func (p Produto) comprar(pagamento *float64, chave string) {
	if *pagamento >= p.preco && validaApi(chave) {
		fmt.Println("Efetuando pagamento...")
		fmt.Println("Compra de", p.nome, "no valor de",p.preco,"efetuada com sucesso!")
		*pagamento -= p.preco
	} else {
		fmt.Println("Ocorreu um erro na compra!")
	}
}

func main() {

	dinheiro := 200.45

	produto1 := Produto{"Leite", 8.50}
	produto2 := Produto{"Refrigerante", 7.00}

	fmt.Println("Dinheiro:", dinheiro)
	produto1.comprar(&dinheiro, "123")
	fmt.Println("Dinheiro:", dinheiro)
	produto2.comprar(&dinheiro, "132")
	fmt.Println("Dinheiro:", dinheiro)

}
