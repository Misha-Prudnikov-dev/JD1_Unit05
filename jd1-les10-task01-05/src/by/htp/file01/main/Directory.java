package by.htp.file01.main;

import java.util.ArrayList;
import java.util.List;

public class Directory {

	private String name;
	private List<TextFile> textFile;
	private List<Directory> subDirectories;

	public Directory(String name) {

		this.name = name;
		textFile = new ArrayList<TextFile>();
		subDirectories = new ArrayList<Directory>();
	}

	public void add(TextFile newTextFile) {
		textFile.add(newTextFile);
	}

	public void add(Directory newSubDirectories) {
		subDirectories.add(newSubDirectories);
	}

	public List<TextFile> getTextFile() {
		return textFile;
	}

	public void setTextFile(List<TextFile> textFile) {
		this.textFile = textFile;
	}

	public List<Directory> getSubDirectories() {
		return subDirectories;
	}

	public void setSubDirectories(List<Directory> subDirectories) {
		this.subDirectories = subDirectories;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((subDirectories == null) ? 0 : subDirectories.hashCode());
		result = prime * result + ((textFile == null) ? 0 : textFile.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Directory other = (Directory) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (subDirectories == null) {
			if (other.subDirectories != null)
				return false;
		} else if (!subDirectories.equals(other.subDirectories))
			return false;
		if (textFile == null) {
			if (other.textFile != null)
				return false;
		} else if (!textFile.equals(other.textFile))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Directory [ name = " + name + ", textFile = " + textFile + ", subDirectories = " + subDirectories
				+ " ]";
	}

}
