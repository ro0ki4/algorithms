package pan.xu.回溯;

/**
 * 306
 * 输入: "199100199"
 * 输出: true
 * 解释: 累加序列为: 1, 99, 100, 199。1 + 99 = 100, 99 + 100 = 199
 */
public class 累加数 {
    public static void main(String[] args) {
        String a = "01";
        System.out.println(Integer.parseInt(a));
    }

    static boolean solution(String tarstr){
        int len = tarstr.length();
        for(int i = 0; i < len; i++){
            if(tarstr.charAt(i)=='0')
                continue;
            for(int j = i+1; j < len*2/3; j++){
                if(tarstr.charAt(j)=='0')
                    continue;
                int len2 = j>2*i?j/2:i;
                if(Integer.parseInt(tarstr.substring(0,i+1))+Integer.parseInt(tarstr.substring(i+1,j+1))==Integer.parseInt(tarstr.substring(j+1,j+1+len2))){
                    int k = j+len2;
                    int z = 0;
                    while(true){
                        if(k ==len-1)
                            return true;
                        z=i;
                        i=j;
                        j=k;
                        k=k+len2;
                    }
                }
            }
        }
        return false;
    }
}
