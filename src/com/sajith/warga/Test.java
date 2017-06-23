package com.sajith.warga;

/**
 * Created by Chinthaka-Dev on 6/21/2017.
 */
public class Test {
    public static void main(String[] args) {
        //Warga warga=new Warga(1367);
        /*ArrayList<String> bestResults=new ArrayList<String>();

        for (int i=500;i<=1800;i++){
            Warga warga=new Warga(i);
            bestResults.add(warga.getBestSqureFeet());
        }
        System.out.println("*************************************************\n");
        for(String bestResult:bestResults){
            System.out.println(bestResult);
        }*/
        int sqFeet=1258;

        Porondam ayaPorondam=new AyaPorondam();
        System.out.println(ayaPorondam.calculateRemainder(sqFeet));

        Porondam weyaPorondam=new WeyaPorondam();
        System.out.println(weyaPorondam.calculateRemainder(sqFeet));

        Porondam aayushaPorondam=new AaushaPorondam();
        System.out.println(aayushaPorondam.calculateRemainder(sqFeet));
    }
}
