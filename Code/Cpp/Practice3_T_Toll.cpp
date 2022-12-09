/*A toll booth on the way to Bangalore wants to keep the track of the number of vehicles passed through it and total amount collected by them.
Write a C++ program to implement the class diagram given below.
                                 
Class description:
Constructor: Initialize both the instance variables, no_of_vehicle, total_amount to 0
count_vehicle(): Increment total number of vehicle by 1
calculate_amount(vehicle_type): Accept vehicle type and identify toll amount for that vehicle based on details given in the table. Add it to the total_amount instance variable.
collect_toll(owner_type,vehicle_type): Accept owner type and vehicle type of the vehicle for which toll should be collected.
If the owner of the vehicle is a "VIP", then toll amount need not be collected but number of vehicles should be updated.
For any other type of owner, calculate the toll amount and update the number of vehicles.
(Hint: Invoke appropriate methods to complete the functionality)
Perform case insensitive string comparison.
Create an object of Tollbooth class, invoke collect_toll() method for different vehicles and test your program*/
#include<iostream>
using namespace std;
class toll_booth
{
    public:
    
}