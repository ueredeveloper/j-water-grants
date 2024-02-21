# To-Do List

## 19 de fevereiro de 2024

## Tarefa 1 - Jakarta
  Alteração na Importação da Anotação `@Entity` em Model Classes

    Neste dia, a solução adotada foi modificar a importação da anotação `@Entity` em classes de modelo (Model) em projetos Spring Boot na versão 3.x.x.

### Problema:
Antes da atualização para o Spring Boot 3.x.x, era comum importar a anotação `@Entity` utilizando `javax.persistence.Entity`.

### Solução:
Com a atualização para o Spring Boot 3.x.x, é necessário utilizar a importação `jakarta.persistence.Entity` para a anotação `@Entity`.
