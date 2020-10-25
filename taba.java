import java.util.*;


public class taba{

public static void main(String[]args){

Scanner s=new Scanner(System.in);
System.out.println("zhmaray 7arfi nawakat daxll bka ");
int a=s.nextInt();
char []k=new char[a];
for(int i=0;i<a;i++){


	System.out.println("7arf"+k[i]);
	k[i]=s.next().charAt(0);


}
                       String naw="";
                      for(int i=0;i<a;i++){
	                      naw+=k[i];
}
            System.out.println("naw:"+naw);
}
}

