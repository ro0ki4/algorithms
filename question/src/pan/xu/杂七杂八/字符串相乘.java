package pan.xu.杂七杂八;

public class 字符串相乘 {
    public static void main(String[] args) {
        System.out.println(pratice("123", "456"));
        System.out.println(multiply("99", "999"));
    }

    static String pratice(String num1,String num2){
        int length1=num1.length();
        int length2=num2.length();
        int[] sum = new int[length1 + length2];
        StringBuilder str = new StringBuilder();
        for(int i=length1-1;i>=0;i--){
            for(int j=length2-1;j>=0;j--){
                sum[i + j + 1] += Integer.parseInt(num1.charAt(i) + "") * Integer.parseInt(num2.charAt(j) + "");
                if(sum[i+j+1]>=10){
                    sum[i+j]=sum[i+j]+sum[i+j+1]/10;
                    sum[i+j+1]=sum[i+j+1]%10;
                }
            }
        }
        //System.out.println(sum.toString());
        for(int i=0;i<=sum.length-1;i++){
            str.append(sum[i]);
        }
        if(str.charAt(0)=='0')
            str.deleteCharAt(0);
        return str.toString();
    }



        public static String multiply(String num1, String num2) {
            if (num1.equals("0") || num2.equals("0")) {
                return "0";
            }
            int length1 = num1.length();
            int length2 = num2.length();
            StringBuilder str = new StringBuilder();

            int[] arrayInt = new int[length1 + length2];

            for (int i = length1 - 1; i >= 0; i--) {
                for (int z = length2 - 1; z >= 0; z--) {
                    int number1 = num1.charAt(i) - 48;
                    int number2 = num2.charAt(z) - 48;
                    //从最后两位加起
                    arrayInt[i + z] += number1 * number2;

                    if (arrayInt[i + z] >= 10 && (i + z) != 0) {
                        arrayInt[i + z - 1] += arrayInt[i + z] / 10;
                        arrayInt[i + z] = arrayInt[i + z] % 10;
                    }
                }
            }

            for (int i = 0; i <= length1 + length2 - 2; i++) {
                str.append(arrayInt[i]);
            }

            return str.toString();
        }

}
