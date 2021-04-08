def count_substring(string, sub_string):
    c=0
    for i in range(len(string)):
        if string[i:].startswith(sub_string):
            c+=1
    return c
