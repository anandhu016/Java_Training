package com.ey.day7assignment;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy2 implements Runnable {
	
	private final Object lock;
	
	public FileCopy2(Object lock) {
		this.lock=lock;
	}

	@Override
	public void run() {
		synchronized (lock) {
			try {
				lock.wait();
		
				try (FileInputStream fis = new FileInputStream("temp.bmp");
						FileOutputStream fos = new FileOutputStream("image2.bmp")) {
		
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
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

