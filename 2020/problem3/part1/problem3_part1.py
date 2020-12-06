Tree = "#"
Empty = "."

def get_tree_path(right, down, lines):
	x = right
	y = down

	trees = 0

	while (y < len(lines)):
		if x > len(lines[y]) - 1: # reached the far-right side, place back at left-side
			x = x % len(lines[y])
		if lines[y][x] == Tree:
			trees += 1

		y += down
		x += right

	return trees

file = open('problem_3/part1/data.txt', 'r')
lines = file.readlines()
lines = [line.strip() for line in lines]
# grid = []
# for line in lines:
# 	# print(line.strip())
# 	grid.append(line.strip())
trees = get_tree_path(3, 1, lines)
print(trees)

