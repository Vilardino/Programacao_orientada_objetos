#ifndef VENDEDOR_H
#define VENDEDOR_H

#include <string>
#include "Funcionario.h"
using namespace std;

class Vendedor : public Funcionario {
public:
    Vendedor(int numero, string nome, int horas, float valor, float vendas) :
    Funcionario(numero, nome, horas, valor) {
        this->vendas = vendas;
    }
    virtual float getSalario();
private:
    float vendas;
};

#endif /* VENDEDOR_H */

