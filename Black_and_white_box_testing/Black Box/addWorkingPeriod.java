import org.junit.*;

import static org.junit.Assert.*;


public class addWorkingPeriod {


        WorkSchedule ws;
        final static int SIZE = 10;

        @Before
        public void setUp() throws Exception {
        ws = new WorkSchedule(SIZE);
        ws.setRequiredNumber(2, 0, SIZE-1);
        }
        //Covers Tests Case 1 (Optional)
        @Test
        public void CheckZeroStartTime() {
        //ws.setRequiredNumber(2, 0, 6);
        assertTrue(ws.addWorkingPeriod("Surafel", 0, 4));

        }

        //Covers Tests Case 2
        @Test
        public void CheckNegativeStartTime() {

            //ws.setRequiredNumber(3, 0, 9);
            assertFalse(ws.addWorkingPeriod("Surafel", -1, 5));
        }

        //Covers Tests Case 3 (Optional)
        @Test
        public void endTimeLessThanSize() {

        //ws.setRequiredNumber(3, 0, 9);
        assertTrue(ws.addWorkingPeriod("Surafel", 0, SIZE-1));
        }

        //Covers Tests Case 4
        @Test
        public void EndTimeEqualsWithSize() {

            //ws.setRequiredNumber(3, 0, 9);
            assertFalse(ws.addWorkingPeriod("Surafel", 1, SIZE));
        }

        //Covers Tests Case 5 (Am not sure weather endtime and starttime should have the same value and return False)
        //There is a probability start time and endtime have the same value and return true
        @Test
        public void EndTimeEqualsWithStartTime() {

        //ws.setRequiredNumber(3, 0, 9);
        assertTrue(ws.addWorkingPeriod("Surafel", 9, SIZE-1));
        }

        //Tests Border Case 6 (NOT WORKING)
        @Test
        public void StartTimeBiggerThanEndTime() {
            //ws.setRequiredNumber(1, 0, 9);
            assertFalse(ws.addWorkingPeriod("Fatih", 4, 2)); // There is a bug over here
           
            //To check weather the schedule is changed or not (Sample). I
            WorkSchedule checkk = new WorkSchedule(10);
			checkk.setRequiredNumber(1, 0, 9);
			assertArrayEquals(ws.workingEmployees(0, 9), checkk.workingEmployees(0, 9));
        }
        @Test
        public void WorkingEmployeesLessThanRequiredNumber() {
        //ws.setRequiredNumber(1, 0, 9);

        assertTrue(ws.addWorkingPeriod("Surafel", 0, SIZE-1));
        }

        //Covers border 8
        @Test
        public void WorkingEmployeesEqualsRequiredNumber() {
            //ws.setRequiredNumber(1, 0, 9);

             assertTrue(ws.addWorkingPeriod("Surafel", 0, 5));
             assertFalse(ws.addWorkingPeriod("Surafel", 0, 5));
        }

        //Covers border 9
        @Test
        public void testSameEmployeeWorkDifferentInterval() {
            //ws.setRequiredNumber(1, 0, 5);
            assertTrue(ws.addWorkingPeriod("Surafel", 0, 4));
            assertTrue(ws.addWorkingPeriod("Surafel",5, SIZE-1));
        }

        //Covers border 10
        @Test
        public void testSameEmployeeWorkDouble() {
            //ws.setRequiredNumber(2, 0, 4);
            assertTrue(ws.addWorkingPeriod("Surafel", 0, SIZE-1));
            assertFalse(ws.addWorkingPeriod("Surafel", 0, SIZE-1));
        }

}












