public class shuzu {
	static int[] arr =
	    {
	            1, -2, 3, -8, 5, 1,
	    };// ��Ҫ�������
	    static int maxIndex = arr.length - 1;// ���������±�
	 
	    public static void main(String[] args)
	    {
	        findMaxArr2();
	        System.out.println("\n-------------");
	        findMaxArr3();
	    }
	 
	    // 1.����forѭ�����
	    // 2.����forѭ�����
	    static void findMaxArr2()
	    {
	        int max = arr[0];// ���ֵ
	        int sum;// ���
	        int startIndex = 0;
	        int endIndex = 0;
	        for (int i = 0; i <= maxIndex; i++)
	        {
	            sum = 0;
	            for (int j = i; j <= maxIndex; j++)
	            {
	                sum += arr[j];
	                if (sum > max)
	                {
	                    max = sum;
	                    startIndex = i;
	                    endIndex = j;
	                }
	            }
	        }
	        System.out.println("���ֵΪ��" + max);
	        printArr(startIndex, endIndex);
	    }
	 
	    // 3.ʱ�临�Ӷ�Ϊn
	    static void findMaxArr3()
	    {
	        int max = arr[0];// ���ֵ
	        int sum = 0;// ���
	        int startIndex = 0;
	        int endIndex = 0;
	        for (int i = 0; i <= maxIndex; i++)
	        {
	            if (sum >= 0)
	            {
	                sum += arr[i];
	            }
	            else
	            {
	                sum = arr[i];
	                startIndex = i;// ��������鿪ʼֵ
	            }
	            if (sum > max)
	            {
	                max = sum;
	                endIndex = i;// ������������ֵ
	            }
	        }
	        System.out.println("���ֵΪ��" + max);
	        printArr(startIndex, endIndex);
	    }
	 
	    // �����±꿪ʼ����ֵ����ӡ����
	    static void printArr(int startIndex, int endIndex)
	    {
	        for (int i = startIndex; i <= endIndex; i++)
	        {
	            System.out.print(arr[i] + " ");
	        }
	    }
	 
	}
