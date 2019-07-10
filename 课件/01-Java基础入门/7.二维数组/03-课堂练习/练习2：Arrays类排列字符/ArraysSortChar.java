import java.util.Arrays;

/**
 * 使用Arrays类升序排列一组字符，并查找某个特殊字符在升序后数组中的位置
 * */
public class ArraysSortChar {
	public static void main(String[] args) {
		// 字符排序
		char[] chars = new char[] { 'a', 'c', 'u', 'b', 'e', 'p', 'f', 'z' };

		System.out.print("原字符序列：");
		for (int i = 0; i < chars.length; i++) {
			System.out.print(chars[i] + " ");
		}
		Arrays.sort(chars); // 对数组进行升序排序
		System.out.print("\n升序排序后：");
		for (int i = 0; i < chars.length; i++) {
			System.out.print(chars[i] + " ");
		}

		// 查找b的位置
		int index=Arrays.binarySearch(chars,'b');
		System.out.println("\n'b'在升序后数组中的位置是："+index);
		
	}
}
