package week3;

import java.util.ArrayList;

public class Result {
    public static void main(String[] args){
        ArrayList<String> qualifications= new ArrayList<String>();
        qualifications.add("BIT");
      Staff staffs= new Staff("Aasis paudel", 25,"9845162431", qualifications,3200);
      staffs.display();
      qualifications.clear();
      qualifications.add("BIM");
      qualifications.add("BCA");
      Staff abc = new Staff("Sunil Karki", 21, "9845216340", qualifications, 4500);
      abc.display();
      qualifications.clear();
      qualifications.add("BBS");
      qualifications.add("BSW");
      qualifications.add("BIT");
      Staff xyz = new Staff("Manish Basnet ", 22 ,"9842513640", qualifications, 5000);
      xyz.display();

    } 
    
}
