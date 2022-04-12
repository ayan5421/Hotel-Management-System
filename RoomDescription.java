import java.io.*;
class RoomDescription
{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static boolean King()throws IOException
    {
        boolean a=false; 
        System.out.println("                          KING SUITE");
        System.out.println("");
        System.out.println("The King Suit is for the very best of our guests. With world class ");
        System.out.println("features, and excellent room decor, this suite is nothing sort of ");
        System.out.println("perfection, which is desired by many. This room is spacy, and the");
        System.out.println("cosinness of it makes one feel at home, albeit a more comfortable and ");
        System.out.println("more exquisite one. We assure you, that if this shall be your choice, you");
        System.out.println("shall regret the day of your departure.");
        System.out.println("");
        System.out.println("                          Features");
        System.out.println("                         ^^^^^^^^^^");
        System.out.println("");
        System.out.println("> 350x200 ft. room, large, spacy and comfortable.");
        System.out.println("> A gigantic double-bed, with Spektron-technology custom made");
        System.out.println("  mattress, for a good night's sleep.");
        System.out.println("> Air-Conditioned, with two split A/Cs.");
        System.out.println("> A 42 inch LG Smart TV.");
        System.out.println("> Two large sofas, a bedside table, and a coffee table.");
        System.out.println("> A long balcony, with a stunning view of the Juche Tower, as well as the");
        System.out.println("  rest of the Pyongyang.");
        System.out.println("> A mini-bar, with an assortmen of the finest elixirs of Korea.");
        System.out.println("> A huge bathroom, fit for a king.");
        System.out.println("");
        System.out.println("");
        System.out.println("The cost of this room (exclusive of tax) is = Rs. 8000/day");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("Do you want to choose this type?");
        System.out.println("Enter 'yes' to book, or 'no' to go back to the menu : ");
        if((br.readLine()).equalsIgnoreCase("yes"))
        {
            a=true;
        }
        System.out.println("");
        return a;
    }
    public static boolean Queen()throws IOException
    {
        boolean a=false;
        System.out.println("                           QUEEN SUITE");
        System.out.println("");
        System.out.println("The Queen Suit has an extra touch of comfort. The features available ");
        System.out.println("are generally associated with cosy lifestyle. The rooms are such made ");
        System.out.println("that we assure you that you shall have no problem in blending in with ");
        System.out.println("the feel of it. The atmosphere created by this room is a calm and ");
        System.out.println("peaceful one, in constract to the loudness of the King Suite. If a quiet");
        System.out.println("stay is what you desire, we take pleasure in welcoming you to the");
        System.out.println("grandeur of this room.");
        System.out.println("");
        System.out.println("                            Features");
        System.out.println("                           ^^^^^^^^^^");
        System.out.println("");
        System.out.println("> 320x220 ft. room, cosy with a home-made feel.");
        System.out.println("> A perfectly homelike double-bed, with a plush Kamaro-protocol");
        System.out.println("  custom made mattress.");
        System.out.println("> Air-Conditioned, with a split A/C and a bedside A/C.");
        System.out.println("> A 42 inch LG Smart TV.");
        System.out.println("> Two large sofas, two bedside tables.");
        System.out.println("> A round balcony, with a spectacular view of Pyongyang.");
        System.out.println("> A wine counter, with vintage wines of Korea.");
        System.out.println("> A cosy, marble-and-graphite bathroom.");
        System.out.println("");
        System.out.println("");
        System.out.println("The cost of this room (exclusive of tax) is = Rs. 5000/day");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("Do you want to choose this type?");
        System.out.println("Enter 'yes' to book, or 'no' to go back to the menu : ");
        if((br.readLine()).equalsIgnoreCase("yes"))
        {
            a=true;
        }
        System.out.println("");
        return a;
    }
    public static boolean AC()throws IOException
    {
        boolean a=false;
        System.out.println("                          A/C DELUXE");
        System.out.println("");
        System.out.println("The A/C Deluxe is the standard room of our hotel. With an affordable");
        System.out.println("price, and unbelievable comfort, the rooms will exceed your ");
        System.out.println("expectations. The ambience is a very tourist-friendly one, and the room ");
        System.out.println("will surely make your stay at Hotel Red Star, a very memorable one.");
        System.out.println("");
        System.out.println("                           Features");
        System.out.println("                          ^^^^^^^^^^");
        System.out.println("");
        System.out.println("> 200x150 ft. room, fully air conditioned.");
        System.out.println("> Choice of single or double bed, with a soft, comfortable mattress.");
        System.out.println("> A 32 inch LG Smart TV.");
        System.out.println("> A large sofa, centre table, bedside table.");
        System.out.println("> A balcony, with a spectacular view of Pyongyang.");
        System.out.println("> A well-furnished bathroom.");
        System.out.println("");
        System.out.println("");
        System.out.println("The cost of this room (exclusive of tax) is = Rs. 3000/day");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("Do you want to choose this type?");
        System.out.println("Enter 'yes' to book, or 'no' to go back to the menu : ");
        if((br.readLine()).equalsIgnoreCase("yes"))
        {
            a=true;
        }
        System.out.println("");
        return a;
    }
    public static boolean Non()throws IOException
    {
        boolean a=false;
        System.out.println("                      Non A/C DELUXE");
        System.out.println("");
        System.out.println("Don't like canned air? Feeling natural? Don't worry! Hotel Red Star ");
        System.out.println("offers you a special Non A/C Deluxe suite with open windows to enjoy ");
        System.out.println("the scenic beauty of Korea. The air here is as fresh as it can be, and the ");
        System.out.println("natural way of life will surely make you feel like a part of Korea");
        System.out.println("");
        System.out.println("                       Features");
        System.out.println("                      ^^^^^^^^^^");
        System.out.println("");
        System.out.println("> 150x150 ft. room.");
        System.out.println("> Four large open-able windows.");
        System.out.println("> Choice of single or double bed, with a soft, comfortable mattress.");
        System.out.println("> A 32 inch LG Smart TV.");
        System.out.println("> A large sofa, centre table, bedside table.");
        System.out.println("> A balcony, with a spectacular view of Pyongyang.");
        System.out.println("> A well-furnished bathroom..");
        System.out.println("");
        System.out.println("");
        System.out.println("The cost of this room (exclusive of tax) is = Rs. 2500/day");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("Do you want to choose this type?");
        System.out.println("Enter 'yes' to book, or 'no' to go back to the menu : ");
        if((br.readLine()).equalsIgnoreCase("yes"))
        {
            a=true;
        }
        System.out.println("");
        return a;
    }
}