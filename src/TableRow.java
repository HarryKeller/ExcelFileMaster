import java.util.ArrayList;
import java.util.List;

public class TableRow {
	private List<TableField> row;
	public TableRow() {
		setRow(new ArrayList<TableField>());
	}
	public TableRow(String[] textfields) {
		this();
		for(int i = 0;i<textfields.length;i++) {
			row.add(new TableField(textfields[i]));
		}
	}
	public List<TableField> getColumn() {
		return row;
	}
	public void setRow(List<TableField> column) {
		this.row = column;
	}
	public TableField getFieldByIndex(int index) {
		return row.get(index);
	}
	
}
