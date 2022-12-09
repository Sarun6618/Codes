function binarySearch(arr, val)
{
    let start = 0;
    let end = arr.length - 1;
    while (start <= end) 
    {
        let mid = Math.floor((start + end) / 2);
        if (arr[mid] === val) 
        {
            return mid;
        }
        if (val < arr[mid]) 
        {
            end = mid - 1;
        } 
        else 
        {
            start = mid + 1;
        }
    }
    return -1;
}
var Mynum = [1, 23, 12, 34, 45, 54, 87, 48, 37, 23, 16];
result = binarySearch(Mynum,45);
console.log(Mynum);
console.log(result);