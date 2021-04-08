if __name__ == '__main__':
    n = int(input())
    arr = input().split()
    num=[]
    for itr in arr:
        num.append(int(itr))
    num2=set(num)
    num = list(num2)
    print(sorted(num)[-2])
