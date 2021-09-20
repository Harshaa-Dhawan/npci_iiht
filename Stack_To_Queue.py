class StackToQueue:
    def __init__(self):
        self.stack = []


    def push(self, element):
        self.stack.append(element)


    def pop(self):
        if(not self.isEmpty()):
            lastElement = self.stack[-1] 
            del(self.stack[-1]) 
            return lastElement
        else:
            return("Stack Already Empty")


    def isEmpty(self):
        return self.stack == []

    def printStack(self):
        print("The Stack is: ",self.stack)

class Queue:
 
    def __init__(self, c):
         
        self.queue = []
        self.front = self.rear = 0
        self.capacity = c
 
    def queueEnqueue(self, data):
 

        if(self.capacity == self.rear):
            print("\nQueue is full")

        else:
            self.queue.append(data)
            self.rear += 1

    def queueDequeue(self):
 

        if(self.front == self.rear):
            print("Queue is empty")
 
  
        else:
            x = self.queue.pop(0)
            self.rear -= 1

    def queueDisplay(self):
         
      if(self.front == self.rear):
            print("\nQueue is Empty")
 
      else:
        print("Elements in the queue are:",end = " ")                                      
        for i in range(self.front, self.rear):
                print(self.queue[i], end = " ")
        print ()

    def queueFront(self):
         
        if(self.front == self.rear):
            print("\nQueue is Empty")
 
        print("\nFront Element is:",
              self.queue[self.front])

def CalculateQueueElemPositions(stack,size):
    q=Queue(size)
    min1 = stack[0] 
    min2 = stack[0]
    min_idx1 = 0
    min_idx2 = 0
    
    for i, num in enumerate(stack) :
        if num < min1 :
            min2 = min1
            min_idx2 = min_idx1
            min1 = num
            min_idx1 = i 
        elif num < min2 :
            min2 = num
            min_idx2 = i
       
    for num in stack :
        if (num > min1) and (num % min1 == 0) :
            q.queueEnqueue(num)

        if (num > min2) and (num % min2 == 0) :
            q.queueEnqueue(num)
    q.queueDisplay()  

s = StackToQueue()
s.push(6)
s.push(12)
s.push(2)
s.push(15)
s.push(17)
s.push(3)
s.push(9)

s.printStack()
size=len(s.stack)
CalculateQueueElemPositions(s.stack,size)

