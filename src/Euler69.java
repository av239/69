/**
 * Created by IntelliJ IDEA.
 * User: Alexey
 * Date: 02.03.12
 * Time: 16:23
 * To change this template use File | Settings | File Templates.
 */
public class Euler69 {

    static int Phi(int n){
        int res = 1;
        boolean[] b = new boolean[n + 1];

        for (int i = 2; i < n; i++){
            if (n % i == 0){
                if (b[i] == false){
                    int k = i;

                    while (k <= n){
                        b[k] = true;
                        k += i;
                    }
                }
            }
        }
        
        for (int i = 2; i < n; i++){
            if (b[i] == false){
                res++;
            }
        }
        return res;
    }

    public static void main(String[] args){
        double maxPhi = 0.0;
        int maxi = 0;

        for (int i = 1; i <= 1000000; i++){
            //System.out.println(i + " " + Phi(i));
            if ((double)i/Phi(i) > maxPhi){
                maxPhi = (double)i/Phi(i);
                maxi = i;
            }
            if (i % 100 == 0)
                System.out.println(i);
        }
        
        System.out.println(maxPhi + " " + maxi);
    }
}
