public class JavaDemo02
{
	public static void main(String args[])
	{
		// 声明了一个数组
		int i[] = null ;
		// 使用数组？
		i = new int[10] ;
		// i[0]  ~ i[9]
		//循环的起点，循环的终止条件，循环的步长
		for (int x=0;x<10;x=x+2)
		{
			System.out.println("i["+x+"] = "+i[x]) ;
		}
	}
};


		结果：i[0] =
		      i[2] =	  i[4] =   i[6] =  i[8] =