package com.baojuan.dao.imp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.baojuan.dao.FlowerDao;
import com.baojuan.pojo.Flower;
public class FlowerDaoImp implements FlowerDao {
	List<Flower> list = new ArrayList<>();
	Connection con = null;
	PreparedStatement ps = null;
	ResultSet res = null;

	@Override
	public List<Flower> selAll() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/flower", "root", "root");
			ps = con.prepareStatement("select * from flower");
			res = ps.executeQuery();
			while (res.next()) {
				list.add(new Flower(res.getInt(1), res.getString(2), res.getString(3), res.getInt(4)));

			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				res.close();
				ps.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
		return list;
	}

	@SuppressWarnings("finally")
	@Override
	public int insertFlower(Flower flower) {
		int index = 0;
		Connection con = null;
		PreparedStatement ps = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/flower", "root", "root");
			ps = (PreparedStatement) con.prepareStatement("insert into flower values(default,?,?,?)");
			ps.setObject(1, flower.getName());
			ps.setObject(2, flower.getPrice());
			ps.setObject(3, flower.getNum());
			index = ps.executeUpdate();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				ps.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return index;
		}
	}

}
