package lesson12;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ParameterMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLTEstr {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		try(final Connection c = DriverManager.getConnection("jdbc:postgresql://localhost:5433/postgres", "postgres", "user")) {
			System.err.println("Connected");
			DatabaseMetaData dbmd = c.getMetaData();

			c.setAutoCommit(false);
//			c.setTransactionIsolation();
//			c.commit();
//			c.rollback();			
			
//			dbmd.getColumns(null, null, null, null);
			
			try(final PreparedStatement	ps = c.prepareStatement("insert into t(x, y) values (?,?)")) {
				ParameterMetaData psmd = ps.getParameterMetaData();
				
				ps.setInt(1, 10);
				ps.setString(2, "s;ld;lfkldfkg");
				ps.executeUpdate();
				ps.setInt(1, 20);
				ps.setString(2, "shfghfgh;ld;lfkldfkg");
				ps.executeUpdate();
				ps.setInt(1, 30);
				ps.setString(2, "s;ld;lfkyuiyuiyuildfkg");
				ps.executeUpdate();
				ps.setInt(1, 40);
				ps.setString(2, "s;ld;lfkldffghfghghkg");
				ps.executeUpdate();
				c.commit();
			} catch (Exception exc) {
				c.rollback();
			}

			try(final PreparedStatement	ps = c.prepareStatement("select * from t where x = ?")) {
				ps.setInt(1, 10);
				try(final ResultSet rs = ps.executeQuery()) {
					
				}
				ps.setInt(1, 20);
				try(final ResultSet rs = ps.executeQuery()) {
					
				}
			}
			
			try(final Statement	s = c.createStatement()) {
//				s.executeUpdate("create table t(x integer, y text)");
				s.executeUpdate("insert into zzz(x, y) values (1,'vassya')");
				
				s.executeUpdate("insert into t(x, y) values (1,'vassya')");
				s.executeUpdate("insert into t(x, y) values (2,'petya')");
				
				try(final ResultSet	rs = s.executeQuery("select * from zzz")) {
					
					while (rs.next()) {
						System.err.println("X="+rs.getInt("x")+",Y="+rs.getString("y"));
					}
				}
				try(final ResultSet	rs = s.executeQuery("select * from t")) {
					ResultSetMetaData	rsmd = rs.getMetaData();

					for(int index = 1; index <= rsmd.getColumnCount(); index++) {
						System.err.println("Name="+rsmd.getColumnName(index)+
								",Type="+rsmd.getColumnTypeName(index)+
								",Class="+rsmd.getColumnClassName(index));
					}
					
					while (rs.next()) {
						for(int index = 1; index <= rsmd.getColumnCount(); index++) {
							System.err.print(rsmd.getColumnName(index)+"="+
									rs.getObject(index)+" ");
						}
						System.err.println();
//						System.err.println("X======"+rs.getInt("x")+",Y="+rs.getString("y"));
					}
				}
				
			}
		}
	}

}
