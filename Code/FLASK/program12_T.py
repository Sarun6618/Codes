from flask import *

app=Flask(__name__)
@app.route('/login', methods=['post'])
def login():
    uname=request.form['uname']
    password=request.form['pass']
    if uname=="sarun0904" and password=="chuttakula":
        return "Welcome %s" %uname
    else:
        return "Wrong login"

if __name__ == '__main__':
    app.run(debug=True)