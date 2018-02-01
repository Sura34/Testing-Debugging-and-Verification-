import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class workingEmployees {
    WorkSchedule ws;
    final static int SIZE = 10;
    @Before
    public void setUp() throws Exception {
        ws = new WorkSchedule(SIZE);
        ws.setRequiredNumber(1, 0, SIZE-1);
        //ws.readSchedule(1).workingEmployees = new String[]{"Surafel", "Sara"};
        //ws.readSchedule(2).workingEmployees = new String[]{"Meheret"};
    }
    // There is a bug over here
    // Covers the first partion
    @Test
    public void starttimegreaterthanendtime(){
        String[] result = new String[0];
        ws.addWorkingPeriod("Surafel",0,SIZE-1);
        String[] res = ws.workingEmployees(4, 1);
        assertEquals(res.length, result.length );
    }
    // This covers the second partition
    @Test
    public void starttimelessthanendtime(){
        String[] result = {"Surafel"};
        ws.addWorkingPeriod("Surafel",0,SIZE-1);
        String[] res = ws.workingEmployees(1, 2);
        assertEquals(res.length, result.length );
    }

    @Test
    public void TimeMatchesForBoth() {
        String[] result = {"Sara"};
        ws.addWorkingPeriod("Sara", 0, SIZE-1);
        assertArrayEquals(ws.workingEmployees(0, SIZE-1), result);
    }
    // Covers test_work_border2
    @Test
    public void TimeDifferFromTheLast(){
        String[] res = new String[0];
        ws.addWorkingPeriod("", 0, 3);
        assertArrayEquals(ws.workingEmployees(3, SIZE-1), res);
    }
    // Covers test_work_border2
    @Test
    public void TimeDifferFromTheBeginning() {
        String[] res = new String[0];
        ws.addWorkingPeriod("Sara", 8, 9);
        assertArrayEquals(ws.workingEmployees(1, 8), res);
    }




}