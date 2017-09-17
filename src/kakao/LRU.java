package kakao;

/**
 * Created by masinogns on 2017. 9. 16..
 *
 *Least Recently Used (LRU) page replacement algorithm output:

 */
import java.io.*;
import java.util.*;

public class LRU {

    public int solution(int cacheSize, String[] cities) throws IOException
    {
        if (cacheSize == 0){
            return cities.length * 5;
        }

        int frames,pointer = 0, hit = 0, fault = 0,ref_len;
        Boolean isFull = false;
        String buffer[];
        ArrayList<String> stack = new ArrayList<>();
        String mem_layout[][];

        frames = cacheSize;

        mem_layout = new String[cities.length][frames];
        buffer = new String[frames];
        for(int j = 0; j < frames; j++)
            buffer[j] = null;



        for(int i = 0; i < cities.length; i++)
        {
            if(stack.contains(cities[i]))
            {
                stack.remove(stack.indexOf(cities[i]));
            }
            stack.add(cities[i]);
            int search = -1;
            for(int j = 0; j < frames; j++)
            {
                if(buffer[j] == cities[i])
                {
                    search = j;
                    hit++;
                    break;
                }
            }
            if(search == -1)
            {
                if(isFull)
                {
                    int min_loc = cities.length;
                    for(int j = 0; j < frames; j++)
                    {
                        if(stack.contains(buffer[j]))
                        {
                            int temp = stack.indexOf(buffer[j]);
                            if(temp < min_loc)
                            {
                                min_loc = temp;
                                pointer = j;
                            }
                        }
                    }
                }

                buffer[pointer] = cities[i];
                fault++;
                pointer++;
                if(pointer == frames)
                {
                    pointer = 0;
                    isFull = true;
                }
            }
            for(int j = 0; j < frames; j++)
                mem_layout[i][j] = buffer[j];
        }


        int ret = 0;

        ret = hit * 1 + fault * 5;
        System.out.println(ret);

        return ret;
    }

}
