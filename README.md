# MS Email

API para o envio de email 

Curso oferecido pela Michelli Brito  
Link: https://www.youtube.com/watch?v=LW-N44fZ1wk&list=PL8iIphQOyG-Dp037UnFG0x8aduelvZZWE&index=1  

## Tecnologias utilizadas

- Java
- Spring boot
- Spring MVC
- Spring data JPA
- Lombok
- Java Mail Sender
- Postgres

### Utils 

Comandos Docker: 
- Criar o container: docker run -it --name postgres -e POSTGRES_PASSWORD=root -p 5433:5432 -d postgres  
- Acessar o container: docker exec -it postgres bash  
- Acessar o banco: psql -U postgres  
- Criar um novo banco: create database ms_email
- Conectar no banco: \c nome_do_banco
- Listar as tabelas do banco: \dt 

Senha para acesso de apps terceiro do Google: 
- Gerar: https://support.google.com/accounts/answer/185833

