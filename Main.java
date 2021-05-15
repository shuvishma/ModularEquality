import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in)) ;
        String[] str = read.readLine().trim().split(" ") ;
        int test = Integer.parseInt(str[0]) ;
        while(test-- > 0) {
            str = read.readLine().trim().split(" ") ;
            Long n = Long.parseLong(str[0]) ;
            Long m = Long.parseLong(str[1]) ;
            HashMap<Long,Long> hs = new HashMap<>() ;
            for(long i=0; i<=n; i++) {
                hs.put(i, (long) 1) ;
            }
            long count = 0L ;
            for(long i=2 ; i<=n; i++) {
                long a = m%i ;
                long temp = hs.get(a) ;
                count = count + temp ;
                for(long j=a; j<=n; j+=i) {
                    hs.put(a, hs.get(j)+1) ;
                }
            }
            // Iterator<Entry<Integer, Integer>> itr = hs.entrySet().iterator() ;
            // while(itr.hasNext()) {
            //     HashMap.Entry<Integer,Integer> entry = itr.next() ;
            //     System.out.println(entry.getKey() + " " + entry.getValue());
            // }
            System.out.println(count);
        }  
    }
}