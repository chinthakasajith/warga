package com.sajith.warga;

/**
 * Created by Chinthaka-Dev on 6/21/2017.
 */
public class ThithiPorondam implements Porondam {
    YoniPorondam yoniPorondam;

    public ThithiPorondam(YoniPorondam yoniPorondam) {
        this.yoniPorondam = yoniPorondam;
    }

    @Override
    public Integer calculateRemainder(Integer sqFeet) {
        int result = sqFeet * 9 % 30;

        System.out.println(this.getClass().getName().toString() + " : " + result);

        if ("Wushaba".equals(yoniPorondam.getYoniya())) {
            if (result == 1 || result == 6 || result == 11 || result == 16 || result == 21 || result == 26)
                return 0;
        } else if ("Gaja".equals(yoniPorondam.getYoniya())) {
            if (result == 2 || result == 7 || result == 12 || result == 17 || result == 22 || result == 27)
                return 0;
        } else if ("Dawaja".equals(yoniPorondam.getYoniya())) {
            if (result == 3 || result == 8 || result == 13 || result == 18 || result == 23 || result == 28)
                return 0;
        } else if ("Sinha".equals(yoniPorondam.getYoniya())) {
            if (result == 4 || result == 9 || result == 14 || result == 19 || result == 24 || result == 29)
                return 0;
        }
        return 1;
    }
}
