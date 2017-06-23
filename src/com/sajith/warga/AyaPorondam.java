package com.sajith.warga;

/**
 * Created by Chinthaka-Dev on 6/21/2017.
 */
public class AyaPorondam implements Porondam {

    @Override
    public Integer calculateRemainder(Integer sqFeet) {
        int result=sqFeet*8%12;
        System.out.println(this.getClass().getName().toString()+" : "+result);
        if (result>6){
            return 1;
        }else{
            return 0;
        }
    }
}
