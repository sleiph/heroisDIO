# heroisDIO 🐱‍🏍

Projeto da [Kamilah Santos](https://github.com/Kamilahsantos/Heroes-SpringWebflux-API) de criação de uma api de armazenamento de heróis com webflux, pro bootcamp de Java da [DIO](https://web.digitalinnovation.one/home).

## Stack utilizada
- Java8
- spring webflux
- Spring data
- dynamodb
- junit
- sl4j
- reactor

## rodando o projeto

1. clone o repositório em alguma pasta:
```
git clone https://github.com/sleiph/heroisDIO.git
```

2. entre na pasta criada
```
cd heroesApi_digital_innovation_one
```

3. baixe e configure a [AWS Command Line Interface](https://docs.aws.amazon.com/pt_br/cli/latest/userguide/cli-configure-quickstart.html):

4. execute o dynamo (AWS Command Line Interface):

```
java -Djava.library.path=./DynamoDBLocal_lib -jar DynamoDBLocal.jar -sharedDb
```

pra listar as tabelas criadas:

```
aws dynamodb list-tables --endpoint-url http://localhost:8000
```
