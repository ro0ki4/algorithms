package pan.xu.杂七杂八;

/**
 * 925长按键入
 * 超时~~~~~~~
 */
public class THREE {
    public static void main(String[] args) {
        String xupan="xupanxxuuppaann";
        String xu="nxup";
        System.out.println(hehe(xu,xupan));
    }
    public static boolean fuck(String name,String typed){
        char[] name_char=name.toCharArray();
        char[] typed_char=typed.toCharArray();
        for(int i=0,j=0;i<name.length();i++){
            for(;j<typed.length();){
                if(name_char[i]==typed_char[j]){
                    j++;
                    break;
                }
                if(i<name.length()-1&&j==typed.length()-1){
                    return false;
                }
                else if(i==name.length()-1&&j==typed.length()-1){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean hehe(String name,String typed){
        //if(name.charAt(0)!=typed.charAt(0))
         //   return false;
        //else{
            int i=0;
            int j=0;
            for(;i<name.length();){
                for(;j<typed.length();){
                    if(name.charAt(i)==typed.charAt(j)){
                        i++;
                        j++;
                        break;
                    }
                    else
                        j++;
                }
                if(i<name.length()-1&&j==typed.length()-1)
                    return false;
                else if(i==name.length()-1&&j<=typed.length()-1)
                    return true;
            }

        //}
        return false;
    }
}
