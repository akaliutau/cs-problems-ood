package com.design.patterns.composite;

public class FileNode implements Node {

	private String fileContent;

	@Override
	public String info() {
		return "details about file";
	}

	public String getFileContent() {
		return fileContent;
	}

	public void setFileContent(String fileContent) {
		this.fileContent = fileContent;
	}

}
