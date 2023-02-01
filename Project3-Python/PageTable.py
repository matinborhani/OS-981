from Config import Config


class NodePageTable:
    hasValue = None;
    numberFrame = None;

    def __init__(self,hasValue,numberFrame) -> None:
        self.hasValue = hasValue;
        self.numberFrame = numberFrame;


class PageTable:
    sizeProcess = None
    sizePage = None
    table = list()
    def __init__(self) -> None:
        config = Config();
        self.sizePage = config.sizePage;
        self.sizeProcess = config.sizeProcess;
        for i in range(self.sizeProcess // self.sizePage):
            self.table.append(NodePageTable(0,0))

    def add(self,numberPage,numberFrame):
        self.table[numberPage]= NodePageTable(1,numberFrame);


    def remove(self,numberPage):
        self.table[numberPage].hasValue = 0

    def findFrame(self, numberPage):
        if self.table[numberPage].hasValue == 1:
            return self.table[numberPage].numberFrame;
        else:
            return -1;
