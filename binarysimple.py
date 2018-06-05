num=int(input("Enter the length of array :"))
list=[]
print "Enter the elements"
for i in range (0,num):
	ins=raw_input()
	list.append(ins)

print(list)

for i in range (0,num):
	for j in range (i+1,num):
		if(list[i]>list[j]):
			temp=list[i]
			list[i]=list[j]
			list[j]=temp
print("Sorted list is :")
print(list)

cont='y'
while(cont=='y'):
	key=raw_input("Enter the key to be searched :")
	low=0
	high=num
	check=0
	cont='n'
	while(low<high):
		mid=int((low+high)/2)
		if(key==list[mid]):
			print("The element is found at position",mid+1)
			flag=1
			check=1
			break
		elif(key<list[mid]):
			high=mid
		elif(key>list[mid]):
			low=mid+1
	
	if(check==0):
		print("Element not found.")

	cont=raw_input("do you want to continue\n")
