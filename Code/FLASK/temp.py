from flask import Flask

app=Flask(__name__)

@app.route('/greet')   #app.route(rule,options)
def greet():
    user={'username':'John','age':"20"}
    return 
if __name__=='__main__':
	app.run(debug=True,port=8000)     #app.run(host,port,debug,options)