if __name__ == '__main__':
    students = []
    for i in range(int(input("Enter a number: "))):
        name = input("Enter your name: ")
        score = float(input("Enter your score: "))
        students.append([name, score])

def my_function(score):
    return score
    # Sort students by score and then by name

students.sort(key = my_function)
second_lowest_score = sorted(set(score for name, score in students))[1]
