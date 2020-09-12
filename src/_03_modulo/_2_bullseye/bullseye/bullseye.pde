
void setup() {
 
  // set the size of your sketch
  size(1000,1000);
}

void draw() {
  
  //Starting with the largest ellipse, use a for loop to draw a 
  
for (int i=10; i>0; i--) {

 if(i % 2 ==0){
   fill(#F51111);
 }
   else{
     fill(#FFFFFF);
   }
 
 
  
  
  ellipse(500,500,i*50,i*50 );
 
}
}



      
    
  //Use an if statement and modulo to alternate the color of your rings.
 
