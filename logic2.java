//fish pattarn
/*class fish{
public static void main(String args[]){
try{int num = Integer.parseInt(args[0]);
int sp1 = num/2+1;
int st1 = 1;
int sp2 = num;
int st2 = 1;
for(int i = 1; i<=num;i++){
if(i <= num/2){
for(int j=1 ;j<=sp1;j++){
System.out.print(" ");
     }
for(int j=1 ;j<=st1;j++){
System.out.print("*");
     }
for(int j=1 ;j<=sp2;j++){
System.out.print(" ");
     }
for(int j=1 ;j<=st2;j++){
System.out.print("*");
     }
sp1--;
st1+=2;
sp2-=2;
st2++;    }else if(i==num/2+1){
           System.out.print(" ");
           for(int j=1 ;j<=num+num/2+2;j++){
          System.out.print("*");
     }
           }else{
          sp1++;
          st1-=2;
          sp2+=2;
          st2--;
for(int j=1 ;j<=sp1;j++){
System.out.print(" ");
     }
for(int j=1 ;j<=st1;j++){
System.out.print("*");
     }
for(int j=1 ;j<=sp2;j++){
System.out.print(" ");
     }
for(int j=1 ;j<=st2;j++){
System.out.print("*");
     }
           }System.out.println();
       }
	}catch(NumberFormatException e){
		System.out.println("you have to provide number .like-1,2,3etc");
	}
    }
}*/

/*class butterfly{
public static void main(String args[]){
int num = 25;
int st = 1;
int sp = num-1;
for(int i = 1; i<=num;i++){
 if(i<=num/2){
 for(int j = 1; j<=st;j++){
      System.out.print("*");
        }

 for(int j = 1; j<=sp;j++){
      System.out.print(" ");
        }

 for(int j = 1; j<=st;j++){
      System.out.print("*");
        }

         sp-=2;
         st++;
       }else if(i == num/2+1){
    
 for(int j = 1; j<=num+1;j++){
      System.out.print("*");
        }

          }else{
       sp+=2;
       st--;

 for(int j = 1; j<=st;j++){
      System.out.print("*");
        }

 for(int j = 1; j<=sp;j++){
      System.out.print(" ");
        }

 for(int j = 1; j<=st;j++){
      System.out.print("*");
        }

        }System.out.println();
     }
   }
}*/

/*class fectorial{
public static void main(String args[]){
int num = 11;
int swp = num;
int res = 1;
for(int i = 1; i<=num ; i++){
    res*=swp;
     swp--;
     }System.out.println(res);
  }
}*/


// left arrow
/*class LeftArrow{
public static void main(String args[]){
int length = 20;
int num = length*2-1;
int st = 1;
int sp = length-1;
for(int i=1;i<=num;i++){
if(i<=num/2){
   for(int j=1;j<=sp;j++){
         System.out.print("  ");
     }
     for(int j=1;j<=st;j++){
         System.out.print("*");
     }
      sp--;
        }else if(i==num/2+1){
        for(int j=1;j<=num;j++){
         System.out.print(" *");
     }
        }else{
        sp++;
        for(int j=1;j<=sp;j++){
         System.out.print("  ");
     }
       for(int j=1;j<=st;j++){
         System.out.print("*");
     }
           }System.out.println();

      }
   }
}*/
//right side arrow
/*class arrow{
public static void main(String args[]){
int num = 20;
int sp = 1;
int st = 1;
for(int i =1;i<=num;i++){
if(i<=num/2){
    for(int j =1;j<=sp;j++){
          System.out.print("  ");
         }
    for(int j =1;j<=st;j++){
          System.out.print("* ");
         }
       sp+=2;
         }else if(i == num/2+1){
          for(int j =1;j<=sp;j++){
          System.out.print("* ");
         }
            }else{
                 sp-=2;
             for(int j =1;j<=sp;j++){
          System.out.print("  ");
         }
          for(int j =1;j<=st;j++){
          System.out.print("* ");
         }
            
          }System.out.println();
      }
   }
 }*/

//MAX MULTIPLICATION IN ARRAY
/*class MaxMultiplication{
public static void main(String args[]){
int ar1[]= {8,4,5,6,7,3,8,9,565,99};
int res = 0;
for(int i = 0;i<=ar1.length-1;i++){
     for(int j=i+1;j<=ar1.length-1;j++){
          if(ar1[i]>ar1[j]){
            res = ar1[i];
            ar1[i] = ar1[j];
            ar1[j] = res;
            
            }
        }
      }int max1 = ar1[ar1.length-1];
       int max2 = ar1[ar1.length-2];
       System.out.print("max multiplication :"+ max1+","+max2+" which is = "+ max1*max2);
    }
}*/

