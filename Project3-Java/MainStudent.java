public class MainStudent {
     PageTable pageTable;
     Ram ramClass;
     int sizeRam;
     int sizePage;

     public void initialize(){
         Config config = new Config();
         pageTable = new PageTable();
         ramClass = new Ram();
         sizeRam = config.getSizeOfRAM();
         sizePage = config.getSizeOfPage();

     }
    public static void main(String[] args) {
        // Complete this function
    }
}
