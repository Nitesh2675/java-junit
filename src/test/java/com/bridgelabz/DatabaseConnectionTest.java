import com.bridgelabz.DatabaseConnection;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DatabaseConnectionTest {

    private DatabaseConnection db;

    @BeforeEach
    void setup() {
        db = new DatabaseConnection();
        db.connectDb();
    }

    @Test
    public void connectDBTest() {
        Assertions.assertTrue(db.isConnected(), "Database should be connected");
    }

    @Test
    public void disconnectDBTest() {
        db.disconnect();
        Assertions.assertFalse(db.isConnected(), "Database should be disconnected");
    }





    @AfterEach
    void tearDown() {
        db.disconnect();
    }
}
