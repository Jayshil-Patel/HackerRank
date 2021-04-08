if __name__ == '__main__':
    n = int(input())
    student_marks = {}
    for _ in range(n):
        name, *line = input().split()
        scores = list(map(float, line))
        student_marks[name] = scores
    query_name = input()
    count = 0
    iterate=0
    for a in student_marks[query_name]:
        count += a
        iterate += 1
    # print(count)
    # print(iterate)
    average_output = count/iterate
    print("{:.2f}".format(average_output))
