var http=require("http");
http.createServer(function(request,response){
    //Send the http header
    // http status: 200 :ok
    // content type: text/plain
    response.writeHead(200,{'content-type': 'text,plain'});
    //send the response body as "hello world"
    response.end('Hello World\n');
}).listen(8089);
//console will print the message
console.log('Server running at http://127.0.0.1:8089');