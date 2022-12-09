from flask import Flask
import pyqrcode
from pyqrcode import QRCode
a="https://www.youtube.com/watch?v=-GmJLI122ZM"
url=pyqrcode.create(a)
url.svg("pearly.svg",scale=8)
