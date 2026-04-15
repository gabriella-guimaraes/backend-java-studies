# ☕ Java - Primeira Aplicação (em desenvolvimento)

Repositório desenvolvido durante os cursos da formação Back-End com Java da Alura.

> Projeto com finalidade educacional para prática dos fundamentos da linguagem Java.

---

## 📚 Conteúdo abordado

### ✔️ Java: criando sua primeira aplicação

Neste primeiro módulo foram trabalhados os fundamentos da linguagem Java e a estrutura básica de uma aplicação.

**Conceitos abordados:**

- Criação de um projeto Java no IntelliJ IDEA
- Processo de compilação e execução de uma aplicação Java
- Diferenças entre JDK, JRE e JVM
- Estrutura básica de uma aplicação Java
- Principais tipos de dados
- Entrada de dados com `Scanner`
- Estruturas condicionais (`if`, `else`)
- Estruturas de repetição (`for`, `while`)

### ✔️ Java: aplicando a Orientação a Objetos

Neste módulo a aplicação passa a ser estruturada utilizando **Programação Orientada a Objetos (POO)**.

**Conceitos abordados:**

- Modelagem de problemas utilizando **classes e objetos**
- Criação de **atributos e métodos**
- Uso de **encapsulamento** para proteger dados
- Aplicação de **herança** para reaproveitamento de código
- Uso de **polimorfismo** para tornar o código mais flexível
- Utilização de **interfaces** para padronização de comportamentos

---
### ✔️ Java: trabalhando com listas e coleções de dados

Neste módulo, a aplicação passa a lidar com múltiplos objetos em memória, aproximando-se de cenários reais de sistemas backend.

**Conceitos que serão abordados:**

- Representação de conjuntos de objetos com List
- Utilização da classe ArrayList
- Adição, remoção e acesso a elementos em listas
- Iteração com for, forEach e outras abordagens
- Ordenação de coleções com Comparable e Comparator
- Uso de Collections.sort()
- Casting de objetos
- Verificação de tipo com instanceof
- Aplicação prática de polimorfismo em coleções

---

### 🚧 Java: consumindo API, gravando arquivos e lidando com erros *(em andamento)*

Neste módulo, a aplicação evolui para cenários mais próximos do mundo real, integrando-se com serviços externos e lidando com persistência de dados e falhas.

**Conceitos que serão abordados:**

- Consumo de APIs HTTP em Java
- Envio de requisições e leitura de respostas
- Conversão de dados JSON para objetos Java
- Uso da biblioteca `Gson` para serialização e desserialização
- Manipulação de dados no formato JSON
- Leitura e escrita de arquivos com o pacote `java.io`
- Tratamento de exceções (`try`, `catch`, `finally`)
- Criação de exceções personalizadas
- Boas práticas de organização de código
- Separação de responsabilidades em classes e possíveis interfaces

---

## 🛠️ Tecnologias utilizadas

- Java 25  
- JDK 25 
- IntelliJ IDEA  

---

## 🧠 Conceitos fundamentais

### 🔹 Ecossistema Java

- **JDK (Java Development Kit)** – Kit de desenvolvimento responsável pela compilação do código-fonte.
- **JRE (Java Runtime Environment)** – Ambiente de execução que fornece bibliotecas padrão.
- **JVM (Java Virtual Machine)** – Máquina virtual responsável por executar o bytecode.

### 🔹 Estrutura de uma aplicação Java

- Classe principal
- Método `main`
- Compilação para bytecode
- Execução na JVM

---

## ▶️ Como executar o projeto

1. Certifique-se de ter o **JDK 25** instalado.
2. Configure a variável de ambiente OMDB_API_KEY (veja seção abaixo)
3. Abra o projeto na **IntelliJ IDEA**.
4. Execute a classe que contém o método `main`.

---

## 🔐 Configuração da API (OMDb)

Este projeto realiza o consumo da API pública do OMDb API para busca de informações sobre filmes.

Por questões de segurança, a chave da API (API Key) não está armazenada diretamente no código-fonte.

Em vez disso, deve ser utilizada uma variável de ambiente, evitando o versionamento de dados sensíveis no repositório.

### 📌 Como obter uma API Key
Acesse o site oficial [OMDb API](https://omdbapi.com/) e solicite sua chave gratuita.

Você receberá a API Key por e-mail

### ⚙️ Como configurar a variável de ambiente
🪟 Terminal:

```powershell
setx OMDB_API_KEY "sua_chave_aqui"
```

Após executar o comando, feche e reabra o terminal ou a IDE

## 📌 Observação

Este repositório faz parte de uma trilha de estudos em Back-End com Java e será atualizado conforme a evolução dos módulos da formação.
