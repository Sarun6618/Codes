file = open("kmit.txt")
lines = file.readlines()
print("Reverse order:")
for line in reversed(lines):
    print(line,end="")
    number_of_lines = 0
    number_of_words = 0
    number_of_characters = 0
for line in lines:
    line = line.strip("\n")
    words = line.split()
    number_of_lines += 1
    number_of_words += len(words)
    number_of_characters += len(line)
file.close()
print("Number of lines:", number_of_lines)
print("Number of words:", number_of_words)
print("Number of characters:", number_of_characters)