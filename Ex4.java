import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ex4 {

	
	public static void main(String[] args) throws IOException {
		
		FileWriter fileWriter = new FileWriter("output.html");
		
		Scanner s = new Scanner(System.in);
		System.out.println("please enter a number (from 1 to 50)");// n to cut the screen for column
		
		double num = s.nextDouble();
		s.close();
		int i=0;
		fileWriter.write("<html>\r\n" + 
				"	<head> \r\n" + 
				"		<style>\r\n" + 
				"			.blue{background-color: blue;}\r\n" + 
				"			.red{background-color: red;}\r\n" + 
				"			.green{background-color:green;}\r\n" + 
				"			.size{height:100%; width:"+ (double)100/num +"%;}\r\n"  +
				"			.pullLeft{float:left;}\r\n" + 
				"			</style>\r\n" + 
				"	</head>\r\n" +  
				"			<body>");
		
		
		for(i=0;i<num;i++) {
			
			int x = i%3;//which color from the 3
			if(x==0)
				fileWriter.write("<div class=\"blue size pullLeft\"></div>"+"\n");//first color
			else if (x==1)
				fileWriter.write("<div class=\"red size pullLeft\"></div>"+"\n");//second color
			else 
				fileWriter.write("<div class=\"green size pullLeft\"></div>"+"\n");// third one
		}
		fileWriter.write("</body>\r\n </html>");
		fileWriter.close();
		System.out.println("done");
	}

}
