package com.sajith.warga;

/**
 * Created by Chinthaka-Dev on 6/21/2017.
 */
public class WanshaPorondam implements Porondam {
    String wansha = null;

    @Override
    public Integer calculateRemainder(Integer sqFeet) {
        int result = sqFeet * 3 % 4;

        System.out.println(this.getClass().getName().toString() + " : " + result);
        switch (result) {
            case 0:
                wansha = "Shudra";
                break;
            case 1:
                wansha = "Brahmana";
                break;
            case 2:
                wansha = "Kshathreeya";
                break;
            case 3:
                wansha = "Waishya";
                break;
            default:
                wansha = "Unknown Yoniya";
                break;
        }
        System.out.println("Wanshaya : " + wansha);
        if (result == 0) {
            return 0;
        } else {
            return 1;
        }

    }

    String getWansha() {
        return wansha;
    }
}
