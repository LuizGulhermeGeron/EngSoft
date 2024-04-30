1 - Single Responsibility Principle

Este princípio diz que toda classe/função deve ter um único motivo para existirem. Esse princípio impede que classes e funções fiquem complexas demais, acumulando funções, facilitando a manutenção, o entendimento, os testes e diminuindo a possibilidade de erros.

Neste projeto podemos observar uma violação deste princípio na classe CarrinhoDeCompras, que está exercendo duas funções: armazenar os produtos e calcular o preço total deles.

2 - Open/Closed Principle

Este princípio diz que o código deve estar aberto para adições e fechado para alterações. Em outras palavras, seu código deve permitir a inclusão de funcionalidades sem exigir alterações no existente. Isso é bom por evitar refatoração de partes do código, economizando tempo e diminuindo a possibilidade de erros.

Neste projeto, podemos encontrar uma violação deste princípio no cálculo do total do carrinho, feito pela função calcularTotal da classe CarrinhoDeCompras. Para alterar o método de cálculo, seria necessário alterar diretamente a função calcularTotal.

3 - Interface Segregation Principle

Este princípio diz que uma classe que recebe uma interface não deve ser obrigada a receber métodos e atributos que ela não usará. É melhor ter várias interfaces mínimas, específicas, do que poucas grandes, que agregam várias funcionalidades. Isso facilita o reuso e a organização do código.

Neste projeto, não existem interfaces, logo, este princípio não está sendo aplicado.

4 - Dependency Inversion Principle

Este princípio fala que os módulos de alto e baixo nível devem depender de abstrações. Em outras palavras, deve-se usar interfaces para manipular um objeto, em vez de usá-lo diretamente. Isso se encontra com o princípio anterior ao permitir o uso de vários subtipos no mesmo código, ou seja, permite a implementação de novos objetos sem a necessidade de refatorar o código que irá tratá-los. Dessa forma, facilitamos a implementação de novas funções e aumentamos o reuso do código.

Neste código podemos observar uma violação deste princípio no método main, ao instanciar diretamente as classes Produto e CarrinhoDeCompras.

Alterações (branch Arrumado):

2 - Para respeitar o segundo princípio, criamos uma interface para definir a função de cálculo do valor total, chamada CalculoTotal.

1 - Para respeitar o primeiro princípio, criamos uma nova classe para assumir a responsabilidade do cálculo do valor total, a CalculoTotalSimples.

3 - Para respeitar o terceiro princípio criamos uma interface para a funcionalidade da classe CarrinhoDeCompras, que se chamará CarrinhoDeCompras e será implementada pela classe CarrinhoDeComprasImpl.

4 - Para respeitar o último princípio, alteramos o método main para manipular as interfaces e não os objetos diretamente.
