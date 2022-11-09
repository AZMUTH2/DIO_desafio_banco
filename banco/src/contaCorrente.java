public class contaCorrente extends conta {
    private static final int Agecia_padrao = 1;
    private static  int sequencial=1;

    public contaCorrente(){
        super.agencia= Agecia_padrao;
        super.numero = sequencial++;
        
    }

    
}
