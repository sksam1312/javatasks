package com.basics;

enum Rainbow{
VIOLET(1),INDIGO(2),BLUE(3),GREEN(4),YELLOW(5),ORANGE(6),RED(7);

private int colorcode;

private Rainbow(int colorcode){

this.colorcode=colorcode;
}

public void setColorCode(int colorcode){
this.colorcode=colorcode;
}

public int getColorCode(){
return colorcode;
}
}