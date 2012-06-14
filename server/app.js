var express = require('express');
var  path = require('path');
var  clientPath = path.join(__dirname, '../client');

var app = express.createServer();

app.configure(function(){
    app.use(express.methodOverride());
    app.use(express.bodyParser());
    app.use(app.router);
    app.use(express.static(__dirname + '/../client/src'));
    app.use(express.errorHandler({
        dumpExceptions: true,
        showStack: true
    }));
});

app.get('/client', function (req, res) {
    res.sendfile(path.join(clientPath, 'src/html/index.html'));
});
    
app.get('/client/test', function (req, res) {
    res.sendfile(path.join(clientPath, 'test/index.html'));
});
    
app.get('/!shutdown', function (req, res) {
    res.send(200);
    server.stop();
    process.exit(0);
});

app.listen(3000, function() {
	console.log("Express server listening on port %d", app.address().port);
});
