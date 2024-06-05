package com.ey.day7assignment;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy1 implements Runnable {
	
	private final Object lock;
	
	public FileCopy1(Object lock) {
		this.lock=lock;
	}

	@Override
	public void run() {
		synchronized (lock) {
		
			try (FileInputStream fis = new FileInputStream("image1.bmp");
					FileOutputStream fos = new FileOutputStream("temp.bmp")) {
	
		            byte[] buffer = new byte[1024];
		            int bytesRead;
		            while ((bytesRead = fis.read(buffer)) != -1) {
		                fos.write(buffer, 0, bytesRead);
		            }
	
		            System.out.println("Contents of " + fis+ " copied to " + fos);
		        }
			catch (IOException e) {
				e.printStackTrace();
			}
			finally {
				lock.notify();
			}
		}
	}
}

