package TestingThings;

public enum Animal {
    DOG("Собака"),
    CAT("Кошка"),
    BIRD("Птица");
    private String translation;

    Animal(String translation) {                  //Изначально имеет модификатор доступа private
        this.translation = translation;
    }

    public String getTranslation() {
        return translation;
    }

    @Override
    public String toString() {
        return "Можно написать - " +
                "Свой текст перевод -" + translation + '\'';
    }
}
