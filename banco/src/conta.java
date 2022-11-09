public class conta {
    protected  int numero;
    protected int agencia;
    protected  float saldo;



    
    public int getNumero() {
        return numero;
    }
    public int getAgencia() {
        return agencia;
    }
    public float getSaldo() {
        return saldo;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }
    public void setSaldo(float dinhaeiroNaConta) {
        this.saldo = saldo;
    }
    


    @Override
    public String toString() {
        return "conta [numero=" + numero + ", agencia=" + agencia + ", saldo=" + saldo + "]";
    }
    float depositar(float valor_a_depositar){
        if (valor_a_depositar<1){
            System.out.println("valor de deposito invalido");
        }
        else{
            saldo=saldo+valor_a_depositar;
            
        }
        return saldo;

    }
    float sacar(float valor_a_sacar){
        if (valor_a_sacar>saldo){
            System.out.println("valor de saque invalido");
        }
        else{

            saldo=saldo-valor_a_sacar;
        }
        return saldo;
    }


    void extrato(){
        System.out.println(saldo);
    }
    void transferir(float valor_a_tranferir, int numedo_da_conta_a_transferir){
        saldo=saldo-valor_a_tranferir;
        }
    
    
}
