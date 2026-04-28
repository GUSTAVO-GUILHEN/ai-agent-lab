# ai-agent-lab
Laboratório experimental para desenvolvimento de APIs Java e auditoria de segurança utilizando agentes autônomos de IA (Ollama/DeepSeek) e orquestração via Docker

# 🤖 AI Agent Lab: Backend & Security Audit

Este repositório é um ambiente de experimentação focado no desenvolvimento de microserviços Java e na implementação de fluxos de **Agentes Autônomos de IA**. O objetivo principal é validar a capacidade de LLMs locais em atuar como engenheiros de software, desde a concepção do código até a auditoria de segurança.

## 🚀 Objetivo do Projeto
Testar a autonomia de modelos de linguagem (como DeepSeek-Coder e Llama 3) rodando via **Ollama** e **Docker** para:
* Geração de código boilerplate e APIs REST em Java/Spring Boot.
* Auditoria automatizada de vulnerabilidades (SQL Injection, Resource Leaks, etc.).
* Testes de orquestração de agentes (OpenHands/Aider).

## 🛠️ Stack Tecnológica
* **Linguagem Principal:** Java 17+
* **Framework:** Spring Boot / Maven
* **Infraestrutura de IA:** Docker, Ollama, Open WebUI
* **Modelos Utilizados:** DeepSeek-Coder, Llama 3

## 🧠 Fluxo de Trabalho do Agente
O agente opera em um ciclo de feedback:
1. **Desenvolvimento:** Criação de endpoints e lógica de negócio.
2. **Auditoria:** Varredura do código gerado em busca de falhas de segurança.
3. **Refatoração:** Aplicação de correções baseadas nos padrões de Clean Code e SOLID.

---
*Projeto desenvolvido por Gustavo Guilhen como parte de estudos em Engenharia de Software e IA Generativa.*
