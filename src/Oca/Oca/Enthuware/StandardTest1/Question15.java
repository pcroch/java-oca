package Oca.Oca.Enthuware.StandardTest1;

public class Question15 {


        public void initData(String[] arr){
            int ind = 0;
            for(String str : arr){
//                str.concat(str+" "+ind);
                str = str +""+ind;
                ind++;
            }
        }

        public void printData(String[] arr){
            for(String str : arr){
                System.out.println(str);
            }
        }

        public static void main(String[] args) {
            Question15 ot = new Question15();
            String[] arr = new String[2];
            ot.initData(arr);
            ot.printData(arr);
        }
    }
