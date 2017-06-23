package com.sajith.warga;

/**
 * Created by Chinthaka-Dev on 6/22/2017.
 */
public class Warga {

    Integer finalResult=0;
    Integer squreFeet;

    public Warga(int sqFeet) {
        this.squreFeet=sqFeet;
        //calculatePorondam(sqFeet);
    }

    void calculatePorondam(int sqFeet){

        Porondam ayaPorondam=new AyaPorondam();
        finalResult+=ayaPorondam.calculateRemainder(sqFeet);

        Porondam weyaPorondam=new WeyaPorondam();
        finalResult+=weyaPorondam.calculateRemainder(sqFeet);

        YoniPorondam yoniPorondam=new YoniPorondam();
        finalResult+=yoniPorondam.calculateRemainder(sqFeet);

        Porondam nekathPorondam=new NekathPorondam(yoniPorondam);
        finalResult+=nekathPorondam.calculateRemainder(sqFeet);

        WaraPorondam waraPorondam=new WaraPorondam(yoniPorondam);
        finalResult+=waraPorondam.calculateRemainder(sqFeet);

        RaashiPorondam raashiPorondam=new RaashiPorondam(yoniPorondam);
        finalResult+=raashiPorondam.calculateRemainder(sqFeet);

        Porondam anshakaPorondam=new AnshakaPorondam();
        finalResult+=anshakaPorondam.calculateRemainder(sqFeet);

        ThithiPorondam thithiPorondam=new ThithiPorondam(yoniPorondam);
        finalResult+=thithiPorondam.calculateRemainder(sqFeet);

        Porondam wanshaPorondam=new WanshaPorondam();
        finalResult+=wanshaPorondam.calculateRemainder(sqFeet);

        Porondam aayushaPorondam=new AaushaPorondam();
        finalResult+=aayushaPorondam.calculateRemainder(sqFeet);

        Porondam deewathaPorondam=new DewathaPorondam();
        finalResult+=deewathaPorondam.calculateRemainder(sqFeet);

        System.out.println(this.getFinalResult()+" / 11.");

    }

    public Integer getFinalResult() {
        System.out.println("Warga Porondam Match :-\n");
        return finalResult;
    }

    public String getBestSqureFeet(){
        String finalCount="Below Expectation";
        calculatePorondam(squreFeet);
        System.out.println("*** Best Results ***\n");
        if(finalResult>9){
            System.out.println("Squre Feets : "+squreFeet+" :: "+this.finalResult+" / 11.");
            finalCount="Squre Feets : "+squreFeet+" :: "+this.finalResult+" / 11.";
        }
        return finalCount;
    }
}
