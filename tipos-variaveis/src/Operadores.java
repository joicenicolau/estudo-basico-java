public class Operadores {
  public static void main (String[] args) throws Exception{
    //classe Operadores.java
    String nomeCompleto = "LINGUAGEM" + "JAVA";
		System.out.println(nomeCompleto);
    //qual o resultado das expressoes abaixo?
    String concatenacao ="?"; 

    concatenacao = 1+1+1+"1";
    System.out.println(concatenacao);

    concatenacao = 1+"1"+1+1;
    System.out.println(concatenacao);

    concatenacao = 1+"1"+1+"1";
    System.out.println(concatenacao);

    concatenacao = "1"+1+1+1;
    System.out.println(concatenacao);

    concatenacao = "1"+(1+1+1);
    System.out.println(concatenacao);
  }
}
