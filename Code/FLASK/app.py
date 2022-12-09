from flask import Flask

app=Flask(__name__)

@app.route('/')   #app.route(rule,options)
def hello_world():
	return "hello world"
if __name__=='__main__':
	app.run(debug=True)     #app.run(host,port,debug,options)