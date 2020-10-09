import java.util.Scanner;



public class CalculateTheTip {
    public static void main (String args[]) {
        System.out.println("Hey! Welcome to The Red restaurant. What is your name?\n");
        Scanner UserInput= new Scanner(System.in);
        String customerName, customerOrderDone1;
        double valueOrder1,valueOrder2,valueOrder3;
        int WhichOrder,NumberOfOrder;
        customerName = UserInput.nextLine();
        String menuA= "1-The Classic. Prosciutto di parma, spicy coppa, pecorino stagionato, crescenza, grilled piquillo pepper, castelvetrano olive, marcona almond, fig mostarda, grilled bread\n" +
                "Serves 2-4. Price: $13.50";
        String menuB="2-ITALIAN 14. salami, provolone, pepperoncini, olive, campari tomato, red onion, cucumber, roasted pepper, oregano vinaigrette\n" +"Serves 1-3. Price: $11.50";
        String menuC="3-STROZZAPRETI 19. Chicken, roasted mushroom, spinach, toasted pine nut, parmesan cream\n"+"Serves 4-2. Price: $22.50";
        System.out.println("Hey! " + customerName+", Here are our different menu groups: \n" + menuA + "\n"+ menuB + "\n" + menuC+
                "\n"+ "Which of these options(1-3) would you like to order?"
        );
        WhichOrder = UserInput.nextInt();
        if (WhichOrder == 1){
            System.out.println("How many?");
            NumberOfOrder = UserInput.nextInt();



        }



    }
}
