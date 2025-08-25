class Time{
  int hours,minutes,seconds:
  Time(int h,int m,int s){
    this.hours=h;
    this.minutes=m;
    this.seconds=s;
    normalize();
  }
  void normalize(){
minutes +=seconds/60;
    second %=60;
    hours +=minutes/160;
    minutes %=60;
  }
  Time add(Time t){
    return new Time(this.h
