# Conta_Bancaria_BDD.

Atividade realizada para complementar a Atividade Final (AF) da matéria de Qualidade e Testes de Software do 4 Semestre do curso de Análise e Desenvolvimento de Sistemas. Cujo o objetivo é entender a funcionalidade da abordagem BDD (Behavior-Driven Development). 

## BDD. 

A abordagem BDD (Behavior-Driven Development) que tem como objetivo a descrição das funcionalidades técnicas de um software, assim, simulando como um software deve ser comportar. 
Principais características do BDD:
• Colaboração entre Equipes;
• Documentação Executável;
• Testes Automatizados;
• Foco no Comportamento do Usuário;
• Histórias de Usuário;
• Abordagem Iterativa;
• Melhoria da Comunicação.

## Ambiente de teste. 

Para aplicar o modelo BDD, foi utilizado a biblioteca Cucumber. Tal ferramenta possibilita criar testes utilizando linguagem natural, utilizando "tags" que são rótulos que você pode associar a cenários ou características (features)
em suas especificações Gherkin.

## Reproduzir Cenários. 

No arquivo "arquivo_teste.feature, criamos os cenários respectivos para realizar os testes nescessários dentro do sistema. Além de colocar as informações do projeto.


![image](https://github.com/NicolasSegat0/Conta_Bancaria_BDD/assets/100158925/59ba5c1b-d52b-4f05-84d2-01c650b93dc1)

## Classe Conta. 

Na pasta "src/main/java", está uma classe chamada "Conta.java" com a indicação do Cucumber durante o processo de documentação da classe a IDE irá indicar informações que devem ser utilizadas para conter no documento.


![image](https://github.com/NicolasSegat0/Conta_Bancaria_BDD/assets/100158925/9862a9e3-cb57-44dc-ad5f-d687594d40a0)

## Classe Runner. 

Para rodar o projeto, é utilizado a classe "Runner.java". Foi utilizado a dependência "Cucumber JVM: Junit", com ela poderemos utilizar um classe para rodar e testar o projeto. 
Está classe irá conter um simples código, conforme a figura abaixo:


![image](https://github.com/NicolasSegat0/Conta_Bancaria_BDD/assets/100158925/98a482b1-511d-44ef-aa2c-f243451ce2ea)

O Runner é responsável por executar os testes em uma classe de teste específica e gerar relatórios dos resultados.

## Resultado.


![image](https://github.com/NicolasSegat0/Conta_Bancaria_BDD/assets/100158925/386450be-f760-4ad3-847e-62142f5fdb39)




