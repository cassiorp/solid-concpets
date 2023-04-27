/* 
    A solução é abstrair os ifs para classes especificas para cada tipo de provider, ou seja, criamos uma interface
    Authenticaion com um método login e essa classe é implementada pelos provider. Na classe login passamos a interface 
    Authentication.
    Com isso a classe AutheticationLogin está fechada para moficiação, mas aberta para extensão, pois podemos criar mais providers
    sem a necessidade de mexer nela;
*/

public class O_OpenClosedSolution {

    //Interface que obriga a todos os autenticadores a aplicar um login
    private interface Authentication {
        boolean login(User user);
    }

    //Autenticadores implementando a interface
    private static class AuthenticationLinkedin implements Authentication {
        @Override
        public boolean login(User user) {
            //autêntica o login com o Oauth Linkedin.
            return true;
        }
    }

    private static class AuthenticationFacebook implements Authentication {
        @Override
        public boolean login(User user) {
            //autêntica o login com o Oauth Facebook.
            return true;
        }
    }

    private static class AuthenticationDatabase implements Authentication {
        @Override
        public boolean login(User user) {
            ConnectionDAO connectionDAO = new ConnectionDAO("root", "");
            Connection connection = connectionDAO.createConnection();
            //autêntica o login com informações do banco de dados
            return true;
        }
    }

    private static class AuthenticateLogin {
        private Authentication authentication;

        public AuthenticateLogin(Authentication authentication) {
            this.authentication = authentication;
        }

        public boolean login(User user){
            return authentication.login(user);
        }
    }
}
