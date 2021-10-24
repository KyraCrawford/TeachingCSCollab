# converting number grades to letter grades

gradenum = input("Input a number grade (1-100): \n")
gradenum = int(gradenum)
if gradenum <= 69:
    print("Letter grade: F")
elif gradenum >= 70 and gradenum <= 74:
    print("Letter grade: D")
elif gradenum >= 75 and gradenum <= 84:
    print("Letter grade: C")
elif gradenum >= 85 and gradenum <= 92:
    print("Letter grade: B")
elif gradenum >= 93 and gradenum <= 100:
    print("Letter grade: A")
else:
    print("Number grade invalid")

