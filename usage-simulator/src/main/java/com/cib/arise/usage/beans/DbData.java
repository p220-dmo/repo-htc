package com.cib.arise.usage.beans;

import java.util.Date;
import java.util.List;

public class DbData {

	private int id;
	private String table_name;
	private List<String> columns;
	private long[] rows_range;
	private Date save_date;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTable_name() {
		return table_name;
	}

	public void setTable_name(String table_name) {
		this.table_name = table_name;
	}

	public List<String> getColumns() {
		return columns;
	}

	public void setColumns(List<String> columns) {
		this.columns = columns;
	}

	public long[] getRows_range() {
		return rows_range;
	}

	public void setRows_range(long[] rows_range) {
		this.rows_range = rows_range;
	}

	public Date getSave_date() {
		return save_date;
	}

	public void setSave_date(Date save_date) {
		this.save_date = save_date;
	}

}
