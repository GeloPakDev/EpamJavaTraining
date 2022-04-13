package test;

import com.company.task2.entity.Ball;
import com.company.task2.entity.Color;
import com.company.task2.util.DataReader;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DataReaderTest {

    @Test
    void readData() {
        List<Ball> list = new ArrayList<>();
        list.add(new Ball(123, Color.PINK));
        list.add(new Ball(765, Color.BLUE));
        list.add(new Ball(456, Color.RED));
        list.add(new Ball(876, Color.PINK));
        list.add(new Ball(984, Color.YELLOW));
        list.add(new Ball(965, Color.GREEN));

        String filePath = "C:\\Users\\super\\Desktop\\GELO\\Computer Science\\text.txt";
        DataReader dataReader = new DataReader();
        List<Ball> list1;
        list1 = dataReader.readData(filePath);
        assertEquals(list, list1);
    }
}