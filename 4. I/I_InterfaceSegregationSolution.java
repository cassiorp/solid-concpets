/*
    A solução para este problema é basicamente simples, criamos interfaces especificas.
    Temos agora a interface FlyingBirds que podemos aplicas apenas em aves que voam e a interface Birds que é mais generica.
*/
public class I_InterfaceSegregationSolution {

    public interface Birds {
        void walk();
    }

    public interface FlyingBirds {
        void fly();
    }

    public static class Dove implements Birds {

        @Override
        public void walk() {
            System.out.println("Andar");
        }
    }

    public static class Penguin implements Birds, FlyingBirds {
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
