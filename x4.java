int r,g,b;
float button1X=100, button1Y=100, button1W=80, button1H=40;
int counter=0;

//// SETUP:  size only.  Also set colors.
void setup() {
  size( 640, 480 );
  reset();
}
void reset() {
  r=  200;
  g=  150;
  b=  300;
}


//// NEXT:  button only.
void draw() {
  background( r,g,b );
  showButton( button1X, button1Y, button1W, button1H );
  fill(100,0,0);
  text( "CLICK ME!", button1X+button1W/4, button1Y+button1H*2/3 );
}
// Draw the button.
void showButton( float x, float y, float w, float h ) {
  fill( 200,200,0 );
  rect ( x,y, w,h );
}

//// HANDLERS:  keys & click
void keyPressed() {
  if (key == 'q') exit();
  if (key == 'r') reset();
}
void mousePressed() {
  if ( hit( mouseX,mouseY, 200,150, 200,100 ) ) {
    counter=  counter+1;
    if (counter % 10 > 0) {
      r=  100;
      g=  200;
      b=  10;
    } else {
      reset();
    }
  }
}

//// OTHER METHODS:  detect "hit"
// Return true if "near"
boolean hit( float x1, float y1, float x2, float y2, float w, float h ) {
  boolean result;

  // +++++ STUB ALWAYS RETURNS TRUE!
  if ( abs(x1-x2) < w && abs(y1-y2)<h ) {
    result=  true;
  } else {
    result=false;
  }

  return result;
}
