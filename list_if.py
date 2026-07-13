nums = [3, 6, 9, 12, 15]
result = []
for n in nums:    
  if n > 10:       
    result.append(n - 2)    
  else:        
    result.append(n + 1)
print(result)

# 위 프로그램의 최종 출력 결과를 리스트 형태로 쓰시오.
# [4,7,10,10,13]
