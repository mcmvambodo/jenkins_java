W I N D O W S :
#Java compile:
javac -d target/classes ./src/main/java/com/doitwell/scratch/models/User.java
javac -d target/classes ./src/main/java/com/doitwell/scratch/App.java -cp target/classes
javac -d target/classes ./src/test/java/com/doitwell/scratch/models/UserTest.java -cp ".;./target/classes;./lib/hamcrest-core-1.3.jar;./lib/junit-4.13.2.jar"

#Java run:
java -cp target/classes com.doitwell.scratch.App 1 2
java -cp ".;target/classes;./lib/hamcrest-core-1.3.jar;./lib/junit-4.13.2.jar" org.junit.runner.JUnitCore com.doitwell.scratch.models.UserTest

#Java create executable jar:
jar cfvm ../app.jar ../../scr/main/resources/MANIFEST.txt . ../../lib/

#Java run executable jar:
java -jar app.jar 


L I N U X :
javac -d target/classes ./src/main/java/com/doitwell/scratch/models/User.java
javac -d target/classes ./src/main/java/com/doitwell/scratch/App.java -cp target/classes
javac -d target/classes ./src/test/java/com/doitwell/scratch/models/UserTest.java -cp .:./target/classes:./lib/hamcrest-core-1.3.jar:./lib/junit-4.13.2.jar
java -cp target/classes com.doitwell.scratch.App 1 2
java -cp .:target/classes:./lib/hamcrest-core-1.3.jar:./lib/junit-4.13.2.jar org.junit.runner.JUnitCore com.doitwell.scratch.models.UserTest


MAVEN:
- mvn compile
- mvn test
- mvn package 
(Il compile, il lance les tests unitaire et il genere le .jar executable 
si le <mainclass> a ete specifie dans les plugins de pom.xml)
Il faudra aussi ajouter une configuration dans le pom.xml pour generer le .jar 
executable contenant les dependencies
- mvn dependency:build-classpath
- mvn install (compile, execute les tests, generer le.jar livrable executable avec et sans dependencies)