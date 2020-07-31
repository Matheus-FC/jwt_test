1.Aplicação back-endcom ORM, banco de dados relacional e acesso a dados sem o uso de SQL. 
A aplicação deve possuir:

a.Entidades associadas (OneToMany/ManyToOne ou ManyToMany);

b.Consultas que envolvam mais de uma entidade (Join);

c.Consultas com mais de um parâmetro;d.Uso correto de transações.

2.Aplicação do item 1com serviços REST. A aplicação deve seguir o padrão MVC e possuir:

a.Rotas com diferentes métodosde acesso(GET, POST, etc);

b.Tratamento de CORS;

c.Formatação de JSON por configuração, sem uso de DTOs (JsonView em Java).

3.Aplicação do item 2 com segurança. A aplicação deve possuir:

a.Autenticaçãousando login e token JWT;

b.Autorização(não anotar Controllers). Utilizar, no mínimo, dois níveis de autorização (Usuário e Administrador).

4.Aplicação front-end SPAJavaScript  que  consuma  os  serviços  do  back-end construído nos itens 1, 2 e 3.

A aplicação deve possuir:

a.Múltiplas rotas;

b.Tratamentode erros;

c.Gerenciamento de estado(Redux, Vuex, etc);

d.Elementos  visuais  diferentesde  acordo com  o  nível  de  autorização  do usuário.
