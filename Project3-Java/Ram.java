import java.util.ArrayList;
import java.util.List;

public class Ram {
    private List<Integer> ram ;
    private int sizeRam ;
    private int sizePage ;

                // &&&&&&&&&&&&&&&&&&&& Constructor
                // &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
    public Ram() {
        Config config = new Config();
        sizeRam = config.getSizeOfRAM();
        sizePage = config.getSizeOfPage();
        ram = new ArrayList<>(sizeRam);
        for (int i = 0 ; i<sizeRam;i++)
            ram.add(i,0);
    }
    public void addPageToFrame(int numberOfPage,int numberOfFrame) throws InterruptedException {
        Thread.sleep(100);
        for (int j=0;j<sizePage;j++){
            ram.set((numberOfFrame*sizePage)+j,(numberOfPage*sizePage) + j + 10000);
        }
    }
    public int read(int addr){
        return ram.get(addr);
    }
            // ******************************************
            // **************** Getter & Setter
            // ******************************************

    public List<Integer> getRam() {
        return ram;
    }



    public int getSizeRam() {
        return sizeRam;
    }



    public int getSizePage() {
        return sizePage;
    }

}
