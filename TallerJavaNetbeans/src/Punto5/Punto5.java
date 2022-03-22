package Punto5;

public class Punto5 {

    public static void main(String[] args) {
        String titulos[] = {"Comuna", "Candidato A", "Candidato B", "Candidato C", "Candidato D"};

        int votos[][] = {{1, 2, 3, 4, 5}, 
            {194, 180, 221, 432, 820}, {48, 20, 90, 50, 61}, {206, 320, 140, 821, 946}, {45, 16, 20, 14, 18}};
        
        int Total[] = new int[5];
        String Maxvoto = "", ganador = "";
        int contador = 0, MasVotado = 0,NumComuna=0;
        double prt, TotalVotos=  0, MayorPrt = 0;
        int TotalComuna[] = new int[5];
        double ComunaMayor=0, PorcentajeComuna;

        for (int i = 0; i <= titulos.length - 1; i++) {
            System.out.print(titulos[i] + "\t");
        }
        System.out.println("");
        for (int i = 0; i < 5; i++) {
            for (int m = 0; m < 5; m++) {
                System.out.print(votos[m][i] + "\t      ");
            }
            System.out.println("");
        }

        System.out.println("\n---- votos totales ----");

        for (int i = 1; i < 5; i++) {
            for (int m = 0; m < 5; m++) {
                Total[contador] += votos[i][m];
            }
            TotalVotos += Total[contador];
            contador++;
        }
        contador = 0;
         
        for (int i = 0; i < 5; i++) {
            for (int m = 1; m < 5; m++) {
                TotalComuna[contador] += votos[m][i];
            }
            PorcentajeComuna = (TotalComuna[contador] * 100) / TotalVotos;
            if (PorcentajeComuna > ComunaMayor) {
                ComunaMayor = PorcentajeComuna;
                NumComuna = i+1;
            }
            contador++;
        }
        contador = 0;
        
        
        for (int j = 1; j < 5; j++) {

            prt = (Total[contador] * 100) / TotalVotos;
            System.out.printf("El " + titulos[j] + " tiene " + Total[contador] + " votos en total con un porcentaje del %.2f \n", prt);
            
            if (Total[contador] > MasVotado) {
                MasVotado = Total[contador];
                Maxvoto = titulos[j];
            }
            
            if (prt > MayorPrt) {
                MayorPrt = prt;
                ganador = titulos[j];
            }
            contador++;
        }
        System.out.println("------ Conclusiones ------");
        System.out.println("El " + Maxvoto + " con " + MasVotado + " votos fue el que obtuvo más votos");
        System.out.printf("El " + ganador + " ha sido el ganador ya que tiene el %.2f porciento de los votos\n", MayorPrt);
        System.out.printf("La comuna "+NumComuna+" con %.2f porciento de votos es la que tiene mayor porcentaje de votos\n",ComunaMayor);

    }
}
