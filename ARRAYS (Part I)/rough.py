def is_prime(n):
    if n <= 1:
        return False
    for i in range(2,int(n**0.5)+1):
        if n % i == 0:
            return False
    return True
    
def sum_of_not_primes():
    total_sum = 0
    count = 0
    num = 2 
    
    while count < 40:
        if(not is_prime(num)):
            total_sum += num
            count += 1
        num += 1
        
    return total_sum
    
result = sum_of_not_primes()
print(result)