package Identifier;

public class Identifier {

    public boolean isValidString(char caracter) {
        if (((caracter >= 'A') && (caracter <= 'Z')) || ((caracter >= 'a') && (caracter <= 'z'))) {
            return true;
        }
        return false;
    }

    public boolean isValidF(char caracter) {
        boolean aux = isValidString(caracter);

        if (aux || ((caracter >= 0) && (caracter <= 9))) {
            return true;
        }
        return false;
    }

    public boolean validateIdentifier(String string) {
        char find;
        boolean isIdValid = false;

        if (string.length() > 0) {
            find = string.charAt(0);
            isIdValid = isValidString(find);
            if (string.length() > 1) {
                find = string.charAt(1);
                int index = 1;
                while (index < string.length()) {
                    find = string.charAt(index);
                    if (!isValidF(find)) {
                        isIdValid = false;
                    }
                    index++;
                }
            }
        }

        if (isIdValid && (string.length() >= 1) && (string.length() <= 6)) {
            return true;
        } else {
            return false;
        }
    }
}
