public class lianxi { 
	//编写一个main方法
		//测试
		
	public int fibonacci(int n) {
			if( n >= 1) {
				if( n == 1 || n == 2) {
					return 1;
				} else {
					return fibonacci(n-1) + fibonacci(n-2);
				}
			} else {
				System.out.println("要求输入的n>=1的整数");
				return -1;
			System.out.println(fibonacci(10));

			}
		}
	}
}

