arr=[9,47,3,5,8,1,16];     
temp=0;    
   
for i in range(0, len(arr)):    
  for j in range(i+1, len(arr)):    
    if(arr[i]>arr[j]):    
      temp=arr[i];    
      arr[i]=arr[j];    
      arr[j]=temp;    
print();    
  
print("Elements in Ascending order: ");    
for i in range(0, len(arr)):    
  print(arr[i], end=" ");