def get_count(sentence):
    num = 0
    list = ['a','e','i','o','u','A','E','I','O','U']
    for el in sentence:
        if el in list:
            num += 1
    return num

print(get_count("string"))