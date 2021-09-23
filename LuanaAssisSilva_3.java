import java.util.Scanner;
public class LuanaAssisSilva_3 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe um número inteiro de no máximo  dígitos: ");
        String numero = teclado.nextLine();
        String num[] = numero.split("");
        if (num.length <= 4) {
            int maior = 0;
            for (int i = 0; i < num.length; i++) {
                int valor = Integer.parseInt(num[i]);
                if (valor > maior) {
                    maior = valor;
                }
            }
            System.out.print(" A base mínima do número "+numero+", é de "+ (maior+1));
        } else {
            System.out.print(" O número informado é inválido.");
        }
    }
}
