package jimmy;

public class builds {
    public static void main(String[]args)
    {
        for(int leap = -4241; leap <= 2024; leap++){
            if(leap < 0 && (leap % 4 == 0 && (leap % 100 != 0 || leap % 400 == 0))){
                System.out.println(leap * -1 + " bce");
            }
            else if(leap % 4 == 0 && (leap % 100 != 0 || leap % 400 == 0)){
                System.out.println(leap + " ad");
            }
        }







    }
}
