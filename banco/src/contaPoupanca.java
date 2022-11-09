public class contaPoupanca extends conta {
    private static final int Agecia_padrao = 2;
    private static  int sequencial =1;

    public contaPoupanca(){
        super.agencia= Agecia_padrao;
        super.numero = sequencial++;
    }
}
