package by.htp.file01.main;

/*
 *1.Создать объект класса Текстовый файл, используя классы Файл, Директория. 
 * Методы: создать, переименовать, вывести на консоль содержимое, 
 * дополнить, удалить.
 */

public class Main {

	public static void main(String[] args) {

		Directory resource = new Directory("directory");

		Directory subresource = new Directory("subresource");

		resource.add(subresource);

		TextFile textFile1 = new TextFile("Text 1", "11111111");

		TextFile textFile2 = new TextFile("Text 2", "22222222");

		TextFile textFile3 = new TextFile("Text 3", "333333333");

		resource.add(textFile1);
		resource.add(textFile2);
		resource.add(textFile3);

		print(resource);

		DirectoryLogic dLog = new DirectoryLogic();

		TextFile textFile4 = dLog.createTextFile("Text4");

		resource.add(textFile4);

		dLog.renameFile(textFile1, "NewText1");
		dLog.supplementFile(textFile4, "44444444444");
		dLog.supplementFile(textFile4, " 55555555");

		print(resource);

		dLog.remove(resource, textFile4);
	}

	public static void print(Directory d) {

		System.out.println();

		for (TextFile tFile : d.getTextFile()) {

			System.out.println(tFile.getName() + " " + tFile.getContent());
		}
	}

}
