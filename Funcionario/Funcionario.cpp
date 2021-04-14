#include "Funcionario.h"
#include <iostream>
using namespace std;

Funcionario::Funcionario(int numero, string nome, int horas, float valor) {
    this->numero = numero;
    this->nome = nome;
    this->horas = horas;
    this->valor = valor;
}

float Funcionario::getSalario() {
    return horas * valor;
}

void Funcionario::imprimeDados() {
    cout << "O salário de " << nome << " é R$ "<< getSalario() << endl;
}