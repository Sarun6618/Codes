import matplotlib.pyplot as plt
import numpy as np
np.random.seed(10)
data=np.random.normal(50,20,200)
fig=plt.figure(figsize=(10,7))
plt.boxplot(data)
plt.show()