import java.util.*;
import java.io.*;

public class Template {
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

        //For each test get the input
        int n=scanner.nextInt();
        int k= scanner.nextInt();

        int ans;
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
