public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        double salario = 1270.50; // milhar e centavos
        double salario2 = 1.270; // 1.2
        byte idade = 123;
		short ano = 2021;
		int cep = 21070333; // se começar com zero, talvez tenha que ser outro tipo
		long cpf = 98765432109L; // se começar com zero, talvez tenha que ser outro tipo
		float pi = 3.14F;
        System.out.println("Meu salário é " + salario);
        System.out.println("Meu salário é " + salario2);
        System.out.println("Minha idade é " + idade);
        System.out.println("O ano é " + ano);
        System.out.println("O CEP é " + cep);
        System.out.println("O CPF é " + cpf);
        System.out.println("O valor de PI é " + pi);
        
    }
}
