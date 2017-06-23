package com.sajith.warga;

/**
 * Created by Chinthaka-Dev on 6/21/2017.
 */
public class RaashiPorondam implements Porondam {
    String raashi = null;
    YoniPorondam yoniPorondam;

    public RaashiPorondam(YoniPorondam yoniPorondam) {
        this.yoniPorondam = yoniPorondam;
    }

    @Override
    public Integer calculateRemainder(Integer sqFeet) {
        int result = sqFeet * 5 % 12;

        System.out.println(this.getClass().getName().toString() + " : " + result);
        switch (result) {
            case 0:
                raashi = "Meena";
                break;
            case 1:
                raashi = "Meesha";
                break;
            case 2:
                raashi = "Wushaba";
                break;
            case 3:
                raashi = "Mithuna";
                break;
            case 4:
                raashi = "Kataka";
                break;
            case 5:
                raashi = "Sinha";
                break;
            case 6:
                raashi = "Kanya";
                break;
            case 7:
                raashi = "Thula";
                break;
            case 8:
                raashi = "Wushchika";
                break;
            case 9:
                raashi = "Danu";
                break;
            case 10:
                raashi = "Makara";
                break;
            case 11:
                raashi = "Kumba";
                break;
            default:
                raashi = "Unknown Nekatha";
                break;
        }
        System.out.println("Raashi : " + raashi);
        if (result== 2||result== 3||result== 5||result== 9||result== 11) {
            if ("Gaja".equals(yoniPorondam.getYoniya())) {
                if (result == 5)
                    return 0;
            } else if ("Sinha".equals(yoniPorondam.getYoniya())) {
                if (result == 11)
                    return 0;
            } else if ("Wushaba".equals(yoniPorondam.getYoniya())) {
                if (result == 2 || result == 3)
                    return 0;
            } else if ("Dawaja".equals(yoniPorondam.getYoniya())) {
                if (result == 9)
                    return 0;
            } else {
                return 1;
            }
        }
        return 0;


    }

    String getRaashi() {
        return raashi;
    }
}
