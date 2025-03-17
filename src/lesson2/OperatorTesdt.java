package lesson2;

public class OperatorTesdt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int		x = 10, y;
		
		y = x = 20;
		x += 20;	   // x = x + 20;
		y = (x += 20) + (x -= y);
		x++; ++y;
		y--; x--;
		
		if (x == 0) {
			// TODO:" sdl;lfgk;ldfkglsdkl;g
			y = 0;
		}
		else {
			// TODO:  fdgjlkdfgjlkdjk
		}
		
		while (x > 0) {
			x--;
		}
		
		do {
			x--;
		} while (x > 0);
	
		for(int index = 0; index < 10; index++) {
			x += index;
		}
		
		int[] ax = new int[10];
		
		for(int val : ax) {
			
		}
//		while (true) {
//			
//		}
//		for(;;) {
//			
//		}
		// int index = 0;
		// while (index < 10) {
		//  x += index;
		//  index++
		// }

L:		for (int zzz =  0; zzz < 10; zzz++) {
			for (int index =  0; index < 10; index ++) {
				if (x % 2 == 0) {
					break L;
				}
				else {
					continue L;
				}
			}
		}

		switch (x) {
			case 0 :
				// TODO: ,lcxcjkljklgjk
				break;
			case 1 :
				// TODO:  dklgljjdklfjjkldfg
				break;
			default :
				// TODO: sdfjsdlkfjl
		}
		
		return ;
	}
	

}
