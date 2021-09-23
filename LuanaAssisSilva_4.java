import java.util.Scanner;
public class LuanaAssisSilva_4 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe o preço da compra: ");
        double preco = Double.parseDouble(teclado.nextLine());
        System.out.print("Informe a categoria da compra: ");
        int categoria = Integer.parseInt(teclado.nextLine());
        System.out.print("Informe a situação do produto: ");
        String situacao = teclado.nextLine();
        double precoAumento=0, descontoI =0;
        String classe = "";
        if (preco<=25){
            if (categoria==1){
                precoAumento= (preco*0.05);
            } else if (categoria==2){
                precoAumento= (preco*0.08);
            }else if (categoria==3) {
                precoAumento = (preco * 0.1);
            } else {
                System.out.print("Não existe essa categoria. ");
            }
        } else {
            if (categoria==1){
                precoAumento=  (preco*0.12);
            } else if (categoria==2){
                precoAumento= (preco*0.15);
            }else if (categoria==3) {
                precoAumento = (preco * 0.18);
            } else {
                System.out.print("Não existe essa categoria. ");
            }
        }
        if ( categoria == 3 || situacao=="R"){
            descontoI = (preco + precoAumento) * 0.08;
        } else if (categoria == 2 && situacao=="N"){
            descontoI = (preco + precoAumento) * 0.05;
        } else {
            descontoI = (preco + precoAumento) * 0.03;
        }
        double valorF =(preco + precoAumento) - descontoI;
        if (valorF<=50){
             classe = "barato";
        } else if (valorF>50 && valorF<120){
             classe = "normal";
        } else if (valorF>=120){
             classe = "caro";
        }
        System.out.print("O aumento é de "+precoAumento+", o desconto do imposto é de "+descontoI+", o valor final é de "+ valorF+ " e a classificação é "+ classe);

    }
}
