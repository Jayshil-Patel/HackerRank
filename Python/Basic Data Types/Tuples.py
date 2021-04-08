N=int(input())
input_list=input().split()
t=()
for num in input_list:
   t=list(t)
   t.append(int(num))
   t=tuple(t)
print(hash(t))
