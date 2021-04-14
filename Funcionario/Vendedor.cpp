#include "Vendedor.h"

float Vendedor::getSalario() {
    float salario = Funcionario::getSalario();
    salario += this->vendas * 0.15;
    return salario;
}
