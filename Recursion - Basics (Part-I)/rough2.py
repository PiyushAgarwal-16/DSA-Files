import json

# Replace with the path to your extracted file
with open("Saved.json", "r", encoding="utf-8") as f:
    data = json.load(f)

titles = []

for item in data.get("items", []):
    title = item.get("title")
    if title:
        titles.append(title)

# Print the list
for t in titles:
    print(t)
