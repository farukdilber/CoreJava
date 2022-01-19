package techproed.jdbcOrnekler;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.protocol.Resultset;
import com.mysql.cj.xdevapi.Result;



public class Jdbc1Query01 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		// 1) ilgili driver yuklemeliyiz.
		Class.forName("com.mysql.cj.jdbc.Driver");
        
		// 2) baglanti olusturmaliyiz 
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sys?serverTimezone=UTC", "root", "birinci12");
	
		// SQL komutlari icin bir statement nesnesi olustur
		Statement st = con.createStatement();
		//SQL ifadeleri yazabilir ve calistirabiliriz 
		ResultSet veri= st.executeQuery("SELECT isim,maas FROM personel WHERE id=10005");
		// sonuclari aldik ve isledik
		while (veri.next()) {
			System.out.println(veri.getString("isim") + veri.getInt("maas"));
		}
	}

}
