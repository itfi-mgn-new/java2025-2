package lesson7;

public class Exercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// s = "abcdefg" -> "AbCdEfG";
		// 
		String	s = "abcdefg";
		
		StringBuilder	sb = new StringBuilder();
		for(int index = 0; index < s.length(); index++) {
			if (index % 2 == 0) {
				sb.append(Character.toUpperCase(s.charAt(index)));
			}
			else {
				sb.append(Character.toLowerCase(s.charAt(index)));
			}
		}
		System.err.println("S="+sb.toString());

		char[]	result = new char[s.length()];
		int	index;
		for (index = 0; index < result.length - 1; index += 2) {
			result[index] = Character.toUpperCase(s.charAt(index));
			result[index+1] = Character.toLowerCase(s.charAt(index+1));
		}
		if (index % 2 == 0) {
			result[index] = Character.toUpperCase(s.charAt(index));
		}
		System.err.println("S="+new String(result));
		
		// s = "IvAnoff   Ivan ivanovich " -> "Ivanoff Ivan Ivanovich";
		
		s = "IvAnoff   Ivan ivanovich ";
		sb.setLength(0);
		
		for(String item : s.split("\\s+")) {
			sb.append(' ').append(Character.toUpperCase(item.charAt(0)));
			for(int i = 1; i < item.length(); i++) {
				sb.append(Character.toLowerCase(item.charAt(i)));
			}
		}
		System.err.println("S="+sb.substring(1));
		
		// s = "12+34+99+7" -> calculate value
		// s = "-12-34+99-7" -> calculate value
		
		s = "12+34+99+7";
		int	sum = 0;
		for(String item : s.split("\\+")) {
			sum += Integer.valueOf(item);
		}
		System.err.println("Sum="+sum);
		
		s = "-12-34+99-7";
		sum = 0;
		for(String item : ("0"+s).replace("-", ";-").replace("+", ";").split(";")) {
			sum += Integer.valueOf(item);
		}
		System.err.println("Sum="+sum);

		// s = "12*34+99*7" -> calculate value
	
		s = "12*34+99*7";
		
		sum = 0;
		for (String item : s.split("\\+")) {
			int	mul = 1;
			for (String val : item.split("\\*")) {
				mul *= Integer.valueOf(val);
			}
			sum += mul;
		}
		System.err.println("Sum="+sum);
		
	}

}
