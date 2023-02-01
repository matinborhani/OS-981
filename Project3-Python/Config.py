class Config:
    def __init__(self) -> None:
        self.initialize()

    #  for retrieving data from config.txt file
    def initialize(self):
        values = list();
        nameFile = "config.txt";
        file = open(nameFile, "r")
        for i in range(3):
            str = file.readline();
            listSplit = str.split(" ");
            values.append(listSplit.pop(1).rstrip())
        self.sizeProcess = int(values[0]);
        self.sizePage = int(values[1]);
        self.sizeRam = int(values[2]);
