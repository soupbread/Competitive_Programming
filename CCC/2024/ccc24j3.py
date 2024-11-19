import sys
input = sys.stdin.buffer.readline

scores = [int(input()) for i in range(int(input()))]
sco = []
[sco.append(score) for score in scores if score not in sco]

sco.sort()

bronze = sco[-3]
cnt = 0

for score in reversed(scores):
    if score==bronze:
        cnt+=1

print(bronze, cnt)