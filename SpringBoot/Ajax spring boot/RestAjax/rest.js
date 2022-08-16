function restCall(){
    let httpReq = new XMLHttpRequest();
    httpReq.open("Get", "http://localhost:8080/api/call");
    httpReq.send();
    httpReq.onload=function (){
        alert(httpReq.responseText);
    }
}