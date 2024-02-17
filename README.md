# API de Cadastro de Clientes - Spring Boot

Este é um projeto de API desenvolvido em Java com o framework Spring Boot para um sistema de cadastro de clientes. Ele fornece endpoints para realizar operações CRUD (Criar, Ler, Atualizar e Deletar) de clientes.

## Pré-requisitos

Antes de começar, certifique-se de ter instalado em sua máquina:

- Java Development Kit (JDK) 8 ou superior
- Maven

## Instalação e Execução

1. Clone este repositório:

   ```bash
   git clone https://github.com/seu-usuario/nome-do-repositorio.git
   ```

2. Navegue até o diretório do projeto:

   ```bash
   cd nome-do-repositorio
   ```

3. Execute o projeto com Maven:

   ```bash
   mvn spring-boot:run
   ```

4. A aplicação estará disponível em `http://localhost:8080/`.

## Endpoints

A API possui os seguintes endpoints:

- **GET /clientes**: Retorna a lista de todos os clientes.
- **POST /clientes**: Cria um novo cliente.
- **PUT /clientes/{id}**: Atualiza os dados de um cliente existente.
- **DELETE /clientes/{id}**: Remove um cliente existente.

## Documentação da API

Você pode acessar a documentação da API em `http://localhost:8080/swagger-ui.html`, onde encontrará informações sobre os endpoints disponíveis e poderá testá-los diretamente no navegador.

## Contribuição

Contribuições são bem-vindas! Para sugestões, por favor abra uma issue primeiro para discutir o que você gostaria de mudar.

## Licença

Este projeto está licenciado sob a [Licença MIT](https://opensource.org/licenses/MIT).
