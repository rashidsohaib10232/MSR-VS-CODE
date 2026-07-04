import csv

# Step 1: Read file
with open('Book1.csv', 'r', encoding='utf-8') as file:
    reader = csv.reader(file)
    data = list(reader)

# Step 2: Remove header
rows = data[1:]

# Step 3: Extract only names safely
names = []
for row in rows:
    if len(row) > 1:
        names.append(row[1].strip())

# Step 4: Sort names (ascending)
names.sort(key=lambda x: x.lower())

# Step 5: Assign Roll Numbers
final_data = []
for i, name in enumerate(names, start=1):
    final_data.append([i, name])

# Step 6: Write new file
with open('new_file1.csv', 'w', newline='', encoding='utf-8') as file:
    writer = csv.writer(file)
    writer.writerow(["Roll No", "Name"])
    writer.writerows(final_data)

# Step 7: Print
print(["Roll No", "Name"])
for row in final_data:
    print(row)