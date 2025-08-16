import pedrohgmello.exceptions.ParametrosInvalidosException;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        int parametroUm = scanner.nextInt();
        int parametroDois = scanner.nextInt();
        try{
            contar(parametroUm, parametroDois);
        } catch(ParametrosInvalidosException e){
            System.out.println(e.getMessage());
        }

    }

    static void contar(int parametroUm, int parametroDois){
        if(parametroUm > parametroDois){
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        } else{
            int diff = parametroDois - parametroUm;
            for(int i = 1; i < diff + 1; i++){
                System.out.println("Imprimindo o número: " + i);
            }
        }
    }
}