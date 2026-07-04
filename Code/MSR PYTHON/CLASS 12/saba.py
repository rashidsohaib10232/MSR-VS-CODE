import csv

# Step 1: Read file (tab-separated)
with open('Book1.csv', 'r') as file:
    reader = csv.reader(file, delimiter='\t')
    data = list(reader)

# Step 2: Clean valid rows
rows = []
for row in data:
    if len(row) >= 2:
        try:
            float(row[1])
            rows.append(row)
        except:
            pass

# Step 3: Sort by marks
sorted_rows = sorted(rows, key=lambda row: float(row[1]))

# Step 4: Add Roll Numbers
final_data = []
roll_no = 1

for row in sorted_rows:
    name = row[0]
    marks = row[1]
    final_data.append([roll_no, name, marks])
    roll_no += 1

# Step 5: Print
print(["Roll No", "Name", "Marks"])
for row in final_data:
    print(row)

# Step 6: Write back to file
with open('Book1.csv', 'w', newline='') as file:
    writer = csv.writer(file, delimiter='\t')
    writer.writerow(["Roll No", "Name", "Marks"])
    writer.writerows(final_data)