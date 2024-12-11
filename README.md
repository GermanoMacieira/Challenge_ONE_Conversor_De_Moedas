# **Conversor de Moedas**

Este projeto é um **Conversor de Moedas** desenvolvido em Java. Ele utiliza uma API de câmbio para realizar conversões entre diferentes moedas de forma prática e eficiente.

---

## **Funcionalidades**
- Conversão entre diferentes moedas, incluindo:
  - Dólar (USD) ↔ Peso Argentino (ARS)
  - Dólar (USD) ↔ Real Brasileiro (BRL)
  - Dólar (USD) ↔ Peso Colombiano (COP)
- Interface de terminal simples e amigável.
- Atualização em tempo real das taxas de câmbio, obtidas da API [ExchangeRate-API](https://www.exchangerate-api.com/).

---

## **Pré-requisitos**
Para executar este projeto, você precisará de:
- **Java Development Kit (JDK)** 8 ou superior instalado.
- Dependência do Gson:
  - Faça o download do arquivo `gson-<versão>.jar` no site oficial do [Gson](https://github.com/google/gson).
  - Adicione-o ao classpath do seu projeto.

---

## **Como Executar**
1. Clone este repositório:
   ```bash
   git clone https://github.com/seu-usuario/conversor-moedas.git
   cd conversor-moedas
   ```

2. Configure o arquivo `.jar` do Gson no classpath:
   - Se estiver utilizando uma IDE como IntelliJ IDEA ou Eclipse, importe o arquivo `gson-<versão>.jar` para o projeto.
   - Alternativamente, compile e execute o projeto com o seguinte comando (ajuste o caminho do Gson):
     ```bash
     javac -cp "caminho/do/gson-<versão>.jar" *.java
     java -cp ".:caminho/do/gson-<versão>.jar" Main
     ```

3. Execute o programa:
   - O menu será exibido no terminal.
   - Escolha a opção desejada, insira os valores e veja os resultados da conversão!

---

## **Arquivos do Projeto**
### **1. Main.java**
Este é o ponto de entrada do programa. Ele apresenta um menu interativo para o usuário, permitindo escolher entre as diferentes opções de conversão.

### **2. Moeda.java**
Classe responsável por encapsular as informações de uma moeda, como nome e taxa de câmbio.

### **3. BuscaMoeda.java**
Classe que realiza a comunicação com a API de câmbio. Utiliza o **HttpURLConnection** (ou **HttpClient**, na refatoração) para obter as taxas de conversão em tempo real.

---

## **Exemplo de Uso**
```plaintext
****************************************************
Seja bem-vindo/a ao Conversor de Moeda =]
1) Dólar =>> Peso argentino
2) Peso argentino =>> Dólar
3) Dólar =>> Real brasileiro
4) Real brasileiro =>> Dólar
5) Dólar =>> Peso colombiano
6) Peso colombiano =>> Dólar
7) Sair
****************************************************
Escolha uma opção válida: 3
Digite o valor a ser convertido: 100
Taxa de conversão USD => BRL: 4.75
Valor convertido: 475.00 BRL
```

---

## **Tecnologias Utilizadas**
- **Java**: Linguagem de programação principal.
- **Gson**: Biblioteca para manipulação de JSON.
- **ExchangeRate-API**: Fonte das taxas de câmbio.

---

## **Personalização**
Caso você queira utilizar outra API, substitua o valor da variável `BASE_URL` na classe `BuscaMoeda` pela URL da nova API e ajuste os parâmetros conforme necessário.

---

## **Contribuição**
Sinta-se à vontade para contribuir com melhorias ou novas funcionalidades:
1. Faça um fork do projeto.
2. Crie uma branch para suas alterações:
   ```bash
   git checkout -b minha-alteracao
   ```
3. Commit suas mudanças:
   ```bash
   git commit -m "Descrição da alteração"
   ```
4. Faça o push para a branch:
   ```bash
   git push origin minha-alteracao
   ```
5. Abra um Pull Request.

---

