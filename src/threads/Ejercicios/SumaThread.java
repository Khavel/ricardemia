package threads.Ejercicios;


public class SumaThread extends Thread {
    private int min, max;
    private int[] arr;
    private int ans = 0;

    public SumaThread(int[] arr, int min, int hi) {
        this.min = min;
        this.max = hi;
        this.arr = arr;
    }

    @Override
    public void run() {
        for (int i = min; i < max; i++) {
            ans += arr[i];
        }
    }


    public static int sum(int[] arr) throws InterruptedException {
        int len = arr.length;
        int ans = 0;

        SumaThread[] ts = new SumaThread[4];
        for (int i = 0; i < 4; i++) {
            ts[i] = new SumaThread(arr, (i * len) / 4, ((i + 1) * len / 4));
            ts[i].start();
        }


        for (int i = 0; i < 4; i++) {
            ts[i].join();
            ans += ts[i].ans;
        }
        return ans;
    }

    public static void main(String[] args) throws InterruptedException {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        int sum = sum(arr);
        System.out.println("Suma: " + sum);
    }
}