import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        HashSet<Integer> set = new HashSet<Integer>();
        int [] A = new int[10];



        for(int i=0; i<10; i++){


            set.add(sc.nextInt() % 42);
            //값을 넣을 때 만약 중복되는 값이 없으면 HashSet에 저장됨 , 만약 중복된다면 저장하지 않음
            //즉 입력한 값이 중복된다면 저장하지 않고 입력한 값이 중복되지 않은 값이면 저장됨

        }

        System.out.println(set.size());
        //저장된 HashSet의 크기를 출력하면 이는 결국 "서로 다른 나머지"가 되는 것





    }
}
