import java.util.Scanner;
public class LuanaAssisSilva_1 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe a posição do jogador R: ");
        double R = Double.parseDouble(teclado.nextLine());
        System.out.print("Informe a posição do jogador L: ");
        double L = Double.parseDouble(teclado.nextLine());
        System.out.print("Informe a posição do jogador D: ");
        double D = Double.parseDouble(teclado.nextLine());
        if (!(R < 0 || R > 100 || L < 0 || L > 100 || D < 0 || D > 100 )){
            if (R > 50 && L < R && R > D) {
                System.out.print(" O jogador encontra-se em posição de impedimento.");
            } else {
                System.out.print(" Não há impedimento no lance.  :) ");
            }
        } else {
            System.out.print(" A posição de algum dos jogadores é inválida ");
        }
    }
}
