const Movies={
    a: 'hrushitha',
    b: 'satyan',
    c: 'sriabhi',
    d: 'shashi'
}

Movies[Symbol.iterator]=function(){
    const ordered=Object.values(this).sort((a,b)=>a-b);
    let i=0;
    return{
        next()+>({
            done:i>ordered.length;
            value:ordered[i++]
        })
    }
}

function* objectEntries(obj)
{
    const keys=object.keys(obj);
    for(const key of keys)
    {
        yield[key,obj[key]];
    }
}

const student={name :'john',gender: 'male',}