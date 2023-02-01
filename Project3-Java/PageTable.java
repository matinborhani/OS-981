import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PageTable {
    List<NodePageTable> table;
    int sizeProcess;
    int sizeOfPage;

                // &&&&&&&&&&&&&&&&&&&& Constructor
                // &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
    public PageTable() {
        Config config = new Config();
        this.sizeProcess = config.getSizeProcess();
        this.sizeOfPage = config.getSizeOfPage();
        table = new ArrayList<>(sizeProcess/sizeOfPage);
        for (int i =0 ; i<sizeProcess/sizeOfPage;i++)
            table.add(new NodePageTable(0,0));
    }
    public void add(int numberPage,int numberFrame){
        table.set(numberPage,new NodePageTable(1,numberFrame));
    }
    public void remove(int numberPage){
        table.get(numberPage).hasValue = 0;
    }
    public int findFrame(int numberPage){
        if (table.get(numberPage).hasValue == 1)
            return table.get(numberPage).getNumberFrame();
        else
            return -1;
    }
                // ******************************************
                // **************** Getter & Setter
                // ******************************************

    public List<NodePageTable> getTable() {
        return table;
    }



    public int getSizeProcess() {
        return sizeProcess;
    }



    public int getSizeOfPage() {
        return sizeOfPage;
    }


}
