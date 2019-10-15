package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FindLoopTest {

    @Test
    public void whenArrayHas5Then0(){
        FindLoop find=new FindLoop();
        int[] input=new int[]{5,10,3};
        int value= 5;
        int result= find.indexOf(input, value);
        int expect= 0;
        assertThat(result,is(expect));
    }

    @Test
    public void whenArrayHas8Then3(){
        FindLoop find=new FindLoop();
        int[] input=new int[]{6,12,3,8,22};
        int value= 8;
        int result= find.indexOf(input, value);
        int expect= 3;
        assertThat(result,is(expect));
    }

    @Test
    public void whenArrayHas17Then1(){
        FindLoop find=new FindLoop();
        int[] input=new int[]{5,17,33,23,57};
        int value= 17;
        int result= find.indexOf(input, value);
        int expect= 1;
        assertThat(result,is(expect));
    }
}
