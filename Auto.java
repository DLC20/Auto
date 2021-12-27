int velocidad =1;
int x=0;
void setup(){
size(250,250);
smooth();
}
void draw(){
 background(255);
mueve();
rebota();
 dibujaAuto(100,100,64,color(200,200,0));
 dibujaAuto(50,75,32,color(0,200,100));
 dibujaAuto(80,175,40,color(200,200,0));
  dibujaAuto(150,200,50,color(255,100,0));
}
//Funcion que mueve la bola
 void mueve(){
   //Cambia segun la velocidad
 x=x + velocidad;
 }
 // Funcion que renota la bola
 void rebota(){
 /* Si se ha llegafo a una orilla, invierte la velocidad*/
  if ((x>width) || (x<0)){
  velocidad = velocidad * -1;
  }
 }
 
 
void dibujaAuto(int x, int y, int tamanio,color c){
//Empleo de una variable local como "compensacion"
int compensacion=tamanio/4;
//Dibuja el cuerpo del auto
rectMode(CENTER);
stroke(200);
fill(c);
rect (x,y,tamanio,tamanio/2);
//Dibuja cuatro ruedas en relacion al centro
fill(0);
rect(x-compensacion,y-compensacion,compensacion,compensacion/2);
rect(x+compensacion,y-compensacion,compensacion,compensacion/2);
rect(x-compensacion,y+compensacion,compensacion,compensacion/2);
rect(x+compensacion,y+compensacion,compensacion,compensacion/2);
}
