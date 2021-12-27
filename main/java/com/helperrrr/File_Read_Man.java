package com.helperrrr;

public class File_Read_Man {
	private File_Read_Man() {}
	
	public static File_Read_Man getInstanceFRM() {
		File_Read_Man frm=new File_Read_Man();
		return frm;
	}
	public Config_Read getInstanceCR() throws Throwable {
		Config_Read cr=new Config_Read();
		return cr;
	}

}
