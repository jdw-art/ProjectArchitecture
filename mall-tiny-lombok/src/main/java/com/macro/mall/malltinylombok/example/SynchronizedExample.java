package com.macro.mall.malltinylombok.example;

import lombok.*;

/**
 * @Author: Jacob
 * @Description: TODO
 * @Date: 2024/2/4 14:56
 * @Version: 1.0
 */
@Data
public class SynchronizedExample {

    @NonNull
    private Integer count;

    @Synchronized
    @SneakyThrows
    public void reduceCount(Integer id) {
        if (count > 0) {
            Thread.sleep(500);
            count--;
            System.out.println(String.format("thread-%d count:%d", id, count));
        }
    }

    public static void main(String[] args) {
        //添加@Synchronized三个线程可以同步调用reduceCount方法
        SynchronizedExample example = new SynchronizedExample(20);
        new ReduceThread(1, example).start();
        new ReduceThread(2, example).start();
        new ReduceThread(3, example).start();
    }

    @RequiredArgsConstructor
    static class ReduceThread extends Thread {
        @NonNull
        private Integer id;
        @NonNull
        private SynchronizedExample example;

        @Override
        public void run() {
            while (example.getCount() > 0) {
                example.reduceCount(id);
            }
        }
    }

}
