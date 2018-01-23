
/**
 * Desk calculates the price of a desk.
 * The minimum price for a desk is $200.
 * If the surface area is over 750 square inches, an extra $50 is added.
 * The price is also modified based on the type of wood it will be made of.
 * For every drawer in the desk, an extra $30 is added.
 * @author Sean Stock
 * @version 1.23.2018
 */
public class Desk
{
    // The customer's name.
    private String custName;
    // The order number.
    private int orderNumber;
    // The length of the desk.
    private int deskLength;
    // The width of the desk.
    private int deskWidth;
    // The area of the desk
    private int area;
    // The type of wood that the desk will be made of.
    private String woodType;
    // The number of drawers in the desk.
    private int numDrawers;
    // The price of the desk.
    private int price;
    // The base price of a desk
    private static final int BASE_PRICE = 200;

    /**
     * Constructor for objects of class Desk
     */
    public Desk()
    {
        custName = "none";
        orderNumber = 0;
        deskLength = 0;
        deskWidth = 0;
        area = 0;
        woodType = "none";
        numDrawers = 0;
        price = 0;
    }
    
    /**
     * Prompts user for the customer's name.
     */
    public void promptCustName(String name)
    {
        custName = name;
    }
    
    /**
     * Prompts user for order numer.
     */
    public void promptOrderNumber(int number)
    {
        orderNumber = number;
    }

    /**
     * Calculates area based upon user input length and width
     */
    public void getArea(int length, int width)
    {
        if(length > 0) {
            deskLength = length;
        }
        else {
            System.out.println("I'm sorry, you have entered an incorrect amount");
        }
         if(width > 0) {
            deskWidth = width;
        }
        else {
            System.out.println("I'm sorry, you have entered an incorrect amount");
        }
        area = length * width;
    }
    
    /**
     * Prompts user for the type of wood the desk will be made of
     */
    public void promptWoodType(String wood)
    {
        if(wood.equals("mahogany") || wood.equals("oak") || wood.equals("pine")) {
            woodType = wood;
        }
        else {
            System.out.println("I'm sorry, please enter an appropriate wood type.");
        }
    }
    
    /**
     * Prompts user for the number of drawers the desk will have
     */
    public void promptNumDrawers(int drawers)
    {
        if(drawers >= 0) {
            numDrawers = drawers;
        }
        else {
            System.out.println("I'm sorry, you have entered an incorrect amount");
        }
    }
    
    /**
     * Calculates the price of the desk
     */
    public void calculatePrice()
    {
        int priceArea;
        if(area > 750) {
            priceArea = 50;
        }
        else {
            priceArea = 0;
        }
        int priceWood;
        if(woodType.equals("mahogany")) {
            priceWood = 150;
        }
        else if(woodType.equals("oak")) {
            priceWood = 125;
        }
        else {
            priceWood = 0;
        }
        int priceDrawer;
        priceDrawer = numDrawers * 30;
        price = BASE_PRICE + priceArea + priceWood + priceDrawer;
    }
    
    /**
     * Prints all information about an order
     */
    public void printReceipt()
    {
        System.out.println("Customer Name:"  + custName);
        System.out.println("Order Number:"  + orderNumber);
        System.out.println("Length of desk:"  + deskLength);
        System.out.println("Width of desk:"  + deskWidth);
        System.out.println("Type of wood:"  + woodType);
        System.out.println("Total price: $" + price);
    }
}
