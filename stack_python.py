# Python: стек
stack = []
for i in range(1, 6):
    stack.append(i)   # push
while stack:
    print(stack.pop())  # pop
