# Pizzaria DIO - Design Patterns

Este projeto simula uma aplicação de uma pizzaria utilizando Java e aplicando diversos **Design Patterns**. O objetivo é demonstrar a implementação e o uso de padrões de projeto no contexto de uma pizzaria, abordando padrões como **Singleton**, **Factory**, **Strategy**, entre outros.

## Tecnologias Utilizadas

- Java 17
- Maven
- Docker
- Docker Compose
- MySQL
- JUnit (para testes unitários)

## Padrões de Projeto Utilizados

- **Singleton**: Garantir que haja uma única instância de um determinado objeto durante toda a execução.
- **Factory Method**: Criar objetos sem expor a lógica de criação ao cliente.
- **Strategy**: Definir uma família de algoritmos, encapsular cada um e torná-los intercambiáveis.
- **Builder**: Facilitar a construção de objetos complexos, passo a passo.

## Como Rodar o Projeto

### Requisitos

- **Docker** e **Docker Compose** instalados

### Rodando com Docker Compose

O projeto está configurado para ser executado com **Docker Compose**, incluindo um banco de dados **MySQL**. Siga os passos abaixo para rodar a aplicação:

1. Clone o repositório:
   ```bash
   git clone https://github.com/stein465/PizzariaDIODesingPatterns.git
   ```
2. Navegue até o diretório do projeto:
   ```bash
   cd PizzariaDIODesingPatterns
   ```
3. Suba os contêineres da aplicação e do banco de dados:
   ```bash
   docker-compose up --build
   ```
4. A aplicação estará disponível em `http://localhost:8080` e o banco de dados MySQL estará rodando no contêiner.


### Rodando os Testes

Este projeto contém testes unitários para garantir a qualidade do código. Para executá-los, use o comando:

```bash
mvn test
```

### Exemplos de Uso

Ao rodar a aplicação, o seguinte cenário será executado:

1. O cliente faz um pedido de uma pizza usando o **Factory Pattern**.
2. A escolha do tamanho e adicionais é feita utilizando o **Strategy Pattern**.
3. O pedido final é exibido, mostrando os ingredientes e preço.

Saída esperada:

```
Pedido realizado: Pizza Margherita - Tamanho: Grande
Adicionais: Queijo Extra
Preço total: R$ 45,00
```


### Alterações Feitas:
1. **Docker Compose**: Adicionadas instruções para rodar o projeto com Docker Compose, criando contêineres para a aplicação e o banco de dados MySQL.
2. **Banco de Dados MySQL**: Informações sobre como acessar o banco de dados MySQL no ambiente Docker.
3. **Melhorias Futuras**: Mantidas as sugestões de melhorias futuras para indicar que o projeto pode ser expandido.
