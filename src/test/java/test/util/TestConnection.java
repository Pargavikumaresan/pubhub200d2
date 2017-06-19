package test.util;

import java.sql.SQLException;
import com.util.ConnectionUtil;

import org.springframework.jdbc.core.JdbcTemplate;

public class TestConnection {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		System.out.println(ConnectionUtil.getJdbcTemplate());
	}


}
