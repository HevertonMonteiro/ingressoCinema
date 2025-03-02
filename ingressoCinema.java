import java.util.Scanner;
public class ingressoCinema {
public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);

    double adulto = 30.00;
    double infantil = 15.00;
    double idoso = 20.00;
    double ingresso = 0.00;
    String escolhido = "";
    boolean continuar = true;
    
    while (continuar) {
    System.out.println("Qual a sua categoria? ");
    System.out.println("1 - adulto");
    System.out.println("2 - infantil");
    System.out.println("3 - idoso");
    System.out.println("4 - Finalizar e calcular o total");

    int categoria = scanner.nextInt();

    if (categoria == 1){
        ingresso += adulto;
        escolhido = "adulto";
    }
    else if (categoria == 2){
        ingresso += infantil;
        escolhido = "infantil";
    }
    else if (categoria == 3){
        ingresso += idoso;
        escolhido = "idoso";
    }
    else if (categoria == 4) {
        continuar = false;
    }
    if (categoria != 1 && categoria != 2 && categoria != 3 && categoria != 4){
        System.out.println("Opção invalida, digite 1, 2, 3 ou 4. ");
        continue;
    }
    
    System.out.println("Voçê escolheu a opção , " + categoria);
    System.out.println("O valor é " + ingresso);    
}
    System.out.println("Obrigado por usar o sistema de ingressos! ");
    scanner.close();
}
}

