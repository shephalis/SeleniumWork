package dataDrivn;

public class ReadData {

	public static void main(String[] args) {
	
		String DataFetch=GetData.frameExcel("DataDriven","Sheet1",0,2 );
		System.out.println(DataFetch);
	}

}
