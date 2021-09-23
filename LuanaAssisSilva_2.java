import java.util.Scanner;
public class LuanaAssisSilva_2 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe o tempo do nadador A : ");
        double A = Double.parseDouble(teclado.nextLine());
        System.out.print("Informe o tempo do nadador B : ");
        double B = Double.parseDouble(teclado.nextLine());
        System.out.print("Informe o tempo do nadador C : ");
        double C = Double.parseDouble(teclado.nextLine());
        if (A < B && A < C){
            if (B<C){
                System.out.print(" O nadador A receber OURO, o nadador B recebe PRATA e o C recebe BRONZE .");
            } else {
                System.out.print(" O nadador A receber OURO, o nadador C recebe PRATA e o B recebe BRONZE .");
            }
        } else if (B < A && B < C) {
            if (A<C){
                System.out.print(" O nadador B receber OURO, o nadador A recebe PRATA e o C recebe BRONZE .");
            } else {
                System.out.print(" O nadador B receber OURO, o nadador C recebe PRATA e o A recebe BRONZE .");
            }
        } else {
            if (A<B){
                System.out.print(" O nadador C receber OURO, o nadador A recebe PRATA e o B recebe BRONZE .");
            } else {
                System.out.print(" O nadador C receber OURO, o nadador B recebe PRATA e o A recebe BRONZE .");
            }
        }
    }
}
