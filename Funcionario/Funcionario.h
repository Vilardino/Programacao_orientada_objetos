#ifndef FUNCIONARIO_H
#define FUNCIONARIO_H

#include <string>
using namespace std;

class Funcionario {
public:
    Funcionario(int numero, string nome, int horas, float valor);
    virtual float getSalario();
    void imprimeDados();
private:
    int numero;
    string nome;
    int horas;
    float valor;
};

#endif /* FUNCIONARIO_H */

