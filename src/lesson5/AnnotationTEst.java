package lesson5;

@MyAnnotation(value="assa",depth=5)
public class AnnotationTEst {
	@MyAnnotation(value=";fl;sdkl;")
	int x = 10;

	@MyAnnotation("fffffff")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyAnnotation ma = AnnotationTEst.class.getAnnotation(MyAnnotation.class);
		
		System.err.println("Value="+ma.value());
		System.err.println("DEpth="+ma.depth());
	}

}
