import java.io.*;
public class Hotel_Management
{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int days,room;
    boolean Type[];
    String date,name,gen,occp,add,pur,rname;
    int adults,child,no;
    double bill;
    boolean breakfast;
    public static void main()throws IOException
    {
        System.out.println("  o    o          o          8   .oPYo.               8   .oPYo.  o                 ");
        System.out.println("  8    8          8          8   8   `8               8   8       8                 ");
        System.out.println("  8oooo8  .oPYo. o8P .oPYo.  8  o8yooP'  .oPYo.  .oPYo8   `Yooo. o8P .oPYo.  oPYo.  ");
        System.out.println("  8    8  8    8  8  8oooo8  8   8   `b  8oooo8  8    8       `8  8  .oooo8  8  `'  ");
        System.out.println("  8    8  8    8  8  8.      8   8    8  8.      8    8        8  8  8    8  8      ");
        System.out.println("  8    8  `Yoop'  8  `Yooo'  8   8    8  `Yooo'  `YooP'   `YooP'  8  `YooP8  8      ");
        System.out.println("::..:::..:.....:::..::.....:..:::..:::..:......::......::::.....::..:.......:..::::");
        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
        System.out.println("");
        Hotel_Management ob=new Hotel_Management();
        ob.input();
        ob.roomBook();
        ob.registration();
        ob.billCalc();
    }
    public void input()throws IOException
    {
        System.out.println("      ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        System.out.println("           165, General Kim Jong il Road, Pyongyang: 10010876");
        System.out.println("");
        System.out.println("Dear Customer,");
        System.out.println("A warm welcome to our online booking site, for the greatest hotel in Pyongtang");
        System.out.println("built in the year 1967, dedicated to our Great Leader, Marshall Kim il Sung.");
        System.out.println("At hotel Red Star, we bring to you absoutely modern living in utmost comfort,");
        System.out.println("amidst the fragrance of our glorious heritage.");
        System.out.println();
        System.out.println("Be you a native weekend tourist, or be you an international tourist coming");
        System.out.println("to witness the wonders of North Korea, be assured that we will take up the");
        System.out.println("responsibility of making your stay a memorable one.");
        System.out.println();
        System.out.println("Do you want to book a room in our grand hotel?");
        System.out.println("Please reply in yes or no : ");
        if((br.readLine()).equalsIgnoreCase("yes"))
        {
            System.out.println();
            System.out.println("Please state your date of visit, and the number of days you intend to stay");
            System.out.print("Date : ");
            date=br.readLine();
            System.out.print("Number of days : ");
            days=Integer.parseInt(br.readLine());
        }
        else
        {
            System.exit(0);
        }
    }
    public void roomBook()throws IOException
    {
        Hotel_Management ob=new Hotel_Management();
        boolean King[]=new boolean[5];
        boolean Queen[]=new boolean[5];
        boolean AC[]=new boolean[15];
        boolean Non[]=new boolean[15];
        King=randomFiller(King);
        Queen=randomFiller(Queen);
        AC=randomFiller(AC);
        Non=randomFiller(Non);
        int fl=0;
        while(fl!=1)
        {
            System.out.println("Please select the type of room you prefer.");
            System.out.println("1. King Suite");
            System.out.println("2. Queen Suite");
            System.out.println("3. AC Deluxe");
            System.out.println("4. Non-AC Deluxe");
            System.out.println("Enter your choice to view: ");
            int ch=Integer.parseInt(br.readLine());
            boolean tmp;
            switch(ch)
            {
                case 1: tmp=RoomDescription.King();
                if(tmp)
                {
                    Type=King;
                    rname="King Suite";
                    fl=1;
                }
                break;
                case 2: tmp=RoomDescription.Queen();
                if(tmp)
                {
                    Type=Queen;
                    rname="Queen Suite";
                    fl=1;
                }
                break;
                case 3: tmp=RoomDescription.AC();
                if(tmp)
                {
                    Type=AC;
                    rname="AC Deluxe";
                    fl=1;
                }
                break;
                case 4: tmp=RoomDescription.Non();
                if(tmp)
                {
                    Type=Non;
                    rname="Non-AC Deluxe";
                    fl=1;
                }
                break;
                default:System.out.println("INPUT INVALID!!! PLEASE RE-ENTER YOUR CHOICE. ");
                roomBook();
            }
        }
        String bed="double";
        if(rname.equals("AC Deluxe")||rname.equals("Non-AC Deluxe"))
        {
            System.out.println("Single Bed OR Double Bed ?");
            bed=br.readLine();
        }
        System.out.println("Checking for room availibility.........");
        for(long i=0;i<=2099999999;i++);
        System.out.println("DONE !");
        int cn;
        System.out.println("Rooms Available = ");
        for(int i=0;i<Type.length;i++)
        {
            if(bed.equalsIgnoreCase("single")||bed.equalsIgnoreCase("single bed"))
            {
                if(Type[i]==true&&i<=(Type.length/2))
                {
                    System.out.println("Room "+(i+1));
                    room=i;
                }
            }
            else if(bed.equalsIgnoreCase("double")||bed.equalsIgnoreCase("double bed"))
            {
                if(Type[i]==true&&i<=(Type.length/2))
                {
                    System.out.println("Room "+(i+1));
                    room=i;
                }
            }
        }
        System.out.println("We have assigned room "+(room+1)+" for you");
        System.out.println("Let us now proceed to the registration");
    }
    public boolean[] randomFiller(boolean A[])
    {
        for(int i=0;i<A.length;i++)
        {
            int rand=(int)(Math.random()+0.5);
            if(rand==1)
            {
                A[i]=true;
            }
            else if (rand==0)
            {
                A[i]=false;
            }
        }
        return A;
    }
    void registration()throws IOException
    {
        System.out.println();
        System.out.println("_________________________________________________________________________________");
        System.out.println("                                REGISTRATION                                     ");
        System.out.println("                               ''''''''''''''                                    ");
        System.out.println("_________________________________________________________________________________");
        System.out.println("               ");
        System.out.print("Name : ");
        name=br.readLine();
        System.out.print("Gender : ");
        gen=br.readLine();
        System.out.print("Reaidential Address : ");
        add=br.readLine();
        System.out.print("Occupation : ");
        occp=br.readLine();
        System.out.print("Purpose of visit : ");
        pur=br.readLine();
        System.out.print("Number of rooms booked : ");
        no=Integer.parseInt(br.readLine());
        System.out.print("Total number of adults : ");
        adults=Integer.parseInt(br.readLine());
        System.out.print("Total number of children (below 18) : ");
        child=Integer.parseInt(br.readLine());
        System.out.println("THANK YOU!!! ");
        System.out.println("Do you wish to have complementary breakfast (yes/no)?");
        String bk=br.readLine();
        breakfast=bk.equalsIgnoreCase("yes");
    }
    public void billCalc()throws IOException
    {
        int rate=0;
        if(rname.equals("King Suite"))
        {
            rate=8000;
        }
        else if(rname.equals("Queen Suite"))
        {
            rate=5000;
        }
        else if(rname.equals("AC Deluxe"))
        {
            rate=3000;
        }
        else if(rname.equals("Non-AC Deluxe"))
        {
            rate=2500;
        }
        int add=0,rent=rate*days;
        if(adults>(no*2))
        {
            add+=200*days;
        }
        if(child>(no))
        {
            add+=100*days;
        }
        if(breakfast)
        {
            add+=200*days*(adults+child);
        }
        int gross=rent+add;
        display(gross);
    }
    void display(int n)throws IOException
    {
        System.out.println();
        System.out.println("                             __");
        System.out.println("                            |__)  *  |    |");
        System.out.println("                            |__)  |  |__  |__");
        System.out.println();
        System.out.println("                             HOTEL RED STAR   ");
        System.out.println("                           ^^^^^^^^^^^^^^^^^^");
        System.out.println();
        System.out.println("Room type              : "+rname);
        System.out.println("Room number            : "+(room+1));
        System.out.println("Customer name          : "+name);
        System.out.println("Total number of people : "+(adults+child));
        System.out.println("Date of check-in       : "+date);
        System.out.println("Days stayed            : "+days);
        System.out.println();
        System.out.println("Gross Amount           : "+n);
        double servtax=(5/100.0)*n;
        double gst=(18/100.0)*(servtax+n);
        bill=servtax+gst+n;
        System.out.println("GST (@ 18%)            : "+gst);
        System.out.println("Net Amount             : "+bill);
        System.out.println();
        System.out.println("Please enter the mode of payment : ");
        String mode=br.readLine();
        System.out.println("                                 THANK YOU!!");
    }
}