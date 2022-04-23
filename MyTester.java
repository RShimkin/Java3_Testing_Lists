package shimkin.lab3;

import java.util.List;

/**
 * тестер производительности массивов List
 */
public class MyTester {
    private int ops = 10000;
    
    /**
     * Основной конст-тор с числом операций
     * @param num Число операций
     */
    public MyTester(int num){
        ops=num;
    }

    public MyTester(){}
    
    /**
     * Тестирование добавления в середину
     * @param list Контейнер
     * @return Итоговое время
     */
    public long testAdd(List<Integer> list) {
        long start = System.currentTimeMillis();
        for(int k = 0; k<ops; ++k) {
            list.add(list.size()/2, k);
        }
        return System.currentTimeMillis() - start;
    }
}
