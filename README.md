                        BEM-VINDO AO MEU PROJETO!

Princípios SOLID

Esse projeto foi criado com o intuito de melhor compreendimento dos princípios
SOLID. Além de explicar o conceito dos princpipios SOLID, explica de maneira
prática com funciona os princípios na prática. Os exemplos criados foram
pensados para que o meu e talvez o seu compreendimento seja o mais facilitado
possível.

ARTIGOS E REFERÊNCIAS:

- [SOLID: o que é e quais os 5 princípios da Programação Orientada a Objetos (POO)](https://www.alura.com.br/artigos/solid)
- [The S.O.L.I.D Principles in Pictures](https://medium.com/backticks-tildes/the-s-o-l-i-d-principles-in-pictures-b34ce2f1e898)

[Alura artigos]: https://www.alura.com.br/artigos
[Medium]: https://medium.com/

CONCEITO:

O primeiro indício dos princípios SOLID apareceu em 1995, no [artigo](http://butunclebob.com/ArticleS.UncleBob.PrinciplesOfOod) “*The principles of OoD*” de Robert C Martin, também conhecido como “Uncle Bob”.

Nos anos seguintes, Robert se dedicou a escrever mais sobre o tema, consolidando esses princípios de forma categórica.

E, em 2002, lançou o livro *“Agile Software Development, Principles, Patterns, and Practices”* que reúne diversos artigos sobre o tema.

- S — Single Responsibility Principle (Princípio da responsabilidade única)

> o princípio da responsabilidade única diz que: “*Cada classe deve ter um, e somente um, motivo para mudar.”*
>

This principle aims to separate behaviours so that if bugs arise as a result of your change, it won’t affect other unrelated behaviours.

- O — Open-Closed Principle (Princípio Aberto-Fechado)

> Assim, é possível definir o Princípio Aberto-Fechado como: *“entidades de software (como classes e métodos) devem estar abertas para extensão, mas fechadas para modificação”*.
>

This principle aims to extend a Class’s behaviour without changing the existing behaviour of that Class. This is to avoid causing bugs wherever the Class is being used.

- L — Liskov Substitution Principle (Princípio da substituição de Liskov)

> “*Classes derivadas (ou classes-filhas) devem ser capazes de substituir suas classes-base (ou classes-mães)*”
>

This principle aims to enforce consistency so that the parent Class or its child Class can be used in the same way without any errors.

- I — Interface Segregation Principle (Princípio da Segregação da Interface)

> “*Uma classe não deve ser forçada a implementar interfaces e métodos que não serão utilizados*”.
>

This principle aims at splitting a set of actions into smaller sets so that a Class executes ONLY the set of actions it requires.

- D — Dependency Inversion Principle (Princípio da inversão da dependência)

> O **Princípio da Inversão de Dependência** diz: *“dependa de abstrações e não de implementações concretas”*.
>

Assim, é recomendado que os **módulos de alto nível** não dependam diretamente dos detalhes de implementação de **módulos de baixo nível.**

This principle aims at reducing the dependency of a high-level Class on the low-level Class by introducing an interface.

# Resumo Clean Code

- Utilizar o príncipios do SOLID
- Possuir nomes significativos
- Priorizar o uso de funções pequenas
- Evitar comentários desnecessários
- Evitar complexidade
- Fazer(por) o mínimo de argumentos
- Evitar código com repetição

>“Qualquer tolo pode escrever código que um computador pode entender. Bons programadores escrevem código que humanos podem entender”. Martin Fowler