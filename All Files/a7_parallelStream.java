import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class a7_parallelStream {
    public static void main(String[] args) {
        
        int size = 10_000;   //10_000 means 10000
        List<Integer> nums = new ArrayList<>(size);
        
        Random ran = new Random();

        for(int i = 0; i <= size; i++){
            nums.add(ran.nextInt(100));
        }

        // int sum1 = nums.stream()
        //             .map(i -> i*2)
        //             .reduce(0, (c,e) -> c+e);
        
        long startTime1 = System.currentTimeMillis();
        int sum2 = nums.stream()
                        .map(i -> {
                            try {
                                Thread.sleep(1);
                            } catch (Exception e) {
                            }
                            return i*2;
                        })
                        .mapToInt(i -> i)
                        .sum();
        long endTime1 = System.currentTimeMillis();
        
        //parallelStream is faster than Streams
        long startTime2 = System.currentTimeMillis();
        int sum3 = nums.parallelStream()
                        .map(i -> {
                            try {
                                Thread.sleep(1);
                            } catch (Exception e) {
                            }
                            return i*2;
                        })
                        .mapToInt(i -> i)
                        .sum();
        long endTime2 = System.currentTimeMillis();

        System.out.println(sum2 + " " + sum3);
        System.out.println("StreamTiming : " + (endTime1-startTime1));
        System.out.println("ParallelStreamTiming : " + (endTime2-startTime2));


    }
}
