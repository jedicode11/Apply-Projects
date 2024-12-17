# x = 94
# y = 49
#
#
# def sum():
#     sum = x + y
#     return sum
#
#
# print(sum())
#
# string = "That's the darn string"
#
# print(string[4])
# print(string)  # Prints complete string
# print(string[0])  # Prints first character of the string
# print(string[2:5])  # Prints characters starting from 3rd to 5th
# print(string[2:])  # Prints string starting from 3rd character
# print(string * 2)  # Prints string two times
# print(string + "TEST")  # Prints concatenated string
#
#
# list = ["New Age", 1231, "Artificial Intelligence", 211.1, "How' bout that", 2.1314134]
# tinyList = ["+++++++++++++++++++++", "Here starts the new data science list checker", 700000007, "Borderlands"]
# tinyList1 = ["-------------------------------------------------------------------------------------------------"]
#
# print(tinyList1)
# print(list[0])
# print(list[0:6])
# print(list[2:])
# print(tinyList * 2)
# print(list + tinyList)
#
#
# for dataCollection in range(1, 101):
#     print(dataCollection)
#
# dictionary = {'==one==': "==This is one==", 2: "==This is two=="}
# # dict = {}
# # dict['one'] = "This is one"
# # dict[2] = "This is two"
#
# tinyDict = {'/name': 'john', '/code': 6734, '/dept': 'sales'}
#
# print(dictionary['==one=='])
# print(dictionary[2])
# print(tinyDict)
# print(tinyDict.keys())
# print(tinyDict.values())
#
# a = True
# # display the value of a
# print(a)
#
# # display the data type of a
# print(type(a))
#
# # Returns false as a is not equal to b
# dataSet = 2
# secondDataSet = 4
# print(bool(dataSet == secondDataSet))
#
# # Following also prints the same
# print(dataSet == secondDataSet)
#
# # Returns False as a is None
# dataSet = None
# print(bool(dataSet))
#
# # Returns false as a is an empty sequence
# dataSet = ()
# print(bool(dataSet))
#
# # Returns false as a is 0
# dataSet = 0.0
# print(bool(dataSet))
#
# # Returns false as a is 10
# dataSet = 4131241
# print(bool(dataSet))
#
# a = int(1)  # a will be 1
# b = int(2.2)  # b will be 2
# c = int("3")  # c will be 3
#
# print(a)
# print(b)
# print(c)
#
# EntryData = 1241
# AddedMore = 23
#
# # Addition
# print("a + b : ", EntryData + AddedMore)
#
# # Subtraction
# print("a - b : ", EntryData - AddedMore)
#
# # Multiplication
# print("a * b : ", EntryData * AddedMore)
#
# # Division
# print("a / b : ", EntryData / AddedMore)
#
# # Modulus
# print("a % b : ", EntryData % AddedMore)
#
# # Exponent
# print("a ** b : ", EntryData ** AddedMore)
#
# # Floor Division
# print("a // b : ", EntryData // AddedMore)

# //////////////////////////////////////////

# a = 4
# b = 5
#
# # Equal /False
# print("a == b : ", a == b)
#
# # Not Equal /True
# print("a != b : ", a != b)
#
# # Greater Than /False
# print("a > b : ", a > b)
#
# # Less Than /True
# print("a < b : ", a < b)
#
# # Greater Than or Equal to /False
# print("a >= b : ", a >= b)
#
# # Less Than or Equal to /True
# print("a <= b : ", a <= b)
#
# # Assignment Operator
# a = 10
#
# # Addition Assignment
# a += 5
# print ("a += 5 : ", a)
#
# # Subtraction Assignment
# a -= 5
# print ("a -= 5 : ", a)
#
# # Multiplication Assignment
# a *= 5
# print("a *= 5 : ", a)
#
# # Division Assignment
# a /= 5
# print("a /= 5 : ", a)
#
# # Remainder Assignment
# a %= 3
# print("a %= 3 : ", a)
#
# # Exponent Assignment
# a **= 2
# print("a **= 2 : ", a)
#
# # Floor Division Assignment
# a //= 3
# print("a //= 3 : ", a)

# print("My name is %s and weight is %d kg!" % ('Zara', 21))
#
#
# para_str = """this is a long string that is made up of
# several lines and non-printable characters such as
# TAB ( \t ) and they will show up that way when displayed.
# NEWLINEs within the string, whether explicitly given like
# this within the brackets [ \n ], or just a NEWLINE within
# the variable assignment will also show up.
# """
# print(para_str)

# list1 = ['physics', 'chemistry', 1997, 2000]
# list2 = [1, 2, 3, 4, 5, 6, 7, 8]
# print("list1[0]: " + list1[1])
# print("list[1:5]: ", list2[1:5])

# list = ['physics', 'chemistry', 1997, 2000]
# print("Value available at index 2 : ")
# print(list[2])
# list[2] = 2001
# print("New value available at index 2 : ")
# print(list[2])

# def changeme(mylist):
#     "This changes a passed list into this function"
#     mylist.append([1, 2, 3, 4])
#     print("Values inside the function: ", mylist)
#     return
#
#
# # Now you can call changeme function
# mylist = [10, 20, 30]
# changeme(mylist)
# print("Values outside the function: ", mylist)