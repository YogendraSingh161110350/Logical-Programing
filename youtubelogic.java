/*class fibonacci{
public static void main(String args[]){    
int pri = 0;
int next = 1;
for(int i = 0 ; i<=9; i++){
      System.out.print(pri+"||");
      int res = pri+next;
         pri = next ;
         next = res;
      
       
        }
     }
 }*/

/*
class fectorial{
public static void main(String srgs[]){
int num = 5;
System.out.print(num+"! = ");
for(int i = num-1 ; i >= 2; i--){
   num *=i;
            } System.out.println(num);
       }
   }*/
//sum of natural number
/*class sum{
public static void main(String args[]){
int num = 10;
int res = num*(num+1)/2;
System.out.print("sum of the first "+num +" natuarl number is : "+res );

      }
  }*/
// rendom sum from to till
/*class sum{
public static void main(String args[]){
int from = 1;
int till = 10;
System.out.print("sum of number from "+from + " to " + till);
for(int i = from+1 ; i <= till ; i++){
        from += i;

      }System.out.print(" is = " + from);
    }
 }*/
//fector in java
/*class fector{
public static void main(String args[]){
int num = 658;
for(int i = 2 ; i <= num/2 ; i++){
     if(num %i == 0){
          System.out.print(i + " , ");
           }
        }
     }
  }*/
//prime number in range of
class prime{
public static void main(String args[]){
int num = 100 ;

for(int i = 2 ; i <=num ; i++){
  for(int j = 2 ; j <= i/2 ; j++){   
   if(i%j==0){
                prm = i ;
                 break;
                 }

          }System.out.println(prm + "not prime");
       }
    }
}






















































































