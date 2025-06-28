# The :int represents the expected input type
# The -> int represents the expected output type
# It's a good practice to provide these type hints (not required)

def add(num1: int, num2: int) -> int:
    return num1 + num2

print(add(14, 61))
