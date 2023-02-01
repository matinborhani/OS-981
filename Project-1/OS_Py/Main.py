import threading
import time
import random

def printMessage(number_Thread):
    print("Start Thread " , number_Thread);
    print("End thread " , number_Thread);

def writeFile(number_Thread):
    nameFile = 'File' + str(i);
    time.sleep(random.randrange(1,5,1))
    file = open(nameFile,"w");
    file.write("Start Thread " + str(number_Thread) + " ");
    print("Start Thread " , number_Thread);
    file = open(nameFile,"a");
    file.write("End thread " + str(number_Thread) + " ");
    print("End thread " , number_Thread);
    file.close();
if __name__ == '__main__':
    threads = []; # it is a list of threads
    for i in range(1,200):
        # threads.append(threading.Thread(target=printMessage , args=(i,)));
        threads.append(threading.Thread(target=writeFile , args=(i,)));
        threads[i-1].start();
    print("End Process")