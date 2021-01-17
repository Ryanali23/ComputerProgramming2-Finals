
package DatabaseHelper;

import java.sql.ResultSet;

public interface CRUD {
    public void create();
    public ResultSet read();
    public void update(int id);
    public void delete(int id);
}
