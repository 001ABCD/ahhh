public class lianxi { 
	//��дһ��main����
		//����
		
	public int fibonacci(int n) {
			if( n >= 1) {
				if( n == 1 || n == 2) {
					return 1;
				} else {
					return fibonacci(n-1) + fibonacci(n-2);
				}
			} else {
				System.out.println("Ҫ�������n>=1������");
				return -1;
			System.out.println(fibonacci(10));

			}
		}
	}
}

