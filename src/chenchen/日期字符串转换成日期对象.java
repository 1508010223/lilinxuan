/**
 * 
 */
package chenchen;

/**
 * @author chenchen
 *@package_name:chenchen
*@file_name:�����ַ���ת�������ڶ���.java
*@date-time:2017��11��14������2:35:28
*@location:https://github.com/1508010223/lilinxuan.git
 */
import java.util.Date;
public class �����ַ���ת�������ڶ��� {
public static void main(String[] args)
{
	System.out.println("��ǰʱ�̣�");
	System.out.println(new Date().toString());
	System.out.println("ת����ʾ��ʽ��");
	System.out.println(convertCommonDateStr(new Date().toString()));}
public static String convertCommonDateStr(String commonDateStr)
{
StringBuffer result=new StringBuffer(" ");
String arrStr[]=commonDateStr.split(" ");
result.append(arrStr[5]).append("-");
result.append(convertMonthStr(arrStr[1],true)).append("-");
result.append(arrStr[2]).append(" ");
result.append(arrStr[3]);
return result.toString();
}
public static String convertMonthStr(String monthStr,boolean isWithZero)
{
	String monthResult="";
	if("jan".equals(monthStr))
		monthResult="01";
	else if("feb".equals(monthStr))
		monthResult="02";
	else if("mar".equals(monthStr))
		monthResult="03";
	else if("apr".equals(monthStr))
		monthResult="04";
	else if("may".equals(monthStr))
		monthResult="05";
	else if("jun".equals(monthStr))
		monthResult="06";
	else if("jul".equals(monthStr))
		monthResult="07";
	else if("aug".equals(monthStr))
		monthResult="08";
	else if("sep".equals(monthStr))
		monthResult="09";
	else if("oct".equals(monthStr))
		monthResult="10";
	else if("nov".equals(monthStr))
		monthResult="11";
	else if("dec".equals(monthStr))
		monthResult="12";
		if(!isWithZero){
			if(monthResult.startsWith("0"))
				monthResult=monthResult.substring(1,2);
		}
		return monthResult;
}
}
