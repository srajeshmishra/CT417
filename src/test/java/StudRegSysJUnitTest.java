/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import ie.nuigalway.schukat.ct417ass1v2.StudRegSys;
import org.joda.time.DateTime;

/**
 *
 * @author Michael
 */
public class StudRegSysJUnitTest {
    
    public StudRegSysJUnitTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void test1()  {
        StudRegSys srs;
        String s1 = "BSc (CS&IT)";
        String s2 = "CT417";
        
        srs = new StudRegSys();
        
        srs.addCourse(s1, new DateTime(), new DateTime());
        srs.addSubject(s2);
        assertEquals(s1, s1);
        System.out.println("This is a dummy test");
    }
    
}
