import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("digite seu nome");
    String nome = sc.nextLine();
     System.out.println("digite sua senha");
    int senha = sc.nextInt();
    if (nome.equals("mateus") && senha == 123){
      System.out.println(" seja bem vindo chefe");
    } 

    sc.close();
  }

}