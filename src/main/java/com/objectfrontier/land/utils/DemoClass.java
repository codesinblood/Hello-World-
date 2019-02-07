package com.objectfrontier.land.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.mock.web.MockMultipartFile;
import org.springframework.web.multipart.MultipartFile;

public class DemoClass {
	
	public static MultipartFile get() {
		
	
		Path path = Paths.get("D://temp/images.png");
		String name = "file.txt";
		String originalFileName = "file.txt";
		String contentType = "image/png";
		byte[] content = null;
		try {
		    content = Files.readAllBytes(path);
		} catch (final IOException e) {
		}
		MultipartFile result = new MockMultipartFile(name,
		                     originalFileName, contentType, content);
		System.out.println(result);
		return result;
	}
	
	static FileStorageService fs;
	
	public static void main(String[] args) {
		
		String fileName = fs.storeFile(DemoClass.get());
		System.out.println(fileName);
	}

}
