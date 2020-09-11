package pan.xu.杂七杂八;

import java.util.ArrayList;

public class Z字形变换 {
    public static void main(String[] args) {
        solution("xupandontbeevil",3);
    }

    public static void solution(String s,int numRows){
        int flag=0;
        int space = numRows * 2 - 2;
        ArrayList<String>[] arr = new ArrayList[numRows];
        for(int i=0;i<numRows;i++){
            arr[i] = new ArrayList<>();
        }
//        arr[0] = new ArrayList<>();
//        arr[1] = new ArrayList<>();
//        arr[2] = new ArrayList<>();
//        while(flag<s.length()){
//            if(flag%space==0){
//                arr[0].add(s.charAt(flag) + "");
//            } else if(flag%space==1){
//                arr[1].add(s.charAt(flag) + "");
//            } else if(flag%space==2){
//                arr[2].add(s.charAt(flag) + "");
//            } else if(flag%space==3){
//                arr[1].add(s.charAt(flag) + "");
//            }
//            flag++;
//        }
        while(flag<s.length()){
            for(int i=0;i<numRows;i++){
                if(flag%space==i){
                    arr[i].add(s.charAt(flag) + "");
                    break;
                }
            }
            flag++;
        }
//        for(String s1:arr[0]){
//            System.out.print(s1 + "   ");
//        }
//        System.out.println();
//        for (String s2 : arr[1]) {
//            System.out.print(s2 + " ");
//        }
//        System.out.println();
//        for(String s3:arr[2]){
//            System.out.print(s3 + "   ");
//        }
        for(int i=0;i<numRows;i++){
//            if(i==0||i==numRows-1){
//                for (String s1 : arr[i]) {
//                    System.out.print(s1);
//                    for(int i1=0;i1<2*numRows-3;i1++){
//                        System.out.print(" ");
//                    }
//                }
//                System.out.println();
//            }
            for(int j=0; j<arr[i].size();j++){
                if(i==0||i==numRows-1){
                    //输出n-2个空格
                    System.out.print(arr[i].get(j));
                    for(int ii=0;ii<numRows-2;ii++){
                        System.out.print(" ");
                    }
                }
                System.out.print(arr[i].get(j));
                //添加n-1-i个空格
                for(int ii=0;ii<numRows-2-i;ii++){
                    System.out.print(" ");
                }
                if(j+1<arr[i].size()){
                    System.out.print(arr[i].get(j++));
                    //添加i-1个空格
                    for(int ii=0;ii<i-1;ii++){
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();//换行
        }
    }
}
