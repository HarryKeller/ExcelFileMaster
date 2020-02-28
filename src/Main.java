

public class Main {

	public static void main(String[] args) {
		try {
			TableHandler table = new TableHandler("C:\\Users\\hkeller\\Documents\\Christian\\Servo\\Generierung\\destination.csv");
			System.out.printf(table.getTable().getTableRow(0).getFieldByIndex(0).getField().toString());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
