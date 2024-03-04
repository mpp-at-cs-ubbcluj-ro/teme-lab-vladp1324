import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ro.mpp2024.model.ComputerRepairRequest;

public class ComputerRepairRequestTest {
    @Test
    @DisplayName("First test")
    public void testExample()
    {
        ComputerRepairRequest crr = new ComputerRepairRequest();
        Assertions.assertEquals("", crr.getOwnerName());
        Assertions.assertEquals("", crr.getOwnerAddress());
    }

    @Test
    @DisplayName("Test exemplu")
    public void testExample2()
    {
        Assertions.assertEquals(2, 2, "Numerele trebuie sa fie egale");
    }


}