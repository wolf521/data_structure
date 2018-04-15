package first_introduction;

public class Test {
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6,7,8,9};
		int[] b = three(a);
		for(int i = 0;i < b.length;i++) {
			System.out.println(b[i]);
		}
	}
	/**
	 * 求1+2!+3!+.....+n!之和
	 * 
	 * @param n
	 */
	private static long first(int n) {
		if(n == 1) return 1;
		long sum = 0;
		for(int i = 1;i <= n;i++) {
			sum += getFactorial(i);
		}
		return sum;
	}
	/**
	 * 获得阶乘
	 */
	private static long getFactorial(int i) {
		long f = i;
		for(int k = (i - 1);k >= 1;k--) {
			f *= k;
		}
		return f;
	}
	
	private static double method(double n) {
		if(n == 1) return 1;
		double sum = 1.0;
		double k = 1.0;
		for(double i = 2.0;i <= n;i++) {
			k = (i-1.0)*i;
			sum += 1.0/k;
		}
		return sum;
	}
	/**
	 * 数组循环向后移动一位
	 */
	private static int[] three(int[] a) {
		int size = a.length;
		int k = a[size-1];
		for(int i = size - 1;i>0;i--) {
			a[i] = a[i-1];
		}
		a[0] = k;
		return a;
	}
}
