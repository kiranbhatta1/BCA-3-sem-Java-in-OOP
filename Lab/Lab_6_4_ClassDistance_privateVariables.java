class Distance{
  private int feet;
  private int inches;
  feet=0;
  inches=0;
}
Distance (int f,int i){
  feet =f;
  inches =i;
  normalize();
}
void normalize(){
  feet =inches/12;
  inches =inches%12;
}
Distance add
