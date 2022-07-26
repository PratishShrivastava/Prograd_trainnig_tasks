import java.util.Scanner;

public class Q39_NumSysConCal {

    static void HexaMenu(){
        System.out.println("=============================");
        System.out.println("        Hexa-Menu         ");
        System.out.println("Press '0' :- Menu ");
        System.out.println("Press '1' :- Exit ");
        System.out.println("Press '2' :- Convert Hexa to Decimal conversion ");
        System.out.println("Press '3' :- Convert Hexa to Octal conversion ");
        System.out.println("Press '4' :- Convert Hexa to Binary conversion ");
        System.out.println("=============================");
    }

    static void OctalMenu(){
        System.out.println("=============================");
        System.out.println("        Octal-Menu         ");
        System.out.println("Press '0' :- Menu ");
        System.out.println("Press '1' :- Exit ");
        System.out.println("Press '2' :- Convert Octal to Decimal conversion ");
        System.out.println("Press '3' :- Convert Octal to Hex conversion ");
        System.out.println("Press '4' :- Convert Octal to Binary conversion ");
        System.out.println("=============================");
    }

    static void BinaryMenu(){
        System.out.println("=============================");
        System.out.println("        Binary-Menu         ");
        System.out.println("Press '0' :- Menu ");
        System.out.println("Press '1' :- Exit ");
        System.out.println("Press '2' :- Convert Binary to Decimal conversion ");
        System.out.println("Press '3' :- Convert Binary to Hex conversion ");
        System.out.println("Press '4' :- Convert Binary to Octal conversion ");
        System.out.println("=============================");
    }

    static void DecimalMenu(){
        System.out.println("=============================");
        System.out.println("        Decimal-Menu         ");
        System.out.println("Press '0' :- Menu ");
        System.out.println("Press '1' :- Exit ");
        System.out.println("Press '2' :- Convert Decimal to Binary conversion ");
        System.out.println("Press '3' :- Convert Decimal to Hex conversion ");
        System.out.println("Press '4' :- Convert Decimal to Octal conversion ");
        System.out.println("=============================");
    }

    static void Menu(){
        System.out.println();
        System.out.println("=============================");
        System.out.println("            Menu              ");
        System.out.println("Press '1' :- Menu ");
        System.out.println("Press '2' :- Exit ");
        System.out.println("Press '3' :- Decimal Number System ");
        System.out.println("Press '4' :- Binary Number System ");
        System.out.println("Press '5' :- Octal Number System ");
        System.out.println("Press '6' :- Hexadecimal Number System ");
        System.out.println("=============================");
    }

    static void Exit(){
        System.out.println();
        System.out.println("-------------------- THANK YOU -----------------------");
        System.out.println("------------------------------------------------------");
        System.out.println("         |----    /\\    /   |---| ");
        System.out.println("         |----   /   \\  /   |    | ");
        System.out.println("         |----  /     \\/    |___| ");
        System.out.println("------------------------------------------------------");
        System.out.println("--------------CREATED-BY-PRATISH-SHRIVASTAVA----------");
        System.out.println();

    }

    public static void toBinary(int decimal){
        int binary[] = new int[40];
        int index = 0;
        while(decimal > 0){
            binary[index++] = decimal%2;
            decimal = decimal/2;
        }
        System.out.print("Ans -> ");
        for(int i = index-1;i >= 0;i--){
            System.out.print(binary[i]);
        }
        System.out.println();
    }

