package domain;

public class Name {
    public String name;

    public Name(String name) {
        validationStringEmpty(name);
        validationNameLength(name);
        this.name = name;
    }

    /**
     * StringUtils.isEmpty
     * String empty check
     */
    public static void validationStringEmpty(CharSequence cs) {
        if(null == cs || cs.length() == 0){
            throw new IllegalArgumentException("이름은 공백이 될 수 없습니다.");
        }
    }

    public static void validationNameLength(String carName) {
        if(!(carName.length() <= 5)){
            throw new IllegalArgumentException("이름은 5자리 이하로만 입력이 가능합니다.");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Name)) return false;

        Name name1 = (Name) o;

        return name.equals(name1.name);

    }

    @Override
    public String toString() {
        return name;
    }

}
