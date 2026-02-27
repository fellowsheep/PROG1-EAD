# 🐍 Guia de Instalação: Python + VS Code

Este guia prático ajudará você a configurar seu ambiente de desenvolvimento do zero para começar a programar em Python.

---

## 📑 Índice
- [🐍 Guia de Instalação: Python + VS Code](#-guia-de-instalação-python--vs-code)
  - [📑 Índice](#-índice)
  - [Passo 1: Instalar o Python](#passo-1-instalar-o-python)
  - [Passo 2: Instalar o VS Code](#passo-2-instalar-o-vs-code)
  - [Passo 3: Configurar a Extensão Python](#passo-3-configurar-a-extensão-python)
  - [Passo 4: Criando seu primeiro programa](#passo-4-criando-seu-primeiro-programa)
  - [Passo 5: Como Executar seu Código](#passo-5-como-executar-seu-código)
    - [A. Via Interface (Botão Run)](#a-via-interface-botão-run)
    - [B. Via Menu Superior](#b-via-menu-superior)
    - [C. Via Terminal (Linha de Comando)](#c-via-terminal-linha-de-comando)

---

## Passo 1: Instalar o Python
Antes de usar o editor, o computador precisa "aprender" a linguagem Python.

1. Acesse o site oficial [python.org](https://www.python.org).
2. Baixe a versão mais recente para o seu sistema operacional.
3. **Importante (Windows):** Ao abrir o instalador, marque a caixa **"Add Python to PATH"**. Isso permite que o VS Code encontre o Python automaticamente.
4. Clique em **"Install Now"** e aguarde a conclusão.

## Passo 2: Instalar o VS Code
O VS Code será o nosso "caderno inteligente" onde escreveremos o código.

1. Acesse [code.visualstudio.com](https://code.visualstudio.com).
2. Baixe e instale a versão correspondente ao seu sistema.
3. Siga as instruções padrão de instalação.

## Passo 3: Configurar a Extensão Python
O VS Code puro é apenas um editor de texto; precisamos dar a ele os "poderes" do Python.

1. Abra o **VS Code**.
2. No menu lateral, clique no ícone de **Extensions** (quatro quadrados).
3. Busque por **"Python"**.
4. Instale a extensão oficial da **Microsoft**.

## Passo 4: Criando seu primeiro programa
**Atenção:** Antes de começar, é fundamental organizar seus arquivos para que os comandos de compilação e execução funcionem corretamente.

1. Crie uma pasta no seu computador para o seu projeto.
2. No VS Code, vá em **File > Open Folder** e selecione essa pasta. Estar no diretório correto no terminal é essencial para o sucesso da execução.
3. Agora sim, vá em **File > New Text File**.
4. Salve o arquivo (`Ctrl + S`) com o nome `ola_mundo.py`. A extensão `.py` é o que identifica o arquivo.
5. Escreva o seguinte código:
   ```python
   print("Olá, Mundo!")
   ```

   ## Passo 5: Como Executar seu Código

Existem três formas principais de rodar o seu script no VS Code:

### A. Via Interface (Botão Run)
Esta é a forma mais rápida e visual. 

1. [cite_start]Localize o ícone de **Play** (triângulo) no canto superior direito do editor[cite: 24].
2. [cite_start]Clique nele e o VS Code abrirá o terminal automaticamente para exibir o resultado[cite: 24].



### B. Via Menu Superior
1. Com o arquivo `ola_mundo.py` aberto e selecionado.
2. Vá ao menu superior e clique em **Run**.
3. Selecione **Start Debugging** (ou pressione **F5**) ou **Run Without Debugging** (**Ctrl+F5**).

### C. Via Terminal (Linha de Comando)
Se você preferir usar comandos manuais, o que ajuda a entender como o computador processa o arquivo:

1. Abra o terminal integrado (Menu **Terminal > New Terminal**).
2. Certifique-se de que você está na pasta correta (onde salvou o arquivo).
3. Digite o comando abaixo e aperte Enter:
   ```bash
   python ola_mundo.py