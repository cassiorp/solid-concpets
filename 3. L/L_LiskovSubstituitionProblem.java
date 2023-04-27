/*
    O principio de substituição de Liskov (LSP) prega que classes derivadas devem ser substituidas por usas classes base, ou seja,
    uma classe filha deve ser substituivel por sua classe mãe, isso pensando no uso de herança.
    No exemplo a baixo podemos ver que SalaryAccount herda atributos e comportamentos de BasicAccount, mas o metodo yield() não é aplicado
    em SalaryAccount que lança uma exception, ou seja, a classe filha é obrigada a fazer algo que não lhe compete. Gerando erros inesperados
    ou indesejaveis.
*/
public class L_LiskovSubstituitionProblem {
    //A LSP prega que uma uma classe derivada deve ser substituível por sua classe base.
    private static class BasicAccount {
        protected double balance = 0;

        public void yield() {
            this.balance += (this.balance * 0.15);
        }
    }

    private static class SalaryAccount extends BasicAccount {
        @Override
        public void yield() {
            throw new UnsupportedOperationException("Salary account can't yield");
        }
    }

    //Ao executar esse loop toda classe SalaryAccount ira lançar um exception, o que significa
    //que a classe derivada não pode ser subtituida pela base, porque a regra de yield, não existe
    //em SalaryAccount
    public static void main(String[] args) {
        List<BasicAccount> accountList = new AccountDAO().getAllAccounts();
        accountList.forEach(account -> account.yield());
    }

}