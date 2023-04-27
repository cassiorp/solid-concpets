/*
    O principio de segregação de interfaces (ISP) diz que devemos ter interfaces mais especificas ao inves de classes genericas
    Observer o código e veja o problema que ela visa solucionar, a classe Penguin é obrigada a implementar o metodo fly() que não 
    é de sua competencia, gerando uma exception.
*/
public class I_InterfaceSegregationProblem {

    public interface Birds {
        void fly();
        void walk();
    }

    public static class Dove implements Birds {

        @Override
        public void fly() {
            System.out.println("Voar");
        }

        @Override
        public void walk() {
            System.out.println("Andar");
        }
    }

    //Aqui esta o problema. Obrigamos ao pinguim a implementar o metodo fly = voar;
    public static class Penguin implements Birds {
        @Override
        public void fly() {
            throw new RuntimeException("Pinguim não voa :(");
        }

        @Override
        public void walk() {
            System.out.println("Andar");
        }
    }
}