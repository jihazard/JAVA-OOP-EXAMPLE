package PASTA;

import RAMEN.EggRamen;
import RAMEN.KimcheRamen;
import RAMEN.Ramen;

import java.util.ArrayList;

public class PastaTest {

    static ArrayList<TomatoPasta> tomatopastasales= new ArrayList<>();
    static ArrayList<CreamPasta> creampastasales= new ArrayList<>();
    static ArrayList<Ramen> ramensales= new ArrayList<>();
    static ArrayList<KimcheRamen> kimcheramensales= new ArrayList<>();
    static ArrayList<EggRamen> eggramensales= new ArrayList<>();


    public static void main(String[] args) {


        Pasta pasta= new Pasta("파스타", "맛있는 파스타");

        Pasta cpasta= new CreamPasta(pasta);
        Pasta tpasta= new TomatoPasta(pasta);

        cpasta.advertise();
        tpasta.advertise();


        //가계정산



    }
}
