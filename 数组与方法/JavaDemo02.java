public class JavaDemo02
{
	public static void main(String args[])
	{
		// ������һ������
		int i[] = null ;
		// ʹ�����飿
		i = new int[10] ;
		// i[0]  ~ i[9]
		//ѭ������㣬ѭ������ֹ������ѭ���Ĳ���
		for (int x=0;x<10;x=x+2)
		{
			System.out.println("i["+x+"] = "+i[x]) ;
		}
	}
};


		�����i[0] =
		      i[2] =	  i[4] =   i[6] =  i[8] =