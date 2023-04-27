/*
 O DIP diz que:
 1.Módulos de alto nível não devem depender de módulos de baixo nível. Ambos devem depender da abstração.
 2.Abstrações não devem depender de detalhes. Detalhes devem depender de abstrações.
 No Exemplo abaixo vemos que o AuthenticaionLogin que é nível mais alto, é acoplado a uma classe de baixo nivel:
 AutenticationLinkedin,esse código tambem quebra outro principio o Open Closed Principle, pois se adicioanarmos
 mais um tipo de auth, precimamos mexer nessa classe.
*/
public class D_DependencyInversionProblem {

    private static class AuthenticateLogin {

        public boolean login(User user){
            AuthenticationLinkedin authentication = new AuthenticationLinkedin();
            return authentication.login(user);
        }
    }

    private static class AuthenticationLinkedin  {
        public boolean login(User user) {
            //autêntica o login com o Oauth Linkedin.
            return true;
        }
    }
}