/**
 * 
 */
package chenchen;

/**
 * @author chenchen
 *@package_name:chenchen
*@file_name:进制转换.java
*@date-time:2017年11月14日下午1:48:41
*@location:https://github.com/1508010223/lilinxuan.git
 */
import java.util.Scanner;
class Transform{
	String s;
	private int y;
	Transform(){}
	Transform(String s)
	{
		this.s=s;
		}
	int getY()
	{
		return y;
		}
	void setY(int y)
	{
		this.y=y;
		}
	void Change16to10()
	{
		int m=0;
		int n,l;
		for(n=0;n<s.length();n++)
		{
			l=Change(s.charAt(n));
			m+=l*Math.pow(16,s.length()-(n+1));
			}
		System.out.println(m);
		System.out.println("转换完成");
		}
	int Change(char h)
	{
		int x;
		switch(h)
		{
		case'0':x=0;
		break;
		case'1':x=1;
		break;
		case'2':x=2;
		break;
		case'3':x=3;
		break;
		case'4':x=4;
		break;
		case'5':x=5;
		break;
		case'6':x=6;
		break;
		case'7':x=7;
		break;
		case'8':x=8;
		break;
		case'9':x=9;
		break;
		case'a':x=10;
		break;
		case'b':x=11;
		break;
		case'c':x=12;
		break;
		case'd':x=13;
		break;
		case'e':x=14;
		break;
		case'f':x=15;
		break;
		default:throw new Exception();
		}
		return x;
	}
}
class Exception extends RuntimeException
{
	public Exception(){}
	public Exception(String msg)
	{
		super(msg);
		}
	public void alert()
	{
		System.out.println("输入的数字不正确！");
		}
	}
public class 进制转换
{
	public static void main(String[] args)
	{
		System.out.println("输入一个16进制数字：");
		Scanner S=new Scanner(System.in);
		String s=S.next();Transform E=new Transform(s);
		try{
			E.Change16to10();
			}
		catch(Exception e)
		{
			e.alert();
			}
		}
	}
