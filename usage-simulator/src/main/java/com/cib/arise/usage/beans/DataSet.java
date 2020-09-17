package com.cib.arise.usage.beans;

import java.util.Date;

public class DataSet {
	private int id_dataset;
	private Date data_last_updated;

	private Files files;
	private DbDatas db_datas;

	public int getId_dataset() {
		return id_dataset;
	}

	public void setId_dataset(int id_dataset) {
		this.id_dataset = id_dataset;
	}

	public Date getData_last_updated() {
		return data_last_updated;
	}

	public void setData_last_updated(Date data_last_updated) {
		this.data_last_updated = data_last_updated;
	}

	public Files getFiles() {
		return files;
	}

	public void setFiles(Files files) {
		this.files = files;
	}

	public DbDatas getDb_datas() {
		return db_datas;
	}

	public void setDb_datas(DbDatas db_datas) {
		this.db_datas = db_datas;
	}

}
