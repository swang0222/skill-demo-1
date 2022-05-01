import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoTest {
    @Test
    public void testSkillDemo() {
        assertEquals(240, SkillDemo.hoursToMinutes(4)); // Now it should pass
    }
}
