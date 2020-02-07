package by.htp.file01.main;


public class DirectoryLogic {

	public TextFile createTextFile(String n) {

		TextFile tF = new TextFile(n);

		return tF;
	}

	public void renameFile(TextFile textFile, String name) {
		textFile.setName(name);
	}

	public void supplementFile(TextFile textFile, String supplement) {
		textFile.setContent(textFile.getContent().concat(supplement)); 
		
		
	}

	public void remove(Directory d, TextFile textFile) {
		d.getTextFile().remove(textFile);

	}

}
