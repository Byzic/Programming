public class Proglaba1{
   public static void main(String[] args){
        
     short d[]=new short[7];                  // создание массива d
     short  k=19;
     for (short i=0;i<=6;i++){               // заполнение массива d
        d[i]=k;
        k-=2;
      }
     for (short i=0; i<=6; i++) {
        // System.out.print(d[i]+" ");
     }
     System.out.println();
     float x[]=new float[17];                // создание массивава x
     for (int j=0; j<=16;j++){
         x[j]=(float)(Math.random()*10-7.0); // заполнение массива x
         //System.out.print(x[j]+" ");
     }
     double d1[][]=new double[7][17];        // создание массива d1[i][j]
     for (int i=0;i<=6;i++){
         for (int j=0;j<=16;j++ ){
             if (d[i]==15){                 // заполнение массива d1
                 d1[i][j]= Math.pow(Math.atan(Math.cos(x[j]))*(Math.pow((3/(2*x[j]+2)),2)+0.75),3);
             }
             else if ((d[i]==7) | (d[i]==11) | (d[i]==19)){
                 d1[i][j]=Math.cbrt(Math.sin(Math.log(Math.abs(x[j]))));
             }
             else{
                 d1[i][j]=Math.pow(Math.E,Math.pow((Math.sin(x[j])+1)/(Math.asin(Math.E*(x[j]-2)+1)),Math.pow(4/(x[j]-1),x[j])*(1/3)/( Math.pow( x[j]/Math.PI,(2*Math.atan((x[j]-2)*Math.E+1)/3)))));
             }
           System.out.printf("%.2f",d1[i][j]); System.out.print("   ");
         }
       System.out.println("");
     }


   }
}
