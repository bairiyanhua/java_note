import java.util.Arrays;

public class ArraysMethod {
	public static void main(String[] args) {
		//equals(array1,array2) �������ǣ��Ƚ����������Ƿ����
		System.out.println("----equals(array1,array2)������----");
		int [] arr1 = {10,50,40,30};
		int [] arr2 = {10,50,40,30};
		int [] arr3 = {60,50,85};
		System.out.println(Arrays.equals(arr1, arr2)); //�ж�arr1��arr2�ĳ��ȼ�Ԫ���Ƿ����
		System.out.println(Arrays.equals(arr1, arr3)); //�ж�arr1��arr3�ĳ��ȼ�Ԫ���Ƿ����

		//sort(array) �������ǣ�������array��Ԫ�ؽ�����������
		System.out.println("----sort(array)������----");
		int [] array = new int[]{80,66,70,54,98};
		Arrays.sort(array);
		System.out.println("�ɼ������");
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

		//toString(array) �������ǣ���һ������arrayת����һ���ַ���
		System.out.println("----toString(array)������----");
		int[] arr = { 10, 50, 40, 30 };
		Arrays.sort(arr); 								//�����鰴��������
		System.out.println(Arrays.toString(arr)); 		//������arrת��Ϊ�ַ��������

		//fill(array,val) �������ǣ�������array������Ԫ�ض���ֵΪval
		System.out.println("----fill(array,val)������----");
		int[] arrs = { 10, 50, 40, 30 }; 				//��ʼ����������
		Arrays.fill(arrs, 40); 							//�滻����Ԫ��
		System.out.println(Arrays.toString(arrs)); 		//������arrת��Ϊ�ַ��������

		//copyOf(array,length) �������ǣ�������array���Ƴ�һ������Ϊlength��������
		System.out.println("----copyOf(array,length)������----");
		int[] arr11 = { 10, 50, 40, 30 };
		int[] arr22 = Arrays.copyOf(arr11, 3); 			//��arr11���Ƴɳ���Ϊ3��������arr22
		System.out.println(Arrays.toString(arr22));
		int[] arr33 = Arrays.copyOf(arr1, 4); 			//��arr11���Ƴɳ���Ϊ4��������arr33
		System.out.println(Arrays.toString(arr33));
		int[] arr44 = Arrays.copyOf(arr1, 6); 			//��arr11���Ƴɳ���Ϊ6��������arr44
		System.out.println(Arrays.toString(arr44));

		//binarySearch(array, val) �������ǣ���ѯԪ��ֵval������array�е��±�
		System.out.println("----binarySearch(array, val)������----");
		int[] arrss = { 10, 50, 40, 30 };
		Arrays.sort(arrss); 							//�Ȱ���������
		int index=Arrays.binarySearch(arrss, 30); 		//����30���±�
		System.out.println(index);
		index=Arrays.binarySearch(arrss, 50); 			//����50���±�
		System.out.println(index);
	}
}
