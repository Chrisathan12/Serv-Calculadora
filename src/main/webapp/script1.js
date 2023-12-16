function setInp(){
    let val=document.getElementById("inp").value;
    switch (val){
        case '1':{
            document.getElementById("form").innerHTML="A:<input name='a'/><br><br>B:<input name='b'/><br><br><input type='submit' name='oper' value='-'>";
            break;
        }
        case '2':{
            document.getElementById("form").innerHTML="A:<input name='a'/><br><br>B:<input name='b'/><br><br><input type='submit' name='oper' value='+'>";
            break;
        }
        case '3':{
            document.getElementById("form").innerHTML="A:<input name='a'/><br><br>B:<input name='b'/><br><br><input type='submit' name='oper' value='*'>";
            break;
        }
        case '4': {
            document.getElementById("form").innerHTML = "A:<input name='a'/><br><br>B:<input name='b'/><br><br><input type='submit'  name='oper' value='/'>";
            break;
        }
    }
}