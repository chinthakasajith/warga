package com.sajith.warga;

/**
 * Created by Chinthaka-Dev on 6/21/2017.
 */
public class AaushaPorondam implements Porondam {

    @Override
    public Integer calculateRemainder(Integer sqFeet) {
        int result=sqFeet*27%100;
        System.out.println(this.getClass().getName().toString()+" : "+result);
        if (result>50){
            return 1;
        }else{
            return 0;
        }
    }
}