// Array odd even number find logic
/*class ArrayCount{
public static void main(String args[]){
int odd = 0;
int even = 0;
int ar1[] = {22,3,5,6,6,7,7,7,866,544,91,845};
for(int i = 0; i<=ar1.length-1;i++){
   if(ar1[i]%2==0){
         even++;
          }else{
             odd++;
             }
      }System.out.println("odd number in ar1 array: "+ odd);
       System.out.println("even number in ar1 array: "+ even);
   }
}*/






//ARMSTRONG NUMBER
/*class Armstrong{
public static void main(String args[]){
int num = 111111111;
int rem = 0;
int res = 0;
for(int i=1;true;i++){
     if(num != 0) {  
       rem = num%10;
       num = num/10;
       rem = rem*rem;
       res +=rem;}
         
        else{break;}
      }System.out.println(res);
   }
}*/

// prime number trick
/*class prime{
public static void main(String args[]){
int num = 100;

for(int i =3; i<=num;i++){
    int res = 0;
    for(int j = 2; j<=i/2+1;j++){
       if(i%j==0){
            res =1;
            }
        }if(res==0){
          System.out.println("no. is  prime = "+ i);
        }
     }
   }
}*/


//rohmbus
/*class rhombus{
public static void main(String args[]){
 int num = 10;
 int sp = 1;
 for(int i=1;i<=num;i++){
   for(int j = 1; j<=sp;j++){
System.out.print(" ");
    }sp++;
    for(int j =1;j<=num;j++){
       System.out.print("* ");
        }System.out.println();
      }
   }
}*/


//aakash ka chilhood problem
/*class A{
public static void main(String args[]){
 int num = 30;
 for(int i=1;i<=num;i++){
      for(int j=1;j<=num;j++){
if(i==1|j==1|i==num||j==num||i==j||i+j==num+1){
        System.out.print("* ");}
  
      else{System.out.print("  ");}
        }System.out.println();
      }
    }
 }*/


//crown of king
/*class A{
public static void main(String args[]){
int num = 17;
int lower = num+num/2;
int sp1 =1;
int sp2 = num*2+1;
int st2 = 1;
int res = 0;
for(int i=1;i<=lower ; i++){
if(i<=num/2+4){
for(int j=1;j<=sp1;j++){
      System.out.print(" ");
   }
for(int j=1;j<=sp1;j++){
      System.out.print("*");
   }
for(int j=1;j<=sp2;j++){
      System.out.print(" ");
   }
for(int j=1;j<=st2;j++){
      System.out.print("*");
   }
for(int j=1;j<=sp2;j++){
      System.out.print(" ");
   }
for(int j=1;j<=sp1;j++){
      System.out.print("*");
   }
    sp1++;
    sp2-=3;
    st2+=2;
         }else{
           res = sp1+sp2+st2+sp2+sp1+2;
for(int j=1;j<=sp1-1;j++){
 System.out.print(" ");
   }
        for(int j=1;j<=res;j++){
      System.out.print("*");
   }
    
         }System.out.println();
      }
   }
}*/
/*
class heart{
public static void main(String args[]){
int num = 5;
int row = num*3+2;
int colmn = num*4+3;
int st = 3;
int sp1 = num;
int sp2 = num*2-1;
int sp3 = 1;

for(int i =1;i<=row+1;i++){


  if(i<=colmn-row-1){
for(int j =1;j<=sp1;j++){
       System.out.print("  ");
   }
for(int j =1;j<=st;j++){
       System.out.print("* ");
   }
for(int j =1;j<=sp2;j++){
       System.out.print("  ");
   }
for(int j =1;j<=st;j++){
       System.out.print("* ");
   }
       st+=2;
       sp1--;
       sp2-=2;
        }else if(i==colmn-row){
         for(int j =1;j<=sp3;j++){
       System.out.print("  ");
   }for(int j =1;j<=colmn;j++){
       System.out.print("* ");
   }
        }

else {
       for(int j =1;j<=sp3;j++){
       System.out.print("  ");
   }for(int j =1;j<=colmn;j++){
       System.out.print("* ");
   }
         colmn-=2;
         sp3++;
            
            }
System.out.println();
     }
   }
}
*/


// number line
/*class A{
public static void main(String args[]){
int sum = 0;
int ar1[] = {10,24,-2,4,6,-2,5};
for(int i=1;i<ar1.length;i++){
     if(ar1[i] > 0){   sum = ar1[i];
        for(int j = 1;j<=2;j++){
         System.out.print("  ");
     }
       System.out.print("|");
    for(int j = 1;j<=sum;j++){
          System.out.print("* ");
           }
        }else{
  sum = ar1[i];
       
    for(int j = 1;j<= -sum;j++){
          System.out.print("* ");
           }
    System.out.print("|");
    }
System.out.println();
        }
     }
 }*/



