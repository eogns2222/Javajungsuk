class Ex9_10 {
	public static void main(String[] args) {
		int iVal = 100;
		String strVal = String.valueOf(iVal); // int�� String���� ��ȯ�Ѵ�.
		
		double dVal = 200.0;
		String strVal2 = dVal + "";	// int�� String���� ��ȯ�ϴ� �� �ٸ� ���

		double sum  = Integer.parseInt("+"+strVal) // ���ڿ��� ���ڷ� �ٲٴ� ���
                                          + Double.parseDouble(strVal2);
		double sum2 = Integer.valueOf(strVal) + Double.valueOf(strVal2); // ���ڿ��� ���ڷ� �ٲٴ� ��� �� �ٸ� ���
		
		System.out.println(String.join("*",strVal,"+",strVal2,"=")+sum);
		System.out.println(strVal+"+"+strVal2+"="+sum2);
	}
}