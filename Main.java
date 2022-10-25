import java.io.BufferedReader;  
import java.io.InputStreamReader;
// import java.lang.Exception;

public class Main {
    public static void main(String Args[]) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int ch = 0, ch2 = 0, fillch = 0, fillexit = 0, exit = 0, coffeePowder =0, water = 0, milk = 0,sugar = 0,  cup=0, add=0, qty = 0;

        while (exit == 0) {
            fillexit = 0;
            System.out.println("\n\nWelcome to Cafe You");
            System.out.println("Please select your desired option : ");
            System.out.println("1. About us");
            System.out.println("2. Order");
            System.out.println("3. Fill");
            System.out.println("4. Exit\n");
            try { 
                ch = Integer.parseInt(br.readLine());
            } catch (Exception e) {
                System.out.println("Please enter the proper choice");
            }
            switch (ch) {
                case 1:
                    System.out.println(
                            "\n\nCafe YOU Hours: \nMonday to Saturday: 7:45 AM to 3:30 PM. \nKitchen closes at 3 PM./n If you are coming \nwith a group of more than 6 people \nplease make a reservation : 239-600-0966.\n\n");
                    break;

                case 2:
                    int exit1 = 0;
                    do{
                        System.out.println("Please Select your favorite Beverage : ");
                        System.out.println("1. COFFEE");
                        System.out.println("2. COFFEE LATTE");
                        System.out.println("3. CAPPUCCINO");
                        System.out.println("4. INSTANT COFFEE ESPRESSO");
                        System.out.println("5. Exit");
                        try {
                            ch2 = Integer.parseInt(br.readLine());
                        } catch (Exception e) {
                            System.out.println("Please enter the proper choice");
                        }
                        switch (ch2) {
                            case 1:
                                System.out.println("How many cups you want????");
                                try { 
                                    qty = Integer.parseInt(br.readLine());
                                } catch (Exception e) {
                                }
                                if(coffeePowder>=(18*qty) && water>=(40*qty) && milk>=(20*qty) && cup >= (1*qty) && sugar>=(20*qty))
                                {
                                    coffeePowder -= (18*qty);
                                    water -= (40*qty);
                                    milk -= (20*qty);
                                    cup -= (1*qty);
                                    sugar -= (20*qty);
                                    System.out.println("\n\n\n**********ENJOY YOUR DRINK**********\n\n\n");
                                }
                                else
                                {
                                    if(coffeePowder<(15*qty))
                                    {
                                        System.out.println("Machine out of Coffee Powder. Kindly Contact the administration and get coffee Powder Filled. Thank you");
                                    }else if(water<(30*qty)){
                                        System.out.println("Machine out of Water. Kindly Contact the administration and get Water Filled. Thank you");
                                    }else if(milk<(90*qty)){
                                        System.out.println("Machine out of Milk. Kindly Contact the administration and get Milk Filled. Thank you");
                                    }else if(sugar<(20*qty)){
                                        System.out.println("Machine out of Sugar. Kindly Contact the administration and get Sugar Filled. Thank you");
                                    }else{
                                        System.out.println("Machine out of Cups. Kindly Contact the administration and get cups for Machine.");
                                    }
                                }
                                break;
                            case 2:
                                System.out.println("How many cups you want????");
                                try { 
                                    qty = Integer.parseInt(br.readLine());
                                } catch (Exception e) {
                                }
                                if(coffeePowder>=(15*qty) && water>=(30*qty) && milk>=(90*qty) && cup >= (1*qty)&&sugar>=(20*qty))
                                {
                                    coffeePowder -= (15*qty);
                                    water -= (30*qty);
                                    milk -= (90*qty);
                                    cup -= (1*qty);
                                    sugar -= (20*qty);
                                    System.out.println("\n\n\n**********ENJOY YOUR DRINK**********\n\n\n");
                                }
                                else
                                {
                                    if(coffeePowder<(15*qty))
                                    {
                                        System.out.println("Machine out of Coffee Powder. Kindly Contact the administration and get coffee Powder Filled. Thank you");
                                    }else if(water<(30*qty)){
                                        System.out.println("Machine out of Water. Kindly Contact the administration and get Water Filled. Thank you");
                                    }else if(milk<(90*qty)){
                                        System.out.println("Machine out of Milk. Kindly Contact the administration and get Milk Filled. Thank you");
                                    }else if(sugar<(20*qty)){
                                        System.out.println("Machine out of Sugar. Kindly Contact the administration and get Sugar Filled. Thank you");
                                    }else{
                                        System.out.println("Machine out of Cups. Kindly Contact the administration and get cups for Machine.");
                                    }
                                }
                                break;
                            case 3:
                                System.out.println("How many cups you want????");
                                try { 
                                    qty = Integer.parseInt(br.readLine());
                                } catch (Exception e) {
                                }
                                if(coffeePowder>=(15*qty) && water>=(30*qty) && milk>=(90*qty) && cup >= (1*qty)&&sugar>=(20*qty))
                                {
                                    coffeePowder -= (15*qty);
                                    water -= (30*qty);
                                    milk -= (90*qty);
                                    cup -=( 1*qty);
                                    System.out.println("\n\n\n**********ENJOY YOUR DRINK**********\n\n\n");
                                }
                                else
                                {
                                    if(coffeePowder<(15*qty))
                                    {
                                        System.out.println("Machine out of Coffee Powder. Kindly Contact the administration and get coffee Powder Filled. Thank you");
                                    }else if(water<(30*qty)){
                                        System.out.println("Machine out of Water. Kindly Contact the administration and get Water Filled. Thank you");
                                    }else if(milk<(90*qty)){
                                        System.out.println("Machine out of Milk. Kindly Contact the administration and get Milk Filled. Thank you");
                                    }else if(sugar<(20*qty)){
                                        System.out.println("Machine out of Sugar. Kindly Contact the administration and get Sugar Filled. Thank you");
                                    }else{
                                        System.out.println("Machine out of Cups. Kindly Contact the administration and get cups for Machine.");
                                    }
                                }
                                break;
                            case 4:
                                System.out.println("How many cups you want????");
                                try { 
                                    qty = Integer.parseInt(br.readLine());
                                } catch (Exception e) {
                                }
                                if(coffeePowder>=(21*qty) && water>=(40*qty) && milk>=(40*qty) && cup >=( 1*qty)&& sugar>=(20*qty))
                                {
                                    coffeePowder -= (21*qty);
                                    water -= (40*qty);
                                    milk -= (40*qty);
                                    sugar -= (20*qty);
                                    cup -=( 1*qty);
                                    System.out.println("\n\n\n**********ENJOY YOUR DRINK**********\n\n\n");
                                }
                                else
                                {
                                    if(coffeePowder<(15*qty))
                                    {
                                        System.out.println("Machine out of Coffee Powder. Kindly Contact the administration and get coffee Powder Filled. Thank you");
                                    }else if(water<(30*qty)){
                                        System.out.println("Machine out of Water. Kindly Contact the administration and get Water Filled. Thank you");
                                    }else if(milk<(90*qty)){
                                        System.out.println("Machine out of Milk. Kindly Contact the administration and get Milk Filled. Thank you");
                                    }else if(sugar<(20*qty)){
                                        System.out.println("Machine out of Sugar. Kindly Contact the administration and get Sugar Filled. Thank you");
                                    }else{
                                        System.out.println("Machine out of Cups. Kindly Contact the administration and get cups for Machine.");
                                    }
                                }
                                break;
                            case 5:
                                exit1=1;
                                break;
                            default:
                                System.out.println("Please Enter the valid Choice");
                                break;
                        }
                        break;
                    }while (exit1 == 0); 
                    break;
                case 3:
                    while (fillexit == 0) {
                    System.out.println("\n\nWelcome to Cafe You");
                    System.out.println("Please select your desired option to fill: ");
                    System.out.println("1. Coffee Powder");
                    System.out.println("2. Milk");
                    System.out.println("3. Water");
                    System.out.println("4. Sugar");
                    System.out.println("5. Cup\n");
                    System.out.println("6. Exit\n");
                    try {
                        fillch = Integer.parseInt(br.readLine());
                    } catch (Exception e) {
                        System.out.println("Please enter the proper choice");
                    }
                    switch (fillch) {
                        case 1:
                            System.out.println("Enter quantity to fill (in grams) : ");
                            try {
                            add = Integer.parseInt(br.readLine());
                            } catch (Exception e) {
                            }
                            coffeePowder += add;
                            break;
                        case 2:
                            System.out.println("Enter quantity to fill (in mililiter) : ");
                            try {
                            add = Integer.parseInt(br.readLine());
                            } catch (Exception e) {
                            }
                            milk += add;
                            break;
                        case 3:
                            System.out.println("Enter quantity to fill (in mililiter) : ");
                            try {
                            add = Integer.parseInt(br.readLine());
                            } catch (Exception e) {
                            }
                            water += add;
                            break;
                        case 4:
                            System.out.println("Enter quantity to fill (in grams) : ");
                            try {
                            add = Integer.parseInt(br.readLine());
                            } catch (Exception e) {
                            }
                            sugar += add;
                            break;
                        case 5:
                            System.out.println("Enter number of cups : ");
                            try {
                            add = Integer.parseInt(br.readLine());
                            } catch (Exception e) {
                            }
                            cup += add;
                            break;
                        case 6:
                            fillexit = 1;
                            break;
                        default:
                            System.out.println("Please Enter the valid Choice");
                            break;
                            }
                        }
                    break;
                case 4:
                    exit = 1;
                    break;
                default:
                    System.out.println("Please Enter the valid Choice");
                    break;
            }
        }
    }
}
