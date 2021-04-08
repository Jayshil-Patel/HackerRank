if __name__ == '__main__':
    N = int(input())
    main_list=[]
    for iterate in range(N):
        entered_string=input().split()
        if entered_string[0] == 'insert':
            main_list.insert(int(entered_string[1]),int(entered_string[2]))
        elif entered_string[0] == 'print':
            print(main_list)
        elif entered_string[0] == 'remove':
            main_list.remove(int(entered_string[1]))
        elif entered_string[0] == 'append':
            main_list.append(int(entered_string[1]))
        elif entered_string[0] == 'sort':
            main_list.sort()
        elif entered_string[0] == 'pop':
            main_list.pop()
        elif entered_string[0] == 'reverse':
            main_list.reverse()
