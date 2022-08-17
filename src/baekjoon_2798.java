import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.StringTokenizer;

public class baekjoon_2798 {
    public static void main(String[] args) throws IOException {

        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer((br.readLine()));

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

       int array[] = new int[N];

       st= new StringTokenizer(br.readLine()," ");

        for(int i = 0 ; i < N; i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }
        int result = black(array,N,M);


        System.out.println(result);

    }
    static int black(int []array, int N , int M) {
        int result = 0 ;

        for (int i1 = 0; i1 < N - 2; i1++) {

            for (int i2 = i1 + 1; i2 < N - 1; i2++) {

                for (int i3 = i2 + 1; i3 < N; i3++) {

                    int temp = array[i1] + array[i2] + array[i3];

                    if (M == temp) {
                        return temp;
                    }

                    if(result < temp && temp < M) {
                        result = temp;
                    }
                }
            }
        }

        return result;
    }
}
