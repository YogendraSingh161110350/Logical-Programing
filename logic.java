/*class yogu{
public static void main(String args[]){
int num = 0;
for(int i = 1 ; i <= 100 ; i++){
        num = num + i;
        if(num >= 100){
               break;}
        System.out.println(num);
                      

            }

       }

   }


class yogu{

public static void main(String args[]){
  for (int i = 1 ; i <= 10; i++){
  for(int s = 1 ; s <= 10-i ; s++){
         System.out.print(" ");
            }
 for(int j = 1 ; j <= i ; j++){
           System.out.print("*");
           } System.out.println();
         }
     }
 }

*/

//  HOLLOW TRIANGLE:
/*
class yogi{
public static void main(String args[]){
 int num = 10;
 for(int i = 1 ; i <= num ; i++){
   for(int s = 1 ; s <= num-i ; s++ ){
        System.out.print(" ");

           }
   for(int j = 1 ; j <= i ; j++){
         if(j == i || j == 1 || i == num ){
            System.out.print("* ");
                }else{
            System.out.print("  ");
    }
           }System.out.println();
        }
     }
  }*/

// hollow inverted triangle
/*class yogi{
public static void main(String args[]){
int num = 10;
for(int i = 1 ; i <= num ; i++){
for(int s = 1 ; s <= i ; s++){
  System.out.print(" ");
           }
for(int j = 1 ; j <= num-i ; j++){

  if(i == 1 || j == 1 || j == num-i){
System.out.print(" *");
               }else{
 System.out.print("  ");
                    }
            }System.out.println();
        }
     }
  }*/

// programme for east triangle 
/*class yogu{
public static void main(String args[]){
int num = 11;
for(int i = 1 ; i <= num/2 +1; i++ ){
for(int j = 1 ; j <= i ; j++ ){
       System.out.print("* ");
           } System.out.println();

        }
for(int s = num/2+2 ; s <= num ; s++ ){
 for(int t = 1 ; t <= num-s+1  ; t++ ){
     System.out.print("* ");
              }System.out.println();
          }
       }
  }*/
// ABCD arregenment
/*class yogu{
public static void main(String args[]){
for(int i = 65 ; i <= 70 ; i++ ){
for(int j = 65 ; j <= i ; j++){
   char letr =(char)j ; 
   System.out.print(letr);
   System.out.print(" ");

                 }System.out.println();
            }
        }
   }


class yogu{
public static void main(String args[]){
for(int i = 65 ; i <= 68 ; i++ ){
for(int j = 65 ; j <=i ; j++){
char ltr1 = (char)j;
System.out.print(ltr1);
                    }
for(int s = 65 ; s <= 132-i; s++){
char ltr2 = (char)s;
System.out.print(ltr2);
}System.out.println();
               }

          }
      }
  */


// x shape 

/*class ronu{
public static void main(String args[]){
int num = 10;
for(int i = 1 ; i <= num ; i++){
for(int s = 1 ; s <= i ; s++){
    System.out.print(" ");
                }
for(int j = 1 ; j <= num-i+1 ; j++){
if( j == num-i+1 || j == 1  ){
     System.out.print("* ");}else{
System.out.print("  ");
        }

              }System.out.println();
          } 

for(int i = 1 ; i <= num ; i++){
for(int s = 1 ; s <= num-i+1 ; s++ ){
              System.out.print(" ");
                   }
for(int j = 1 ; j <= i ; j++ ){
    if(j==1 || j== i )    { System.out.print("* ");
              }else{  System.out.print("  ");
}   
                   }   System.out.println();  
              }
         

       }
    }

*/
//pattern of T

/*class king{
public static void main(String args[]){
int num = 11;
for(int i = 1 ; i <=num ; i++){
          System.out.print("*");            
          }System.out.println();
for(int j = 1 ; j <= num/2 ; j++){
for(int s = 1 ; s <= num/2 ; s++){
     System.out.print(" ");
             }System.out.println("*");
        }

    }
 }*/

// rohmbus


/*class yoga{
public static void main(String args[]){
int num = 10;
for(int i = 1 ; i <= num ; i++){
for(int s = 1 ; s <= num-i ; s++){
     System.out.print("*");
           }
for(int j = 1 ; j <= i ; j++){
if(  i == j ||  j == 1){
    
   System.out.print("* ");}else{
   System.out.print("  ");
           }

           }System.out.println();
        }
for( int a = 1 ; a <= num ; a++){
for(int d = 1 ; d <= a ; d++){
      System.out.print("*");
            }
for(int c = 1 ; c <= num-a ; c++  ){
if( c == num-a || c == 1){
     System.out.print("* ");}else{
     System.out.print("  ");
   }

             }System.out.println();
         }
     }
  }
*/

