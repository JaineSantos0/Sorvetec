<div align="center">
<img src="/logo.png" alt="drawing"width="450"/>
</div>

<div id='inicio'/> 

## Projeto Java ##

Este projeto faz parte da finalização do Bloco 1 do Curso Pessoa Desenvolvedora da [Generation Brasil](https://brazil.generation.org/).

<br>Aqui aplicamos os conceitos de:
<br>
- Entrada e saída de dados⠀⠀⠀⠀⠀ 
- Laços Condicionais
- Laços de Repetição⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
- Métodos e Modificadores de acesso
- Classes, Atributos e Objetos       
- Herança e Sobrecarga
- Collections⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀ 
- Exceptions

<br>

## Sobre o tema ##  
### 🍧 Sistema para Sorveterias ###
Tivemos como base o principal desafio para estabelecimentos que ainda não possuem um processo de vendas automatizado - dificil acesso de todos os clientes ao estabelecimento e o limite de serviços oferecidos por conta de um processo ainda manual para venda. Deste modo, desenvolvemos um um sistema computacional para sorveteria otimizando os serviços de venda de produtos tal como o detalhamento de pedidos, trazendo praticidade e facilidade para o cliente. 

### 📑 Funcionalidades ###
- Cadastro de produtos e clientes (pessoa física e jurídica);
- Opções de entrega;
- Forma de pagamento;
- Menu para efetuar pedido e emitir detalhamento.


<br>

## Sobre o desenvolvimento do sistema ##
Sistema desenvolvido em Java utilizando os conceitos de Orientação a Objetos.

### ✏️ Diagrama de Classes ###
<div align="center">
<img src="/diagrama-de-classes.png" alt="drawing"width="700"/>
</div>

### 📏 Organização do projeto ###

```
 📁 Sorvetec
   |- 📁 src
   |   |- 📁 application
   |   |    |- 📑 Menu.java
   |   |- 📁 model
   |   |    |- 📑 Cliente.java
   |   |    |- 📑 Pedido.java
   |   |    |- 📑 PessoaFisica.java
   |   |    |- 📑 PessoaJuridica.java
   |   |    |- 📑 Produto.java
   |   |- 📁 model.util
   |   |    |- 📑 Cores.java
   |   |    |- 📑 LeituraArquivo.java
   |- 📑 .gitignore
   |- 📑 README.md
```

### 🎲 Dados ###
Para o input, manipulação e testes através de dados locais, utilizamos a classe *BufferedReader* com o objeto *FileReader* para leitura de arquivos **.csv** e posterior método para criação de listas que serviram para a base nas listas de Produtos e Clientes.

```
// Exemplo de dados enviados pelo .csv 
//Pessoa Fisica
1,Kaua,11 0000-0000,Rua Tamarindo 0101 CEP.: 00000-000 São Paulo/SP,kaua@einrot.com,000.000.000-00
//Pessoa Juridica
9,Gelateria Sorvet,11 0000-0090,Rua Pera Do Campo 0101 CEP.: 00000-000 São Paulo/SP,sorvet@armyspy.com,00.000.000/0001-07
//Produtos
31,Picolé 65g,Picoles,Abacaxi,10.00
```

### 📽 Execução ###
<div align="center">
<img src="/executa-menu.gif" alt="drawing"width="700"/>
</div>

<br>

### 💻 Desenvolvedores ###

[<img src="https://avatars.githubusercontent.com/u/97362216?v=4" width=100 > <br> <sub> Lia Laurindo </sub>](https://github.com/lialaurindo) | [<img src="https://avatars.githubusercontent.com/u/100010843?v=4" width=100 > <br> <sub> Jaine Santos</sub>](https://github.com/JaineSantos0) | [<img src="https://avatars.githubusercontent.com/u/123555504?v=4" width=100 > <br> <sub> Andreza Silvestre </sub>](https://github.com/Deekahass) | [<img src="https://avatars.githubusercontent.com/u/105376533?v=4=" width=100 > <br> <sub> Dener Verçosa </sub>](https://github.com/denervercosa) | [<img src="https://avatars.githubusercontent.com/u/114762538?v=4" width=100 > <br> <sub> Kelvin Souza </sub>](https://github.com/KeelvinW) | [<img src="https://avatars.githubusercontent.com/u/123783746?v=4" width=100 > <br> <sub> Fábio Martins </sub>](https://github.com/martinsdfabio) | [<img src="https://avatars.githubusercontent.com/u/123500218?v=4" width=100 > <br> <sub> Nicolas Albuquerque</sub>](https://github.com/NicolasAlbuquerque)
| :---: | :---: | :---: | :---: | :---: | :---: | :---: |


<br>

## 💟 Agradecimentos ##
**É o Grupo 2!**
<br>Este foi o primeiro projeto técnico desenvolvido em grupo e assim como tem sido todo o curso até aqui, foi uma experiência que nos marcou positivamente.
Foram dias e muitas horas de trabalho, reuniões e entregas, pensando com carinho em cada detalhe que está aqui. Também foi um ponto de encontro para pessoas que se conheciam tão pouco e puderam se perceber melhor através de tantas conversas (fora as boas risadas que demos juntos). 
<br>Não poderíamos estar mais inspirados para continuar nossa jornada na Generation. 💙🧡

E obrigada a você que veio conferir nosso projeto! Um sorvetinho virtual para você: 🍦

---
<div align="right">
Copyright ©️ 2023 - Sorvetec
</div>

[🔝 Voltar ao início](#inicio)
