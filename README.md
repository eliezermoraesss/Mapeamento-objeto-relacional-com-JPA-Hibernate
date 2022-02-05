# Java EE - Mapeamento objeto-relacional com JPA / Hibernate <br>

4) Incluindo JPA para persistir os objetos em banco de dados<br>
Passos:<br>

1) Crie uma base de dados MySQL vazia<br>
 Instale o Xampp no seu computador<br>
 Inicie o Apache e o MySQL<br>
 No PhpMyAdmin, crie uma base de dados chamada "aulajpa"<br>

2) Crie um novo projeto Maven<br>
 File -> New -> Other -> Maven Project<br>
 Create Simple Project -> Next<br>
o Group Id: com.educandoweb<br>
o Artifact Id: aulajpamaven<br>
o Finish<br>

3) Copie as classes Programa e Pessoa para o novo projeto<br>

4) Atualize o Maven do projeto para Java 11<br>
 Edite o arquivo pom.xml<br>
 Inclua o conteúdo abaixo<br>
 Salve o projeto<br>
 Botão direito no projeto -> Maven -> Update Project<br>

<properties><br>
<maven.compiler.source>11</maven.compiler.source><br>
<maven.compiler.target>11</maven.compiler.target><br>
</properties><br>

5) Inclua as dependências Maven a serem baixadas:<br>
<dependencies><br><br>
<!-- https://mvnrepository.com/artifact/org.hibernate/hibernate-core --><br>
<dependency><br>
 <groupId>org.hibernate</groupId><br>
 <artifactId>hibernate-core</artifactId><br>
 <version>5.4.12.Final</version><br>
</dependency><br>
<!-- https://mvnrepository.com/artifact/org.hibernate/hibernate-entitymanager --><br>
<dependency><br>
 <groupId>org.hibernate</groupId><br>
 <artifactId>hibernate-entitymanager</artifactId><br>
 <version>5.4.12.Final</version><br>
</dependency><br>
<!-- https://mvnrepository.com/artifact/mysql/mysql-connector-java --><br>
<dependency><br>
 <groupId>mysql</groupId><br>
 <artifactId>mysql-connector-java</artifactId><br>
 <version>8.0.19</version><br>
</dependency><br>
</dependencies><br>

6) Configure o JPA no seu projeto por meio do arquivo persistence.xml<br>
 Crie uma pasta "META-INF" a partir da pasta "resources"<br>
 Dentro da pasta META-INF crie um arquivo "persistence.xml"<br>
 Conteúdo do arquivo persistence.xml:<br>
<?xml version="1.0" encoding="UTF-8"?><br>
<persistence xmlns="http://xmlns.jcp.org/xml/ns/persistence"<br>
xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"<br>
xsi:schemaLocation="http://xmlns.jcp.org/xml/ns/persistence<br>
 http://xmlns.jcp.org/xml/ns/persistence/persistence_2_1.xsd"<br>
version="2.1"><br>
<persistence-unit name="exemplo-jpa" transaction-type="RESOURCE_LOCAL"><br>
<properties><br>
 <property name="javax.persistence.jdbc.url"<br>
 value="jdbc:mysql://localhost/aulajpa?useSSL=false&amp;serverTimezone=UTC" /><br>
 <property name="javax.persistence.jdbc.driver" value="com.mysql.jdbc.Driver" /><br>
 <property name="javax.persistence.jdbc.user" value="root" /><br>
 <property name="javax.persistence.jdbc.password" value="" /><br>
 <property name="hibernate.hbm2ddl.auto" value="update" /><br>
 <!-- https://docs.jboss.org/hibernate/orm/5.4/javadocs/org/hibernate/dialect/package-summary.html --><br>
 <property name="hibernate.dialect" value="org.hibernate.dialect.MySQL8Dialect" /><br>
</properties><br>
</persistence-unit><br>
</persistence><br>

7) Inclua os MAPEAMENTOS na classe de domínio:<br>
package dominio;<br>
import (...)<br>
@Entity<br>
public class Pessoa implements Serializable {<br>
private static final long serialVersionUID = 1L;<br>
@Id<br>
@GeneratedValue(strategy=GenerationType.IDENTITY)<br>
private Integer id;<br>
 (...) <br>
