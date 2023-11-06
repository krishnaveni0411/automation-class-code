package week5.day4.assignment1;

public class Automation extends MultipleLangauge implements Language,TestTool {

	public void Selenium() {
		System.out.println("Selenium");
		
	}

	public void Java() {
		System.out.println("Java");
		
	}

	@Override
	public void ruby() {
		System.out.println("ruby");
		
	}
	public static void main(String[] args) {
		Automation lang=new Automation();
		lang.python();
		lang.Java();
		lang.ruby();
		lang.Selenium();
		
		Language lan=new Automation();
		lan.Java(); 
		
		
		TestTool test=new Automation();
		test.Selenium();
		
	}
}
