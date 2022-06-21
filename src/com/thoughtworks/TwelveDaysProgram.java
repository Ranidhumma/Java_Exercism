package com.thoughtworks;
public class TwelveDaysProgram {

    /*
     * @purpose : this method is printing Christmas 12 days song
     */

    public static void TwelveDays () {

        for (int i = 1; i <= 12; i++) {
        System.out.print("On the ");
            switch (i) {
                case 1:
                    System.out.print("First");
                    break;
                case 2:
                    System.out.print("Second");
                    break;
                case 3:
                    System.out.print("Third");
                    break;
                case 4:
                    System.out.print("Fourth");
                    break;
                case 5:
                    System.out.print("Fifth");
                    break;
                case 6:
                    System.out.print("Sixth");
                    break;
                case 7:
                    System.out.print("Seventh");
                    break;
                case 8:
                    System.out.print("Eighth");
                    break;
                case 9:
                    System.out.print("Ninth");
                    break;
                case 10:
                    System.out.print("Tenth");
                    break;
                case 11:
                    System.out.print("Eleventh");
                    break;
                default:
                    System.out.print("twelfth");
            }

            System.out.println(" day of Christmas my true love gave to me:");


                switch (i) {
                    case 12:
                        System.out.print("twelve Drummers Drumming,");
                    case 11:
                        System.out.print("eleven Pipers Piping,");
                    case 10:
                        System.out.print("ten Lords-a-Leaping,");
                    case 9:
                        System.out.print("nine Ladies Dancing,");
                    case 8:
                        System.out.print("eight Maids-a-Milking,");
                    case 7:
                        System.out.print("seven Swans-a-Swimming,");
                    case 6:
                        System.out.print("six Geese-a-Laying,");
                    case 5:
                        System.out.print("five Gold Rings,");
                    case 4:
                        System.out.print("four Calling Birds,");
                    case 3:
                        System.out.print("three French Hens,");
                    case 2:
                        System.out.print("two Turtle Doves, and ");
                    default:
                        System.out.print("a Partridge in a Pear Tree.");
                }

            System.out.println("\n");
            }
        }
    }