//1234 pattern
/*class yopu{
public static void main(String args[]){
int num = 10;
for(int i = 1 ; i <= num ; i++){
for(int j = num ; j >= 1 ; j--){
if(i == num || i == 1 || j == 1 || j == num ){
System.out.print(j + " ");}else{
 System.out.print("  ");
   }
 
           }System.out.println();
        }
     }
  }*/








































































































































































 












































// REVERSE DIGITE LOGIC

/*class rev{
public static void main(String args[]){
int num = 854;
while(num != 0){
       int rem = 0; 
       rem = num%10;
       System.out.print(rem);
       num = num/10;

            }

        }

    }
*/



// Number of digits in number
/*
class king{
public static void main(String args[]){
int num = 6556799;
int res = 0;
while(num != 0){
            num = num/10;
            res++ ; 
          }System.out.println(res);
               
      }
   }
*/

// to find sum of number
/* class king{
public static void main(String args[]){
int num = 254646;
int res = 0 ;
while(num != 0){
          res = res + (num % 10);
          num = num/10;
          

    
          }System.out.println(res);
           System.out.println(num);
      }
  } 
// sequre number sum 
class yogi{
public static void main(String args[]){
int num = 115128;
int rem1 = num % 10;
num = num/10;
int rem = 0;
while(num != 0){
              rem = rem + num%10*num%10;
              num = num/10;
           } if(rem1 == rem){
              System.out.println("condtion is full- fill");
                   } else{
               System.out.println(" xxxxxxxxcondtion is not full-fill");
            }

     }
}
*/





































































/*class A{
      public static void main(String aargs[]){
      int a = 1;
      switch(a){
                case 1: 
                       System.out.println("this is case first");
                       break;

                case 2:
                       System.out.println("this is case 2");
                       break;

                case 3:
                       System.out.println("this is case 3");
                       break;


                default:
                        System.out.println("invalid selection");     
             }
          }

}*/


class A{
       public static void main(String arg[]){
       String a = arg[0];
       switch(a){
                 case "add" :
                             System.out.println(20 + 30);
                             break;
                case "sub" :
                             System.out.println(30 - 20);break;
                case "mul" :
                             System.out.println(30 * 20);break;
                case "div" :
                             System.out.println(30/20);break;
                case "mod" :
                             System.out.println(30%20);break;
               
                case "bitAnd" :
                             System.out.println(20 & 30);break;
                case "bitOR" :
                             System.out.println(20 | 30);break;
                default:
                              System.out.println("invalid selection");




}
           }


       }















































/*class A{
       public static void main(String args[]){
       int a = 0;
       if (a > 0){ System.out.println("+ve number");

  }    if (a < 0){  System.out.println("-ve number");



  }    if (a == 0){  System.out.println(" number is zero , abe sale ");


   
  }
      

     }

      }*/






             /*   WPM NUMBER WHICH IS DIVIDE BY 2 THEN DIVIDE BY 4 THEN DIVIDE BY 12 
======================================================================================= 

class A{
       public static void main(String args[]){
        int a = 20;
       if (a % 2 == 0){
                
                   if (a % 4 == 0){
     
                               if (a % 12 == 0){ System.out.println(a + "no. is divisible by  2, 4, 12");


                                            }else{
                                                       System.out.println(a + "no. is divisible 2, 4, but not 12");


                                                }

                       }else{ System.out.println( "not divisble by 4");


                                          }

                       }else{              System.out.println( "not divisble by 2,4,12");
      
                        
                                  }   

            }

   }

*/












              /*                 LARGEST NUMBER
                          

class A{
       public static void main(String args[]){
       int a = -13 , b = -404 , c = -64 ;

       if (a > b){
                  
               if (a > c){ System.out.println( a + " greatest number");


                              }else{ System.out.println( c + " greatest number");



                                      }      
                   } else{ if (b > c){System.out.println( b + " greatest number");
                                   }
             
                              else{System.out.println( c + " greatest number");
}
                                }

       }

}    */









                                        /* if else statement use
=============================================================================================================================
class A{
        public static void main(String args[]){
        int ac = 1, pc = 0, pp = 1;
            
          if (ac == 1) {
                     if (pc == 1) {
                               if (pp == 1) { System.out.println("eligiable for applying visa ");

                                    }else{    System.out.println("not-eligiable for applying visa");
                                System.out.println("apply for passport");
 
                                   }

                        }else{ System.out.println("not-eligiable for applying visa");
                                System.out.println("apply for pancard");
                               if(pp != 1){ System.out.println("apply for passport"); }

                        }
               }else{ System.out.println("not-eligiable for applying visa");
                  System.out.println("apply for aadhar");
                  if(pc != 1){ System.out.println("apply for pancard"); }
                  if(pp != 1){ System.out.println("apply for passport"); }
               }

        } 
}
================================================================================================================================== */
                                             