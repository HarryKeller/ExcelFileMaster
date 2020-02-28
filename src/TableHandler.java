import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TableHandler {

	private String path;
	BufferedReader file = null;
	TextTable table = new TextTable();
	
	public TableHandler(String pathToCsv) throws Exception {
		//TODO: Sehr unübersichtlich. Exceptionhandling verbessern.
		try{
			file = new BufferedReader(new FileReader(pathToCsv));
		} catch(Exception e) {
			e.printStackTrace();
			throw new Exception("Datei: "+path+" wurde nicht gefunden!");
		}
		try {
			readFile();
		} catch(Exception e) {
			throw new Exception("Fehler beim lesen der Datei");
		}
	}
	private void readFile() throws IOException {
		String row;	
		while((row = file.readLine()) != null) {
			String dataArr[] = row.split(";");
			table.addTableRow(new TableRow(dataArr));
		}
	}
	
	
}
