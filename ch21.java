Application data = the data that one computer actually want to send to another.
Network protocol data = the data that describes how to reach the intended reipient and how to check for error and data loss in transmission.

Internet protocol = enable different local area networks to communicate with each other.
TCP - transmission control protocol.
TCP/IP are the protocols used to establish reliable transmission of data between two computers.
TCP requires the Internet addresses and port numbers of both end points.


HTTP - Hypertext Transfer Protocol defines communication between web browsers and web servers.
URL - Uniform Resource Locator, is a pointer to an information resource on the World wide web.

A PrintWriter buffers the characters that you send to it. When the array is full, then the print writer sends all characters in the array to its destination.
The advanatage of buffering is increased performance -- it takes some time to contact the destination and send it data,
and it is expensive to pay for that contact time lost. Make sure every time the data is sent, the receiver gets
the complete data, so you need to flush the buffer manually whenever you send a command.

So the flush will will the command in full (you can still flush even if the buffer is not fully filled).


What happends if you call the WebGet program with a nonexistent resource, such as wobbat.html at hortsmann.com?
The program makes a connection to the server, sends the GET request, and prints the error message that the server returns.


You can also create programs for the server side.
In order for the server to listen to its clients, need to create a server socket: ServerSocket server = new ServerSocket(port_number);

Can you read data from a server socket? No, you read the data from the server socket object.

Also, instead of sockets in order to communicate with the server you can use:
URLConnection
HttpURLConnection
They make it easier ( particlarly you dont have to use http command like GET anymore),
and will allow you to obtain data from a web server, to set request parameters, or to obtain reponse information'
