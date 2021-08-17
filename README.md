# PessoasAPI

Projeto de API REST para gestão de pessoas utilizando JAVA com spring-boot, banco H2 e Gradle

Ao subir o projeto copiar a referencia do jdbc do H2-console para conectar no banco. Muda a cada nova execução do projeto

o.s.b.a.h2.H2ConsoleAutoConfiguration    : H2 console available at '/h2-console'. Database available at 'jdbc:h2:mem:f2304b1c-3746-4de8-8ae4-9ba66272688d'

# Entidades:

Pessoa
Endereco
Telefone


# Métodos:

GET http://localhost:8080/api/v1/pessoas             >> listAll
GET http://localhost:8080/api/v1/pessoas/uf/{UF}     >> listarPorUf
GET http://localhost:8080/api/v1/pessoas/nome/{nome} >> listarPorNome
GET http://localhost:8080/api/v1/pessoas/id/{id}     >> findById
POST http://localhost:8080/api/v1/pessoas            >> createPessoa
PUT http://localhost:8080/api/v1/pessoas/{id}        >> updateById
DELETE http://localhost:8080/api/v1/pessoas/{id}     >> deleteById

# MODELO DE JSON PARA CARREGAR DADOS

    {
        "id":1,
        "nome": "Carlos Heitor",
        "cpf": "000.000.000-00",        // tem que ser um CPF válido
        "dataNascimento": "18-08-2000",
        "telefones":[
            {
                "id": 1,
                "tipo": "CASA",
                "numero": "(45)98877-4422"
            }
        ],
        "enderecos":[
            {
                "id": 1,
                "tipo": "RESIDENCIAL",
                "logradouro": "Av. João Gular",
                "numero": "34",
                "bairro": "Consolação",                
                "cidade": "Natal",
                "uf":"RN"           
            }
        ]
    }
