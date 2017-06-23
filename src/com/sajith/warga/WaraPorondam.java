package com.sajith.warga;

/**
 * Created by Chinthaka-Dev on 6/21/2017.
 */
public class WaraPorondam implements Porondam {
    String dawasa = null;
    YoniPorondam yoniPorondam;

    public WaraPorondam(YoniPorondam yoniPorondam) {
        this.yoniPorondam = yoniPorondam;
    }

    @Override
    public Integer calculateRemainder(Integer sqFeet) {
        int result = sqFeet * 9 % 7;

        System.out.println(this.getClass().getName().toString() + " : " + result);
        switch (result) {
            case 0:
                dawasa = "Shani";
                break;
            case 1:
                dawasa = "Chandra";
                break;
            case 2:
                dawasa = "Bhuda";
                break;
            case 3:
                dawasa = "Sikuru";
                break;
            case 4:
                dawasa = "Ravi";
                break;
            case 5:
                dawasa = "Kuja";
                break;
            case 6:
                dawasa = "Guru";
                break;
            default:
                dawasa = "Unknown Yoniya";
                break;
        }
        System.out.println("Yoniya : " + dawasa);
        if (result == 1 || result == 4 || result == 5) {
            return 0;
        } else {
            if ("Sinha".equals(yoniPorondam.getYoniya())) {
                if (result == 2)
                    return 0;
            } else if ("Gaja".equals(yoniPorondam.getYoniya())) {
                if (result == 5)
                    return 0;
            } else if ("Wushaba".equals(yoniPorondam.getYoniya())) {
                if (result == 4)
                    return 0;
            }
            return 1;
        }

    }

    String getDawasa() {
        return dawasa;
    }
}
