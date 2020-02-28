import java.util.ArrayList;
import java.util.List;

public class TextTable {
	private List<TableRow> table;
	public TextTable() {
		setTable(new ArrayList<TableRow>());
	}
	public List<TableRow> getTable() {
		return table;
	}
	public void setTable(List<TableRow> table) {
		this.table = table;
	}
	public void addTableRow(TableRow tableRow) {
		table.add(tableRow);
	}
	
}
