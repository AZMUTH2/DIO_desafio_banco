public class App {
    public static void main(String[] args) throws Exception {
        contaCorrente conta1 = new contaCorrente();
        conta1.saldo=1500;
        contaCorrente conta2 = new contaCorrente();
        conta2.saldo=5000;
        contaPoupanca contaP1 = new contaPoupanca();
        contaP1.saldo= 6000;
        
        System.out.println(conta1);
        System.out.println(conta2);
        System.out.println(contaP1);


        

        
    }
}
