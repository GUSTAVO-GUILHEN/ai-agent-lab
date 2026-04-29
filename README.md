# AI Agent Lab - Oficina API 🚀

Este repositório é um laboratório prático focado no desenvolvimento de uma API REST utilizando **Orquestração de Múltiplos Agentes de IA Autônomos**. O objetivo deste projeto foi construir um sistema de gerenciamento de oficina mecânica explorando as fronteiras do **Java 21** e fluxos de trabalho *agentic*.

## 🤖 O Fluxo de Orquestração (Multi-Agent Workflow)

A construção desta aplicação não seguiu o modelo tradicional de codificação manual. Foi utilizado um ecossistema de agentes com funções distintas e colaborativas:

1.  **Windsurf (Cascade):** Atuou como o **Agente de Execução (DevOps)**. Responsável pela gestão do sistema de arquivos, criação da estrutura de pastas (Controller, Service, Repository), automação de comandos de terminal e sincronização de ambiente.
2.  **Gemini (Google):** Atuou como o **Agente Arquiteto**. Responsável pela resolução de conflitos críticos de infraestrutura — especificamente a incompatibilidade entre o compilador do Java 21 e o processamento de anotações do Lombok — e definição da estratégia de tratamento global de exceções.
3.  **Qwen (Alibaba):** Responsável pela lógica de negócio inicial, geração de boilerplate REST e definição das estruturas de dados primárias (DTOs e Entities).

## 🛠️ Stack Tecnológica

* **Linguagem:** Java 21 (Oracle JDK)
* **Framework:** Spring Boot 3.3.2
* **Build Tool:** Maven 3.13.0
* **Banco de Dados:** H2 Database (In-memory)
* **Persistência:** Spring Data JPA / Hibernate

## 🚀 Decisões de Arquitetura

Durante o desenvolvimento, enfrentamos um desafio real de "fronteira tecnológica": a incompatibilidade de bibliotecas de terceiros com a versão mais recente do JDK. A orquestração de agentes tomou as seguintes decisões estratégicas:

* **Bypass de Incompatibilidade:** Migração do Lombok para POJOs puros com Getters/Setters manuais para garantir a estabilidade do build no Java 21.
* **Resiliência de Dados:** Implementação de validação de placa única no `VehicleService`.
* **Camada de Resposta:** Criação de um `GlobalExceptionHandler` para converter exceções de negócio em códigos de status HTTP semânticos (como o `409 Conflict`).

## 📋 Como Executar

Certifique-se de ter o Maven e o Java 21 configurados em suas variáveis de ambiente (`JAVA_HOME`).

```bash
# Limpar e construir o artefato
mvn clean install

# Iniciar o servidor
mvn spring-boot:run
