package pan.xu.杂七杂八;

public class 寻找有序数组的中位数时间复杂度为logm加n {
    public static void main(String[] args) {
        int[] a = {0, 1, 3, 5, 6};
        int[] b = {2, 3, 4, 7, 8};
        int[] c = {4,5};
        int[] d = {1};
        //System.out.println(solution2(a, b));
        System.out.println(solution2(c, d));
    }

    static float solution2(int[] num1, int[] num2) {
        if (num1.length == 0 || num2.length == 0) {
            if (num1.length == 0) {
                if (num2.length % 2 == 0) {
                    return (float) (num2[num2.length / 2 - 1] + num2[num2.length/2]) / 2;
                } else {
                    return (float) (num2[num2.length / 2]);
                }
            } else {
                if (num1.length % 2 == 0) {
                    return (float) (num1[num1.length / 2 - 1] + num1[num1.length / 2]) / 2;
                } else {
                    return (float) (num1[num1.length / 2]);
                }
            }
        }
        if ((num1.length + num2.length) % 2 != 0) {
            //System.out.println("为奇数");
            //为奇数
            int flag = 0;//用来标识三种情况
            int m = 0;
            int n = 0;
            while (true) {
                if (m + n == (num1.length + num2.length) / 2) break;
                if (num1[m] > num2[n]) {
                    if (n < num2.length - 1) {
                        n++;
                    } else {
                        m++;
                        flag = 1;
                    }
                } else {
                    if (m < num1.length - 1) {
                        m++;
                    } else {
                        n++;
                        flag = 2;
                    }
                }
            }
            System.out.println(flag + "    ");
            if (flag == 0) {
                if (num1[m] > num2[n]) {
                    return num2[n];
                } else return num1[m];
            } else if (flag == 1) {
                return num1[m - 1] < num2[n] ? num2[n] : num1[m - 1];
            } else if (flag == 2) {
                return num2[n - 1] < num1[m] ? num1[m] : num2[n - 1];
            }
        } else {
            //为偶数
            int flag = 0;//用来标识三种情况
            int m = 0;
            int n = 0;
            while (true) {
                if (m + n == (num1.length + num2.length) / 2 - 1) break;
                if (num1[m] > num2[n]) {
                    if (n < num2.length - 1) {
                        n++;
                    } else {
                        m++;
                        flag = 1;
                    }
                } else {
                    if (m < num1.length - 1) {
                        m++;
                    } else {
                        n++;
                        flag = 2;
                    }
                }
            }
            if (flag == 0) {
//                if (num1[m] > num2[n]) {
//                    return ((float) num2[n] + (float) (num2[n + 1] > num1[m] ? num1[m] : num2[n + 1])) / 2;
//                } else {
//                    return ((float) num1[m] + (float) (num2[n] > num1[m + 1] ? num1[m + 1] : num2[n])) / 2;
//                }
                if (num1[m] > num2[n]) {
                    if (n + 1 <= num2.length - 1) {
                        return ((float) num2[n] + (float) (num2[n + 1] > num1[m] ? num1[m] : num2[n + 1])) / 2;
                    } else {
                        return (float) (num1[m] + num2[n]) / 2;
                    }
                } else {
                    if (m + 1 <= num1.length - 1) {
                        return ((float) num1[m] + (float) (num1[m + 1] > num2[n] ? num2[n] : num1[m + 1])) / 2;
                    } else {
                        return (float) (num1[m] + num2[n]) / 2;
                    }
                }
            } else if (flag == 1) {
//                return (float) (num1[m] + num1[m + 1]) / 2;
                return (float) (num1[m] + (num1[m - 1])) / 2;
            } else if (flag == 2) {
                return (float) (num2[n] + num2[n - 1]) / 2;
            }
        }

        return 0;
    }
}
