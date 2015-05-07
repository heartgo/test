public class qiuhe
{ 
	public int sum() {

        int a=1,sum=0;
        while(a<=100){sum=sum+a;
                      a=a+1;}
           System.out.println("1~100µÄºÍÊÇ"+sum); 
           return sum;
	}
	
    public static void main(String args[])
    {
    	new qiuhe().sum();
     }      
}
