package com.sajith.warga;

/**
 * Created by Chinthaka-Dev on 6/21/2017.
 */
public class DewathaPorondam implements Porondam {
    String dewatha = null;

    @Override
    public Integer calculateRemainder(Integer sqFeet) {
        int result = sqFeet * 5 % 3;

        System.out.println(this.getClass().getName().toString() + " : " + result);
        switch (result) {
            case 0:
                dewatha = "Shiwa";
                break;
            case 1:
                dewatha = "Brahmana";
                break;
            case 2:
                dewatha = "Wishnu";
                break;
            default:
                dewatha = "Unknown Yoniya";
                break;
        }
        System.out.println("Deewatha : " + dewatha);
        if (result == 0) {
            return 0;
        } else {
            return 1;
        }

    }

    String getDewatha() {
        return dewatha;
    }
}
