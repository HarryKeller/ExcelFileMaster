import java.util.ArrayList;
import java.util.List;

public class TableRow {
	private List<TableField> column;
	public TableRow() {
		setRow(new ArrayList<TableField>());
	}
	public TableRow(String[] textfields) {
		for(int i = 0;i<textfields.length;i++) {
			column.add(new TableField(textfields[i]));
		}
	}
	public List<TableField> getColumn() {
		return column;
	}
	public void setRow(List<TableField> column) {
		this.column = column;
	}
	
}
