/*
    A solução para este problema consiste em criar classes coesas e com uma única resposabilidade.
*/

public class S_SingleResponsabilitySolution {

    //Classe para lidar com conexao com banco de dados
    public static class ConnectionDAO {
        private Properties connectionProps;
        private Connection conn;

        private static final String URL = "jdbc:mysql://localhost:3306/employee?useSSL=false";

        public ConnectionDAO(String username, String password) {
            connectionProps = new Properties();
            connectionProps.put("user", username);
            connectionProps.put("password", password);
        }

        public Connection createConnection() {
            //Cria conexão com o banco
            return null;
        }

    }

    //Classe para lidar com login
    public static class AuthenticateLogin {
        public boolean login(User user) {
            ConnectionDAO connectionDAO = new ConnectionDAO("root", "");
            Connection connection = connectionDAO.createConnection();
            //realiza o login do usuário no sistema
            return true;
        }
    }

    //Classe de usuário para abstrais email e password para todos os tipos de possiveis usuários
    public static class User {
        private String email;
        private String password;
    }

    //Classe empregado fica responsavel apenas pelos seus campos
    private static class Employee extends User {
        private Long id;
        private String name;
        private double salary;
        private String jobTitle;
    }
}
