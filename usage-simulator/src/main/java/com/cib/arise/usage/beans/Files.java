package com.cib.arise.usage.beans;

import java.util.Set;

public class Files {
	private int number_of_files;
	private Set<File> files;

	public int getNumber_of_files() {
		return number_of_files;
	}

	public void setNumber_of_files(int number_of_files) {
		this.number_of_files = number_of_files;
	}

	public Set<File> getFiles() {
		return files;
	}

	public void setFiles(Set<File> files) {
		this.files = files;
	}

}
