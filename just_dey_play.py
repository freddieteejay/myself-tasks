def string_checker(alpha):
	vowel = 0
	consonant = 0
	for i in range(len(alpha)):
		if alpha[i] == "a" or alpha[i] == "e" or alpha[i] == "i" or alpha[i] == "o" or alpha[i] == "u" :
			vowel += 1
		else:
			consonant +=1
	print("consonant  ", consonant, "vowel ", vowel)
	
print(string_checker("fareed"))