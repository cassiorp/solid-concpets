/*
    O principio de aberto e fechado (OCP) diz que classes devem ser fechadas para modificação, mas abertas para extensão.
    Aqui podemos ver que um login que recebe um provider (Linkedin, google, facebook, etc).
    O problema é que para adicionarmos um novo provider devemos adicionar um novo if toda vez
    Isso fere o principio pois modificamos nossa classe.
*/

public class O_OpenClosedProblem {

    private static class AuthenticateLogin {
        public boolean login(User user, String provider) {
            ConnectionDAO connectionDAO = new ConnectionDAO("root", "");
            Connection connection = connectionDAO.createConnection();

            if (provider.equalsIgnoreCase("Linkedin")) {
                //autêntica o login com o Oauth Linkedin
            } else {
                //autêntica o login com informações do banco de dados
            }
            return true;
        }
    }
    
}