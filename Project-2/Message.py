class Message:
    numThread=""
    def enterMuseum(self):
        print (self.numThread , "enter Museum")

    def waitingForTaxi(self):
        print(self.numThread , "waiting for taxi")

    def enterTaxi(self,numTaxi):
        print(self.numThread , "enter to taxi" , numTaxi)

    def inTaxi(self,numTaxi):
        print("\t" , numTaxi , "started")

    def exitTaxi(self,numTaxi):
        print("\t" , numTaxi , "stoped")