package com.sajith.warga;

/**
 * Created by Chinthaka-Dev on 6/21/2017.
 */
public class NekathPorondam implements Porondam {
    String nekatha = null;
    YoniPorondam yoniPorondam;

    public NekathPorondam(YoniPorondam yoniPorondam) {
        this.yoniPorondam = yoniPorondam;
    }

    @Override
    public Integer calculateRemainder(Integer sqFeet) {
        int result = sqFeet * 8 % 27;

        System.out.println(this.getClass().getName().toString() + " : " + result);
        switch (result) {
            case 0:
                nekatha = "Rewatha";
                break;
            case 1:
                nekatha = "Pusha";
                break;
            case 2:
                nekatha = "Visa";
                break;
            case 3:
                nekatha = "Siyawasa";
                break;
            case 4:
                nekatha = "Muwasirasa";
                break;
            case 5:
                nekatha = "Hatha";
                break;
            case 6:
                nekatha = "Uthrasala";
                break;
            case 7:
                nekatha = "Berana";
                break;
            case 8:
                nekatha = "Ma";
                break;
            case 9:
                nekatha = "Deta";
                break;
            case 10:
                nekatha = "Uthraputupa";
                break;
            case 11:
                nekatha = "Punawasa";
                break;
            case 12:
                nekatha = "Sa";
                break;
            case 13:
                nekatha = "Denata";
                break;
            case 14:
                nekatha = "Rehena";
                break;
            case 15:
                nekatha = "Uthrapal";
                break;
            case 16:
                nekatha = "Puwasala";
                break;
            case 17:
                nekatha = "Aswidha";
                break;
            case 18:
                nekatha = "Asliya";
                break;
            case 19:
                nekatha = "Anura";
                break;
            case 20:
                nekatha = "Puwaputupa";
                break;
            case 21:
                nekatha = "Ada";
                break;
            case 22:
                nekatha = "Sitha";
                break;
            case 23:
                nekatha = "Suwana";
                break;
            case 24:
                nekatha = "Kethi";
                break;
            case 25:
                nekatha = "Puwapal";
                break;
            case 26:
                nekatha = "Mula";
                break;
            default:
                nekatha = "Unknown Nekatha";
                break;
        }
        System.out.println("Nekatha : " + nekatha);
        if (result % 2 == 0) {
            if ("Wushaba".equals(yoniPorondam.getYoniya())) {
                if (result == 24 || result == 14 || result == 4 || result == 21)
                    return 0;
            } else if ("Gaja".equals(yoniPorondam.getYoniya())) {
                if (result == 8 || result == 25 || result == 5 || result == 15)
                    return 0;
            } else if ("Dawaja".equals(yoniPorondam.getYoniya())) {
                if (result == 19 || result == 9 || result == 26 || result == 16)
                    return 0;
            } else if ("Sinha".equals(yoniPorondam.getYoniya())) {
                if (result == 13 || result == 20 || result == 10 || result == 3)
                    return 0;
            } else {
                return 1;
            }
        }
        return 0;


    }

    String getNekatha() {
        return nekatha;
    }
}
