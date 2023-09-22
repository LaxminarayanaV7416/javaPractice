def find_combinations(lst, k):
    if k == 0:
        return [[]]  # Base case: an empty list is a valid combination
    
    if not lst:
        return []  # Base case: an empty list has no combinations
    
    first_elem = lst[0]
    rest_combinations = find_combinations(lst[1:], k - 1)
    
    combinations_with_first = [[first_elem] + comb for comb in rest_combinations]
    combinations_without_first = find_combinations(lst[1:], k)
    
    return combinations_with_first + combinations_without_first

# Example usage:
input_list = [1, 2, 3,4,5,6]
k = 2
result = find_combinations(input_list, k)
print(result)