// swastik of sanatan
/*class hindu{
public static void main(String args[]){
int num = 25 ;
for(int i = 1 ; i <= num ; i++){
for(int j = 1 ; j <= num ; j++){
if(i == num/2+1 || j == num/2+1 ||((i == 1 && j >= num/2+1))||(i == num && j <= num/2+1)||(j ==1 && i <=num/2+1)||(j == num && i >= num/2+1) ){
      System.out.print("* ");

  }else{
      System.out.print("  ");
             }
           }System.out.println();
        }
     }
  }


class heart{
public static void main(String args[]){
for(int k = 1 ; k <= 4 ; k++){
for(int l = 1 ; l <= 15 ; l++){
if(k == 1){
        System.out.print(" ");
          }  else if(k == 2 && (l <= 5 || l >= 3 )){
    System.out.print("*");
                               }else{

            }

     } System.out.println();
  }
for(int i = 1 ; i <= 8 ; i++){
for(int s = 1 ; s <= i  ; s++){
  System.out.print(" ");
           }
   for(int j = 1 ; j <= 17-2*i ; j++){
    System.out.print("*");
            }System.out.println();
        }
     }
  }*/

/*class A{
public static void main(String args[]){
int ar1[] = {3,2,4,2,44,13,3,12,103,15};
int temp = 0;
for(int i = 0 ; i <= ar1.length-1 ; i++){
      for(int j = i+1 ; j <= ar1.length-1 ; j++){
             if(ar1[i] < ar1[j]){
               temp = ar1[i];
               ar1[i] = ar1[j];
               ar1[j] = temp;
               }
           }
       }for(int i = 0 ; i <= ar1.length-1 ; i++){
              System.out.print(ar1[i] + "||");
               }                 
    }
 }
*/

class A{
public static void main(String args[]){
int ar1[] = {32,5,4,2,4,5,2};
int pos = 4 ;
for(int i = 0 ; i <= ar1.length-1 ; i++){
for(int j = 0 ; j <= ar1.length-2 ; j++){
      if(i > pos-1){
             ar1[i] = ar1[j+1];
                          
             
              }
         }
          }for(int i = 0 ; i <= ar1.length-2 ; i++){
          System.out.print(ar1[i] + "||");

    }
 }

class flotNum_Identfy{
public static void main(String args[]){
double d1 = 55;
int i1 = 0;
for(int i=1;true;i++){
		d1--;
	if(d1>0&&d1<1){
			i1=1;
			}if(d1<0){
				break;
			}
		}if(i1==1){
			System.out.println("no is decimal");
		}else{
			System.out.println("no.is not decimal");
		}
	}
}
//tringle Star and hastag
public class Practice1 {
public static void main(String[] args) {
	int num= 5;
	for(int i=1;i<=num;i++) {
			for(int j=1;j<=num-i+1;j++) {
				System.out.print("  ");
			}
			for(int j=1;j<=2*i-1;j++) {
				if(j%2==0) {
					System.out.print("* ");
				}else {
					System.out.print("# ");
				}
			}System.out.println();
		}
	}	
}

//trinangle of {*}
public class Practice1 {
public static void main(String[] args) {
	int num= 5;
	for(int i=1;i<=num;i++) {
			for(int j=1;j<=num-i+1;j++) {
				System.out.print("  ");
			}
			for(int j=1;j<=2*i-1;j++) {
				if(j<i) {
					System.out.print("{ ");
				}else if(j==i) {
					System.out.print("# ");
				}else {
					System.out.print(" }");
				}
			}System.out.println();
		}
	}	
}
// triangle patteran 

public class practice {
public static void main(String[] args) {
int num = 5;
char  ch = 65;
for(int i=1;i<=num;i++) {
	for(int j=1;j<=num-i;j++) {
		System.out.print("  ");
	}
	for(int j=1;j<=2*i;j++) {
		
		if(j>i) {
			
		System.out.print(ch+" ");}else {
			
			System.out.print(i+" ");
				}
			}ch++;
	System.out.println();
		}
	}
}

//trinagle pattern

public class practice {
public static void main(String[] args) {
int num = 5;

for(int i=1;i<=num;i++) {
	for(int j=1;j<=num-i;j++) {
		System.out.print("  ");
	}char  ch = 65;
	for(int j=1;j<=2*i;j++) {
		
		if(j>i) {
		
		System.out.print(ch+" ");
		ch++;
		}else {
			
			System.out.print(i+" ");
				}
			}
	System.out.println();
		}
	}
}
