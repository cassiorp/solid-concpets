/*
 A solução pode foi Abstrair os auths para uma interface Authenticaiton, onde cada tipo de auth
 implementa essa interface.
 A interface é passada então para o AuthenticaionLogin, assim ele não precisa saber detalhes da implementação,
 apenas depende de uma abstração.
 */
public class D_DependencyInversionSolution {

    private static class AuthenticateLogin {
        private final Authentication authentication;

        private AuthenticateLogin(Authentication authentication) {
            this.authentication = authentication;
        }

        public boolean login(User user){
            return authentication.login(user);
        }
    }

    private interface Authentication {
        boolean login(User user);
    }

    private static class AuthenticationLinkedin implements Authentication {
        public boolean login(User user) {
            //autêntica o login com o Oauth Linkedin.
        }
    }

    private static class AuthenticateLogin {
        private final Authentication authentication;

        private AuthenticateLogin(Authentication authentication) {
            this.authentication = authentication;
        }

        public boolean login(User user){
            return authentication.login(user);
        }
    }

    public static void main(String[] args) {
        User user = new User("email@mail.com", "123");

        AuthenticateLogin authenticateLogin = new AuthenticateLogin(new AuthenticationLinkedin());
        authenticateLogin.login(user);
    }
}