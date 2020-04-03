package test;

import org.apache.commons.text.CaseUtils;

public class CamelCase {
	public static String cCase(String input) {
		return CaseUtils.toCamelCase(input, false);
	}
public static void main(String arga[]) {
	System.out.print(new CamelCase().cCase("hello world"));
}
}