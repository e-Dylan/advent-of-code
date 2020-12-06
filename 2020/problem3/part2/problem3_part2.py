# Flag: 6050183040

Tree = "#"
Empty = "."

down_slopes = [1, 1, 1, 1, 2]
right_slopes = [1, 3, 5, 7, 1]

def find_path(right, down, lines):
    x = right
    y = down
    trees = 0
    while y < len(lines):
        if x > len(lines[0]) - 1:
            x = x % len(lines[y])
        if lines[y][x] == Tree:
            trees += 1

        x += right
        y += down

    return trees

lines = open("problem_3/part2/data.txt", 'r')
lines = lines.readlines()
lines = [line.rstrip() for line in lines]

all_trees = 1
for i in range(len(down_slopes)):
    trees = find_path(right_slopes[i], down_slopes[i], lines)
    all_trees *= trees

print(all_trees)