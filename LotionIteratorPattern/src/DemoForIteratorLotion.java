
public class DemoForIteratorLotion {
	
	public static void main(String[] args) {  
        CollectiuonOfLotionIterator lotionCollection = new CollectiuonOfLotionIterator();  
        System.out.println("Different types of lotions by using Iterator");  
        for(Iterator iter = lotionCollection.getIterator(); iter.hasNext();){  
            String lotion = (String)iter.next();  
            System.out.println(lotion);  
         }      
  }  

}
