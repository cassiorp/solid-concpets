/*
    O Principio de Responsabilidade unica (SRP) prega que cada classe deve ter uma única resposabilidade
    e deve se manter coesa.
    No exemplo a baixo podemos ver uma classe que representa um empregado, e lida com campos relacionados a login
    e conexão com banco de dados, ou seja, essa classe tem mais de uma resposabilidade e não é coesa 
*/
public class S_SingleResponsabilityProblem {

    private static class Employee {
        private Long id;
        private String name;
        private double salary;
        private String jobTitle;

        private static final String URL = "jdbc:mysql://localhost:3306/employee?useSSL=false";

        public void login() {
            //Abre conexão com o banco e realiza o login do empregado no sistema
        }

        //getter
        //setters
    }
}