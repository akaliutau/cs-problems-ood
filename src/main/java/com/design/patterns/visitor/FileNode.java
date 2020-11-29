package com.design.patterns.visitor;

/**
 * Represent state of some object, not actions The latter are handled by Visitor
 * object
 * 
 * @author akalu
 *
 */
public class FileNode implements Visitable {

	private String fileName;

	public FileNode(String fileName) {
		this.fileName = fileName;
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.read(fileName);
	}

	@Override
	public String getFileName() {
		return fileName;
	}

}
