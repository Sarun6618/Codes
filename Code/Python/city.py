"""
i)Read number of cities
ii)Read each city details such as name of the city, area and population
iii)Display the city with maximum density of population.
Sample input & output:
Enter number of cities:5                                                                                                
Enter City details:                                                                                                     
Toronto 630.2 2731571                                                                                                   
Chicago 606.1 2720546                                                                                                   
Houston 1733 2296224                                                                                                    
montreal 431.5 1704694                                                                                                  
calgary 825.3 1239220                                                                                                   
calgary has highest density of population 
"""
n=int(input("Enter number of cities:"))
cities=[]
print("Enter City details: ")
for i in range(n):
    s=input().split() 
    c=dict()
    c["name"]=s[0]
    c["area"]=float(s[1])
    c["population"]=int(s[2])
cities.append(c)
cities.sort(key=lambda c:c["population"]/c["area"],reverse=True)
print(cities[0]["name"],"has highest density of population")
