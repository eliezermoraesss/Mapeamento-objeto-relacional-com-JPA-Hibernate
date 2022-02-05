# Java EE - Mapeamento objeto-relacional com JPA / Hibernate <br>

Este projeto é uma implmentação básica de um CRUD através da especificação Java Persistence Application (JPA) implementando o Hibernate.

## JPA<br>
Java Persistence API (JPA) é a especificação padrão da plataforma Java EE (pacote javax.persistence) para<br>
mapeamento objeto-relacional e persistência de dados.<br>
JPA é apenas uma especificação (JSR 338):<br>
http://download.oracle.com/otn-pub/jcp/persistence-2_1-fr-eval-spec/JavaPersistence.pdf<br>
Para trabalhar com JPA é preciso incluir no projeto uma implementação da API (ex: Hibernate). <br>

# Principais classes:<br>
## EntityManager<br>
https://docs.oracle.com/javaee/7/api/javax/persistence/EntityManager.html<br>
Um objeto EntityManager encapsula uma conexão com a base de dados e serve para efetuar operações de<br>
acesso a dados (inserção, remoção, deleção, atualização) em entidades (clientes, produtos, pedidos, etc.)<br>
por ele monitoradas em um mesmo contexto de persistência.<br>
Escopo: tipicamente mantem-se uma instância única de EntityManager para cada thread do sistema (no caso<br>
de aplicações web, para cada requisição ao sistema).<br>
## EntityManagerFactory<br>
https://docs.oracle.com/javaee/7/api/javax/persistence/EntityManagerFactory.html<br>
 Um objeto EntityManagerFactory é utilizado para instanciar objetos EntityManager.<br>
 Escopo: tipicamente mantem-se uma instância única de EntityManagerFactory para toda aplicação. <br>

