package com.sajith.warga;

/**
 * Created by Chinthaka-Dev on 6/21/2017.
 */
public class AnshakaPorondam implements Porondam {
    String anshaka = null;

    @Override
    public Integer calculateRemainder(Integer sqFeet) {
        int result = sqFeet * 4 % 9;

        System.out.println(this.getClass().getName().toString() + " : " + result);
        switch (result) {
            case 0:
                anshaka = "Pretha";
                break;
            case 1:
                anshaka = "Artha";
                break;
            case 2:
                anshaka = "Artha Heena";
                break;
            case 3:
                anshaka = "Bala";
                break;
            case 4:
                anshaka = "Durbala";
                break;
            case 5:
                anshaka = "Bhutha";
                break;
            case 6:
                anshaka = "Dhanya";
                break;
            case 7:
                anshaka = "Thaskara";
                break;
            case 8:
                anshaka = "Nupathi";
                break;
            default:
                anshaka = "Unknown Anshaka";
                break;
        }
        System.out.println("Yoniya : " + anshaka);
        if (result == 0||result == 2||result == 4||result == 7) {
            return 0;
        } else {
            return 1;
        }

    }

    String getAnshaka() {
        return anshaka;
    }
}
