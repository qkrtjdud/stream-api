package shopmtcoding.streamstudy.lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;

public class StreamEx01Test {

    @Test
    public void ex05() {
        List<Integer> list = Arrays.asList(7, 5, 5, 2, 1, 2, 3, 5, 4, 6);
        List<Integer> newList = new ArrayList<>();

        //중복값 뺴고 내림차순으로 복사하기
        for (Integer i : list) {
            if (!newList.contains(i)) {
                newList.add(i);
                for(int n = 0; i<newList.size();n++){
                    
                }
            }
        }
        System.out.println(newList);
 
    }

    @Test
    public void ex04() {
        List<Integer> list = Arrays.asList(7, 5, 5, 2, 1, 2, 3, 5, 4, 6);
        List<Integer> newList = new ArrayList<>();

        //중복값 빼고 깊은복사하기
        for (Integer i : list) {
            if (!newList.contains(i)) {
                newList.add(i);
            }
        }
        System.out.println(list);
        System.out.println(newList);
    }

    @Test
    public void ex03() {
        List<Integer> list = Arrays.asList(7, 5, 5, 2, 1, 2, 3, 5, 4, 6);
        List<Integer> lowList = new ArrayList<>();
        List<Integer> highList = new ArrayList<>();

        // 얕은복사
        lowList = list;

        // 깊은 복사
        for (Integer i : list) {
            highList.add(i);
            System.out.println(highList);
        }

    }

    @Test
    public void ex02() {
        List<Integer> list = Arrays.asList(7, 5, 5, 2, 1, 2, 3, 5, 4, 6);

        Stream<Integer> stream = list.stream();
        stream.distinct().forEach(t -> {
            System.out.println();
        });

    }

    @Test
    public void ex01() {
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(4);

        list.add(2);

        list.add(3);

        list.add(1);

        Stream<Integer> stream = list.stream();
        stream.forEach(t -> {
            System.out.println("값: " + t);
        });// 매개변수가 두개면 (t,i)이런식으로 괄호
           // System.out.println("=====================");
           // stream.forEach(System.out::println);

        // stream.forEach(new Consumer<Integer>() {
        // @Override
        // public void accept(Integer);
        // });

    }
}
