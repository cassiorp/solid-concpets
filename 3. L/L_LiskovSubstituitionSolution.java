/*
    A solução para esse problema é usar composição ao inves de herança. 
    Criamos uma classe BalanceManager que tem o atributo balance, nessário nas duas classes BasicAccount e SalaryAccount.
    E implementa o metodo yield(). Então BasicAccount repassa o método e SalaryAccount simplemente não usa o método de  BalanceManager.
    Podemos AnotherAccount que ainda usa o yield e aplica mais regras.
*/
public class L_LiskovSubstituitionSolution {
    
    private static class BalanceManager {
        protected double balance = 0;
        public void yield() {
            this.balance += (this.balance * 0.15);
        }
    }

    //Classe que implementa o mesmo metodo do BalanceManager
    private static class BasicAccount {
        private BalanceManager balanceManager;

        public BasicAccount(BalanceManager balanceManager) {
            this.balanceManager = balanceManager;
        }

        public void yield() {
            balanceManager.yield();
        }
    }

    //Classe que nao implementa o metodo
    private static class SalaryAccount {
        private String something;
        private BalanceManager balanceManager;

        public SalaryAccount(BalanceManager balanceManager) {
            this.balanceManager = balanceManager;
        }
    }

    //Classe que implementa o metodo com mais operações
    private static class AnotherAccount {
        private String anotherThing;
        private BalanceManager balanceManager;

        public AnotherAccount(BalanceManager balanceManager) {
            this.balanceManager = balanceManager;
        }

        public void yield() {
            balanceManager.yield();
            //do more things
        }
    }
}
