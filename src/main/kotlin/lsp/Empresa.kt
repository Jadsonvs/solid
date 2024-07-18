package org.example.lsp

/*
Para melhorar o entendimento do Liskov Substitution Principle(LSP) ou em português Princípio de Substituição Liskov, que
nos diz o seguinte: Classes derivadas(ou classes-filhas) devem ser capazes de substituir suas classes-base(ou classes mães).

No exemplo abaixo criamos a classe-mãe Funcionario, a classe-filha Gerente que herda tudo de Funcionario sem ser feito
inclusão de atributos ou métodos novos, e também criamos a classe-filha Presidente que herda da classe mãe mas, foram
incluso atributo e métodos novos. Ao criamos o método imprimiFuncionario que recebe como parâmetro a classe mãe Funcionario
e passamos todas as classes filhas no método, nenhum erro foi apresentado. Caso alguma classe filha não consiga substituir
a classe mãe teremos um erro e iremos ferir o Princípio da Substituição de Liskov.
 */

fun main() {

    val funcionario = Funcionario("Jadson", 30)
    val gerente = Gerente("Lorena", 29)
    val presidente = Presidente("Adriana", 40, 30)

    //Método que recebe como parâmetro a classe mãe Funcionario
    imprimirFuncionario(funcionario)//Classe mãe sendo passada no método que a recebe como parãmetro
    imprimirFuncionario(gerente)//Classe filha sem inclusão de atributo ou métodos novos
    imprimirFuncionario(presidente)//Classe filha com inclusão de mais um atributo e um método novo

}

fun imprimirFuncionario(funcionario: Funcionario) {
    println("Nome: ${funcionario.nome} Idade: ${funcionario.idade}")
}
