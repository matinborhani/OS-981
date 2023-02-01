from time import sleep
from Config import Config

class Ram:
    ram = list();
    def __init__(self) -> None:
        config = Config()
        self.sizeRam = config.sizeRam;
        self.sizePage = config.sizePage;
        for i in range(self.sizeRam): # inititalize ram to 0 value
            self.ram.append(0)
    def addPageToFrame(self,numberPage,numberFrame):
        sleep(1);
        for i in range(self.sizePage):
            self.ram[(numberFrame*self.sizePage) + i] = (numberPage * self.sizePage) + i + 10000
    def read(self,addr):
        return self.ram[addr];


