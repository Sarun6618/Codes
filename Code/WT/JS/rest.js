function restp(one,...cse)
{
    for(let i=0;i<cse.length;i++)
    {
        one+=cse[i];
    }
    return one;
    //console.log(one);
}
console.log(restp(1,2,3,4,5));
restp(1,2);
console.log(restp(10));

function myfun3(name,callback)
{
    console.log()
}