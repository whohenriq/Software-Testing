package Identifier;

public class IdentifierMain {
    public static void main(String[] args) {
        if (args.length != 0) {
            Identifier id = new Identifier();

            if (id.validateIdentifier(args[0])) {
                System.out.println("Is valid!");
            } else {
                System.out.println("Is not valid!");

            }
        }

        System.out.println("Uso: IdentifierMain <string>");

    }
}
