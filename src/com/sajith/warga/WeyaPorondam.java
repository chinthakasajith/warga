package com.sajith.warga;

/**
 * Created by Chinthaka-Dev on 6/21/2017.
 */
public class WeyaPorondam implements Porondam {

    @Override
    public Integer calculateRemainder(Integer sqFeet) {
        int result=sqFeet*9%10;
        System.out.println(this.getClass().getName().toString()+" : "+result);
        if (result<5){
            return 1;
        }else{
            return 0;
        }
    }
}