    public static void toHex(int decimal){
        int rem;
        String hex="";
        char hexchars[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        while(decimal>0)
        {
            rem=decimal%16;
            hex=hexchars[rem]+hex;
            decimal=decimal/16;
        }
        System.out.println(hex);
    }

    public static void toOctal(int decimal){
        int rem;
        String octal="";
        char octalchars[]={'0','1','2','3','4','5','6','7'};

        while(decimal>0) {
            rem=decimal%8;
            octal=octalchars[rem]+octal;
            decimal=decimal/8;
        }
        System.out.println(octal);
    }

    static int binaryToDecimal(long binary) {
        int decimalNumber = 0, i = 0;

        while (binary > 0) {

            decimalNumber += Math.pow(2, i++) * (binary % 10);

            binary /= 10;
        }

        return decimalNumber;
    }

    static void BtoDeciaml(int n) {
        int num = n;
        int dec_value = 0;

        int base = 1;

        int temp = num;
        while (temp > 0) {
            int last_digit = temp % 10;
            temp = temp / 10;

            dec_value += last_digit * base;

            base = base * 2;
        }

        System.out.println(dec_value);
        //return dec_value;
    }

    static void BtoHex(long binary) {

        int decimalNumber = binaryToDecimal(binary);

        String hexNumber = Integer.toHexString(decimalNumber);

        hexNumber = hexNumber.toUpperCase();

        System.out.println(hexNumber);
    }

    static void BtoOctal(long binary) {

        int decimalNumber = binaryToDecimal(binary);

        String octalString = Integer.toOctalString(decimalNumber);

        int octalNumber = Integer.parseInt(octalString);

        System.out.println(octalNumber);
    }

    static void OtoDeciaml(int n ){
        int result = 0;

        // Take a copy of input
        int copy_a = n;

        for (int i = 0; copy_a > 0; i++) {
            int temp = copy_a % 10;

            double p = Math.pow(8, i);

            result += (temp * p);
            copy_a = copy_a / 10;
        }

        System.out.print(result);
    }

    static  void OtoHex(int n){
        String hexnum;
        int decnum;
        String s = String.valueOf(n);
        decnum = Integer.parseInt(s, 8);

        hexnum = Integer.toHexString(decnum);

        System.out.println(hexnum);
    }

    static void OtoBinary(int n){
        int i = 0;
        int decimalValue = 0;
        int binaryValue = 0;

        while (n != 0) {
            decimalValue += (n % 10) * Math.pow(8, i);
            ++i;
            n /= 10;
        }

        i = 1;

        while (decimalValue != 0) {
            binaryValue += (decimalValue % 2) * i;
            decimalValue /= 2;
            i *= 10;
        }

        System.out.println(binaryValue);
    }

    static void HtoDeciaml(String n){
        String digits = "0123456789ABCDEF";
        String hex = String.valueOf(n);
        hex = hex.toUpperCase();
        int val = 0;
        for (int i = 0; i < hex.length(); i++)
        {
            char c = hex.charAt(i);
            int d = digits.indexOf(c);
            val = 16*val + d;
        }
        //return val;
        System.out.println(val);
    }
    static void Htooctal(String n){
        int dec = 0;

        String hexa = "1AC";
        int c = hexa.length() - 1;

        for(int i = 0; i < hexa.length() ; i ++ ) {
            char ch = hexa.charAt(i);
            switch (ch) {
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                    dec = dec + Integer.parseInt(Character.toString(ch))*
                            (int)Math.pow(16,c);
                    c--;
                    break;
                case 'a':
                case 'A':
                    dec = dec + 10 * (int)Math.pow(16, c);
                    c--;
                    break;
                case 'b':
                case 'B':
                    dec = dec + 11 * (int)Math.pow(16, c);
                    c--;
                    break;
                case 'c':
                case 'C':
                    dec = dec + 12 * (int)Math.pow(16, c);
                    c--;
                    break;
                case 'd':
                case 'D':
                    dec = dec + 13 * (int)Math.pow(16, c);
                    c--;
                    break;
                case 'e':
                case 'E':
                    dec = dec + 14 * (int)Math.pow(16, c);
                    c--;
                    break;
                case 'f':
                case 'F':
                    dec = dec + 15 * (int)Math.pow(16, c);
                    c--;
                    break;
                default:
                    System.out.println("Invalid hexa input");
                    break;
            }
        }

        String oct ="";

        while(dec > 0){
            oct = dec % 8 + oct;
            dec = dec / 8;
        }

        System.out.println(oct);
    }

    static String decimalToBinary(int decimal) {

        String binaryString = "";

        while (decimal != 0) {

            binaryString = (decimal % 2) + binaryString;
            decimal /= 2;
        }

        while (binaryString.length() % 4 != 0) {
            binaryString = "0" + binaryString;
        }
        return binaryString;
    }

    static void HtoBinary(String hexadecimal) {
        int i;
        char ch;
        String binary = "";
        int returnedBinary = 0;

        hexadecimal = hexadecimal.toUpperCase();

        for (i = 0; i < hexadecimal.length(); i++) {
            ch = hexadecimal.charAt(i);

            if (Character.isDigit(ch) == false && ((int)ch >= 65 && (int)ch <= 70) == false) {
                binary = "Invalid Hexadecimal String";
                System.out.println(binary);
            }
            else if ((int)ch >= 65 && (int)ch <= 70) {
                returnedBinary = (int) ch - 55;
            }
            else {
                returnedBinary = Integer.parseInt(String.valueOf(ch));
            }
            binary += decimalToBinary(returnedBinary);
        }
        System.out.println(binary);
    }

    static boolean isBinary(int number) {
        int copyOfInput = number;
        while (copyOfInput != 0) {
            if (copyOfInput % 10 > 1) {
                return false;
            }
            copyOfInput = copyOfInput / 10; }
        return true;
    }

    static boolean isOctal(int oct) {
        String octal = Integer.toString(oct);
        boolean isOctal = false;
        if (octal != null && !octal.isEmpty()) {
            int number = Integer.parseInt(octal);
            while (number > 0) {
                if (number % 10 <= 7) {
                    isOctal = true;
                } else {
                    isOctal = false;
                    break;
                }
                number /= 10;
            }
        }
        return isOctal;
    }

    static boolean ishexa(String hexa){
        //String hexadecimal = Integer.toString(hexa);
        int n = hexa.length();
        for (int i = 0; i < n; i++) {
            char ch = hexa.charAt(i);
            if ((ch < '0' || ch > '9') && (ch < 'A' || ch > 'F')) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.println("------------------------------------------------------");
        System.out.println("         |----  -----  |----|  |----|  -----");
        System.out.println("         |---|    |    |____|  |-\\ _|    |  ");
        System.out.println("         ----|    |    |    |  |  \\      |  " );
        System.out.println("------------------------------------------------------");
        System.out.println();

        Menu();

        while (true){
            System.out.print("\n>> ");
            int num = sc.nextInt();

            switch (num){
                case 1:
                    Menu();
                    break;
                case 2:
                    Exit();
                    System.exit(0);
                    break;
                case 3:
                    // Decimal
                    DecimalMenu();
                    while(true) {
                        System.out.print("\n>> Decimal-Menu >> ");
                        int nn = sc.nextInt();

                        if (nn == 0) {
                            // Menu
                            DecimalMenu();
                        } else if (nn == 1) {
                            // end
                            System.out.println("You are Now on Main Menu.");
                            Menu();
                            break;
                        } else if (nn == 2) {
                            // Convert Decimal to Binary conversion
                            System.out.println("Enter number to Convert Decimal to Binary conversion");
                            String n = sc.next();

                            try {
                                int y = Integer.parseInt(n);
                                toBinary(y);
                            } catch (NumberFormatException e) {
                                System.out.println("Please type correct Decimal Number.");
                            }

                        } else if (nn == 3) {
                            // Convert Decimal to Hex conversion
                            System.out.println("Enter number to Convert Decimal to Hex conversion");
                            String n = sc.next();

                            try {
                                int y = Integer.parseInt(n);
                                toHex(y);
                            } catch (NumberFormatException e) {
                                System.out.println("Please type correct Decimal Number.");
                            }

                        } else if (nn == 4) {
                            // Convert Decimal to Octal conversion
                            System.out.println("Enter number to Convert Decimal to Octal conversion");
                            String n = sc.next();

                            try {
                                int y = Integer.parseInt(n);
                                toOctal(y);
                            } catch (NumberFormatException e) {
                                System.out.println("Please type correct Decimal Number.");
                            }
                        } else {
                            System.out.println("Sorry 'Wrong' command. There is no command '" + nn);
                        }
                    }
                    break;
                case 4:
                    // binary
                    BinaryMenu();

                    while(true) {
                        System.out.print("\n>> Binary-Menu >> ");
                        int nn = sc.nextInt();

                        if (nn == 0) {
                            // Menu
                            BinaryMenu();
                        } else if (nn == 1) {
                            // end
                            System.out.println("You are Now on Main Menu.");
                            Menu();
                            break;
                        } else if (nn == 2) {
                            // Convert Decimal to Binary conversion
                            System.out.println("Enter number to Convert Binary to Decimal");
                            String n = sc.next();

                            try {
                                int y = Integer.parseInt(n);
                                if(isBinary(y)==true){
                                    BtoDeciaml(y);
                                }else{
                                    System.out.println("Please type correct Decimal Number.");
                                }
                            } catch (NumberFormatException e) {
                                System.out.println("Please type correct Decimal Number.");
                            }

                        } else if (nn == 3) {
                            // Convert Decimal to Hex conversion
                            System.out.println("Enter number to Convert Binary to Hex conversion");
                            String n = sc.next();

                            try {
                                int y = Integer.parseInt(n);
                                if(isBinary(y)==true){
                                    BtoHex(y);
                                }else{
                                    System.out.println("Please type correct Decimal Number.");
                                }
                            } catch (NumberFormatException e) {
                                System.out.println("Please type correct Decimal Number.");
                            }

                        } else if (nn == 4) {
                            // Convert Decimal to Octal conversion
                            System.out.println("Enter number to Convert Binary to Octal conversion");
                            String n = sc.next();

                            try {
                                int y = Integer.parseInt(n);
                                if(isBinary(y)==true){
                                    BtoOctal(y);
                                }else{
                                    System.out.println("Please type correct Decimal Number.");
                                }
                            } catch (NumberFormatException e) {
                                System.out.println("Please type correct Decimal Number.");
                            }

                        } else {
                            System.out.println("Sorry 'Wrong' command. There is no command '" + nn);
                        }
                    }
                    break;
                case 5:
                    // octal
                    OctalMenu();

                    while(true) {
                        System.out.print("\n>> Octal-Menu >> ");
                        int nn = sc.nextInt();

                        if (nn == 0) {
                            // Menu
                            OctalMenu();
                        } else if (nn == 1) {
                            // end
                            System.out.println("You are Now on Main Menu.");
                            Menu();
                            break;
                        } else if (nn == 2) {
                            // Convert octal to Decimal conversion
                            System.out.println("Enter number to Convert Octal to Decimal");
                            String n = sc.next();

                            try {
                                int y = Integer.parseInt(n);
                                if(isOctal(y)==true){
                                    //BtoOctal(y);
                                    OtoDeciaml(y);
                                }else{
                                    System.out.println("Please type correct Octal Number.");
                                }
                            } catch (NumberFormatException e) {
                                System.out.println("Please type correct Octal Number.");
                            }

                        } else if (nn == 3) {
                            // Convert octal to Hex conversion
                            System.out.println("Enter number to Convert Octal to Hex conversion");
                            String n = sc.next();

                            try {
                                int y = Integer.parseInt(n);
                                if(isOctal(y)==true){
                                    OtoHex(y);
                                }else{
                                    System.out.println("Please type correct Octal Number.");
                                }
                            } catch (NumberFormatException e) {
                                System.out.println("Please type correct Octal Number.");
                            }

                        } else if (nn == 4) {
                            // Convert octal to Binary conversion
                            System.out.println("Enter number to Convert Octal to Binary conversion");
                            String n = sc.next();

                            try {
                                int y = Integer.parseInt(n);
                                if(isOctal(y)==true){
                                    OtoBinary(y);
                                }else{
                                    System.out.println("Please type correct Octal Number.");
                                }
                            } catch (NumberFormatException e) {
                                System.out.println("Please type correct Octal Number.");
                            }

                        } else {
                            System.out.println("Sorry 'Wrong' command. There is no command '" + nn);
                        }
                    }
                    break;
                case 6:
                    // hexa
                    HexaMenu();

                    while(true) {
                        System.out.print("\n>> Hexa-Menu >> ");
                        int nn = sc.nextInt();

                        if (nn == 0) {
                            // Menu
                            HexaMenu();
                        } else if (nn == 1) {
                            // end
                            System.out.println("You are Now on Main Menu.");
                            Menu();
                            break;
                        } else if (nn == 2) {
                            // Convert Decimal to Binary conversion
                            System.out.println("Enter number to Convert Hexa to Decimal");
                            String n = sc.next();

                            try {
                                if(ishexa(n)==true){
                                    HtoDeciaml(n);
                                }else{
                                    System.out.println("Please type correct hexadecimal Number.");
                                }
                            } catch (NumberFormatException e) {
                                System.out.println("Please type correct hexadecimal Numberb.");
                            }

                        } else if (nn == 3) {
                            // Convert Decimal to Hex conversion
                            System.out.println("Enter number to Convert Hexa to Octal conversion");
                            String n = sc.next();

                            try {
                                if(ishexa(n)==true){
                                    Htooctal(n);
                                }else{
                                    System.out.println("Please type correct hexadecimal Number.");
                                }
                            } catch (NumberFormatException e) {
                                System.out.println("Please type correct hexadecimal Number.");
                            }

                        } else if (nn == 4) {
                            // Convert Decimal to Octal conversion
                            System.out.println("Enter number to Convert Hexa to Binary conversion");
                            String n = sc.next();

                            try {
                                if(ishexa(n)==true){
                                    HtoBinary(n);
                                }else{
                                    System.out.println("Please type correct hexadecimal Number.");
                                }
                            } catch (NumberFormatException e) {
                                System.out.println("Please type correct hexadecimal Number.");
                            }

                        } else {
                            System.out.println("Sorry 'Wrong' command. There is no command '" + nn);
                        }
                    }
                    break;
                default:
                    System.out.println("Sorry 'Wrong' command. There is no command '" + num +  "'. \nPlease try '1' for MENU OR '2' for EXIT. ");
            }
        }
    }
}
