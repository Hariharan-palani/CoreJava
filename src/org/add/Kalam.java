package org.add;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class Kalam {
public static void main(String[] args) throws IOException{
	File f=new File("D:\\DCIM");
	
	FileUtils.readLines(f);
	
}
}
