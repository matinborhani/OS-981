import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Config {
    private int sizeProcess;
    private int sizeOfPage;
    private int sizeOfRAM;
    private String fileName="config.txt";
    private List<Integer> values;

                    // &&&&&&&&&&&&&&&&&&&& Constructor
                    // &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
    public Config() {
        try {
            getInfo();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void getInfo() throws IOException {
        values = new ArrayList<>(3);
        char[] characters = new char[100];
        boolean canRead = false;
        String value = "";
        File file = new File(fileName);
        FileReader fileReader = new FileReader(file);
        fileReader.read(characters);
        for (char ch : characters) {
            if (ch == ':') {
                canRead = true;
                continue;
            }
            if (canRead) {
                if (ch == '\r')
                    continue;
                if (ch == '\n') {
                    values.add(Integer.valueOf(value));
                    value = "";
                    canRead = false;
                    continue;

                }
                value = value.concat(String.valueOf(ch));
            }
        }
        sizeProcess = values.get(0);
        sizeOfPage = values.get(1);
        sizeOfRAM = values.get(2);
    }


                // ******************************************
                // **************** Getter & Setter
                // ******************************************




    public int getSizeProcess() {
        return sizeProcess;
    }


    public int getSizeOfPage() {
        return sizeOfPage;
    }



    public int getSizeOfRAM() {
        return sizeOfRAM;
    }





}
