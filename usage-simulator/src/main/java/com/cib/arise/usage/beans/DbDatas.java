package com.cib.arise.usage.beans;

import java.util.Set;

public class DbDatas {
	private int number_of_dbdatas;
	private Set<DbData> db_datas;

	public int getNumber_of_dbdatas() {
		return number_of_dbdatas;
	}

	public void setNumber_of_dbdatas(int number_of_dbdatas) {
		this.number_of_dbdatas = number_of_dbdatas;
	}

	public Set<DbData> getDb_datas() {
		return db_datas;
	}

	public void setDb_datas(Set<DbData> db_datas) {
		this.db_datas = db_datas;
	}

}
