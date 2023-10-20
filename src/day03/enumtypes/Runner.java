package day03.enumtypes;

import static day03.enumtypes.PasswordStrengthConstant.*;

public class Runner {
    public static void main(String[] args) {
        printPasswordStrength("MEDIUM");
        printPasswordStrength("LOW");
        printPasswordStrength("high");//mesaj yazilmadi,CTE yok, RTE yok
        //--------------------------------------------------------
        System.out.println("-----------------------ENUM_--------------------------");
        printMessageByEnum(PasswordStrengthEnum.HGH);
        printMessageByEnum(PasswordStrengthEnum.LOW);//enum ,sinirli sabit degiskenler olusturabiliyoruzz
        printMessageByEnum(PasswordStrengthEnum.MEDIUM);
        // printMessageByEnum(yuksek);
        //printMessageByEnum(HIGH);-->method cagrilirekn farkli degerler girmesine izin vermiyor ve direk hata veriyor
    }

    //sifrenin gucunu yazdiran method : static final sabitleri kullanildi
    public static void printPasswordStrength(String strength) {
        if (strength.equals(LOW)) {
            System.out.println("Password gucunuz dusuktur !!!");
        } else if (strength.equals(MEDIUM)) {
            System.out.println("Password gucunuz orta seviyededir !!!");
        } else if (strength.equals(HIGH)) {
            System.out.println("Password gucunuz yuksektir...");
        }
    }

    //enum metod
    public static void printMessageByEnum(PasswordStrengthEnum strength) {
        if (strength.equals(PasswordStrengthEnum.LOW)) {
            System.out.println("Password gucunuz dusuktur!!!");
            System.out.println("Seviyesi :" + strength.getLevel());
        } else if (strength.equals(PasswordStrengthEnum.MEDIUM)) {
            System.out.println("Password gucunuz orta seviydedir !!");
            System.out.println("Seviyesi :" + strength.getLevel());
        } else if (strength.equals(PasswordStrengthEnum.HGH)) {
            System.out.println("Password gucunuz yuksek derecedir");
            System.out.println("Seviyesi :" + strength.getLevel());
        }

        System.out.println("Enum ismi :" + strength.name());
        System.out.println("Enum sirasi :" + strength.ordinal());//sira numarsini kullanmak readable degil sonraki developer anlamayabilir,
        // bakima gelisime acik degill, buna ragmen javanin bir clasinda birebir kullanimi da mevcut
    }


}
