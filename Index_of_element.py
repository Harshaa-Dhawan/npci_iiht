Array=[1,5,8,4,5]
n=int(input())
pos=-1
for i in range(len(Array)):
    if Array[i]==n:
        pos=i
        break

if pos> -1:
    print(f'Index of element "{n}" is ', pos)