package com.sajith.warga;

/**
 * Created by Chinthaka-Dev on 6/21/2017.
 */
public class YoniPorondam implements Porondam {
    String yoniya = null;

    @Override
    public Integer calculateRemainder(Integer sqFeet) {
        int result = sqFeet * 3 % 8;

        System.out.println(this.getClass().getName().toString() + " : " + result);
        switch (result) {
            case 0:
                yoniya = "Kaka";
                break;
            case 1:
                yoniya = "Sinha";
                break;
            case 2:
                yoniya = "Kotalu";
                break;
            case 3:
                yoniya = "Dawaja";
                break;
            case 4:
                yoniya = "Shwana";
                break;
            case 5:
                yoniya = "Gaja";
                break;
            case 6:
                yoniya = "Dhuma";
                break;
            case 7:
                yoniya = "Wushaba";
                break;
            default:
                yoniya = "Unknown Yoniya";
                break;
        }
        System.out.println("Yoniya : " + yoniya);
        if (result % 2 == 0) {
            return 0;
        } else {
            return 1;
        }

    }

    String getYoniya() {
        return yoniya;
    }
}
