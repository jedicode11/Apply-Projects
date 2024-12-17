import pandas as pd
import numpy as np

full_health_data = pd.read_csv("data.csv", header=0, sep=",")

cv = np.std(full_health_data) / np.mean(full_health_data)

print(cv)
