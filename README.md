### Inicialização da aplicação Spring Boot (com banco de dados e dependências)

### 🔧 Pré-requisitos:

- [Java JDK 17+](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)
- [Maven](https://maven.apache.org/download.cgi)
- IDE ([IntelliJ](https://www.jetbrains.com/idea/download), [VS Code](https://code.visualstudio.com/Download) ou [Eclipse](https://www.eclipse.org/downloads/packages/))
- [MySQL](https://dev.mysql.com/downloads/mysql/) (ou outro banco relacional instalado e rodando) 


### 🚀 Passo a passo para iniciar o projeto:
### 1. Clone o projeto
HTTPS:
~~~ git        
  git clone https://github.com/ThiagoasSilva/tarefas-projecao-backend.git
~~~
ou 

SSH:
~~~ git        
  git clone git@github.com:ThiagoasSilva/tarefas-projecao-backend.git
~~~

### 2. Configuração de banco de dados

#### inicie o banco de dados e crie a database
~~~ sql
CREATE DATABASE tarefas_projecao;
USE tarefas_projecao;
~~~

#### Depois de verificar que o bacno de dados está rodando, ajuste suas credenciais de ``usuário`` e ``senha`` no arquivo [application.properties](src/main/resources/application.properties)

    spring.datasource.url=jdbc:postgresql://localhost:3306/tarefas_projecao

    spring.datasource~.username=seuusuario 
    spring.datasource.password=suasenha 
    
    spring.jpa.hibernate.ddl-auto=update
    spring.jpa.show-sql=true
    spring.jpa.properties.hibernate.format_sql=true


#### Abra o projeto na IDE de sua escolha e execute [TarefasProjecaoApplication.java](src/main/java/br/com/tarefas/tarefas_projecao/TarefasProjecaoApplication.java)

#### Verifique se a aplicação está rodando no servidor local pela porta ``8080``
~~~ url
    http://localhost:8080
~~~

## 3. Requisições

#### Utilize alguma ferramenta para lidar com as requisições HTTP, neste projeto foi utilizado o [Postman](https://www.postman.com/)
Métodos: POST, GET, PUT, DELETE

 Utilize do endereço url:
~~~ url
    http://localhost:8080
~~~
---
### Entidades:
<details>
  <summary> USUARIO </summary>

#### 🔹 POST /usuarios – Criar usuário
~~~ json
{
"nome": "João Silva",
"cpf": "12345678900",
"endereco": "Rua das Flores, 123",
"telefoneUsuario": "11999999999"
}
~~~
#### 🔹 GET /usuarios – Listar todos os usuários

    Método: GET

    Sem body

#### 🔹 PUT /usuarios – Modificar usuário

~~~ json
{
"id": 1,
"nome": "João Silva Atualizado",
"cpf": "12345678900",
"endereco": "Rua Nova, 456",
"telefoneUsuario": "11988888888"
}
~~~

#### 🔹 DELETE /usuarios/1 – Deletar usuário

    Método: DELETE
 
    Sem body

---

</details>

<details>
  <summary> TAREFA </summary>

#### 🔹 POST /tarefas – Criar tarefa
~~~ json
{
"prioridade": 2,
"nome": "Estudar Spring Boot",
"descricao": "Fazer exercícios de API REST",
"disciplina": "Programação Web",
"realizado": false
}
~~~

#### 🔹 GET /tarefas – Listar todas as tarefas

    Método: GET

    Sem body

#### 🔹 PUT /tarefas – Atualizar tarefa
~~~ json
{
"id": 1,
"prioridade": 1,
"nome": "Estudar Spring Boot (Atualizado)",
"descricao": "Finalizar exercícios REST",
"disciplina": "Programação Web",
"realizado": true
}
~~~

#### 🔹 DELETE /tarefas/1 – Deletar tarefa

    Método: DELETE

    Sem body

---

</details>

<details>
  <summary> DISCIPLINA </summary>
   
#### 🔹 POST /disciplinas – Criar disciplina
~~~ json
{
"nome": "Banco de Dados",
"nomeProfessor": "Prof. Ana Costa",
"horario": "Segunda-feira - 10h",
"sala": 205
}
~~~

#### 🔹 GET /disciplinas – Listar todas as disciplinas

    Método: GET

    Sem body

#### 🔹 PUT /disciplinas – Atualizar disciplina
~~~ json
{
"id": 1,
"nome": "Banco de Dados II",
"nomeProfessor": "Prof. Ana Costa",
"horario": "Segunda-feira - 14h",
"sala": 305
}
~~~

#### 🔹 DELETE /disciplinas/1 – Deletar disciplina

    Método: DELETE

    Sem body

---

</details>

<details>
  <summary> CURSO </summary>

#### 🔹 POST /cursos – Criar curso
~~~ json
{
"nome": "Engenharia de Software",
"semestres": "8",
"area": "Tecnologia"
}
~~~

#### 🔹 GET /cursos – Listar todos os cursos

    Método: GET

    Sem body

#### 🔹 PUT /cursos – Atualizar curso
~~~ json
{
"id": 1,
"nome": "Engenharia da Computação",
"semestres": "10",
"area": "Exatas"
}
~~~

#### 🔹 DELETE /cursos/1 – Deletar curso

    Método: DELETE

    Sem body

--- 

</details>
