/*
 * Car 
 * CarDAO
 * CarDAOImpl
 * 
 * 
 * Car
 * CarRepository
 * CarRepositoryImpl
 * 
 * 
 * 
 */
package com.sbi.anno;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Enumeration;
import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.datasource.AbstractDriverBasedDataSource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Component;

@Component("theCar")
public class Car implements Vehicle { //isA
	
	@Autowired
	@Qualifier("theEngine")
	//@Qualifier("thePetEngine")
	//@Qualifier("theDieEngine")
	Engine engine ;
	
	
	@Autowired
	DataSource dataSource;
	
//	public Car(Engine engine) {
//		System.out.println("Car(Engine) constructed..."+engine);
//		this.engine = engine;
//	}
	
	public void loadAllCars() {
		
		
		System.out.println("driver : ");
		//AbstractDriverBasedDataSource adds = (AbstractDriverBasedDataSource) dataSource;
		DriverManagerDataSource dmds = (DriverManagerDataSource) dataSource;
		Properties props = dmds.getConnectionProperties();
		
		
		Enumeration enu = props.keys();
		while(enu.hasMoreElements()) {
			Object obj = enu.nextElement();
			
			System.out.println(">"+obj);
			
		}
		
		try {
			Connection conn = dataSource.getConnection();
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery("select * from cars");
			while(rs.next()) {
				int carId = rs.getInt(1);
				String carName = rs.getString(2);
				System.out.println("Car ID   : "+carId);
				System.out.println("Car Name : "+carName);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public void setEngine(Engine engine) {
		System.out.println("Car: setEngine(Engine) property..."+engine);
		this.engine = engine;
	}
	public void drive() {
		engine.ignite();
		System.out.println("Driving a Car...");
	}
}
