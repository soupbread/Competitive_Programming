# AC 2024/12/21
# translated from C++
word = input()
m = {}
ans = 0
for char in word:
    if char in m:
        m[char] += 1
    else:
        m[char] = 1

for char, count in m.items():
    ans += (ord(char) - ord('a') + 1) * count

print(ans)