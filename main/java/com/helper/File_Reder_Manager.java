package com.helper;

public class File_Reder_Manager {
	private File_Reder_Manager(){
		
	}
	public static File_Reder_Manager getInstanceFRM() {
		File_Reder_Manager frm=new File_Reder_Manager();
		return frm;
	}
	public Configurator_Reader getInstanceCR() throws Throwable {
		Configurator_Reader cr=new Configurator_Reader();
		return cr;
	}

}
