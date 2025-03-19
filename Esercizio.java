//LEGGERE LE ISTRUZIONI NEL FILE README.md

//Import di Classi Java necessarie al funzionamento del programma
import java.util.Scanner;
import java.util.FileReader;
import java.util.FileWrite;

public  int inverti (String riga) {
    N=Len(riga);
    int N,i,
    String agir;
    agir="";
    while (N-1 >= 0) {
        agit=charAt(riga);
        i--;
    }
    return agir;
}


class Esercizio {
    public static void main(String args[])
    {
        Scanner in = new Scanner( System.in );

        String InputFileName, OutFileName, riga;

        System.out.print("Nome del file di input");
        InputFileName = in.nextLine();

    
        System.out.print("Nome del file di output");
        OutFileName = in.nextLine();

        do{
            lettura riga;
            riga=inverti(riga);
            scrivi riga;


        }while(notEOP());

    }
}

//LEGGERE LE ISTRUZIONI NEL FILE README.md