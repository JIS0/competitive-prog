import java.util.*;
import java.io.*;

public class Robinhood1 {
    static FastScanner scanner = new FastScanner();
    static PrintWriter out = new PrintWriter(System.out);
    public static void main(String[] args) {

        // Read input
        int t = scanner.nextInt(); // Example: reading an integer
        // Add more input reading as needed

        while (t-- > 0) {
            solve();
        }

        // Output result

        out.flush();
    }

    private static void solve() {
        // Implement your solution logic here

        int n=scanner.nextInt();
        int k= scanner.nextInt();
        String ans= "";
        int odd=0;

        if(n%2!=0){
            if(k%2==0){
                odd=k/2;
            }
            else{
                odd=1+(k/2);
            }
        }
        else {

            odd= k/2;

        }
`
        if(odd%2==0)
        {
            ans="YES";
        }
        else{
            ans="NO";
        }


        out.println(ans);
    }

    // Fast input handling
    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}
