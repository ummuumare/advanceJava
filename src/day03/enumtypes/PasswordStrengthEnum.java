package day03.enumtypes;

public enum PasswordStrengthEnum {

    LOW(10),
    MEDIUM(30),
    HGH(50);
    //enumlarimiza ozellikler vermek istedigmizde(deger,rengiin, seklini) field olusturup
// constructor kismina ekleyerek sonrasinda Enuma ekleyebilirizz
    private final int level;

    PasswordStrengthEnum(int level) {
        this.level = level;
    }

    public int getLevel() {
        return level;
    }
}
