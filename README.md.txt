<h2>API REST com Spring Boot</h2>

Em um primeiro contato com Spring Boot foi desenvolvido uma pequena API REST. Nela temos um CRUD básico para atuar com cadastro de PESSOAS. 

*Conta com Banco de dados estilo "builtIn" H2 acessivel em (user sa sem senha)
http://localhost:8080/h2-console/

*Endereço base da API 
http://localhost:8080/api/v1/pessoas

*Ping endpoint - verifica se servidor subiu.
http://localhost:8080/api/v1/pessoas/ping

*Cria Usuario - verbo POST
http://localhost:8080/api/v1/pessoas
Necessita corpo tipo JSON
{
	"nome": "pessoa3",
	"cpf": "1234567890124",
	"funcao":"ATENDENTE",
	"fones": [{	
			"tipo":"FIXO",
			"numero": "5599887755"
			}	]
}

*Listar Pessoas - verbo GET
http://localhost:8080/api/v1/pessoas/lista

*Listar indivídio - verbo GET
http://localhost:8080/api/v1/pessoas/{id}

*Atualizar individuo - verbo PUT
http://localhost:8080/api/v1/pessoas/{id}
Necessita corpo tipo JSON
{
	"nome": "Atualizada",
	"cpf": "1234567890555",
	"funcao":"ATENDENTE",
	"fones": [{	
			"tipo":"FIXO",
			"numero": "5599988776"
			}	]
}

*Deletar individuo
http://localhost:8080/api/v1/pessoas/{id}


Requisitos:

* Java 8.
* Maven 3.
* NetBeans ou outra IDE.

Documentação:

No corpo das classes via JAVADOC.