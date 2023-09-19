import java.util.Scanner;

public class ContaTerminal {
				
				public static void main(String[] args) {
								Scanner ler = new Scanner(System.in);
								int numero;
								String nome, sobrenome, nomeCompleto;
								String agencia;
								double saldo;
												
								System.out.println("Digite seu primeiro nome: ");
								nome = ler.next();
								System.out.println("Digite seu sobrenome: ");
								sobrenome = ler.next();
								System.out.println("Digite o número da agência: ");
								agencia = ler.next();
								System.out.println("Digite o número da conta: ");
								numero = ler.nextInt();
								System.out.println("Digite o valor do saldo: ");
								saldo = ler.nextDouble();
								
								nomeCompleto = completo(nome, sobrenome);
								
								System.out.println("Olá "+nomeCompleto+"!");
								System.out.println("Obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+" e seu saldo de R$"+saldo+" já está disponivel.");
								
				}
				
				public static String completo(String primeiroNome, String segundoNome){
								return primeiroNome.concat(" ").concat(segundoNome);
				}
}