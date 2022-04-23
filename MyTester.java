package shimkin.lab3;

import java.util.List;

/**
 * тестер производительности массивов List
 */
public class MyTester {
    private int ops = 10000;
    
    /**
     * Возвращает число операций
     * @return Число операций
     */
    public int getOpsAmount() {
        return ops;
    }
    
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
    
    /**
     * Тестирование доступа
     * @param list Контейнер
     * @return Итоговое время
     */
    public long testGet(List<Integer> list) {
        long start = System.currentTimeMillis();
        for(int k = 0; k<ops; k++) {
            int pos = (int) Math.floor(Math.random() * ((list.size())));
            list.get(pos);
        }
        return System.currentTimeMillis() - start;
    }
    
    /**
     * Тестирование добавления в начало
     * @param list Контейнер
     * @return Итоговое время
     */
    public long testAddHead(List<Integer> list){
        long start = System.currentTimeMillis();
        for(int k = 0; k<ops; k++) {
            list.add(0, k);
        }
        return System.currentTimeMillis() - start;
    }

    /**
     * Тестирование добавления в конец
     * @param list Контейнер
     * @return Итоговое время
     */
    public long testAddTail(List<Integer> list){
        long start = System.currentTimeMillis();
        for(int k = 0; k<ops; k++) {
            list.add(k);
        }
        return System.currentTimeMillis() - start;
    }

    /**
     * Тестирование удаления
     * @param list Контейнер
     * @return Итоговое время
     */
    public long testDelete(List<Integer> list) {
        long start = System.currentTimeMillis();
        for(int k = 0; k<ops; k++) {
            int pos = (int) Math.floor(Math.random() * ((list.size())));
            list.remove(pos);
        }
        return System.currentTimeMillis() - start;
    }
}
