public class BREAK {
    public static void main(String [] args)
    {
        int value =3;
        if (value == 1)
        {
            System.out.println("value was 1 ");
        }
        else
        {
            if (value ==2)
            {
                System.out.println("value was 2 ");
            }
            else
            {System.out.println("was not 1 or 2");
            }
            int switchValue = 6;
            switch (switchValue){
                case 1:
                    System.out.println("value was 1 ");
                    break;
                case 2:
                    System.out.println("value was 2 ");
                    break;
                case 3: case 4: case 5:
                    System.out.println("was a 3, a 4, a 5 ");
                    System.out.println("actually it was a" + switchValue);
                    break;
            }
            char charValue ='G';
            switch (charValue) {
                case 'A':
                    System.out.println("A was found ");
                    break;
                case 'B':
                    System.out.println("B was found");
                    break;
                case 'C': case 'D': case 'E':
                    System.out.println(charValue + "was found");
                    break;
                default:
                    System.out.println("could not find A, B, C,D,E,");
                    break;

            }}
    }
}
