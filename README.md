# Loja de Produtos — POO em Java

Projeto de estudo desenvolvido para praticar Programação Orientada a Objetos em Java, simulando uma loja com produtos físicos e digitais.

## Objetivo

Representar diferentes tipos de produtos, calcular seus preços finais e solicitar entregas utilizando abstração, encapsulamento, herança, interfaces e polimorfismo.

## Funcionalidades

- Armazenar produtos físicos e digitais em uma mesma lista.
- Calcular o preço final de produtos físicos adicionando o frete.
- Calcular o preço final de produtos digitais aplicando um desconto percentual.
- Exibir o nome e o preço final de cada produto.
- Solicitar entregas por meio de uma interface comum.
- Permitir que outros tipos de objetos, como documentos, utilizem o serviço de entrega.

## Conceitos praticados

| Conceito | Aplicação |
|---|---|
| Abstração | A classe abstrata `abstractProduto` reúne as características comuns dos produtos. |
| Encapsulamento | Os atributos são privados e acessados por métodos. |
| Herança | `produtoFisico` e `produtoDigital` herdam de `abstractProduto`. |
| Interface | `intefaceGerenciarEntrega` define o contrato para realizar uma entrega. |
| Polimorfismo | Cada objeto executa sua própria implementação de cálculo e entrega. |

## Organização das classes

- **abstractProduto:** classe abstrata com nome, preço-base e contrato de cálculo do preço final.
- **produtoFisico:** acrescenta o frete ao preço-base e implementa a entrega física.
- **produtoDigital:** aplica um desconto percentual e implementa a entrega por link.
- **intefaceGerenciarEntrega:** interface que declara o comportamento de entrega.
- **entregarItem:** solicita a entrega de qualquer objeto que implemente `Entregavel`.
- **Documento:** demonstra o uso da interface fora da hierarquia de produtos.
- **App:** executa os exemplos do sistema.

## Exemplo de funcionamento

| Produto | Preço-base | Ajuste | Preço final |
|---|---:|---|---:|
| Caderno | R$ 20,00 | Frete de R$ 5,00 | R$ 25,00 |
| Curso Java | R$ 100,00 | Desconto de 10% | R$ 90,00 |

Os produtos são percorridos em uma única `List<abstractProduto>`. O cálculo do preço final utiliza a implementação de cada objeto, sem verificar seu tipo com `if` ou `instanceof`.

O serviço de entrega recebe objetos pelo tipo `intefaceGerenciarEntrega`, permitindo atender tanto produtos quanto documentos.

## Tecnologia

- Java
- Java Collections Framework (`List` e `ArrayList`)

## Aprendizados

O projeto explora a diferença entre compartilhar uma base por meio de uma classe abstrata e definir uma capacidade por meio de uma interface. Também demonstra como o polimorfismo permite trabalhar com diferentes implementações por um tipo comum.

Projeto desenvolvido para fins educacionais.
