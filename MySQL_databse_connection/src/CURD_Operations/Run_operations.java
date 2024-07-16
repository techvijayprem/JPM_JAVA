package CURD_Operations;

public class Run_operations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		In_Up_Del_OPER cr = new In_Up_Del_OPER();
		
		persal_info pi = new persal_info();
		
		pi.setEnroll(12377);
		pi.setName("Maybe");
		pi.setStream("acc");
		
		   // INSERT The Data 
		// In_Up_Del_OPER.insertData(pi.getEnroll(),pi.getName(),pi.getStream());
		
		  // DELETE The Data
	//	In_Up_Del_OPER.deleteData();
		
		  //UPDATE The Data
		
		
		pi.setEnroll(11224);
		pi.setName("lilaa");
		pi.setStream("no");
		//In_Up_Del_OPER.updateData(pi.getEnroll(), pi.getName(),pi.getStream());
 		
 		
		In_Up_Del_OPER.search();
		
	//In_Up_Del_OPER.get_data();
	
	}

}
