import re
fileToRead = 'input.txt'
fileToWrite = 'Extracted.txt'
delimiterInFile = [',', ';']
def validateEmail(strEmail):
    if re.match("(.*)@(.*).(.*)", strEmail):
        return True
    return False
def validatePhoneNumber(strPhno):
    if re.match("(\+\d{2})[-]\d{10}",strPhno) or re.match("(\d{3})[-]\d{8}",strPhno):
        return True
    return False
listEmail = []
listPhoneNumber = []
file1 = open(fileToRead, 'r') 
listLine = file1.readlines()
for itemLine in listLine:
    item =str(itemLine)
    for delimeter in delimiterInFile:
        item = item.replace(str(delimeter),' ')
    wordList = item.split()
    for word in wordList:
        if(validateEmail(word)):
            listEmail.append(word)
        if(validatePhoneNumber(word)):
            listPhoneNumber.append(word)
print(len(listEmail),"emails collected!")
print(len(listPhoneNumber),"phone numbers collected!")
file2 = open(fileToWrite, 'w+') 
strData = "Mail IDs:\n"
for item in listEmail:
    strData = strData+item+'\n'
strData = strData+"\nPhone Numbers:\n"
for item in listPhoneNumber:
    strData = strData+item+'\n'
file2.write(strData)
file1.close()
file2.close()
