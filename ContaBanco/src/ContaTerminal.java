import java.util.Scanner;

public class ContaTerminal {

        private int numero;
        private String agencia;
        private String nomeCliente;
        private Double saldo;
        
        public int getNumero() {
            return numero;
        }
        public void setNumero(int numero) {
            this.numero = numero;
        }
        public String getAgencia() {
            return agencia;
        }
        public void setAgencia(String agencia) {
            this.agencia = agencia;
        }
        public String getNomeCliente() {
            return nomeCliente;
        }
        public void setNomeCliente(String nomeCliente) {
            this.nomeCliente = nomeCliente;
        }
        public Double getSaldo() {
            return saldo;
        }
        public void setSaldo(Double saldo) {
            this.saldo = saldo;
        }
    public static void main(String[] args) throws Exception {
         
        Scanner scanner = new Scanner(System.in);

        ContaTerminal conta = new ContaTerminal();

        //Solcitação dos dados ao usuário
        System.out.println("Por favor, digite o número da Conta!");
        conta.setNumero(scanner.nextInt());
        scanner.nextLine();

        System.out.println("Por favor, digite o número da Agência!");
        conta.setAgencia(scanner.nextLine());

        System.out.println("Por favor, digite o nome do Cliente!");
        conta.setNomeCliente(scanner.nextLine());

        System.out.println("Por favor, digite o  saldo da Conta!");
        conta.setSaldo(scanner.nextDouble());

        // Exibição das informações da conta
        System.out.println("********************************");
        System.out.println("Conta criada com sucesso!");
        System.err.println("Número da conta: " + conta.getNumero());
        System.out.println("Agência: " + conta.getAgencia());
        System.out.println("Nome do Cliente: " + conta.getNomeCliente());
        System.out.println("Saldo: " + conta.getSaldo());
       
        //Fechando o Scanner
        scanner.close();
    }
}
