//Script of second interactive class example from module 2 in Java
//Created in 2020-08-03 by Aline Guerreiro

package pkgInteractiveClass2;

import java.util.*;

public class exampleClass {
    public static void main(String[] args) {
        String[] nomePessoas = new String[50];
        String nomePessoaMaiorIdade = "";
        char continuar = 'S';
        int contaPessoas = 0, maiorIdade = 0, menorIdade = 0;
        int[] idades = new int[50];
        char[] sexo = new char[50];
        int[] qtdSexos = new int[3];
        Scanner entNumber= new Scanner(System.in);
        Scanner entCaracter= new Scanner(System.in);

        while (continuar == 'S' || continuar == 's'){
            System.out.printf("Digite o nome da %d. pessoa: ", contaPessoas+1);
            nomePessoas[contaPessoas] = entNumber.nextLine();

            while (nomePessoas[contaPessoas].equals("")){
                System.out.printf("Nome em branco. Digite o nome da %d. pessoa: \n", contaPessoas +1);
                nomePessoas[contaPessoas] = entNumber.nextLine();
            }
            entNumber.nextLine();

            System.out.printf("Digite a idade de %s. \n", nomePessoas[contaPessoas]);
            idades[contaPessoas] = entNumber.nextInt();
            
            while(idades[contaPessoas] < 0) {
                System.out.printf("Idade inválida. Digite a idade de %s. \n", nomePessoas[contaPessoas]);
                idades[contaPessoas] = entNumber.nextLine().charAt(0);
            }

            if(idades[contaPessoas] > maiorIdade) {
                maiorIdade = idades[contaPessoas];
                nomePessoaMaiorIdade = nomePessoas[contaPessoas];
            }
            if(contaPessoas == 0 || idades[contaPessoas] < menorIdade)
                menorIdade = idades[contaPessoas];

            System.out.printf("Digite o sexo de %s. (F- Feminino; M-Masculino; O-Outro", nomePessoas[contaPessoas]);
            sexo[contaPessoas] = entCaracter.nextLine().charAt(0);

            while(sexo[contaPessoas] != 'F' && sexo[contaPessoas] != 'f' &&
                sexo[contaPessoas] != 'M' && sexo[contaPessoas] != 'm' &&
                sexo[contaPessoas] != 'O' && sexo[contaPessoas] != 'o'){
                    System.out.printf("Opção Inválida. Digite o sexo de %s. (F-Feminino; M-Masculino; O-Outro", nomePessoas[contaPessoas]);
                    sexo[contaPessoas] = entCaracter.nextLine().charAt(0);
                }
            if(sexo[contaPessoas] == 'F' || sexo[contaPessoas] == 'f')
                qtdSexos[0]++;
            else if(sexo[contaPessoas] == 'M' || sexo[contaPessoas] == 'm')
                qtdSexos[1]++;
            else 
                qtdSexos[2]++;
            System.out.println("Deseja continuar (S-Sim, N-Não)");
            continuar = entCaracter.nextLine().charAt(0);
            contaPessoas++;
        }

        for (int i=0; i<contaPessoas; i++){
            System.out.printf("Nome: %s. Idade: %d. Sexo: %c. \n", nomePessoas[i],idades[i], sexo[i]);
        }
        System.out.println("**********************Totalizadores************* \n");
        System.out.printf("Quantidade por sexo: Feminino(%d.)," 
                        +"Masculino (%d.), Outros(%d.) \n", qtdSexos[0], qtdSexos[1], qtdSexos[2]);
        System.out.printf("A maior idade é o %d. e pertence a %s.",maiorIdade,nomePessoaMaiorIdade);
        System.out.printf("A menor idade é o %d.",menorIdade);
    }
}
