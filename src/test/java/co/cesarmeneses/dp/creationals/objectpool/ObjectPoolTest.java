package co.cesarmeneses.dp.creationals.objectpool;

import org.junit.Test;

import java.sql.Connection;

import static org.junit.Assert.assertNotNull;

public class ObjectPoolTest {

    @Test
    public void testObjectPool() {
        JDBCConnectionPool pool = new JDBCConnectionPool(
                "org.hsqldb.jdbcDriver",
                "jdbc:hsqldb://localhost/mydb",
                "sa",
                "secret"
        );

        Connection con = pool.checkOut();

        pool.checkIn(con);

        assertNotNull(pool);
    }
}
